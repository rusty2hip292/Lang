JAVAFILES=$(wildcard *.java)
CLASSFILES=$(subst .java,.class,$(JAVAFILES))

all : run

run : parser compile
	java Reader main.src lang | java -cp ".;./antlr-4.7.2-complete.jar" org.antlr.v4.gui.TestRig Lang r -tree

compile : $(CLASSFILES)

%.class : %.java
	javac -cp ".;./antlr-4.7.2-complete.jar" $(JAVAFILES)

parser : Lang.g4
	-java -cp ".;./antlr-4.7.2-complete.jar" org.antlr.v4.Tool Lang.g4

clean :
	rm *.class
