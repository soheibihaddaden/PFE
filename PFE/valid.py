from multiprocessing.sharedctypes import SynchronizedBase
from pyjarowinkler import distance
from semantique import mesure
from itertools import product
from syntax import table 
from lexicale import text
from syntax import fact 
from nltk.tokenize import word_tokenize
from nltk.corpus import wordnet   
import re


INTERNET=["sales amount","tax amount","freight transport","order quantity","discount amount"]

RESELER=["sales amount","tax amount","freight transport","order quantity","discount amount"]

PRODUCT_IVENTORY=["unit cost" ,"units balance"]

FACT=[INTERNET,RESELER,PRODUCT_IVENTORY]

DIM_T="DATE"

DIM_NT=['customer','sales territory','prodcut','promotion','currency','reseller','employee','geography']

mesure_fact=[("sales amount","internet sales",1),("sales amount","reseller sales",1),("sales amount","product iventory",0),
                ("tax amount","internet sales",1),("tax amount","reseller sales",1),("tax amount","product iventory",0),
                ("freight transport","internet sales",1),("freight transport","reseller sales",1),("freight transport","product iventory",0),
                ("order quantity","internet sales",1),("order quantity","reseller sales",1),("order quantity","product iventory",0),
                ("discount amount","internet sales",1),("discount amount","reseller sales",1),("discount amount","product iventory",0),
                ("unit cost","internet sales",0),("unit cost","reseller sales",0),("unit cost","product iventory",1),
                ("unit balance","internet sales",0),("unit balance","reseller sales",0),("unit balance","product iventory",1),] 
fact_dim=[("customer","internet sales"),("sales territory","internet sales"),('internet sales ','geography'),
("promotion","internet sales"),("currentcv","internet sales"),("product","reseller sales"),("promotion","reseller sales"),
  ("currencv","reseller sales"),("reseller","reseller sales"),("employee","reseller sales"),("sales territory","reseller sales"),
  ("product","product iventory")]

SDM=[FACT,DIM_T,DIM_NT]


def m_by_nbr(mois):
          if mois =='january':
           mois=1
          elif mois=='february':
           mois=2
          elif mois=='march':
           mois=3
          elif mois=='april':
           mois=4
          elif mois=='may':
           mois=5
          elif mois=='june':
           mois=6
          elif mois=='july':
           mois=7
          elif mois=='august':
           mois=8
          elif mois=='september':
           mois=9
          elif mois=='october':
           mois=10
          elif mois=='november':
           mois=11
          elif mois=='december':
           mois=12
          return mois

