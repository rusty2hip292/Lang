lexer grammar Tokens;

// this needs to be first
COMMENT : '/' '/' .*? '\n' | '/' '*' .*? '*' '/';	// "//" through newline or "/*" through "*/"

TYPE : 'type';
PRIMATIVE : 'primative';

ANYTHING : . | '\n';