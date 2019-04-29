import regex
import time
import copy

def init():
	TypeDef()
	Variable()
	FunctionDef()
	Assignment()
	Tuple()
	FunctionCall()
	Expression()	# almost anything can be treated as an expression, so this must happen last

program = []
syntaxElements = []

def checksyntax(tokens):
	global program
	program = tokens
	temp = ""
	syntactic = "."
	while(syntactic != temp):
		#print("syn  {}\ntemp {}\n".format(syntactic, temp))
		syntactic = temp
		temp = ""
		for tok in program:
			temp += tok.type + " "
		print(temp)
		syntactic = condense(temp)
	#print(program)

def condense(syntaxString):
	b = True
	while b:
		b = False
		for elem in syntaxElements:
			temp = syntaxString
			syntaxString = elem.match(syntaxString)
			if temp != syntaxString:
				b = True
				return syntaxString	# just for debug, can be removed later
				break
	return syntaxString

class SyntaxElement():	# not really a token, but we'll treat it as one

	innerTokens = []

	def __init__(self, name, regx):
		self.type = name
		self.name = name
		regx = "([\\s\\S]*)(" + regx + ")([\\s\\S]*)"
		print(regx)
		self.reg = regex.compile(regx)
		syntaxElements.append(self)

	def captureTokens(self, m):
		global program
		low = len(m.group(1).split())
		high = len(program) - len(m.group(len(m.groups())).split())
		start = program[0:low]
		self.innerTokens = program[low:high]
		start.append(copy.deepcopy(self))
		end = program[high:]
		program = start + end
		#print(start)
		#print(self.innerTokens)
		#print(end)
		#time.sleep(1)

	def match(self, syntaxString):
		m = self.reg.fullmatch(syntaxString)
		if m == None:
			return syntaxString
		#print("{}\n{}{} {}\n".format(syntaxString, m.group(1), self.name, m.group(len(m.groups()))))
		syntaxString = "{}{}{}".format(m.group(1), self.name, m.group(len(m.groups())))
		#print(syntaxString)
		# TODO actually take care of the condensing of tokens
		self.captureTokens(m)
		self.handler()
		return syntaxString

	def handler(self):
		pass

class FunctionCall(SyntaxElement):
	def __init__(self):
		super().__init__("call", "funcname tuple")

class Tuple(SyntaxElement): # comma separated expressions within parenthesis
	def __init__(self):
		super().__init__("tuple", "\\( (expression (comma expression )*)?\\)")

class Expression(SyntaxElement):
	def __init__(self):
		super().__init__("expression", "(int|float|expression operator expression|call|string|varname|tuple)")

class TypeDef(SyntaxElement):
	def __init__(self):
		super().__init__("typedef", "type name")

	def match(self, syntaxString):
		global program
		temp = super().match(syntaxString)
		for i in range(0, len(program)):
			if program[i].type == "name" and program[i].name == self.innerTokens[1].name:
				program[i].type = "typename"
		return temp

class Variable(SyntaxElement):
	def __init__(self):
		super().__init__("declare", "typename name")

	def match(self, syntaxString):
		global program
		temp = super().match(syntaxString)
		#print(self.innerTokens)
		if len(self.innerTokens) > 0:
			for i in range(0, len(program)):
				#print("{} {} {} {}", i, len(program), 1, len(self.innerTokens))
				if program[i].type == "name" and program[i].name == self.innerTokens[1].name:
					program[i].type = "varname"
		return temp

class Assignment(SyntaxElement):
	def __init__(self):
		super().__init__("expression", "(declare|varname) assigned expression") # assignments return the new value

class FunctionDef(SyntaxElement):
	def __init__(self):
		super().__init__("funcdef", "function name tuple validcode end")

	def handler(self):
		for i in range(0, len(program)):
			if program[i].type == "name" and program[i].name == self.innerTokens[1].name:
				program[i].type = "funcname"
