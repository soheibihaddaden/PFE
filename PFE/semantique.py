import re 
import nltk
from nltk import word_tokenize


def date(text):
    date1=re.search(r'(0[1-9]|1[0-9]|2[0-9]|3[0-1]|[1-9])\s+\w+\s+(199[0-9]|20[0-2][0-9])',text)
    if(date1!=None):
        return date1.group(),1
    date2=re.search(r'(0[1-9]|1[0-9]|2[0-9]|3[0-1]|[1-9])\s*([/|-]|,|.)\s*\w+\s*([/|-]|,|.)\s*(199[0-9]|20[0-2][0-9])',text)    
    if(date2!=None):
        return date2.group(),2
    date3=re.search(r'(january|february|march|april|may|june|july|august|september|october|november|december|10|11|12|[1-9]|0[1-9])\s*([/|-]|,| )\s*(0[1-9]|1[0-9]|2[0-9]|3[0-1])\s*([/|-]|,| )\s*(199[0-9]|20[0-2][0-9])',text)
    if(date3!=None):
        return date3.group(),3
    date4=re.search(r"(january|february|march|april|may|june|july|august|september|october|november|december|10|11|12|[1-9]|0[1-9])\s*([/|-]|,| )\s*(199[0-9]|20[0-2][0-9])",text)    
    if(date4!=None):
        return date4.group(),4
    date5=re.search(r'(199[0-9]|20[0-2][0-9])',text)
    if(date5!=None):
        return date5.group(),5
    date6=re.search(r'january|february|march|april|\smay|\sjune|\sjuly|august|september|october|november|december',text)       
    if(date6!=None):
        return date6.group() ,6

def tandence(text):
    trend=re.search(r'(decreased|increased|low|high|stagnation|stable| evolve | didn\'t evolve |decrease|increase)',text)
    if(trend!=None):
        return trend.group()


def mesure(text):
    mesure=re.search(r'NN|NNS|NNP|NNPS|quantity|amount|number|volume|ratio|percentage|degree',text)
    return mesure.group()





def non_temporel_dimension(text):
    l=True
    li=[]
    ll=[]
    while(l==True):
        dimension1=re.search(r'dimension_marker[a-zA-Z()_1-9 ]+ngf[a-zA-Z()_1-9 ]+ng_f1[a-zA-Z()_1-9 ]+dimension_marker',text)
        if(dimension1!=None):
           ll.append(dimension1) 
        dimension2=re.search(r'dimension_marker[a-zA-Z()_1-9 ]+ngf[a-zA-Z()_1-9 ]+ng_f1[a-zA-Z()_1-9 ]+fil_ter',text)
        if(dimension2!=None):
           ll.append(dimension2) 
        dimension3=re.search(r'dimension_marker[a-zA-Z()_1-9 ]+ngf[a-zA-Z()_1-9 ]+ng_f1[a-zA-Z()_1-9 ]+interogation',text)
        if(dimension3!=None):
           ll.append(dimension3) 
        dimension4=re.search(r'dimension_marker[a-zA-Z()_1-9 ]+ngf[a-zA-Z()_1-9? ]+ng_f1[a-zA-Z()_1-9 ]+<EOF>',text)
        if(dimension4!=None):
           ll.append(dimension4)   
        if len(ll)!=0:
          d=ll.pop()
          for dim in ll:
           if len(d.group())>len(dim.group()):
               d=dim
          dimension=d
          ll=[]
        else:dimension=None      
        if(dimension!=None):
         text=text.replace(dimension.group(),'',1)
         s=[m.start() for m in re.finditer('fil_ter',dimension.group() )]
         i=1
         j=0
         h=[]
         for e in s:
             h.append(dimension.group()[j:e])
             i+=1
             j=e
         if(i>2):
             i-=1  
         while(i):
          if h!=[]:
              t1=h.pop(0)
          else:t1=dimension.group()
          t1=t1.replace('dimension_marker','')
          t1=t1.replace('interogation','')
          t1=t1.replace("<EOF>",'')
          t1=t1.replace("filter",'')
          t1=t1.replace("ng1",'')
          t1=t1.replace("ngf",'')
          t1=t1.replace("ng_f1",'')
          t1=t1.replace("ng",'')
          t1=t1.replace("(",'')
          t1=t1.replace("temporel_dimension",'')
          t1=t1.replace("date","")
          t1=t1.replace("fil_ter",'')
          t1=t1.replace(")",'')
          t1=t1.replace("determinant",'')
          t1=t1.replace("conj_coordination",'')
          t1=t1.replace("nominal_term",'')
          t1=t1.replace("adjective",'')
          t1=t1.replace("past_participale",'')
          t1=t1.replace("preposition",'')
          t1=t1.replace("mesure_indicator",'')
          t1=t1.replace("temporel_lexicon",'')
          t1=t1.replace("noun",'')
          l2=[]
          for token in word_tokenize(t1):
              if token=='in':
                 token='IN'
              l2.append(token)
          li.append(l2)
          i-=1
        else:
         l=False

    return li  







def tokenize(text):
    list_pos=[]
    list_token=[]
    for token in nltk.pos_tag(word_tokenize(text)):
        list_pos.append(token[1])
        list_token.append(token[0])
    return list_pos ,list_token






def index_of(arbre,text):
    t=tokenize(text)[0]
    arbre=non_temporel_dimension(arbre)
    t=','.join(t)
    list1=arbre
    stridex=[]
    for list2 in list1: 
         k=len(list2)
         list2=','.join(list2)
         s=[m.start() for m in re.finditer(list2, t)]
         for i in s:
             st=t[:i].replace(',',' ')
             j=0
             for token in word_tokenize(st):
                 j+=1
             stridex.append((j,k))
    return stridex







def dim_non_temporel(arbre,text):
    list1=index_of(arbre,text)
    list2=tokenize(text)[1]
    list3=[]
    for tupl in list1:
        i=tupl[0]
        j=tupl[1]
        list4=[]
        while(j):
         list4.append(list2[i])   
         j-=1
         i+=1
        if(date(' '.join(list4))==None ):
            if(dim_temporel(' '.join(list4))==''):
              list3.append(' '.join(list4)) 
    return list3      


 
def dim_temporel(text):
    t1=re.search(r'time|year|month|day|season|hour|minute|seconde',text)
    if(t1!=None):
        t12=re.search(t1.group()+r'[a-z1-9 ]'+date(text),text)
        if t12!=None:
           return t12.group()
        else: return ''   
    else:return ''




