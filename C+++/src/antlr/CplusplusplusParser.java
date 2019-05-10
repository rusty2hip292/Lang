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
		T__0=1, T__1=2, T__2=3, IDENTIFIER=4, WHITESPACE=5, ANYTHINGELSE=6;
	public static final int
		RULE_program = 0, RULE_code = 1, RULE_noout = 2, RULE_out = 3, RULE_oursyntax = 4, 
		RULE_classdef = 5, RULE_bracketed = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "code", "noout", "out", "oursyntax", "classdef", "bracketed"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IDENTIFIER", "WHITESPACE", "ANYTHINGELSE"
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

	public static class ProgramContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CplusplusplusParser.EOF, 0); }
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
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			code();
			setState(15);
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
		enterRule(_localctx, 2, RULE_code);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(19);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(17);
						noout();
						}
						break;
					case T__1:
					case IDENTIFIER:
					case WHITESPACE:
					case ANYTHINGELSE:
						{
						setState(18);
						out();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(21); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 4, RULE_noout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
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
		public TerminalNode ANYTHINGELSE() { return getToken(CplusplusplusParser.ANYTHINGELSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CplusplusplusParser.IDENTIFIER, 0); }
		public TerminalNode WHITESPACE() { return getToken(CplusplusplusParser.WHITESPACE, 0); }
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
		enterRule(_localctx, 6, RULE_out);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANYTHINGELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(ANYTHINGELSE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(IDENTIFIER);
				}
				break;
			case WHITESPACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				match(WHITESPACE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
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
		enterRule(_localctx, 8, RULE_oursyntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			classdef();
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
		public TerminalNode IDENTIFIER() { return getToken(CplusplusplusParser.IDENTIFIER, 0); }
		public BracketedContext bracketed() {
			return getRuleContext(BracketedContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(CplusplusplusParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(CplusplusplusParser.WHITESPACE, i);
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
		enterRule(_localctx, 10, RULE_classdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__0);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(34);
				match(WHITESPACE);
				}
			}

			setState(37);
			match(IDENTIFIER);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(38);
				match(WHITESPACE);
				}
			}

			setState(41);
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
		enterRule(_localctx, 12, RULE_bracketed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__1);
			setState(44);
			code();
			setState(45);
			match(T__2);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\6\3\26"+
		"\n\3\r\3\16\3\27\3\4\3\4\3\5\3\5\3\5\3\5\5\5 \n\5\3\6\3\6\3\7\3\7\5\7"+
		"&\n\7\3\7\3\7\5\7*\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\27\2\t\2\4\6\b\n"+
		"\f\16\2\2\2\61\2\20\3\2\2\2\4\25\3\2\2\2\6\31\3\2\2\2\b\37\3\2\2\2\n!"+
		"\3\2\2\2\f#\3\2\2\2\16-\3\2\2\2\20\21\5\4\3\2\21\22\7\2\2\3\22\3\3\2\2"+
		"\2\23\26\5\6\4\2\24\26\5\b\5\2\25\23\3\2\2\2\25\24\3\2\2\2\26\27\3\2\2"+
		"\2\27\30\3\2\2\2\27\25\3\2\2\2\30\5\3\2\2\2\31\32\5\n\6\2\32\7\3\2\2\2"+
		"\33 \7\b\2\2\34 \7\6\2\2\35 \7\7\2\2\36 \5\16\b\2\37\33\3\2\2\2\37\34"+
		"\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 \t\3\2\2\2!\"\5\f\7\2\"\13\3\2\2"+
		"\2#%\7\3\2\2$&\7\7\2\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\')\7\6\2\2(*\7\7"+
		"\2\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\5\16\b\2,\r\3\2\2\2-.\7\4\2\2./\5"+
		"\4\3\2/\60\7\5\2\2\60\17\3\2\2\2\7\25\27\37%)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}