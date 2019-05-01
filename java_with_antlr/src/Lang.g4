grammar Lang;

import Tokens;

program : (valid)+ EOF;

valid : expression;

expression : IDENTIFIER | expression operator expression | LPAREN expression RPAREN;

operator : DIV|MULT|SUB|PLUS;
