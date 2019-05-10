
grammar Cplusplusplus;

identifier : IDENTIFIER;
IDENTIFIER : [a-zA-Z_] [a-zA-Z_0-9]*;

whitespace : WHITESPACE;
WHITESPACE : [\n\t\r ]+;

//equals : EQUALS;
//EQUALS : '=';

anythingelse : ANYTHINGELSE+;
ANYTHINGELSE : .+?|'\n'|'->'|'='|';'|'('|')';
  
eof : EOF;

program : code eof;
code : (noout | out)+;

noout : oursyntax;
out : anythingelse | identifier | whitespace | bracketed;// | varinit | assign;

oursyntax : classdef|new_;

classdef : 'class' whitespace? IDENTIFIER {System.out.print("// auto generated with ANTLR\nstruct " + $IDENTIFIER.text + " {\n");} whitespace? bracketed;
new_ : 'new' whitespace? IDENTIFIER;

bracketed : '{' code '}';
