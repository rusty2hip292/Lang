JAVAFILES=$(sort $(wildcard *.java))
CLASSFILES=$(subst .java,.class,$(JAVAFILES))

all : Compiler Makefile

run : Compiler
	java Compiler main.src lang

Compiler : $(CLASSFILES)

%.class : %.java
	javac $*.java

clean :
	rm *.class
