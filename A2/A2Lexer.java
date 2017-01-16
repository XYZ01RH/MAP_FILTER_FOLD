// Generated from A2Lexer.g by ANTLR 4.5.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class A2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, A2=2, JTXT=3, OUTLIST=4, OUTVAL=5, ID=6, COMMA=7, EQ=8, WS=9, 
		BRSTART=10, CSTART=11, JALL=12;
	public static final int A2_MODE = 1;
	public static final int DJAVA_MODE = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "A2_MODE", "DJAVA_MODE"
	};

	public static final String[] ruleNames = {
		"ESCAPED_QUOTE", "STRING", "A2", "JTXT", "OUTLIST", "OUTVAL", "ID", "COMMA", 
		"EQ", "WS", "BRSTART", "CSTART", "JALL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'#'", null, null, "'FOLD'", null, "','", "'='", null, "'['", 
		"'{'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING", "A2", "JTXT", "OUTLIST", "OUTVAL", "ID", "COMMA", "EQ", 
		"WS", "BRSTART", "CSTART", "JALL"
	};
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


	public A2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "A2Lexer.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 9:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16o\b\1\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\7\3&\n\3"+
		"\f\3\16\3)\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\6\5\62\n\5\r\5\16\5\63\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6?\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\7\bH\n\b\f\b\16\bK\13\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\7\16[\n\16\f\16\16\16^\13\16\3\16\3\16\3\16\3\16\7\16"+
		"d\n\16\f\16\16\16g\13\16\3\16\5\16j\n\16\3\16\3\16\3\16\3\16\4\'\\\2\17"+
		"\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\5\2\3"+
		"\4\b\4\2\f\f\17\17\3\2$%\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\4\2"+
		"\13\13\"\"s\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r\3\2\2\2\3\17\3\2"+
		"\2\2\3\21\3\2\2\2\3\23\3\2\2\2\3\25\3\2\2\2\3\27\3\2\2\2\3\31\3\2\2\2"+
		"\3\33\3\2\2\2\4\35\3\2\2\2\5\37\3\2\2\2\7\"\3\2\2\2\t,\3\2\2\2\13\61\3"+
		"\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21E\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27P"+
		"\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35\\\3\2\2\2\37 \7^\2\2 !\7$\2\2!\6\3"+
		"\2\2\2\"\'\7$\2\2#&\5\5\2\2$&\n\2\2\2%#\3\2\2\2%$\3\2\2\2&)\3\2\2\2\'"+
		"(\3\2\2\2\'%\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7$\2\2+\b\3\2\2\2,-\7%\2\2"+
		"-.\3\2\2\2./\b\4\2\2/\n\3\2\2\2\60\62\n\3\2\2\61\60\3\2\2\2\62\63\3\2"+
		"\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\f\3\2\2\2\65\66\7O\2\2\66\67\7C\2"+
		"\2\67?\7R\2\289\7H\2\29:\7K\2\2:;\7N\2\2;<\7V\2\2<=\7G\2\2=?\7T\2\2>\65"+
		"\3\2\2\2>8\3\2\2\2?\16\3\2\2\2@A\7H\2\2AB\7Q\2\2BC\7N\2\2CD\7F\2\2D\20"+
		"\3\2\2\2EI\t\4\2\2FH\t\5\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J"+
		"\22\3\2\2\2KI\3\2\2\2LM\7.\2\2M\24\3\2\2\2NO\7?\2\2O\26\3\2\2\2PQ\t\6"+
		"\2\2QR\b\13\3\2R\30\3\2\2\2ST\7]\2\2T\32\3\2\2\2UV\7}\2\2VW\3\2\2\2WX"+
		"\b\r\4\2X\34\3\2\2\2Y[\13\2\2\2ZY\3\2\2\2[^\3\2\2\2\\]\3\2\2\2\\Z\3\2"+
		"\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\177\2\2`a\7_\2\2ae\3\2\2\2bd\t\7\2\2cb\3"+
		"\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2hj\7\17\2\2ih"+
		"\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\f\2\2lm\3\2\2\2mn\b\16\5\2n\36\3\2\2"+
		"\2\r\2\3\4%\'\63>I\\ei\6\4\3\2\3\13\2\4\4\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}