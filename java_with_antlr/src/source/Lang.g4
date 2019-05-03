grammar Lang;

import Tokens;

// structural
program : valid EOF;
valid : parsable*;
parsable : funcdef|comment|inline|debugging;
debugging : evaluateable;

// comments, duh
comment : COMMENT;

// literals
literal : string | numeric;
string : '"' ('\\"' | ~('"'))* '"';
numeric : integer | real;
integer : NUMERIC_MODIFIER? NUMERIC;
real : NUMERIC DOT NUMERIC;
bool : TRUE | FALSE;

// blocks
funcdef : FUNCTION IDENTIFIER paramlist valid END;
init : INIT valid END;
inline : INLINE ~(END)*? END;

// syntax
paramlist : LPAREN (IDENTIFIER (COMMA? IDENTIFIER)*?)? RPAREN;

// expressions, conditions, etc
evaluateable : expression | condition | assign;
rvalue : expression | condition;
lvalue : IDENTIFIER;
assign : lvalue ASSIGN rvalue;
expression : IDENTIFIER | expression arithmaticoperator expression | LPAREN expression RPAREN | literal;
condition : expression comparisonoperator expression | condition booleanoperator condition | bool;

// handy for combining expressions
arithmaticoperator : DIV|MULT|SUB|PLUS|CARAT;
comparisonoperator : LT|GT|EQ|LTEQ|GTEQ;
booleanoperator : AND|OR;