if table[1]!='qst_err':
 try:
  jaro_winkler=distance.get_jaro_distance

  ter=table[0].replace(fact(text),'')

  if(',' in ter ):
    ter=ter.split(",")

  mesure_valid=[]
  if ter!='' and table[0] not in DIM_NT:
   if fact(text)=='internet' or fact(text)=='reseller' or fact(text)=='':
        if type(ter)==str:
            for m in SDM[0][0]:
             if jaro_winkler(ter,m)>=0.8:
                mesure_valid.append(m)
              
        else: 
            for el in ter :
               for m in SDM[0][0]:
                 if jaro_winkler(el,m)>=0.8:
                  mesure_valid.append(m)
                  
        if len(mesure_valid)==0:
            if type(ter)==str:
              syn = list()
              for token in  word_tokenize(ter):
                for synset in wordnet.synsets(token):
                    for lemma in synset.lemmas():
                        syn.append(lemma.name())
              for m in SDM[0][0]:
                list1=[]
                for token in word_tokenize(m):
                     list1.append(token)
                i=0
                tr=True
                while(i<len(list1) and tr==True):
                  if list1[i] in syn:
                    pass
                  else:
                      tr2=False
                      j=0
                      while j <len(syn) and tr2==False:
                        if jaro_winkler(syn[j],list1[i])>=0.8:
                            tr2=True         
                        j+=1 
                      if tr2==False:
                       tr=False    
                  i+=1
                
                if tr==True:
                  mesure_valid.append(m)
                
            else: 
              for el in ter :           
                syn = list()
                for token in  word_tokenize(el):
                 for synset in wordnet.synsets(token):
                    for lemma in synset.lemmas():
                        syn.append(lemma.name())
                for m in SDM[0][0]:
                 list1=[]
                 for token in word_tokenize(m):
                     list1.append(token)
                 
                 i=0
                 tr=True
                 while(i<len(list1) and tr==True):
                  if list1[i] in syn:
                    pass
                  else:
                     tr2=False
                     j=0
                     while j <len(syn) and tr2==False:
                        if jaro_winkler(syn[j],list1[i])>=0.8:
                            tr2=True  
                        j+=1 
                     if tr2==False:
                       tr=False       
                  i+=1
                 if tr==True:
                  mesure_valid.append(m)
                
        if len(mesure_valid)==0:
            if type(ter)==str:
                list1=[]
                for token in word_tokenize(ter):
                        list1.append(token)
                i=1
                while(i<=len(list1)) :
                  res = [ele for ele in product(list1,repeat=i)]
                  for tupl in res:
                        for m in SDM[0][0]:
                         if jaro_winkler(' '.join(tupl),m)>=0.8:
                           mesure_valid.append(m)
                        
                  i+=1         
            else:
             for lst in  ter:
                list1=[]
                for token in word_tokenize(lst):
                        list1.append(token)
                i=1
                while(i<=len(list1)) :
                  res = [ele for ele in product(list1,repeat=i)]
                  for tupl in res:
                        for m in SDM[0][0]:
                         if jaro_winkler(' '.join(tupl),m)>=0.8:
                           mesure_valid.append(m)
                          
                  i+=1    
            if len(mesure_valid)!=0:
                mesure_valid=list(set(mesure_valid))
   if(fact(text)=='product iventory' or fact(text)==''):

        if type(ter)==str:
            for m in SDM[0][2]:
             if jaro_winkler(ter,m)>=0.8:
                mesure_valid.append(m)
              
        else: 
            for el in ter :
               for m in SDM[0][2]:
                 if jaro_winkler(el,m)>=0.8:
                  mesure_valid.append(m)
                  
        if len(mesure_valid)==0:
            if type(ter)==str:
              syn = list()
              for token in  word_tokenize(ter):
                for synset in wordnet.synsets(token):
                    for lemma in synset.lemmas():
                        syn.append(lemma.name())
              for m in SDM[0][2]:
                list1=[]
                for token in word_tokenize(m):
                     list1.append(token)
                i=0
                tr=True
                while(i<len(list1) and tr==True):
                  if list1[i] in syn:
                    pass
                  else:
                      tr2=False
                      j=0
                      while j <len(syn) and tr2==False:
                        if jaro_winkler(syn[j],list1[i])>=0.8:
                            tr2=True         
                        j+=1 
                      if tr2==False:
                       tr=False    
                  i+=1
                
                if tr==True:
                  mesure_valid.append(m)
                
            else: 
              for el in ter :           
                syn = list()
                for token in  word_tokenize(el):
                 for synset in wordnet.synsets(token):
                    for lemma in synset.lemmas():
                        syn.append(lemma.name())
                for m in SDM[0][2]:
                 list1=[]
                 for token in word_tokenize(m):
                     list1.append(token)
                 
                 i=0
                 tr=True
                 while(i<len(list1) and tr==True):
                  if list1[i] in syn:
                    pass
                  else:
                     tr2=False
                     j=0
                     while j <len(syn) and tr2==False:
                        if jaro_winkler(syn[j],list1[i])>=0.8:
                            tr2=True  
                        j+=1 
                     if tr2==False:
                       tr=False       
                  i+=1
                 if tr==True:
                  mesure_valid.append(m)
                
        if len(mesure_valid)==0:
            if type(ter)==str:
                list1=[]
                for token in word_tokenize(ter):
                        list1.append(token)
                i=1
                while(i<=len(list1)) :
                  res = [ele for ele in product(list1,repeat=i)]
                  for tupl in res:
                        for m in SDM[0][2]:
                         if jaro_winkler(' '.join(tupl),m)>=0.8:
                           mesure_valid.append(m)
                        
                  i+=1         
            else:
             for lst in  ter:
                list1=[]
                for token in word_tokenize(lst):
                        list1.append(token)
                i=1
                while(i<=len(list1)) :
                  res = [ele for ele in product(list1,repeat=i)]
                  for tupl in res:
                        for m in SDM[0][2]:
                         if jaro_winkler(' '.join(tupl),m)>=0.8:
                           mesure_valid.append(m)
                          
                  i+=1    
  if len(mesure_valid)!=0:
   mesure_valid=list(set(mesure_valid))
 except:
  mesure_valid=[]   
##############################################################################################################

