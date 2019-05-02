grammar Lang;

import Tokens;

program : (valid)* EOF;

valid : expression|funcdef|comment;

comment : COMMENT;

funcdef : FUNCTION IDENTIFIER LPAREN RPAREN valid END;

expression : IDENTIFIER | expression operator expression | LPAREN expression RPAREN;

operator : DIV|MULT|SUB|PLUS;

