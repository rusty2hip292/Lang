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
	 * Enter a parse tree produced by {@link LangParser#parsable}.
	 * @param ctx the parse tree
	 */
	void enterParsable(LangParser.ParsableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#parsable}.
	 * @param ctx the parse tree
	 */
	void exitParsable(LangParser.ParsableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#debugging}.
	 * @param ctx the parse tree
	 */
	void enterDebugging(LangParser.DebuggingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#debugging}.
	 * @param ctx the parse tree
	 */
	void exitDebugging(LangParser.DebuggingContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LangParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(LangParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(LangParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(LangParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(LangParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(LangParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(LangParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(LangParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(LangParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(LangParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(LangParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LangParser.BlockContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(LangParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(LangParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#inline}.
	 * @param ctx the parse tree
	 */
	void enterInline(LangParser.InlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#inline}.
	 * @param ctx the parse tree
	 */
	void exitInline(LangParser.InlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(LangParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(LangParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#evaluateable}.
	 * @param ctx the parse tree
	 */
	void enterEvaluateable(LangParser.EvaluateableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#evaluateable}.
	 * @param ctx the parse tree
	 */
	void exitEvaluateable(LangParser.EvaluateableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(LangParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(LangParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(LangParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(LangParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LangParser.AssignContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(LangParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(LangParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#p0arithmatic}.
	 * @param ctx the parse tree
	 */
	void enterP0arithmatic(LangParser.P0arithmaticContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#p0arithmatic}.
	 * @param ctx the parse tree
	 */
	void exitP0arithmatic(LangParser.P0arithmaticContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#p1arithmatic}.
	 * @param ctx the parse tree
	 */
	void enterP1arithmatic(LangParser.P1arithmaticContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#p1arithmatic}.
	 * @param ctx the parse tree
	 */
	void exitP1arithmatic(LangParser.P1arithmaticContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#p2arithmatic}.
	 * @param ctx the parse tree
	 */
	void enterP2arithmatic(LangParser.P2arithmaticContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#p2arithmatic}.
	 * @param ctx the parse tree
	 */
	void exitP2arithmatic(LangParser.P2arithmaticContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#p3arithmatic}.
	 * @param ctx the parse tree
	 */
	void enterP3arithmatic(LangParser.P3arithmaticContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#p3arithmatic}.
	 * @param ctx the parse tree
	 */
	void exitP3arithmatic(LangParser.P3arithmaticContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#comparisonoperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonoperator(LangParser.ComparisonoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#comparisonoperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonoperator(LangParser.ComparisonoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#booleanoperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanoperator(LangParser.BooleanoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#booleanoperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanoperator(LangParser.BooleanoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(LangParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(LangParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(LangParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(LangParser.OrContext ctx);
}