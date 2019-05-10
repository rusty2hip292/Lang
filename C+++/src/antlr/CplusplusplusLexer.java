// Generated from Cplusplusplus.g4 by ANTLR 4.7.2
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
public class CplusplusplusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, IDENTIFIER=5, WHITESPACE=6, ANYTHINGELSE=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "IDENTIFIER", "WHITESPACE", "ANYTHINGELSE"
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


	public CplusplusplusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cplusplusplus.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\66\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6\"\n\6\f\6\16\6%\13\6\3"+
		"\7\6\7(\n\7\r\7\16\7)\3\b\6\b-\n\b\r\b\16\b.\3\b\3\b\3\b\3\b\5\b\65\n"+
		"\b\3.\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\6\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\5\2\13\f\17\17\"\"\5\2*+==??\2;\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\27\3"+
		"\2\2\2\7\33\3\2\2\2\t\35\3\2\2\2\13\37\3\2\2\2\r\'\3\2\2\2\17\64\3\2\2"+
		"\2\21\22\7e\2\2\22\23\7n\2\2\23\24\7c\2\2\24\25\7u\2\2\25\26\7u\2\2\26"+
		"\4\3\2\2\2\27\30\7p\2\2\30\31\7g\2\2\31\32\7y\2\2\32\6\3\2\2\2\33\34\7"+
		"}\2\2\34\b\3\2\2\2\35\36\7\177\2\2\36\n\3\2\2\2\37#\t\2\2\2 \"\t\3\2\2"+
		"! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\f\3\2\2\2%#\3\2\2\2&(\t\4\2"+
		"\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\16\3\2\2\2+-\13\2\2\2,+"+
		"\3\2\2\2-.\3\2\2\2./\3\2\2\2.,\3\2\2\2/\65\3\2\2\2\60\65\7\f\2\2\61\62"+
		"\7/\2\2\62\65\7@\2\2\63\65\t\5\2\2\64,\3\2\2\2\64\60\3\2\2\2\64\61\3\2"+
		"\2\2\64\63\3\2\2\2\65\20\3\2\2\2\7\2#).\64\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}