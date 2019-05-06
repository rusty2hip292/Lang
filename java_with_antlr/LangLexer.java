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
		INIT=25, INLINE=26, TYPE=27, PRIMITIVE=28, END=29, TRUE=30, FALSE=31, 
		EXTENDS=32, VAR=33, CONST=34, LOCAL=35, PRIMATIVE=36, STATIC=37, IDENTIFIER=38, 
		NEWLINE=39, WHITESPACE=40;
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
			"INLINE", "TYPE", "PRIMITIVE", "END", "TRUE", "FALSE", "EXTENDS", "VAR", 
			"CONST", "LOCAL", "PRIMATIVE", "STATIC", "IDENTIFIER", "NEWLINE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'\\\"'", null, null, null, "'*'", "'/'", "'-'", "'+'", 
			"'^'", "'<='", "'>='", "'<'", "'>'", "'=='", null, null, "'='", "'('", 
			"')'", "','", "'.'", "'if'", null, "'init'", null, "'type'", "'primitive'", 
			"'end'", "'true'", "'false'", "'extends'", "'var'", "'const'", "'local'", 
			null, "'static'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "COMMENT", "NUMERIC", "NUMERIC_MODIFIER", "MULT", "DIV", 
			"SUB", "PLUS", "CARAT", "LTEQ", "GTEQ", "LT", "GT", "EQ", "AND", "OR", 
			"ASSIGN", "LPAREN", "RPAREN", "COMMA", "DOT", "IF", "FUNCTION", "INIT", 
			"INLINE", "TYPE", "PRIMITIVE", "END", "TRUE", "FALSE", "EXTENDS", "VAR", 
			"CONST", "LOCAL", "PRIMATIVE", "STATIC", "IDENTIFIER", "NEWLINE", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u012d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\4\3\4\3\4\3\4\7\4e\n\4\f"+
		"\4\16\4h\13\4\3\4\3\4\5\4l\n\4\3\5\6\5o\n\5\r\5\16\5p\3\6\3\6\3\6\3\6"+
		"\5\6w\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0095\n\21\3\22\3\22\3\22\3\22\5\22\u009b\n\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00b6\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u00cb\n\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0110"+
		"\n%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\7\'\u011b\n\'\f\'\16\'\u011e\13\'\3("+
		"\6(\u0121\n(\r(\16(\u0122\3(\3(\3)\6)\u0128\n)\r)\16)\u0129\3)\3)\4]f"+
		"\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3"+
		"\2\f\f\5\2\13\13\17\17\"\"\2\u013a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7k\3\2\2\2\tn\3\2\2\2\13v\3"+
		"\2\2\2\rx\3\2\2\2\17z\3\2\2\2\21|\3\2\2\2\23~\3\2\2\2\25\u0080\3\2\2\2"+
		"\27\u0082\3\2\2\2\31\u0085\3\2\2\2\33\u0088\3\2\2\2\35\u008a\3\2\2\2\37"+
		"\u008c\3\2\2\2!\u0094\3\2\2\2#\u009a\3\2\2\2%\u009c\3\2\2\2\'\u009e\3"+
		"\2\2\2)\u00a0\3\2\2\2+\u00a2\3\2\2\2-\u00a4\3\2\2\2/\u00a6\3\2\2\2\61"+
		"\u00b5\3\2\2\2\63\u00b7\3\2\2\2\65\u00ca\3\2\2\2\67\u00cc\3\2\2\29\u00d1"+
		"\3\2\2\2;\u00db\3\2\2\2=\u00df\3\2\2\2?\u00e4\3\2\2\2A\u00ea\3\2\2\2C"+
		"\u00f2\3\2\2\2E\u00f6\3\2\2\2G\u00fc\3\2\2\2I\u010f\3\2\2\2K\u0111\3\2"+
		"\2\2M\u0118\3\2\2\2O\u0120\3\2\2\2Q\u0127\3\2\2\2ST\7$\2\2T\4\3\2\2\2"+
		"UV\7^\2\2VW\7$\2\2W\6\3\2\2\2XY\7\61\2\2Y]\7\61\2\2Z\\\13\2\2\2[Z\3\2"+
		"\2\2\\_\3\2\2\2]^\3\2\2\2][\3\2\2\2^`\3\2\2\2_]\3\2\2\2`l\7\f\2\2ab\7"+
		"\61\2\2bf\7,\2\2ce\13\2\2\2dc\3\2\2\2eh\3\2\2\2fg\3\2\2\2fd\3\2\2\2gi"+
		"\3\2\2\2hf\3\2\2\2ij\7,\2\2jl\7\61\2\2kX\3\2\2\2ka\3\2\2\2l\b\3\2\2\2"+
		"mo\t\2\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\n\3\2\2\2rs\7\62\2"+
		"\2sw\7z\2\2tu\7\62\2\2uw\7d\2\2vr\3\2\2\2vt\3\2\2\2w\f\3\2\2\2xy\7,\2"+
		"\2y\16\3\2\2\2z{\7\61\2\2{\20\3\2\2\2|}\7/\2\2}\22\3\2\2\2~\177\7-\2\2"+
		"\177\24\3\2\2\2\u0080\u0081\7`\2\2\u0081\26\3\2\2\2\u0082\u0083\7>\2\2"+
		"\u0083\u0084\7?\2\2\u0084\30\3\2\2\2\u0085\u0086\7@\2\2\u0086\u0087\7"+
		"?\2\2\u0087\32\3\2\2\2\u0088\u0089\7>\2\2\u0089\34\3\2\2\2\u008a\u008b"+
		"\7@\2\2\u008b\36\3\2\2\2\u008c\u008d\7?\2\2\u008d\u008e\7?\2\2\u008e "+
		"\3\2\2\2\u008f\u0090\7(\2\2\u0090\u0095\7(\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7p\2\2\u0093\u0095\7f\2\2\u0094\u008f\3\2\2\2\u0094\u0091\3\2\2"+
		"\2\u0095\"\3\2\2\2\u0096\u0097\7~\2\2\u0097\u009b\7~\2\2\u0098\u0099\7"+
		"q\2\2\u0099\u009b\7t\2\2\u009a\u0096\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"$\3\2\2\2\u009c\u009d\7?\2\2\u009d&\3\2\2\2\u009e\u009f\7*\2\2\u009f("+
		"\3\2\2\2\u00a0\u00a1\7+\2\2\u00a1*\3\2\2\2\u00a2\u00a3\7.\2\2\u00a3,\3"+
		"\2\2\2\u00a4\u00a5\7\60\2\2\u00a5.\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8"+
		"\7h\2\2\u00a8\60\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac"+
		"\7p\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7k\2\2\u00af"+
		"\u00b0\7q\2\2\u00b0\u00b6\7p\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7w\2\2"+
		"\u00b3\u00b4\7p\2\2\u00b4\u00b6\7e\2\2\u00b5\u00a9\3\2\2\2\u00b5\u00b1"+
		"\3\2\2\2\u00b6\62\3\2\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7p\2\2\u00b9"+
		"\u00ba\7k\2\2\u00ba\u00bb\7v\2\2\u00bb\64\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd"+
		"\u00be\7p\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2"+
		"\u00c1\u00cb\7g\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5"+
		"\7n\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7g\2\2\u00c8"+
		"\u00c9\7/\2\2\u00c9\u00cb\7E\2\2\u00ca\u00bc\3\2\2\2\u00ca\u00c2\3\2\2"+
		"\2\u00cb\66\3\2\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7{\2\2\u00ce\u00cf"+
		"\7r\2\2\u00cf\u00d0\7g\2\2\u00d08\3\2\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3"+
		"\7t\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7o\2\2\u00d5\u00d6\7k\2\2\u00d6"+
		"\u00d7\7v\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7x\2\2\u00d9\u00da\7g\2\2"+
		"\u00da:\3\2\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7f\2"+
		"\2\u00de<\3\2\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7"+
		"w\2\2\u00e2\u00e3\7g\2\2\u00e3>\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6"+
		"\7c\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7g\2\2\u00e9"+
		"@\3\2\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7z\2\2\u00ec\u00ed\7v\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7u\2\2"+
		"\u00f1B\3\2\2\2\u00f2\u00f3\7x\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7t\2"+
		"\2\u00f5D\3\2\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7"+
		"p\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7v\2\2\u00fbF\3\2\2\2\u00fc\u00fd"+
		"\7n\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100\7c\2\2\u0100"+
		"\u0101\7n\2\2\u0101H\3\2\2\2\u0102\u0103\7k\2\2\u0103\u0104\7p\2\2\u0104"+
		"\u0110\7v\2\2\u0105\u0106\7e\2\2\u0106\u0107\7j\2\2\u0107\u0108\7c\2\2"+
		"\u0108\u0110\7t\2\2\u0109\u010a\7f\2\2\u010a\u010b\7q\2\2\u010b\u010c"+
		"\7w\2\2\u010c\u010d\7d\2\2\u010d\u010e\7n\2\2\u010e\u0110\7g\2\2\u010f"+
		"\u0102\3\2\2\2\u010f\u0105\3\2\2\2\u010f\u0109\3\2\2\2\u0110J\3\2\2\2"+
		"\u0111\u0112\7u\2\2\u0112\u0113\7v\2\2\u0113\u0114\7c\2\2\u0114\u0115"+
		"\7v\2\2\u0115\u0116\7k\2\2\u0116\u0117\7e\2\2\u0117L\3\2\2\2\u0118\u011c"+
		"\t\3\2\2\u0119\u011b\t\4\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011dN\3\2\2\2\u011e\u011c\3\2\2\2"+
		"\u011f\u0121\t\5\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b(\2\2\u0125"+
		"P\3\2\2\2\u0126\u0128\t\6\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c"+
		"\b)\2\2\u012cR\3\2\2\2\20\2]fkpv\u0094\u009a\u00b5\u00ca\u010f\u011c\u0122"+
		"\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}