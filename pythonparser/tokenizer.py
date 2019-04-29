import regex
from syntaxchecker import checksyntax

syntax = []

### these should be in order of decreasing precedence when the token is ambiguous
def init():
	Comment()
	String()
	OpenParenthesis()
	CloseParenthesis()
	GenericOperator()
	Name()
	Whitespace()
	TokenType()

tokens = []
def printTokens():
	for tok in tokens:
		print(tok.name)
white = regex.compile("\\s*")
def parse(filename, str):
	str = str + " "
	length = len(str)
	line = 1
	column = 0
	index = 0
	backtrack = 0
	token = ""
	while(index < length):
		char = str[index]
		token += char
		if char == '\n':
			line += 1
			column = 0
		column += 1
		#print(token)
		for syn in syntax:
			backtrack = syn.match(token)
			if(backtrack < 0):	# no match
				continue
			else:
				#if backtrack == 0:
				#	tokens.append(token)
				#else:
				#	tokens.append(token[:-backtrack])
				token = ""
				index -= backtrack
				break
		index += 1
	if white.fullmatch(token) == None:
		print("lexer error: unparsable token {} at line {} column {} in file {}".format(token.split()[0], line, column, filename))
		exit(-1)
	else:
		print("woooooo!")
		checksyntax(tokens)

class TokenType:	# these classes are for the lexer; if they match they should add a Token to the tokens variable

	regx = ""
	reg = regex.compile(regx)
	p = None

	def __init__(self):
		syntax.append(self)

	def match(self, token): # if this is called the token is invalid
		return -1

class Token:				# classes that extend Token should be used for syntactic analysis
	def __init__(self, token):
		self.name = token
		tokens.append(self)

class Whitespace(TokenType):
	regx = "[\\s]+\\S"			# at least one whitespace character and then a non-whitepace character
	reg = regex.compile(regx)

	def match(self, token):
		m = self.reg.fullmatch(token)
		if m == None:
			return -1
		else:
			return 1 # backtrack to include the non-whitespace character in the next token

class OpenParenthesis(TokenType):
	regx = "\\("
	reg = regex.compile(regx)

	def match(self, token):
		if self.reg.fullmatch(token) != None:
			OpenParen("(")
			return 0
		else:
			return -1

class CloseParenthesis(TokenType):
	regx = "\\)"
	reg = regex.compile(regx)

	def match(self, token):
		if self.reg.fullmatch(token) != None:
			CloseParen(")")
			return 0
		else:
			return -1

class OpenParen(Token):
	pass
class CloseParen(Token):
	pass

class Name(TokenType):
	regx = "([a-zA-Z_]\\w*)\\W"
	reg = regex.compile(regx)

	def match(self, token):
		m = self.reg.fullmatch(token)
		if m != None:
			VarOrFuncName(m.group(1))
			return 1
		else:
			return -1

class VarOrFuncName(Token):
	pass

class Comment(TokenType):
	regx = "(//.*\\n|/\\*[\\s\\S]*?\\*/)"
	reg = regex.compile(regx)

	def match(self, token):
		m = self.reg.fullmatch(token)
		if m != None:
			ConstString(m.group(1))
			return 0
		else:
			return -1

class String(TokenType):
	regx = "\"(([\\s\\S]*(\\\")*)*)\""
	reg = regex.compile(regx)

	def match(self, token):
		if self.reg.fullmatch(token) != None:
			return 0
		else:
			return -1

class ConstString(Token):
	pass

class GenericOperator(TokenType):
	regx = "((=|\\+|\\-|\\*|/|\\^|%|!)+)[^=!+-/*%^]"
	reg = regex.compile(regx)

	def match(self, token):
		m = self.reg.fullmatch(token)
		if m != None:
			Operator(m.group(1))
			return 1
		else:
			return -1

class Operator(Token):
	pass

class End(TokenType):
	regx = "end\\s"
	reg = regex.compile(regx)

	def match(self, token):
		if self.reg.fullmatch(token) != None:
			EndToken("end")
			return 0
		else:
			return -1

class EndToken(Token):
	pass
