// Generated from Lang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, COMMENT=3, NUMERIC=4, NUMERIC_MODIFIER=5, MULT=6, DIV=7, 
		SUB=8, PLUS=9, CARAT=10, LTEQ=11, GTEQ=12, LT=13, GT=14, EQ=15, AND=16, 
		OR=17, ASSIGN=18, LPAREN=19, RPAREN=20, COMMA=21, DOT=22, IF=23, FUNCTION=24, 
		INIT=25, INLINE=26, END=27, TRUE=28, FALSE=29, IDENTIFIER=30, NEWLINE=31, 
		WHITESPACE=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "COMMENT", "NUMERIC", "NUMERIC_MODIFIER", "MULT", "DIV", 
			"SUB", "PLUS", "CARAT", "LTEQ", "GTEQ", "LT", "GT", "EQ", "AND", "OR", 
			"ASSIGN", "LPAREN", "RPAREN", "COMMA", "DOT", "IF", "FUNCTION", "INIT", 
			"INLINE", "END", "TRUE", "FALSE", "IDENTIFIER", "NEWLINE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'\\\"'", null, null, null, "'*'", "'/'", "'-'", "'+'", 
			"'^'", "'<='", "'>='", "'<'", "'>'", "'=='", null, null, "'='", "'('", 
			"')'", "','", "'.'", "'if'", null, "'init'", null, "'end'", "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "COMMENT", "NUMERIC", "NUMERIC_MODIFIER", "MULT", "DIV", 
			"SUB", "PLUS", "CARAT", "LTEQ", "GTEQ", "LT", "GT", "EQ", "AND", "OR", 
			"ASSIGN", "LPAREN", "RPAREN", "COMMA", "DOT", "IF", "FUNCTION", "INIT", 
			"INLINE", "END", "TRUE", "FALSE", "IDENTIFIER", "NEWLINE", "WHITESPACE"
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00e0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4\3\4\3"+
		"\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\4\3\4\5\4\\\n\4\3\5\6\5_\n\5\r\5\16\5"+
		"`\3\6\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0085\n\21\3\22\3\22\3\22\3\22\5\22\u008b\n\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00a6\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u00bb\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u00ce\n\37\f\37"+
		"\16\37\u00d1\13\37\3 \6 \u00d4\n \r \16 \u00d5\3 \3 \3!\6!\u00db\n!\r"+
		"!\16!\u00dc\3!\3!\4MV\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\"+
		"aac|\3\2\f\f\5\2\13\13\17\17\"\"\2\u00eb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7[\3\2\2\2\t^\3\2\2\2\13f\3\2\2\2\rh\3"+
		"\2\2\2\17j\3\2\2\2\21l\3\2\2\2\23n\3\2\2\2\25p\3\2\2\2\27r\3\2\2\2\31"+
		"u\3\2\2\2\33x\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!\u0084\3\2\2\2#\u008a\3"+
		"\2\2\2%\u008c\3\2\2\2\'\u008e\3\2\2\2)\u0090\3\2\2\2+\u0092\3\2\2\2-\u0094"+
		"\3\2\2\2/\u0096\3\2\2\2\61\u00a5\3\2\2\2\63\u00a7\3\2\2\2\65\u00ba\3\2"+
		"\2\2\67\u00bc\3\2\2\29\u00c0\3\2\2\2;\u00c5\3\2\2\2=\u00cb\3\2\2\2?\u00d3"+
		"\3\2\2\2A\u00da\3\2\2\2CD\7$\2\2D\4\3\2\2\2EF\7^\2\2FG\7$\2\2G\6\3\2\2"+
		"\2HI\7\61\2\2IM\7\61\2\2JL\13\2\2\2KJ\3\2\2\2LO\3\2\2\2MN\3\2\2\2MK\3"+
		"\2\2\2NP\3\2\2\2OM\3\2\2\2P\\\7\f\2\2QR\7\61\2\2RV\7,\2\2SU\13\2\2\2T"+
		"S\3\2\2\2UX\3\2\2\2VW\3\2\2\2VT\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7,\2\2Z"+
		"\\\7\61\2\2[H\3\2\2\2[Q\3\2\2\2\\\b\3\2\2\2]_\t\2\2\2^]\3\2\2\2_`\3\2"+
		"\2\2`^\3\2\2\2`a\3\2\2\2a\n\3\2\2\2bc\7\62\2\2cg\7z\2\2de\7\62\2\2eg\7"+
		"d\2\2fb\3\2\2\2fd\3\2\2\2g\f\3\2\2\2hi\7,\2\2i\16\3\2\2\2jk\7\61\2\2k"+
		"\20\3\2\2\2lm\7/\2\2m\22\3\2\2\2no\7-\2\2o\24\3\2\2\2pq\7`\2\2q\26\3\2"+
		"\2\2rs\7>\2\2st\7?\2\2t\30\3\2\2\2uv\7@\2\2vw\7?\2\2w\32\3\2\2\2xy\7>"+
		"\2\2y\34\3\2\2\2z{\7@\2\2{\36\3\2\2\2|}\7?\2\2}~\7?\2\2~ \3\2\2\2\177"+
		"\u0080\7(\2\2\u0080\u0085\7(\2\2\u0081\u0082\7c\2\2\u0082\u0083\7p\2\2"+
		"\u0083\u0085\7f\2\2\u0084\177\3\2\2\2\u0084\u0081\3\2\2\2\u0085\"\3\2"+
		"\2\2\u0086\u0087\7~\2\2\u0087\u008b\7~\2\2\u0088\u0089\7q\2\2\u0089\u008b"+
		"\7t\2\2\u008a\u0086\3\2\2\2\u008a\u0088\3\2\2\2\u008b$\3\2\2\2\u008c\u008d"+
		"\7?\2\2\u008d&\3\2\2\2\u008e\u008f\7*\2\2\u008f(\3\2\2\2\u0090\u0091\7"+
		"+\2\2\u0091*\3\2\2\2\u0092\u0093\7.\2\2\u0093,\3\2\2\2\u0094\u0095\7\60"+
		"\2\2\u0095.\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7h\2\2\u0098\60\3\2"+
		"\2\2\u0099\u009a\7h\2\2\u009a\u009b\7w\2\2\u009b\u009c\7p\2\2\u009c\u009d"+
		"\7e\2\2\u009d\u009e\7v\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7q\2\2\u00a0"+
		"\u00a6\7p\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7p\2\2"+
		"\u00a4\u00a6\7e\2\2\u00a5\u0099\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\62\3"+
		"\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7k\2\2\u00aa"+
		"\u00ab\7v\2\2\u00ab\64\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7n\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b1\u00bb\7g\2\2"+
		"\u00b2\u00b3\7k\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6"+
		"\7k\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7/\2\2\u00b9"+
		"\u00bb\7E\2\2\u00ba\u00ac\3\2\2\2\u00ba\u00b2\3\2\2\2\u00bb\66\3\2\2\2"+
		"\u00bc\u00bd\7g\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7f\2\2\u00bf8\3\2\2"+
		"\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4"+
		"\7g\2\2\u00c4:\3\2\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8"+
		"\7n\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca<\3\2\2\2\u00cb\u00cf"+
		"\t\3\2\2\u00cc\u00ce\t\4\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0>\3\2\2\2\u00d1\u00cf\3\2\2\2"+
		"\u00d2\u00d4\t\5\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b \2\2\u00d8"+
		"@\3\2\2\2\u00d9\u00db\t\6\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2"+
		"\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\b!\2\2\u00dfB\3\2\2\2\17\2MV[`f\u0084\u008a\u00a5\u00ba\u00cf\u00d5\u00dc"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}