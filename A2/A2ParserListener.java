// Generated from A2Parser.g by ANTLR 4.5.2


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link A2Parser}.
 */
public interface A2ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link A2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(A2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(A2Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(A2Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(A2Parser.StatContext ctx);
}