JAVAFILES=$(wildcard *.java)
CLASSFILES=$(subst .java,.class,$(JAVAFILES))

all : ready test

ready : parser compile

test :
	java -cp ".;./antlr-4.7.2-complete.jar" org.antlr.v4.Tool -visitor Lang.g4
	make compile
	cd .. && java compiler.Reader source/main.src source/lang > source/temp.txt.temp && cd source && cat temp.txt.temp | java -cp ".;./antlr-4.7.2-complete.jar" org.antlr.v4.gui.TestRig Lang program -gui

run : ready
	cd .. && java -cp ".;./antlr-4.7.2-complete.jar" compiler.Compiler main.src lang

compile : $(CLASSFILES)

%.class : %.java
	javac -cp ".;./antlr-4.7.2-complete.jar" $(JAVAFILES)

parser : Lang.g4 Tokens.g4
	java -cp ".;./antlr-4.7.2-complete.jar" org.antlr.v4.Tool -visitor -package source Lang.g4

clean :
	rm *.class Lang*.java *.tokens *.interp
