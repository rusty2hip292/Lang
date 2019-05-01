grammar Tokens;

MULT : '*';
DIV : '/';
SUB : '-';
PLUS : '+';
LPAREN : '(';
RPAREN : ')';

IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;
NEWLINE : [\n]+ -> skip;
WHITESPACE : [\r\t ]+ -> skip;
