from semantique import date
from semantique import dim_temporel
from semantique import tandence
from semantique import mesure
from semantique import dim_non_temporel
from nltk.tokenize import word_tokenize
import nltk
from antlr4 import *
from nlVisitor import nlVisitor 
from nlParser import nlParser
from nlLexer import nlLexer
from antlr4.error.ErrorListener import ErrorListener
from antlr4.tree.Trees import Trees
import re
from lexicale import text
from lexicale import finalltext


class MyErrorListener( ErrorListener ):
    error=False
    def __init__(self):
        super(MyErrorListener, self).__init__()

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        MyErrorListener.error=True
        
    def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
        MyErrorListener.error=True
     
    def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
        MyErrorListener.error=True


    def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
        MyErrorListener.error=True
        



class mynlq(nlVisitor):
   pass


def print_tree(tree):
    context=[]
    i=0
    for c in tree.getChildren():
        try:
            context.append(c.getText())
            i+=1
        except:
            pass
    return context,i




def verify_question(text):
    t1=re.search(r'ng\s',text)
    if(t1!=None):
        t2=re.search(r'trend_indicator',text)
        if(t2!=None):
            t3=re.search(r'temporel_dimension',text)
            if(t3!=None):
                return True
            else: return False     





def fact(text):
   dim=re.search('internet',text)
   if dim==None:
       dim=re.search('reseller',text)
       if dim==None:
        dim=re.search('product'+r'\s*'+'inventory',text)
   if dim!=None:
        return dim.group()
   else: return ''    






def anlysequestion():
        text_sn=finalltext
        te_xt=text
        data =  InputStream(text_sn) 
        lexer = nlLexer(data) 
        stream = CommonTokenStream(lexer) 
        lexer.removeErrorListeners() 
        parser = nlParser(stream)
        parser.removeErrorListeners() 
        parser.addErrorListener( MyErrorListener() ) 
        tree = parser.why_question()       
       # evaluator 
        visitor = mynlq() 
        output = visitor.visit(tree)
        arbre=Trees.toStringTree(tree, None, parser)
        #verification de question       
        if MyErrorListener.error==False:
            if verify_question(arbre)==True:
                print("la question est conforme ")
                # print(arbre)
                # print(print_tree(tree)[0])
                listtoken_arbre=word_tokenize(arbre)
                ngContext=list()
                for token in listtoken_arbre:
                  if token in print_tree(tree)[0][1]:
                      ngContext.append(token)
                while(''.join(ngContext)!=print_tree(tree)[0][1]):
                     ngContext.pop()
                l=[]
                for token in word_tokenize(te_xt):
                    l.append(token)     
                ngContextstr=[] 
                i=0    
                while(i<len(ngContext)):
                    ngContextstr.append(l[i+1])
                    i+=1 
                mes_ure=' '.join(ngContextstr)
                print("la mesure  :",' '.join(ngContextstr))              
                tend_ence=tandence(te_xt)
                print('la tandence  :',tandence(te_xt))
                da_te=date(te_xt)
                if dim_temporel(te_xt)!='':
                    print('la dimension tomporel est :',dim_temporel(te_xt))
                else: print('la dimension tomporel est :',date(te_xt)[0])
                d_n_t=[]
                if dim_non_temporel(arbre,te_xt)!=[]:
                 for d in dim_non_temporel(arbre,te_xt):
                    if d not in ' '.join(ngContextstr):
                        d_n_t.append(d)        
                if d_n_t!=[]:
                    print('la dimension non temporel est :',' '.join(d_n_t))         
                return [mes_ure,tend_ence,da_te,d_n_t] 
        else:
             try:
                listtoken_arbre=word_tokenize(arbre)
                ngContext=list()
                for token in listtoken_arbre:
                  if token in print_tree(tree)[0][1]:
                      ngContext.append(token)
                while(''.join(ngContext)!=print_tree(tree)[0][1]):
                     ngContext.pop()
                l=[]
                for token in word_tokenize(te_xt):
                    l.append(token)     
                ngContextstr=[] 
                i=0    
                while(i<len(ngContext)):
                    ngContextstr.append(l[i+1])
                    i+=1 
                    
                mes_ure=' '.join(ngContextstr)            
                tend_ence=tandence(te_xt)
                da_te=date(te_xt)
                d_n_t=[]
                if dim_non_temporel(arbre,te_xt)!=[]:
                 for d in dim_non_temporel(arbre,te_xt):
                    if d not in ' '.join(ngContextstr):
                        d_n_t.append(d)       
                return [mes_ure,tend_ence,da_te,d_n_t],"qst_err"               
             except: 
                return [],"qst_err"
                MyErrorListener.error=False
            
table=anlysequestion()
