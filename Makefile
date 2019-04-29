CODEFILES=$(sort $(wildcard *.code))

all : main

main :
	python3 main.py $(CODEFILES)
