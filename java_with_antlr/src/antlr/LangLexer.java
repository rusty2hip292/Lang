// Generated from Lang.g4 by ANTLR 4.7.2
package antlr;
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
		EXTENDS=32, VAR=33, CONST=34, LOCAL=35, IDENTIFIER=36, NEWLINE=37, WHITESPACE=38;
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
			"CONST", "LOCAL", "IDENTIFIER", "NEWLINE", "WHITESPACE"
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
			"CONST", "LOCAL", "IDENTIFIER", "NEWLINE", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0113\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\3\4\3\4\7\4a\n\4\f\4\16\4d\13\4"+
		"\3\4\3\4\5\4h\n\4\3\5\6\5k\n\5\r\5\16\5l\3\6\3\6\3\6\3\6\5\6s\n\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u0091\n\21"+
		"\3\22\3\22\3\22\3\22\5\22\u0097\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u00b2\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00c7"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\7%\u0101\n%\f%\16%\u0104\13%\3&\6&\u0107\n&\r&\16&\u0108"+
		"\3&\3&\3\'\6\'\u010e\n\'\r\'\16\'\u010f\3\'\3\'\4Yb\2(\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\2\f\f\5\2\13\13\17\17\""+
		"\"\2\u011e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7g"+
		"\3\2\2\2\tj\3\2\2\2\13r\3\2\2\2\rt\3\2\2\2\17v\3\2\2\2\21x\3\2\2\2\23"+
		"z\3\2\2\2\25|\3\2\2\2\27~\3\2\2\2\31\u0081\3\2\2\2\33\u0084\3\2\2\2\35"+
		"\u0086\3\2\2\2\37\u0088\3\2\2\2!\u0090\3\2\2\2#\u0096\3\2\2\2%\u0098\3"+
		"\2\2\2\'\u009a\3\2\2\2)\u009c\3\2\2\2+\u009e\3\2\2\2-\u00a0\3\2\2\2/\u00a2"+
		"\3\2\2\2\61\u00b1\3\2\2\2\63\u00b3\3\2\2\2\65\u00c6\3\2\2\2\67\u00c8\3"+
		"\2\2\29\u00cd\3\2\2\2;\u00d7\3\2\2\2=\u00db\3\2\2\2?\u00e0\3\2\2\2A\u00e6"+
		"\3\2\2\2C\u00ee\3\2\2\2E\u00f2\3\2\2\2G\u00f8\3\2\2\2I\u00fe\3\2\2\2K"+
		"\u0106\3\2\2\2M\u010d\3\2\2\2OP\7$\2\2P\4\3\2\2\2QR\7^\2\2RS\7$\2\2S\6"+
		"\3\2\2\2TU\7\61\2\2UY\7\61\2\2VX\13\2\2\2WV\3\2\2\2X[\3\2\2\2YZ\3\2\2"+
		"\2YW\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\h\7\f\2\2]^\7\61\2\2^b\7,\2\2_a\13"+
		"\2\2\2`_\3\2\2\2ad\3\2\2\2bc\3\2\2\2b`\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7"+
		",\2\2fh\7\61\2\2gT\3\2\2\2g]\3\2\2\2h\b\3\2\2\2ik\t\2\2\2ji\3\2\2\2kl"+
		"\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\n\3\2\2\2no\7\62\2\2os\7z\2\2pq\7\62\2\2"+
		"qs\7d\2\2rn\3\2\2\2rp\3\2\2\2s\f\3\2\2\2tu\7,\2\2u\16\3\2\2\2vw\7\61\2"+
		"\2w\20\3\2\2\2xy\7/\2\2y\22\3\2\2\2z{\7-\2\2{\24\3\2\2\2|}\7`\2\2}\26"+
		"\3\2\2\2~\177\7>\2\2\177\u0080\7?\2\2\u0080\30\3\2\2\2\u0081\u0082\7@"+
		"\2\2\u0082\u0083\7?\2\2\u0083\32\3\2\2\2\u0084\u0085\7>\2\2\u0085\34\3"+
		"\2\2\2\u0086\u0087\7@\2\2\u0087\36\3\2\2\2\u0088\u0089\7?\2\2\u0089\u008a"+
		"\7?\2\2\u008a \3\2\2\2\u008b\u008c\7(\2\2\u008c\u0091\7(\2\2\u008d\u008e"+
		"\7c\2\2\u008e\u008f\7p\2\2\u008f\u0091\7f\2\2\u0090\u008b\3\2\2\2\u0090"+
		"\u008d\3\2\2\2\u0091\"\3\2\2\2\u0092\u0093\7~\2\2\u0093\u0097\7~\2\2\u0094"+
		"\u0095\7q\2\2\u0095\u0097\7t\2\2\u0096\u0092\3\2\2\2\u0096\u0094\3\2\2"+
		"\2\u0097$\3\2\2\2\u0098\u0099\7?\2\2\u0099&\3\2\2\2\u009a\u009b\7*\2\2"+
		"\u009b(\3\2\2\2\u009c\u009d\7+\2\2\u009d*\3\2\2\2\u009e\u009f\7.\2\2\u009f"+
		",\3\2\2\2\u00a0\u00a1\7\60\2\2\u00a1.\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7h\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7w\2\2\u00a7"+
		"\u00a8\7p\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7k\2\2"+
		"\u00ab\u00ac\7q\2\2\u00ac\u00b2\7p\2\2\u00ad\u00ae\7h\2\2\u00ae\u00af"+
		"\7w\2\2\u00af\u00b0\7p\2\2\u00b0\u00b2\7e\2\2\u00b1\u00a5\3\2\2\2\u00b1"+
		"\u00ad\3\2\2\2\u00b2\62\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2"+
		"\u00b5\u00b6\7k\2\2\u00b6\u00b7\7v\2\2\u00b7\64\3\2\2\2\u00b8\u00b9\7"+
		"k\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd"+
		"\7p\2\2\u00bd\u00c7\7g\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0"+
		"\u00c1\7n\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7g\2\2"+
		"\u00c4\u00c5\7/\2\2\u00c5\u00c7\7E\2\2\u00c6\u00b8\3\2\2\2\u00c6\u00be"+
		"\3\2\2\2\u00c7\66\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7{\2\2\u00ca"+
		"\u00cb\7r\2\2\u00cb\u00cc\7g\2\2\u00cc8\3\2\2\2\u00cd\u00ce\7r\2\2\u00ce"+
		"\u00cf\7t\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7o\2\2\u00d1\u00d2\7k\2\2"+
		"\u00d2\u00d3\7v\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7x\2\2\u00d5\u00d6"+
		"\7g\2\2\u00d6:\3\2\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da"+
		"\7f\2\2\u00da<\3\2\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de"+
		"\7w\2\2\u00de\u00df\7g\2\2\u00df>\3\2\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2"+
		"\7c\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7g\2\2\u00e5"+
		"@\3\2\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7z\2\2\u00e8\u00e9\7v\2\2\u00e9"+
		"\u00ea\7g\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7u\2\2"+
		"\u00edB\3\2\2\2\u00ee\u00ef\7x\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7t\2"+
		"\2\u00f1D\3\2\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7"+
		"p\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7v\2\2\u00f7F\3\2\2\2\u00f8\u00f9"+
		"\7n\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc\7c\2\2\u00fc"+
		"\u00fd\7n\2\2\u00fdH\3\2\2\2\u00fe\u0102\t\3\2\2\u00ff\u0101\t\4\2\2\u0100"+
		"\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103J\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\t\5\2\2\u0106\u0105"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\b&\2\2\u010bL\3\2\2\2\u010c\u010e\t\6\2\2\u010d"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0112\b\'\2\2\u0112N\3\2\2\2\17\2Ybglr"+
		"\u0090\u0096\u00b1\u00c6\u0102\u0108\u010f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}