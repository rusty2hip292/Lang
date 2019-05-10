all : test

test :
	java -cp "./antlr-4.7.2-complete.jar;./bin" compiler.Reader src/source/main.src > temp.txt
	java -cp "./antlr-4.7.2-complete.jar" org.antlr.v4.Tool -visitor Cplusplusplus.g4
	javac -cp "./antlr-4.7.2-complete.jar" ./*.java
	cat temp.txt | java -cp ".;./antlr-4.7.2-complete.jar;./bin" org.antlr.v4.gui.TestRig Cplusplusplus program -gui
	make clean

run :
	java -cp "./antlr-4.7.2-complete.jar;./bin" compiler.Compiler src/source/main.src src/source/lang > autobuild.c
	gcc autobuild.c -o program.exe
	./program.exe

parser : Cplusplusplus.g4
	java -cp "./antlr-4.7.2-complete.jar" org.antlr.v4.Tool -visitor -package antlr -o ./src/antlr Cplusplusplus.g4
	javac -cp "./antlr-4.7.2-complete.jar" src/antlr/*.java -s bin/antlr

clean :
	rm *.class Cplusplusplus*.java *.tokens *.interp
