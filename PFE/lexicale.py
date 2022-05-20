import nltk
from nltk.tokenize import word_tokenize
import re




text="why client, product decrease  in  2018 ?"

puncts=['/','.',',','-']

for punct in puncts:
    pt=re.search(punct,text)
    if(pt!=None):
        text=text.replace(punct,' '+punct+' ')

text=text.lower()


list_pos=['IN','JJR','JJ','JJS','VBN','VB','VBG','VBP','VBZ','NN','DT','NNS','NNP','NNPS']

list_mot=['january','february','march','april','may','june','july','august','september','october','november','december','/','for','during','in','since','while','when',
'according','to','quantity','equal','more','than','this','less','than','with','beetween','amount','total','number',
'volume','ratio','percentage','degree','decrease','increase','low','high','stagnation','stable','evolve','didn\'t','evolve',
'time','year','month','day','season','hour','minute','seconde','decreased','increased'
]



def sentence_pos(text):
 for token in nltk.pos_tag(word_tokenize(text)):
  if token[1] in list_pos:
   if not token[0]  in list_mot:
      text=text.replace(token[0],token[1]) 
 return text
 

def find_date(text):   
    date1=re.search(r'(0[1-9]|1[0-9]|2[0-9]|3[0-1]|[1-9])\s+\w+\s+(199[0-9]|20[0-2][0-9])',text)
    if date1!=None:
       str2=date1.group(0)
       str2=str2.replace(' ','/')
       text=text.replace(date1.group(),str2)
    date2=re.search(r'(0[1-9]|1[0-9]|2[0-9]|3[0-1]|[1-9])\s*([/|-]|,|.)\s*\w+\s*([/|-]|,|.)\s*(199[0-9]|20[0-2][0-9])',text)
    if(date2!=None):
        str1=date2.group()
        text=text.replace(str1,'CD / MMM / CD ')
        str11=re.search(r'([/|-]|,|.)\s*\w+\s*([/|-]|,|.| )',str1)
        s=str11.group()
        s=s.replace('/','')
        s=s.replace(',','')
        s=s.replace(' ','')
        s=s.replace('-','')
        s=s.replace('.','')
        try:
         if(type(int(s))==int):
           text=text.replace('MMM','CD')
        except: text=text.replace('MMM',s)  
    else:
        date2=re.search(r'(january|february|march|april|may|june|july|august|september|october|november|december|10|11|12|[1-9]|0[1-9])\s*([/|-]|,| )\s*(0[1-9]|1[0-9]|2[0-9]|3[0-1])\s*([/|-]|,| )\s*(199[0-9]|20[0-2][0-9])',text)
        if(date2!=None):
         str2=date2.group()
         text=text.replace(str2,' MMM/CD/CD ')
         str2=re.search(r'(january|february|march|april|may|june|july|august|september|october|november|december|10|11|12|[1-9]|0[1-9])',date2.group())
         text=text.replace('MMM',str2.group())
        else:
            date3=re.search(r"(january|february|march|april|may|june|july|august|september|october|november|december|10|11|12|[1-9]|0[1-9])\s*([/|-]|,| )\s*(199[0-9]|20[0-2][0-9])",text)
            if(date3!=None):
             str3=date3.group()
             text=text.replace(str3,' MMM/CD ')
             str3=re.search(r'\d+|\w+',date3.group())
             text=text.replace('MMM',str3.group()) 
            else:
                 date4=re.search(r'(199[0-9]|20[0-2][0-9])',text)
                 if(date4!=None):
                  text=text.replace(date4.group(),' CD ')  
    return text

def finall_text(text):
 text=sentence_pos(text)
 text=find_date(text)
 return text


finalltext=finall_text(text)
print(text)
print(finalltext)


