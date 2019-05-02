grammar Tokens;

COMMENT : '//' .*? '\n' | '/*' .*? '*/';
MULT : '*';
DIV : '/';
SUB : '-';
PLUS : '+';
CARAT : '^';
LPAREN : '(';
RPAREN : ')';
END : 'end';
FUNCTION : 'function'|'func';
IF : 'if';
COMMA : ',';

IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;
NEWLINE : [\n]+ -> skip;
WHITESPACE : [\r\t ]+ -> skip;
