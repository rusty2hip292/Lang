// Generated from Cplusplusplus.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CplusplusplusParser}.
 */
public interface CplusplusplusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CplusplusplusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CplusplusplusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CplusplusplusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CplusplusplusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CplusplusplusParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(CplusplusplusParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CplusplusplusParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(CplusplusplusParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CplusplusplusParser#noout}.
	 * @param ctx the parse tree
	 */
	void enterNoout(CplusplusplusParser.NooutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CplusplusplusParser#noout}.
	 * @param ctx the parse tree
	 */
	void exitNoout(CplusplusplusParser.NooutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CplusplusplusParser#out}.
	 * @param ctx the parse tree
	 */
	void enterOut(CplusplusplusParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CplusplusplusParser#out}.
	 * @param ctx the parse tree
	 */
	void exitOut(CplusplusplusParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CplusplusplusParser#oursyntax}.
	 * @param ctx the parse tree
	 */
	void enterOursyntax(CplusplusplusParser.OursyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link CplusplusplusParser#oursyntax}.
	 * @param ctx the parse tree
	 */
	void exitOursyntax(CplusplusplusParser.OursyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link CplusplusplusParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(CplusplusplusParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CplusplusplusParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(CplusplusplusParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CplusplusplusParser#bracketed}.
	 * @param ctx the parse tree
	 */
	void enterBracketed(CplusplusplusParser.BracketedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CplusplusplusParser#bracketed}.
	 * @param ctx the parse tree
	 */
	void exitBracketed(CplusplusplusParser.BracketedContext ctx);
}