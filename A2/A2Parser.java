// Generated from A2Parser.g by ANTLR 4.5.2


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class A2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, A2=2, JTXT=3, OUTLIST=4, OUTVAL=5, ID=6, COMMA=7, EQ=8, WS=9, 
		BRSTART=10, CSTART=11, JALL=12;
	public static final int
		RULE_prog = 0, RULE_stat = 1;
	public static final String[] ruleNames = {
		"prog", "stat"
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

	@Override
	public String getGrammarFileName() { return "A2Parser.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	/** Initialize debug level to 0 */
	int debug_level=0;

	public A2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2ParserListener ) ((A2ParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2ParserListener ) ((A2ParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				stat();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << A2) | (1L << JTXT))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public Token JTXT;
		public Token STRING;
		public Token out;
		public Token OUTLIST;
		public Token i1;
		public Token i2;
		public Token i3;
		public Token i4;
		public Token i5;
		public Token JALL;
		public Token OUTVAL;
		public TerminalNode JTXT() { return getToken(A2Parser.JTXT, 0); }
		public TerminalNode STRING() { return getToken(A2Parser.STRING, 0); }
		public TerminalNode A2() { return getToken(A2Parser.A2, 0); }
		public TerminalNode EQ() { return getToken(A2Parser.EQ, 0); }
		public TerminalNode OUTLIST() { return getToken(A2Parser.OUTLIST, 0); }
		public TerminalNode BRSTART() { return getToken(A2Parser.BRSTART, 0); }
		public List<TerminalNode> COMMA() { return getTokens(A2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(A2Parser.COMMA, i);
		}
		public TerminalNode CSTART() { return getToken(A2Parser.CSTART, 0); }
		public TerminalNode JALL() { return getToken(A2Parser.JALL, 0); }
		public List<TerminalNode> ID() { return getTokens(A2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(A2Parser.ID, i);
		}
		public TerminalNode OUTVAL() { return getToken(A2Parser.OUTVAL, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2ParserListener ) ((A2ParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2ParserListener ) ((A2ParserListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				((StatContext)_localctx).JTXT = match(JTXT);
				System.out.print((((StatContext)_localctx).JTXT!=null?((StatContext)_localctx).JTXT.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				((StatContext)_localctx).STRING = match(STRING);
				System.out.print((((StatContext)_localctx).STRING!=null?((StatContext)_localctx).STRING.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(13);
				match(A2);
				setState(14);
				((StatContext)_localctx).out = match(ID);
				setState(15);
				match(EQ);
				setState(16);
				((StatContext)_localctx).OUTLIST = match(OUTLIST);
				setState(17);
				match(BRSTART);
				setState(18);
				((StatContext)_localctx).i1 = match(ID);
				setState(19);
				match(COMMA);
				setState(20);
				((StatContext)_localctx).i2 = match(ID);
				setState(21);
				match(COMMA);
				setState(22);
				((StatContext)_localctx).i3 = match(ID);
				setState(23);
				match(COMMA);
				setState(24);
				((StatContext)_localctx).i4 = match(ID);
				setState(25);
				match(COMMA);
				setState(26);
				((StatContext)_localctx).i5 = match(ID);
				setState(27);
				match(COMMA);
				setState(28);
				match(CSTART);
				setState(29);
				((StatContext)_localctx).JALL = match(JALL);

				            String id4 = (((StatContext)_localctx).i4!=null?((StatContext)_localctx).i4.getText():null);
				            String str = (((StatContext)_localctx).JALL!=null?((StatContext)_localctx).JALL.getText():null); str = str.trim(); str = str.substring(0, str.length() - 2);
				            System.out.println("//#" + (((StatContext)_localctx).out!=null?((StatContext)_localctx).out.getText():null) + "=" + (((StatContext)_localctx).OUTLIST!=null?((StatContext)_localctx).OUTLIST.getText():null) + "[" + (((StatContext)_localctx).i1!=null?((StatContext)_localctx).i1.getText():null) + "," + (((StatContext)_localctx).i2!=null?((StatContext)_localctx).i2.getText():null) + "," + (((StatContext)_localctx).i3!=null?((StatContext)_localctx).i3.getText():null) + "," + (((StatContext)_localctx).i4!=null?((StatContext)_localctx).i4.getText():null) + "," + (((StatContext)_localctx).i5!=null?((StatContext)_localctx).i5.getText():null) + ",{" + (((StatContext)_localctx).JALL!=null?((StatContext)_localctx).JALL.getText():null));
				            System.out.println("        {");
				            System.out.println("            List<" + id4 + "> outListInternal = new LinkedList<" + id4 + ">();");
				            System.out.println("            for (" + (((StatContext)_localctx).i2!=null?((StatContext)_localctx).i2.getText():null) + (((StatContext)_localctx).i3!=null?((StatContext)_localctx).i3.getText():null) + " : " + (((StatContext)_localctx).i1!=null?((StatContext)_localctx).i1.getText():null) + ")");
				            System.out.println("            {");
				            System.out.println("            " + (((StatContext)_localctx).i4!=null?((StatContext)_localctx).i4.getText():null) + " " + (((StatContext)_localctx).i5!=null?((StatContext)_localctx).i5.getText():null) + ";");
				            System.out.println("            " + str);
				            System.out.println("            outListInternal.add(" + (((StatContext)_localctx).i5!=null?((StatContext)_localctx).i5.getText():null) + ");");
				            System.out.println("            }");
				            System.out.println("        " + (((StatContext)_localctx).out!=null?((StatContext)_localctx).out.getText():null) + "=outListInternal;");
				            System.out.println("        }");
				            System.out.println("// end of translated code");
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				match(A2);
				setState(32);
				((StatContext)_localctx).out = match(ID);
				setState(33);
				match(EQ);
				setState(34);
				((StatContext)_localctx).OUTLIST = match(OUTLIST);
				setState(35);
				match(BRSTART);
				setState(36);
				((StatContext)_localctx).i1 = match(ID);
				setState(37);
				match(COMMA);
				setState(38);
				((StatContext)_localctx).i2 = match(ID);
				setState(39);
				match(COMMA);
				setState(40);
				((StatContext)_localctx).i3 = match(ID);
				setState(41);
				match(COMMA);
				setState(42);
				match(CSTART);
				setState(43);
				((StatContext)_localctx).JALL = match(JALL);

				            System.out.println("//#" + (((StatContext)_localctx).out!=null?((StatContext)_localctx).out.getText():null) + "=" + (((StatContext)_localctx).OUTLIST!=null?((StatContext)_localctx).OUTLIST.getText():null) + "[" + (((StatContext)_localctx).i1!=null?((StatContext)_localctx).i1.getText():null) + "," + (((StatContext)_localctx).i2!=null?((StatContext)_localctx).i2.getText():null) + "," + (((StatContext)_localctx).i3!=null?((StatContext)_localctx).i3.getText():null) + ",{" + (((StatContext)_localctx).JALL!=null?((StatContext)_localctx).JALL.getText():null));   
				            System.out.println("        {");
				            System.out.println("            List<" + (((StatContext)_localctx).i2!=null?((StatContext)_localctx).i2.getText():null) + "> outListInternal=new LinkedList<" + (((StatContext)_localctx).i2!=null?((StatContext)_localctx).i2.getText():null) + ">();");
				            System.out.println("            for (" + (((StatContext)_localctx).i2!=null?((StatContext)_localctx).i2.getText():null) + " " + (((StatContext)_localctx).i3!=null?((StatContext)_localctx).i3.getText():null) + " : " + (((StatContext)_localctx).i1!=null?((StatContext)_localctx).i1.getText():null) + ")");
				            System.out.println("            {");
				            System.out.println("                if (" + (((StatContext)_localctx).i3!=null?((StatContext)_localctx).i3.getText():null) + ".length()>5)");
				            System.out.println("                {");
				            System.out.println("                    outListInternal.add(" + (((StatContext)_localctx).i3!=null?((StatContext)_localctx).i3.getText():null) + ");");
				            System.out.println("                }");
				            System.out.println("            }");
				            System.out.println("            " + (((StatContext)_localctx).out!=null?((StatContext)_localctx).out.getText():null) + "=outListInternal;");
				            System.out.println("        }");
				            System.out.println("// end of translated code");
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				match(A2);
				setState(46);
				((StatContext)_localctx).out = match(ID);
				setState(47);
				match(EQ);
				setState(48);
				((StatContext)_localctx).OUTVAL = match(OUTVAL);
				setState(49);
				match(BRSTART);
				setState(50);
				((StatContext)_localctx).i1 = match(ID);
				setState(51);
				match(COMMA);
				setState(52);
				((StatContext)_localctx).i2 = match(ID);
				setState(53);
				match(COMMA);
				setState(54);
				((StatContext)_localctx).i3 = match(ID);
				setState(55);
				match(COMMA);
				setState(56);
				match(CSTART);
				setState(57);
				((StatContext)_localctx).JALL = match(JALL);

				            String str = (((StatContext)_localctx).JALL!=null?((StatContext)_localctx).JALL.getText():null); str = str.trim(); str = str.substring(0, str.length() - 2);
				            System.out.println("//#" + (((StatContext)_localctx).out!=null?((StatContext)_localctx).out.getText():null) + "=" + (((StatContext)_localctx).OUTVAL!=null?((StatContext)_localctx).OUTVAL.getText():null) + "[" + (((StatContext)_localctx).i1!=null?((StatContext)_localctx).i1.getText():null) + "," + (((StatContext)_localctx).i2!=null?((StatContext)_localctx).i2.getText():null) + "," + (((StatContext)_localctx).i3!=null?((StatContext)_localctx).i3.getText():null) + ",{" + (((StatContext)_localctx).JALL!=null?((StatContext)_localctx).JALL.getText():null));
				            System.out.println("        {");
				            System.out.println("            for (" + (((StatContext)_localctx).i2!=null?((StatContext)_localctx).i2.getText():null) + " " + (((StatContext)_localctx).i3!=null?((StatContext)_localctx).i3.getText():null) + " : " + (((StatContext)_localctx).i1!=null?((StatContext)_localctx).i1.getText():null) + ")");
				            System.out.println("            {");
				            System.out.println("                " + str);
				            System.out.println("            }");
				            System.out.println("        }");
				            System.out.println("// end of translated code");
				        
				}
				break;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16@\4\2\t\2\4\3\t"+
		"\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\3\2\2\4\2\4\2\2B\2\7\3\2\2\2\4=\3\2\2\2"+
		"\6\b\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\3\3\2\2"+
		"\2\13\f\7\5\2\2\f>\b\3\1\2\r\16\7\3\2\2\16>\b\3\1\2\17\20\7\4\2\2\20\21"+
		"\7\b\2\2\21\22\7\n\2\2\22\23\7\6\2\2\23\24\7\f\2\2\24\25\7\b\2\2\25\26"+
		"\7\t\2\2\26\27\7\b\2\2\27\30\7\t\2\2\30\31\7\b\2\2\31\32\7\t\2\2\32\33"+
		"\7\b\2\2\33\34\7\t\2\2\34\35\7\b\2\2\35\36\7\t\2\2\36\37\7\r\2\2\37 \7"+
		"\16\2\2 >\b\3\1\2!\"\7\4\2\2\"#\7\b\2\2#$\7\n\2\2$%\7\6\2\2%&\7\f\2\2"+
		"&\'\7\b\2\2\'(\7\t\2\2()\7\b\2\2)*\7\t\2\2*+\7\b\2\2+,\7\t\2\2,-\7\r\2"+
		"\2-.\7\16\2\2.>\b\3\1\2/\60\7\4\2\2\60\61\7\b\2\2\61\62\7\n\2\2\62\63"+
		"\7\7\2\2\63\64\7\f\2\2\64\65\7\b\2\2\65\66\7\t\2\2\66\67\7\b\2\2\678\7"+
		"\t\2\289\7\b\2\29:\7\t\2\2:;\7\r\2\2;<\7\16\2\2<>\b\3\1\2=\13\3\2\2\2"+
		"=\r\3\2\2\2=\17\3\2\2\2=!\3\2\2\2=/\3\2\2\2>\5\3\2\2\2\4\t=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}