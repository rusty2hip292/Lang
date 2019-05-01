JAVAFILES=$(shell find ./ -type f -name '*.java')
CLASSFILES=$(subst .java,.class,$(JAVAFILES))

all : Compiler Makefile

run : Compiler
	java Compiler main.src lang

Compiler : $(CLASSFILES)

%.class : %.java
	javac $*.java

clean :
	rm *.class