##############################################################################################################
 
 year=0
 mois=0

 if table[2][1]==1:
    date1=re.search(r'\w+\s+(199[0-9]|20[0-2][0-9])',table[2][0]) 
    if date1!=None:
     st=date1.group()  
     y=re.search(r'(199[0-9]|20[0-2][0-9])',st)
     st=st.replace(y.group(),'')
     year=y.group()
     mois=st.replace(' ','')
     try:
        if type(int(mois))==int :
          pass
     except: 
       mois=m_by_nbr(mois)
 elif table[2][1]==2:
      date2=re.search(r'([/|-]|,|.)\s*\w+\s*([/|-]|,|.)\s*(199[0-9]|20[0-2][0-9])',table[2][0])
      if date2!=None:
        st=date2.group()  
        y=re.search(r'(199[0-9]|20[0-2][0-9])',st)
        st=st.replace(y.group(),'')
        pt=re.search(r'([/|-]|,|.)',st)
        st=st.replace(pt.group(),'')
        st=st.replace(' ','')
        mois=st
        year=y.group()
        try:
         if type(int(mois))==int :
          pass
        except: 
           mois=m_by_nbr(mois)
 elif table[2][1]==3:
     date3=re.search(r'(january|february|march|april|may|june|july|august|september|october|november|december)',table[2][0])
     mois=m_by_nbr(date3.group())
     date3=re.search(r'(199[0-9]|20[0-2][0-9])',table[2][0])   
     year=date3.group()

 elif table[2][1]==4:    
     date4=re.search(r'(january|february|march|april|may|june|july|august|september|october|november|december)',table[2][0])
     mois=m_by_nbr(date4.group())
     date4=re.search(r'(199[0-9]|20[0-2][0-9])',table[2][0])   
     year=date4.group()

 elif table[2][1]==5: 
    date5=re.search(r'(199[0-9]|20[0-2][0-9])',table[2][0])   
    year=date5.group()
  
 elif table[2][1]==6:
    date6=re.search(r'(january|february|march|april|may|june|july|august|september|october|november|december)',table[2][0])
    mois=m_by_nbr(date6.group())

#  print(mois)
#  print(year)    
#  print(fact(text))
#  #if fact='' than propose fact  
 if(mesure_valid!=[]):
  print(mesure_valid)
 if(mesure_valid!=[] and fact(text)==""):
   print("les questions recommandées :")
   for mesure in mesure_valid:
      if mesure in INTERNET:
        print(f"why internet {mesure} {table[1]} in {table[2][0]} ?")
        print(f"why reseller  {mesure} {table[1]} in {table[2][0]} ?")
      elif(mesure in PRODUCT_IVENTORY):
       print(f"why prodcut iventory {mesure} {table[1]} in {table[2][0]} ?")

 if mesure_valid==[]:
    if table[0] in DIM_NT:
     tb_fact=[item for item in fact_dim if item[0] ==table[0]] 
     tb_mesure=[]
     for el in tb_fact:
      mesure_find=[item for item in mesure_fact if(item[1]==el[1] and item[2]==1)]
      for ms in mesure_find:
        tb_mesure.append(ms[0])
     print("les questions recommandées :")
     for mesure in list(set(tb_mesure)):
      if mesure in INTERNET:
        print(f"why internet {mesure} {table[1]} in {table[2][0]} ?")
        print(f"why reseller  {mesure} {table[1]} in {table[2][0]} ?")
      elif(mesure in PRODUCT_IVENTORY):
       print(f"why prodcut iventory {mesure} {table[1]} in {table[2][0]} ?")
    else:
      ter=table[0].replace(fact(text),'')
      if(',' in ter ):
       ter=ter.split(",")
      mesure_valid=[]
      if type(ter)==str:
            for m in DIM_NT:
             if jaro_winkler(ter,m)>=0.8:
                mesure_valid.append(m)              
      else: 
            for el in ter :
               for m in DIM_NT:
                 if jaro_winkler(el,m)>=0.8:
                  mesure_valid.append(m)
                  
                  
      if len(mesure_valid)==0:
            if type(ter)==str:
              syn = list()
              for token in  word_tokenize(ter):
                for synset in wordnet.synsets(token):
                    for lemma in synset.lemmas():
                        syn.append(lemma.name())
              for m in DIM_NT:
                list1=[]
                for token in word_tokenize(m):
                     list1.append(token)
                i=0
                tr=True
                while(i<len(list1) and tr==True):
                  if list1[i] in syn:
                    pass
                  else:
                      tr2=False
                      j=0
                      while j <len(syn) and tr2==False:
                        if jaro_winkler(syn[j],list1[i])>=0.8:
                            tr2=True         
                        j+=1 
                      if tr2==False:
                       tr=False    
                  i+=1
                
                if tr==True:
                  mesure_valid.append(m)
              
      else: 
              for el in ter :           
                syn = list()
                for token in  word_tokenize(el):
                 for synset in wordnet.synsets(token):
                    for lemma in synset.lemmas():
                        syn.append(lemma.name())
                for m in DIM_NT:
                 list1=[]
                 for token in word_tokenize(m):
                     list1.append(token)
                 i=0
                 tr=True
                 while(i<len(list1) and tr==True):
                  if list1[i] in syn:
                    pass
                  else:
                     tr2=False
                     j=0
                     while j<len(syn) and tr2==False:
                        if jaro_winkler(syn[j],list1[i])>=0.8:
                            tr2=True  
                        j+=1 
                     if tr2==False:
                       tr=False       
                  i+=1
                 if tr==True and len(mesure_valid)<len(ter):
                  mesure_valid.append(m)
   
      if len(mesure_valid)==0:
            if type(ter)==str:
                list1=[]
                for token in word_tokenize(ter):
                        list1.append(token)
                i=1
                while(i<=len(list1)) :
                  res = [ele for ele in product(list1,repeat=i)]
                  for tupl in res:
                        for m in DIM_NT:
                         if jaro_winkler(' '.join(tupl),m)>=0.8:
                           mesure_valid.append(m)
                        
                  i+=1         
            else:
             for lst in  ter:
                list1=[]
                for token in word_tokenize(lst):
                        list1.append(token)
                i=1
                while(i<=len(list1)) :
                  res = [ele for ele in product(list1,repeat=i)]
                  for tupl in res:
                        for m in DIM_NT:
                         if jaro_winkler(' '.join(tupl),m)>=0.8:
                           mesure_valid.append(m)
                  i+=1    
      if len(mesure_valid)!=0:
       mesure_valid=list(set(mesure_valid))       
       tb_qst=[]
      if(mesure_valid!=[]):
        for mes_ure in mesure_valid:
         tb_fact=[item for item in fact_dim if jaro_winkler(item[0],mes_ure)>=0.94] 
         for elm in tb_fact:
           mes_ure_find=[item for item in mesure_fact if jaro_winkler(item[1],elm[1])>0.94 and item[2]==1] 
           for msr in mes_ure_find:
             el=elm[1].replace("sales","")
             qst=f"why {el} {msr[0]} {table[1]} in {table[2][0]}"
             tb_qst.append(qst)
        for qst in list(set(tb_qst)):
          print(qst)   
