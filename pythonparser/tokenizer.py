import regex
from syntaxchecker import checksyntax

syntax = []

### these should be in order of decreasing precedence when the token is ambiguous
def init():
	Comment()
	String()
	OpenParenthesis()
	CloseParenthesis()
	CommaToken()
	AssignmentOperator() # cannot move this below GenericOperator
	GenericOperator()
	FloatLiteral()
	IntLiteral()
	TypeToken()
	End()
	FunctionToken()

	## name is really any unrecognized word, so needs to come after the rest of the syntax
	Name()
	Whitespace()

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
	type = "("
class CloseParen(Token):
	type = ")"


class CommaToken(TokenType):
	regx = ","
	reg = regex.compile(regx)

	def match(self, token):
		if self.reg.fullmatch(token) != None:
			Comma(",")
			return 0
		else:
			return -1
class Comma(Token):
	type = "comma"

class Name(TokenType):
	regx = "([a-zA-Z_]\\w*)\\W"
	reg = regex.compile(regx)

	def match(self, token):
		m = self.reg.fullmatch(token)
		if m != None:
			VarFuncOrTypeName(m.group(1))
			return 1
		else:
			return -1

class VarFuncOrTypeName(Token):
	type = "name"

class Comment(TokenType):
	regx = "(//.*\\n|/\\*[\\s\\S]*?\\*/)"
	reg = regex.compile(regx)

	def match(self, token):
		if self.reg.fullmatch(token) != None:
			return 0
		else:
			return -1

class String(TokenType):
	regx = "\"(([\\s\\S]*(\\\")*)*)\""
	reg = regex.compile(regx)

	def match(self, token):
		m = self.reg.fullmatch(token)
		if m != None:
			ConstString(m.group(1))
			return 0
		else:
			return -1

class ConstString(Token):
	type = "string"

class AssignmentOperator(TokenType):
	regx = "=[^=]"
	reg = regex.compile(regx)

	def match(self, token):
		m = self.reg.fullmatch(token)
		if m != None:
			Assign("=")
			return 1
		else:
			return -1

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
	type = "operator"
class Assign(Token):
	type = "assigned"

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
	type = "end"

class FloatLiteral(TokenType):
	regx = "(\d+\\.\d+)\D"
	reg = regex.compile(regx)

	def match(self, token):
		m = self.reg.fullmatch(token)
		if m != None:
			Float(m.group(1))
			return 1
		else:
			return -1
class Float(Token):
	type = "float"

class IntLiteral(TokenType):
	regx = "(\\d+)[^\\d.]"
	reg = regex.compile(regx)

	def match(self, token):
		m = self.reg.fullmatch(token)
		if m != None:
			Int(m.group(1))
			return 1
		else:
			return -1
class Int(Token):
	type = "int"

class TypeToken(TokenType):
	regx = "type\\s"
	reg = regex.compile(regx)

	def match(self, token):
		m = self.reg.fullmatch(token)
		if m != None:
			Type("type")
			return 0
		else:
			return -1
class Type(Token):
	type = "type"

class FunctionToken(TokenType):
	regx = "function\\s"
	reg = regex.compile(regx)

	def match(self, token):
		m = self.reg.fullmatch(token)
		if m != None:
			Function("function")
			return 0
		else:
			return -1
class Function(Token):
	type = "function"
