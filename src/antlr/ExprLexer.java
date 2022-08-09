// Generated from Expr.g4 by ANTLR 4.10.1

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
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Comment=1, Scenario=2, ScenarioOutline=3, Feature=4, Space=5, NewLine=6, 
		Word=7, ERR_TOKEN=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Comment", "Scenario", "ScenarioOutline", "Feature", "Space", "NewLine", 
			"Word", "WD", "ERR_TOKEN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Scenario:'", "'Scenario Outline:'", "'Feature:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Comment", "Scenario", "ScenarioOutline", "Feature", "Space", "NewLine", 
			"Word", "ERR_TOKEN"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\u0004\u0000\b\\\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0005\u0000\u0015\b\u0000\n\u0000"+
		"\f\u0000\u0018\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001c\b\u0000"+
		"\n\u0000\f\u0000\u001f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005M\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005Q\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0005\u0007V\b\u0007\n\u0007\f\u0007Y\t\u0007\u0001"+
		"\b\u0001\b\u0001\u001d\u0000\t\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\u0000\u0011\b\u0001\u0000\u0002"+
		"\u0002\u0000\t\t  \u0003\u000009AZaz_\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0001\u0016\u0001\u0000\u0000\u0000\u0003$\u0001"+
		"\u0000\u0000\u0000\u0005.\u0001\u0000\u0000\u0000\u0007@\u0001\u0000\u0000"+
		"\u0000\tI\u0001\u0000\u0000\u0000\u000bP\u0001\u0000\u0000\u0000\rR\u0001"+
		"\u0000\u0000\u0000\u000fW\u0001\u0000\u0000\u0000\u0011Z\u0001\u0000\u0000"+
		"\u0000\u0013\u0015\u0003\t\u0004\u0000\u0014\u0013\u0001\u0000\u0000\u0000"+
		"\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0019\u0001\u0000\u0000\u0000"+
		"\u0018\u0016\u0001\u0000\u0000\u0000\u0019\u001d\u0005#\u0000\u0000\u001a"+
		"\u001c\t\u0000\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001d\u001b"+
		"\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001d\u0001"+
		"\u0000\u0000\u0000 !\u0003\u000b\u0005\u0000!\"\u0001\u0000\u0000\u0000"+
		"\"#\u0006\u0000\u0000\u0000#\u0002\u0001\u0000\u0000\u0000$%\u0005S\u0000"+
		"\u0000%&\u0005c\u0000\u0000&\'\u0005e\u0000\u0000\'(\u0005n\u0000\u0000"+
		"()\u0005a\u0000\u0000)*\u0005r\u0000\u0000*+\u0005i\u0000\u0000+,\u0005"+
		"o\u0000\u0000,-\u0005:\u0000\u0000-\u0004\u0001\u0000\u0000\u0000./\u0005"+
		"S\u0000\u0000/0\u0005c\u0000\u000001\u0005e\u0000\u000012\u0005n\u0000"+
		"\u000023\u0005a\u0000\u000034\u0005r\u0000\u000045\u0005i\u0000\u0000"+
		"56\u0005o\u0000\u000067\u0005 \u0000\u000078\u0005O\u0000\u000089\u0005"+
		"u\u0000\u00009:\u0005t\u0000\u0000:;\u0005l\u0000\u0000;<\u0005i\u0000"+
		"\u0000<=\u0005n\u0000\u0000=>\u0005e\u0000\u0000>?\u0005:\u0000\u0000"+
		"?\u0006\u0001\u0000\u0000\u0000@A\u0005F\u0000\u0000AB\u0005e\u0000\u0000"+
		"BC\u0005a\u0000\u0000CD\u0005t\u0000\u0000DE\u0005u\u0000\u0000EF\u0005"+
		"r\u0000\u0000FG\u0005e\u0000\u0000GH\u0005:\u0000\u0000H\b\u0001\u0000"+
		"\u0000\u0000IJ\u0007\u0000\u0000\u0000J\n\u0001\u0000\u0000\u0000KM\u0005"+
		"\r\u0000\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NQ\u0005\n\u0000\u0000OQ\u0005\r\u0000\u0000PL\u0001"+
		"\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\f\u0001\u0000\u0000\u0000"+
		"RS\u0003\u000f\u0007\u0000S\u000e\u0001\u0000\u0000\u0000TV\u0007\u0001"+
		"\u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\u0010\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000Z[\t\u0000\u0000\u0000[\u0012\u0001\u0000"+
		"\u0000\u0000\u0006\u0000\u0016\u001dLPW\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}