#la qst n'est pas conforme
# else:
#  print(table[0])
#  try:
#   jaro_winkler=distance.get_jaro_distance

#   ter=table[0][0].replace(fact(text),'')

#   if(',' in ter ):
#     ter=ter.split(",")

#   mesure_valid=[]
#   if ter!='':
#    if fact(text)=='internet' or fact(text)=='reseler' or fact(text)=='':
#         if type(ter)==str:
#             for m in SDM[0][0]:
#              if jaro_winkler(ter,m)>=0.8:
#                 mesure_valid.append(m)
              
#         else: 
#             for el in ter :
#                for m in SDM[0][0]:
#                  if jaro_winkler(el,m)>=0.8:
#                   mesure_valid.append(m)
                  
#         if len(mesure_valid)==0:
#             if type(ter)==str:
#               syn = list()
#               for token in  word_tokenize(ter):
#                 for synset in wordnet.synsets(token):
#                     for lemma in synset.lemmas():
#                         syn.append(lemma.name())
#               for m in SDM[0][0]:
#                 list1=[]
#                 for token in word_tokenize(m):
#                      list1.append(token)
#                 i=0
#                 tr=True
#                 while(i<len(list1) and tr==True):
#                   if list1[i] in syn:
#                     pass
#                   else:
#                       tr2=False
#                       j=0
#                       while j <len(syn) and tr2==False:
#                         if jaro_winkler(syn[j],list1[i])>=0.8:
#                             tr2=True         
#                         j+=1 
#                       if tr2==False:
#                        tr=False    
#                   i+=1
                
#                 if tr==True:
#                   mesure_valid.append(m)
                
#             else: 
#               for el in ter :           
#                 syn = list()
#                 for token in  word_tokenize(el):
#                  for synset in wordnet.synsets(token):
#                     for lemma in synset.lemmas():
#                         syn.append(lemma.name())
#                 for m in SDM[0][0]:
#                  list1=[]
#                  for token in word_tokenize(m):
#                      list1.append(token)
                 
#                  i=0
#                  tr=True
#                  while(i<len(list1) and tr==True):
#                   if list1[i] in syn:
#                     pass
#                   else:
#                      tr2=False
#                      j=0
#                      while j <len(syn) and tr2==False:
#                         if jaro_winkler(syn[j],list1[i])>=0.8:
#                             tr2=True  
#                         j+=1 
#                      if tr2==False:
#                        tr=False       
#                   i+=1
#                  if tr==True:
#                   mesure_valid.append(m)
                
