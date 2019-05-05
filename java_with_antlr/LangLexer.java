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
		EXTENDS=32, VAR=33, CONST=34, LOCAL=35, PRIMATIVE=36, IDENTIFIER=37, NEWLINE=38, 
		WHITESPACE=39;
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
			"CONST", "LOCAL", "PRIMATIVE", "IDENTIFIER", "NEWLINE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'\\\"'", null, null, null, "'*'", "'/'", "'-'", "'+'", 
			"'^'", "'<='", "'>='", "'<'", "'>'", "'=='", null, null, "'='", "'('", 
			"')'", "','", "'.'", "'if'", null, "'init'", null, "'type'", "'primitive'", 
			"'end'", "'true'", "'false'", "'extends'", "'var'", "'const'", "'local'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "COMMENT", "NUMERIC", "NUMERIC_MODIFIER", "MULT", "DIV", 
			"SUB", "PLUS", "CARAT", "LTEQ", "GTEQ", "LT", "GT", "EQ", "AND", "OR", 
			"ASSIGN", "LPAREN", "RPAREN", "COMMA", "DOT", "IF", "FUNCTION", "INIT", 
			"INLINE", "TYPE", "PRIMITIVE", "END", "TRUE", "FALSE", "EXTENDS", "VAR", 
			"CONST", "LOCAL", "PRIMATIVE", "IDENTIFIER", "NEWLINE", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0124\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\4\3\4\7\4c\n\4\f\4\16\4"+
		"f\13\4\3\4\3\4\5\4j\n\4\3\5\6\5m\n\5\r\5\16\5n\3\6\3\6\3\6\3\6\5\6u\n"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u0093"+
		"\n\21\3\22\3\22\3\22\3\22\5\22\u0099\n\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u00b4\n\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u00c9\n\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u010e\n%\3"+
		"&\3&\7&\u0112\n&\f&\16&\u0115\13&\3\'\6\'\u0118\n\'\r\'\16\'\u0119\3\'"+
		"\3\'\3(\6(\u011f\n(\r(\16(\u0120\3(\3(\4[d\2)\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2"+
		"\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\2\f\f\5\2\13\13\17\17\"\"\2\u0131"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7"+
		"i\3\2\2\2\tl\3\2\2\2\13t\3\2\2\2\rv\3\2\2\2\17x\3\2\2\2\21z\3\2\2\2\23"+
		"|\3\2\2\2\25~\3\2\2\2\27\u0080\3\2\2\2\31\u0083\3\2\2\2\33\u0086\3\2\2"+
		"\2\35\u0088\3\2\2\2\37\u008a\3\2\2\2!\u0092\3\2\2\2#\u0098\3\2\2\2%\u009a"+
		"\3\2\2\2\'\u009c\3\2\2\2)\u009e\3\2\2\2+\u00a0\3\2\2\2-\u00a2\3\2\2\2"+
		"/\u00a4\3\2\2\2\61\u00b3\3\2\2\2\63\u00b5\3\2\2\2\65\u00c8\3\2\2\2\67"+
		"\u00ca\3\2\2\29\u00cf\3\2\2\2;\u00d9\3\2\2\2=\u00dd\3\2\2\2?\u00e2\3\2"+
		"\2\2A\u00e8\3\2\2\2C\u00f0\3\2\2\2E\u00f4\3\2\2\2G\u00fa\3\2\2\2I\u010d"+
		"\3\2\2\2K\u010f\3\2\2\2M\u0117\3\2\2\2O\u011e\3\2\2\2QR\7$\2\2R\4\3\2"+
		"\2\2ST\7^\2\2TU\7$\2\2U\6\3\2\2\2VW\7\61\2\2W[\7\61\2\2XZ\13\2\2\2YX\3"+
		"\2\2\2Z]\3\2\2\2[\\\3\2\2\2[Y\3\2\2\2\\^\3\2\2\2][\3\2\2\2^j\7\f\2\2_"+
		"`\7\61\2\2`d\7,\2\2ac\13\2\2\2ba\3\2\2\2cf\3\2\2\2de\3\2\2\2db\3\2\2\2"+
		"eg\3\2\2\2fd\3\2\2\2gh\7,\2\2hj\7\61\2\2iV\3\2\2\2i_\3\2\2\2j\b\3\2\2"+
		"\2km\t\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\n\3\2\2\2pq\7\62"+
		"\2\2qu\7z\2\2rs\7\62\2\2su\7d\2\2tp\3\2\2\2tr\3\2\2\2u\f\3\2\2\2vw\7,"+
		"\2\2w\16\3\2\2\2xy\7\61\2\2y\20\3\2\2\2z{\7/\2\2{\22\3\2\2\2|}\7-\2\2"+
		"}\24\3\2\2\2~\177\7`\2\2\177\26\3\2\2\2\u0080\u0081\7>\2\2\u0081\u0082"+
		"\7?\2\2\u0082\30\3\2\2\2\u0083\u0084\7@\2\2\u0084\u0085\7?\2\2\u0085\32"+
		"\3\2\2\2\u0086\u0087\7>\2\2\u0087\34\3\2\2\2\u0088\u0089\7@\2\2\u0089"+
		"\36\3\2\2\2\u008a\u008b\7?\2\2\u008b\u008c\7?\2\2\u008c \3\2\2\2\u008d"+
		"\u008e\7(\2\2\u008e\u0093\7(\2\2\u008f\u0090\7c\2\2\u0090\u0091\7p\2\2"+
		"\u0091\u0093\7f\2\2\u0092\u008d\3\2\2\2\u0092\u008f\3\2\2\2\u0093\"\3"+
		"\2\2\2\u0094\u0095\7~\2\2\u0095\u0099\7~\2\2\u0096\u0097\7q\2\2\u0097"+
		"\u0099\7t\2\2\u0098\u0094\3\2\2\2\u0098\u0096\3\2\2\2\u0099$\3\2\2\2\u009a"+
		"\u009b\7?\2\2\u009b&\3\2\2\2\u009c\u009d\7*\2\2\u009d(\3\2\2\2\u009e\u009f"+
		"\7+\2\2\u009f*\3\2\2\2\u00a0\u00a1\7.\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7"+
		"\60\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7h\2\2\u00a6\60"+
		"\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7p\2\2\u00aa"+
		"\u00ab\7e\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7q\2\2"+
		"\u00ae\u00b4\7p\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2"+
		"\7p\2\2\u00b2\u00b4\7e\2\2\u00b3\u00a7\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4"+
		"\62\3\2\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7k\2\2\u00b8"+
		"\u00b9\7v\2\2\u00b9\64\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc"+
		"\u00bd\7n\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c9\7g\2\2"+
		"\u00c0\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4"+
		"\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7/\2\2\u00c7"+
		"\u00c9\7E\2\2\u00c8\u00ba\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c9\66\3\2\2\2"+
		"\u00ca\u00cb\7v\2\2\u00cb\u00cc\7{\2\2\u00cc\u00cd\7r\2\2\u00cd\u00ce"+
		"\7g\2\2\u00ce8\3\2\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2"+
		"\7k\2\2\u00d2\u00d3\7o\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7v\2\2\u00d5"+
		"\u00d6\7k\2\2\u00d6\u00d7\7x\2\2\u00d7\u00d8\7g\2\2\u00d8:\3\2\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7f\2\2\u00dc<\3\2\2\2\u00dd"+
		"\u00de\7v\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7w\2\2\u00e0\u00e1\7g\2\2"+
		"\u00e1>\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7n\2"+
		"\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7g\2\2\u00e7@\3\2\2\2\u00e8\u00e9\7"+
		"g\2\2\u00e9\u00ea\7z\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed"+
		"\7p\2\2\u00ed\u00ee\7f\2\2\u00ee\u00ef\7u\2\2\u00efB\3\2\2\2\u00f0\u00f1"+
		"\7x\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7t\2\2\u00f3D\3\2\2\2\u00f4\u00f5"+
		"\7e\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7u\2\2\u00f8"+
		"\u00f9\7v\2\2\u00f9F\3\2\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7q\2\2\u00fc"+
		"\u00fd\7e\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7n\2\2\u00ffH\3\2\2\2\u0100"+
		"\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u010e\7v\2\2\u0103\u0104\7e\2\2"+
		"\u0104\u0105\7j\2\2\u0105\u0106\7c\2\2\u0106\u010e\7t\2\2\u0107\u0108"+
		"\7f\2\2\u0108\u0109\7q\2\2\u0109\u010a\7w\2\2\u010a\u010b\7d\2\2\u010b"+
		"\u010c\7n\2\2\u010c\u010e\7g\2\2\u010d\u0100\3\2\2\2\u010d\u0103\3\2\2"+
		"\2\u010d\u0107\3\2\2\2\u010eJ\3\2\2\2\u010f\u0113\t\3\2\2\u0110\u0112"+
		"\t\4\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114L\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118\t\5\2\2"+
		"\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b\'\2\2\u011cN\3\2\2\2\u011d"+
		"\u011f\t\6\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b(\2\2\u0123"+
		"P\3\2\2\2\20\2[dint\u0092\u0098\u00b3\u00c8\u010d\u0113\u0119\u0120\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}