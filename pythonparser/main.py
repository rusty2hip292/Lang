import sys
import os
from tokenizer import parse, init

init()
for argnum in range(1, len(sys.argv)):
	filename = sys.argv[argnum]
	f = open(filename)
	lines = f.readlines()
	f.close()
	code = "".join(lines)
	parse(filename, code)
