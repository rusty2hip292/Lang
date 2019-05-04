lexer grammar Tokens;

// this needs to be first
COMMENT : '/' '/' .*? '\n' | '/' '*' .*? '*' '/';	// "//" through newline or "/*" through "*/"

// numeric literal
NUMERIC : [0-9]+;
NUMERIC_MODIFIER : '0x'|'0b';

// operators
MULT : '*';
DIV : '/';
SUB : '-';
PLUS : '+';
CARAT : '^';
LTEQ : '<=';
GTEQ : '>=';
LT : '<';
GT : '>';
EQ : '==';
AND : '&&'|'and';
OR : '||'|'or';
ASSIGN : '=';

// syntactic
LPAREN : '(';
RPAREN : ')';
COMMA : ',';
DOT : '.';

// keywords
IF : 'if';
FUNCTION : 'function'|'func'; // either
INIT : 'init';
INLINE : 'inline'|'inline-C';
TYPE : 'type';
PRIMITIVE : 'primitive';
END : 'end';
TRUE : 'true';
FALSE : 'false';
EXTENDS : 'extends';
VAR : 'var';
CONST : 'const';

// leave these down here
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;
NEWLINE : [\n]+ -> skip; // in case we ever decide to start using newlines as tokens
WHITESPACE : [\r\t ]+ -> skip;