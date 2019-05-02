JAVAFILES=$(wildcard *.java)
CLASSFILES=$(subst .java,.class,$(JAVAFILES))

all : ready

ready : parser compile

test : ready
	java Reader main.src lang | java -cp ".;./antlr-4.7.2-complete.jar" org.antlr.v4.gui.TestRig Lang program -gui

run : ready
	java Compiler

compile : $(CLASSFILES)

%.class : %.java
	javac -cp ".;./antlr-4.7.2-complete.jar" $(JAVAFILES)

parser : Lang.g4
	java -cp ".;./antlr-4.7.2-complete.jar" org.antlr.v4.Tool -visitor Lang.g4

clean :
	rm *.class Lang*.java *.tokens *.interp
