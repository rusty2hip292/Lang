all : test

test :
	java -cp "./antlr-4.7.2-complete.jar;./bin" compiler.Reader src/source/main.src > temp.txt
	java -cp "./antlr-4.7.2-complete.jar" org.antlr.v4.Tool -visitor Lang.g4
	javac -cp "./antlr-4.7.2-complete.jar" ./*.java
	cat temp.txt | java -cp ".;./antlr-4.7.2-complete.jar;./bin" org.antlr.v4.gui.TestRig Lang program -gui
	make clean

run :
	java -cp "./antlr-4.7.2-complete.jar;./bin" compiler.Compiler main.src lang

parser : Lang.g4 Tokens.g4
	java -cp "./antlr-4.7.2-complete.jar" org.antlr.v4.Tool -visitor -package antlr -o ./src/antlr Lang.g4
	javac -cp "./antlr-4.7.2-complete.jar" src/antlr/*.java -s bin/antlr

clean :
	rm *.class Lang*.java *.tokens *.interp
