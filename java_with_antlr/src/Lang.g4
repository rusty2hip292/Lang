grammar Lang;

TOKEN : [a-zA-Z0-9]+ ;
WHITESPACE : [ \t\r\n]+;

program : (TOKEN WHITEPACE?)+;
