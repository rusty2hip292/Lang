// Generated from Cplusplusplus.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CplusplusplusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, IDENTIFIER=5, WHITESPACE=6, ANYTHINGELSE=7;
	public static final int
		RULE_identifier = 0, RULE_whitespace = 1, RULE_anythingelse = 2, RULE_eof = 3, 
		RULE_program = 4, RULE_code = 5, RULE_noout = 6, RULE_out = 7, RULE_oursyntax = 8, 
		RULE_classdef = 9, RULE_new_ = 10, RULE_bracketed = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifier", "whitespace", "anythingelse", "eof", "program", "code", 
			"noout", "out", "oursyntax", "classdef", "new_", "bracketed"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'new'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "IDENTIFIER", "WHITESPACE", "ANYTHINGELSE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Cplusplusplus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CplusplusplusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CplusplusplusParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CplusplusplusVisitor ) return ((CplusplusplusVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhitespaceContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(CplusplusplusParser.WHITESPACE, 0); }
		public WhitespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whitespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).enterWhitespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).exitWhitespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CplusplusplusVisitor ) return ((CplusplusplusVisitor<? extends T>)visitor).visitWhitespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhitespaceContext whitespace() throws RecognitionException {
		WhitespaceContext _localctx = new WhitespaceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_whitespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(WHITESPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnythingelseContext extends ParserRuleContext {
		public List<TerminalNode> ANYTHINGELSE() { return getTokens(CplusplusplusParser.ANYTHINGELSE); }
		public TerminalNode ANYTHINGELSE(int i) {
			return getToken(CplusplusplusParser.ANYTHINGELSE, i);
		}
		public AnythingelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anythingelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).enterAnythingelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).exitAnythingelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CplusplusplusVisitor ) return ((CplusplusplusVisitor<? extends T>)visitor).visitAnythingelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnythingelseContext anythingelse() throws RecognitionException {
		AnythingelseContext _localctx = new AnythingelseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_anythingelse);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(28);
					match(ANYTHINGELSE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(31); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CplusplusplusParser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CplusplusplusVisitor ) return ((CplusplusplusVisitor<? extends T>)visitor).visitEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CplusplusplusVisitor ) return ((CplusplusplusVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			code();
			setState(36);
			eof();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public List<NooutContext> noout() {
			return getRuleContexts(NooutContext.class);
		}
		public NooutContext noout(int i) {
			return getRuleContext(NooutContext.class,i);
		}
		public List<OutContext> out() {
			return getRuleContexts(OutContext.class);
		}
		public OutContext out(int i) {
			return getRuleContext(OutContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CplusplusplusVisitor ) return ((CplusplusplusVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
					{
					setState(38);
					noout();
					}
					break;
				case T__2:
				case IDENTIFIER:
				case WHITESPACE:
				case ANYTHINGELSE:
					{
					setState(39);
					out();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << IDENTIFIER) | (1L << WHITESPACE) | (1L << ANYTHINGELSE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NooutContext extends ParserRuleContext {
		public OursyntaxContext oursyntax() {
			return getRuleContext(OursyntaxContext.class,0);
		}
		public NooutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).enterNoout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).exitNoout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CplusplusplusVisitor ) return ((CplusplusplusVisitor<? extends T>)visitor).visitNoout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NooutContext noout() throws RecognitionException {
		NooutContext _localctx = new NooutContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_noout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			oursyntax();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutContext extends ParserRuleContext {
		public AnythingelseContext anythingelse() {
			return getRuleContext(AnythingelseContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WhitespaceContext whitespace() {
			return getRuleContext(WhitespaceContext.class,0);
		}
		public BracketedContext bracketed() {
			return getRuleContext(BracketedContext.class,0);
		}
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).enterOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).exitOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CplusplusplusVisitor ) return ((CplusplusplusVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_out);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANYTHINGELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				anythingelse();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				identifier();
				}
				break;
			case WHITESPACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				whitespace();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				bracketed();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OursyntaxContext extends ParserRuleContext {
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
		}
		public New_Context new_() {
			return getRuleContext(New_Context.class,0);
		}
		public OursyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oursyntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).enterOursyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).exitOursyntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CplusplusplusVisitor ) return ((CplusplusplusVisitor<? extends T>)visitor).visitOursyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OursyntaxContext oursyntax() throws RecognitionException {
		OursyntaxContext _localctx = new OursyntaxContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_oursyntax);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				classdef();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				new_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassdefContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(CplusplusplusParser.IDENTIFIER, 0); }
		public BracketedContext bracketed() {
			return getRuleContext(BracketedContext.class,0);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).enterClassdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).exitClassdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CplusplusplusVisitor ) return ((CplusplusplusVisitor<? extends T>)visitor).visitClassdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(57);
				whitespace();
				}
			}

			setState(60);
			((ClassdefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			System.out.print("// auto generated with ANTLR\nstruct " + (((ClassdefContext)_localctx).IDENTIFIER!=null?((ClassdefContext)_localctx).IDENTIFIER.getText():null) + " {\n");
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(62);
				whitespace();
				}
			}

			setState(65);
			bracketed();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CplusplusplusParser.IDENTIFIER, 0); }
		public WhitespaceContext whitespace() {
			return getRuleContext(WhitespaceContext.class,0);
		}
		public New_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).enterNew_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).exitNew_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CplusplusplusVisitor ) return ((CplusplusplusVisitor<? extends T>)visitor).visitNew_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_Context new_() throws RecognitionException {
		New_Context _localctx = new New_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_new_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__1);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(68);
				whitespace();
				}
			}

			setState(71);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracketedContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public BracketedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).enterBracketed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CplusplusplusListener ) ((CplusplusplusListener)listener).exitBracketed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CplusplusplusVisitor ) return ((CplusplusplusVisitor<? extends T>)visitor).visitBracketed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketedContext bracketed() throws RecognitionException {
		BracketedContext _localctx = new BracketedContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bracketed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__2);
			setState(74);
			code();
			setState(75);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\tP\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\6\4 \n\4\r\4\16\4!\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\6\7+\n\7\r\7\16\7,\3\b\3\b\3\t\3\t\3\t\3\t\5\t\65\n\t\3\n"+
		"\3\n\5\n9\n\n\3\13\3\13\5\13=\n\13\3\13\3\13\3\13\5\13B\n\13\3\13\3\13"+
		"\3\f\3\f\5\fH\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\2\2\2M\2\32\3\2\2\2\4\34\3\2\2\2\6\37\3\2\2\2\b#\3\2\2\2"+
		"\n%\3\2\2\2\f*\3\2\2\2\16.\3\2\2\2\20\64\3\2\2\2\228\3\2\2\2\24:\3\2\2"+
		"\2\26E\3\2\2\2\30K\3\2\2\2\32\33\7\7\2\2\33\3\3\2\2\2\34\35\7\b\2\2\35"+
		"\5\3\2\2\2\36 \7\t\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2"+
		"\"\7\3\2\2\2#$\7\2\2\3$\t\3\2\2\2%&\5\f\7\2&\'\5\b\5\2\'\13\3\2\2\2(+"+
		"\5\16\b\2)+\5\20\t\2*(\3\2\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2"+
		"-\r\3\2\2\2./\5\22\n\2/\17\3\2\2\2\60\65\5\6\4\2\61\65\5\2\2\2\62\65\5"+
		"\4\3\2\63\65\5\30\r\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63"+
		"\3\2\2\2\65\21\3\2\2\2\669\5\24\13\2\679\5\26\f\28\66\3\2\2\28\67\3\2"+
		"\2\29\23\3\2\2\2:<\7\3\2\2;=\5\4\3\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7"+
		"\7\2\2?A\b\13\1\2@B\5\4\3\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\5\30\r\2D"+
		"\25\3\2\2\2EG\7\4\2\2FH\5\4\3\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\7\2"+
		"\2J\27\3\2\2\2KL\7\5\2\2LM\5\f\7\2MN\7\6\2\2N\31\3\2\2\2\n!*,\648<AG";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}