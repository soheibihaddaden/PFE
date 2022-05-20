# Python3 code to demonstrate working of
# All possible N combination tuples
# Using list comprehension + product()
from itertools import product
from nltk.corpus import wordnet   
# initialize N
N = 3

# All possible N combination tuples
# Using list comprehension + product()

list1=['soheib','ihaddaden']
i=1
while(i<=len(list1)) :
    res = [ele for ele in product(list1,repeat=i)]
    print(res)
    i+=1
print(res)


tupl=('soheib','ihaddaden')
print(' '.join(tupl))

from nltk.tokenize import word_tokenize

syn = list()
ant = list()

phrase='sales amount'
for token in word_tokenize(phrase):
 for synset in wordnet.synsets(token):
   for lemma in synset.lemmas():
      syn.append(lemma.name())    #add the synonyms
print(syn)
