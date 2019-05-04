grammar Lang;

import Tokens;

// structural
program : valid EOF;
valid : parsable*;
parsable : comment|block|debugging;
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
block : funcdef | init | inline;
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
expression : IDENTIFIER | p3arithmatic | LPAREN expression RPAREN | literal | functioncall;
condition : expression comparisonoperator expression | condition booleanoperator condition | bool;
functioncall : IDENTIFIER paramlist;

// handy for combining expressions
p0arithmatic : IDENTIFIER | literal | functioncall | LPAREN expression RPAREN;
p1arithmatic : p0arithmatic (CARAT p0arithmatic)*;
p2arithmatic : p1arithmatic ((DIV|MULT) p1arithmatic)*;
p3arithmatic : p2arithmatic ((SUB|PLUS) p2arithmatic)*;
comparisonoperator : LT|GT|EQ|LTEQ|GTEQ;
booleanoperator : and|or;
and : AND;
or : OR;