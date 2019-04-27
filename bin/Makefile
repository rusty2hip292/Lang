JAVAFILES=$(sort $(wildcard *.java))
CLASSFILES=$(subst .java,.class,$(JAVAFILES))

all : Compiler Makefile

run : Compiler
	java Compiler langsrc

Compiler : $(CLASSFILES)

%.class : %.java
	javac $*.java

clean :
	rm *.class
