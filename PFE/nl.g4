grammar nl;

why_question:question_pronoun ng  mg* trend_indicator mg* (fil_ter)+ interogation? EOF #whyExpr
             |EROOR_RECOGNITION #Error
            ;

 

question_pronoun:'why';


fil_ter:dimension_marker ngf
       |dimension_marker  temporel_dimension
       |filter_operator  ngf
       |filter_operator  temporel_dimension
      ;

temporel_dimension: ng date |date;

filter_operator:'equal'|'more than'|'this'|'less than'|'with'|'between';

dimension_marker:'for'|'during'|preposition|'since'|'while'|'when'|'according to';


ng : determinant? ng1 ((',' determinant? ng1)+|(',' determinant? ng1)* (conj_coordination determinant? ng1))?;
       
ngf : determinant? ng_f1 ((',' determinant? ng_f1)+|(',' determinant? ng_f1)* (conj_coordination determinant? ng_f1))?;       
ng1: (nominal_term | adjective |preposition) (nominal_term | adjective | past_participale| preposition)*;

ng_f1: (nominal_term | adjective |preposition) (nominal_term | adjective | past_participale)*;
determinant :'DT';

conj_coordination:'and';

trend_indicator:'decrease' | 'increase' | 'low' | 'high' | 'stagnation' | 'stable' | 'evolve' | 'didn\'t evolve' |'decreased' |'increased' ;

nominal_term: noun | mesure_indicator | temporel_lexicon;


noun :'NN'|'NNS'|'NNP'|'NNPS';


mesure_indicator:'quantity' | 'amount' | 'total' | 'number' | 'volume' | 'ratio' | 'percentage' | 'degree';


temporel_lexicon:'time' |'year' |'month' |'day'|'season'|'hour'|'minute'|'seconde'; 



adjective:'JJ'|'JJR'|'JJS';


past_participale:'VBN';

preposition:'IN'|'in';


mg:verb
  |WORD;


verb:'VB'|'VBG'|'VBD'|'VBP'|'VBZ';



date : DIGIT'/' MMM '/' DIGIT
     | DIGIT '/' DIGIT '/' DIGIT
     | MMM '/' DIGIT '/' DIGIT
     | MMM'/' DIGIT
     | MMM
     | DIGIT
     ;

DIGIT:'CD';


MMM:'january' |'01'
   |'february'  |'02'
   |'march'  |'03'
   |'april'  |'04'
   |'may'  |'05' 
   |'june'  |'06' 
   |'july'  |'07' 
   |'august'  |'08' 
   |'september'  |'09' 
   |'october'  |'10' 
   |'november'  |'11'
   |'december'  |'12'
   ;



WORD:[A-Za-z]+;

interogation:'?';


EROOR_RECOGNITION: ~[ ] ; 

WS : [ \r\t\n] -> skip;