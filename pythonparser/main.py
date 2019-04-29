import sys
import os
from tokenizer import parse, init
from syntaxchecker import init as synt

init()
synt()
for argnum in range(1, len(sys.argv)):
	filename = sys.argv[argnum]
	f = open(filename)
	lines = f.readlines()
	f.close()
	code = "".join(lines)
	parse(filename, code)
