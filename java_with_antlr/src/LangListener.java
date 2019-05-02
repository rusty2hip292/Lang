// Generated from Lang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#valid}.
	 * @param ctx the parse tree
	 */
	void enterValid(LangParser.ValidContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#valid}.
	 * @param ctx the parse tree
	 */
	void exitValid(LangParser.ValidContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(LangParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(LangParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(LangParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(LangParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(LangParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(LangParser.OperatorContext ctx);
}