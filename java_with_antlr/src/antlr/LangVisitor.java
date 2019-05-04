// Generated from Lang.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#valid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValid(LangParser.ValidContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#parsable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParsable(LangParser.ParsableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#debugging}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugging(LangParser.DebuggingContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(LangParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LangParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LangParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(LangParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(LangParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(LangParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(LangParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(LangParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(LangParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#inline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline(LangParser.InlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(LangParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#typedef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef(LangParser.TypedefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(LangParser.ParamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(LangParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#evaluateable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateable(LangParser.EvaluateableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue(LangParser.RvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(LangParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(LangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(LangParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#p0arithmatic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP0arithmatic(LangParser.P0arithmaticContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#p1arithmatic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP1arithmatic(LangParser.P1arithmaticContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#p2arithmatic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP2arithmatic(LangParser.P2arithmaticContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#p3arithmatic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP3arithmatic(LangParser.P3arithmaticContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#comparisonoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonoperator(LangParser.ComparisonoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#booleanoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanoperator(LangParser.BooleanoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LangParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(LangParser.OrContext ctx);
}