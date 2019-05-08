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
literal : string | numeric | PRIMATIVE MULT;
string : '"' ('\\"' | ~('"'))* '"';
numeric : integer | real | bool;
integer : NUMERIC_MODIFIER? NUMERIC;
real : NUMERIC DOT NUMERIC;
bool : TRUE | FALSE;

// blocks
block : funcdef | init | inline;
funcdef : signature valid END;
signature : LOCAL? FUNCTION type identifier paramlist;
init : INIT valid END;
inline : INLINE ~(END)*? END;

// one-liners
line : typedef|declare|assign|functioncall;
typedef : LOCAL? TYPE IDENTIFIER (EXTENDS IDENTIFIER)?;
declare : LOCAL? STATIC? varconst type assign;
assign : lvalue ASSIGN rvalue;

// syntax
paramlist : LPAREN (type identifier (COMMA? type identifier)*?)? RPAREN;
tuple : LPAREN (expression (COMMA? expression)*?)? RPAREN;
varconst : VAR | CONST;
type : identifier | PRIMATIVE;

// expressions, conditions, etc
identifier : IDENTIFIER | identifier DOT identifier;
evaluateable : expression | condition | assign;
rvalue : expression | condition;
lvalue : identifier;
expression : identifier | p3arithmatic | LPAREN expression RPAREN | literal | functioncall;
condition : expression comparisonoperator expression | condition booleanoperator condition | bool;
functioncall : identifier tuple;

// handy for combining expressions
p0arithmatic : identifier | literal | functioncall | LPAREN expression RPAREN;
p1arithmatic : p0arithmatic (CARAT p0arithmatic)*;
p2arithmatic : p1arithmatic ((DIV|MULT) p1arithmatic)*;
p3arithmatic : p2arithmatic ((SUB|PLUS) p2arithmatic)*;
comparisonoperator : LT|GT|EQ|LTEQ|GTEQ;
booleanoperator : and|or;
and : AND;
or : OR;