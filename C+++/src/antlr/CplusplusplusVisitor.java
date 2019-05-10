// Generated from Cplusplusplus.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CplusplusplusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CplusplusplusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CplusplusplusParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CplusplusplusParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CplusplusplusParser#whitespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhitespace(CplusplusplusParser.WhitespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CplusplusplusParser#anythingelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnythingelse(CplusplusplusParser.AnythingelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CplusplusplusParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(CplusplusplusParser.EofContext ctx);
	/**
	 * Visit a parse tree produced by {@link CplusplusplusParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CplusplusplusParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CplusplusplusParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(CplusplusplusParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CplusplusplusParser#noout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoout(CplusplusplusParser.NooutContext ctx);
	/**
	 * Visit a parse tree produced by {@link CplusplusplusParser#out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(CplusplusplusParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by {@link CplusplusplusParser#oursyntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOursyntax(CplusplusplusParser.OursyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link CplusplusplusParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(CplusplusplusParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CplusplusplusParser#new_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_(CplusplusplusParser.New_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CplusplusplusParser#bracketed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketed(CplusplusplusParser.BracketedContext ctx);
}