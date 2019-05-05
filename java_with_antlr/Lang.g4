grammar Lang;

import Tokens;

// structural
program : valid EOF;
valid : parsable*;
parsable : comment|block|line;
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
funcdef : FUNCTION identifier paramlist valid END;
init : INIT valid END;
inline : INLINE ~(END)*? END;

// one-liners
line : typedef|assign|functioncall;
typedef : LOCAL? TYPE IDENTIFIER (EXTENDS IDENTIFIER)?;
assign : (varconst IDENTIFIER?)? lvalue ASSIGN rvalue;

// syntax
paramlist : LPAREN (identifier (COMMA? identifier)*?)? RPAREN;
varconst : VAR | CONST;

// expressions, conditions, etc
identifier : IDENTIFIER | identifier DOT identifier;
evaluateable : expression | condition | assign;
rvalue : expression | condition;
lvalue : identifier;
expression : identifier | p3arithmatic | LPAREN expression RPAREN | literal | functioncall;
condition : expression comparisonoperator expression | condition booleanoperator condition | bool;
functioncall : identifier paramlist;

// handy for combining expressions
p0arithmatic : identifier | literal | functioncall | LPAREN expression RPAREN;
p1arithmatic : p0arithmatic (CARAT p0arithmatic)*;
p2arithmatic : p1arithmatic ((DIV|MULT) p1arithmatic)*;
p3arithmatic : p2arithmatic ((SUB|PLUS) p2arithmatic)*;
comparisonoperator : LT|GT|EQ|LTEQ|GTEQ;
booleanoperator : and|or;
and : AND;
or : OR;