#         if len(mesure_valid)==0:
#             if type(ter)==str:
#                 list1=[]
#                 for token in word_tokenize(ter):
#                         list1.append(token)
#                 i=1
#                 while(i<=len(list1)) :
#                   res = [ele for ele in product(list1,repeat=i)]
#                   for tupl in res:
#                         for m in SDM[0][0]:
#                          if jaro_winkler(' '.join(tupl),m)>=0.8:
#                            mesure_valid.append(m)
                        
#                   i+=1         
#             else:
#              for lst in  ter:
#                 list1=[]
#                 for token in word_tokenize(lst):
#                         list1.append(token)
#                 i=1
#                 while(i<=len(list1)) :
#                   res = [ele for ele in product(list1,repeat=i)]
#                   for tupl in res:
#                         for m in SDM[0][0]:
#                          if jaro_winkler(' '.join(tupl),m)>=0.8:
#                            mesure_valid.append(m)
                          
#                   i+=1    
#             if len(mesure_valid)!=0:
#                 mesure_valid=list(set(mesure_valid))
#    if(fact(text)=='product iventory' or fact(text)==''):

#         if type(ter)==str:
#             for m in SDM[0][2]:
#              if jaro_winkler(ter,m)>=0.8:
#                 mesure_valid.append(m)
              
#         else: 
#             for el in ter :
#                for m in SDM[0][2]:
#                  if jaro_winkler(el,m)>=0.8:
#                   mesure_valid.append(m)
                  
#         if len(mesure_valid)==0:
#             if type(ter)==str:
#               syn = list()
#               for token in  word_tokenize(ter):
#                 for synset in wordnet.synsets(token):
#                     for lemma in synset.lemmas():
#                         syn.append(lemma.name())
#               for m in SDM[0][2]:
#                 list1=[]
#                 for token in word_tokenize(m):
#                      list1.append(token)
#                 i=0
#                 tr=True
#                 while(i<len(list1) and tr==True):
#                   if list1[i] in syn:
#                     pass
#                   else:
#                       tr2=False
#                       j=0
#                       while j <len(syn) and tr2==False:
#                         if jaro_winkler(syn[j],list1[i])>=0.8:
#                             tr2=True         
#                         j+=1 
#                       if tr2==False:
#                        tr=False    
#                   i+=1
                
#                 if tr==True:
#                   mesure_valid.append(m)
                
#             else: 
#               for el in ter :           
#                 syn = list()
#                 for token in  word_tokenize(el):
#                  for synset in wordnet.synsets(token):
#                     for lemma in synset.lemmas():
#                         syn.append(lemma.name())
#                 for m in SDM[0][2]:
#                  list1=[]
#                  for token in word_tokenize(m):
#                      list1.append(token)
                 
#                  i=0
#                  tr=True
#                  while(i<len(list1) and tr==True):
#                   if list1[i] in syn:
#                     pass
#                   else:
#                      tr2=False
#                      j=0
#                      while j <len(syn) and tr2==False:
#                         if jaro_winkler(syn[j],list1[i])>=0.8:
#                             tr2=True  
#                         j+=1 
#                      if tr2==False:
#                        tr=False       
#                   i+=1
#                  if tr==True:
#                   mesure_valid.append(m)
                
#         if len(mesure_valid)==0:
#             if type(ter)==str:
#                 list1=[]
#                 for token in word_tokenize(ter):
#                         list1.append(token)
#                 i=1
#                 while(i<=len(list1)) :
#                   res = [ele for ele in product(list1,repeat=i)]
#                   for tupl in res:
#                         for m in SDM[0][2]:
#                          if jaro_winkler(' '.join(tupl),m)>=0.8:
#                            mesure_valid.append(m)
                        
#                   i+=1         
#             else:
#              for lst in  ter:
#                 list1=[]
#                 for token in word_tokenize(lst):
#                         list1.append(token)
#                 i=1
#                 while(i<=len(list1)) :
#                   res = [ele for ele in product(list1,repeat=i)]
#                   for tupl in res:
#                         for m in SDM[0][2]:
#                          if jaro_winkler(' '.join(tupl),m)>=0.8:
#                            mesure_valid.append(m)
                          
#                   i+=1    
#             if len(mesure_valid)!=0:
#                 mesure_valid=list(set(mesure_valid))
#  except:
#   mesure_valid=[]
#  if(mesure_valid==[]):
