package listeners;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.LangListener;
import antlr.LangParser.*;
import program.Function;
import program.Program;

public class CodeListener extends ScopedListener {

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterProgram(ProgramContext ctx) {
		//System.out.println(compiler.Compiler.currentFile());
		//System.out.println(compiler.Compiler.mainProgram());
		if(compiler.Compiler.mainProgram().equals(compiler.Compiler.currentFile())) {
			Program.push(Program.Context.MAIN);
		}else {
			Program.push(Program.Context.NONE);
		}
	}

	@Override
	public void exitProgram(ProgramContext ctx) {
		Program.pop();
	}

	@Override
	public void enterValid(ValidContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitValid(ValidContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterParsable(ParsableContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitParsable(ParsableContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLiteral(LiteralContext ctx) {
		Program.write(ctx.getText());
	}

	@Override
	public void exitSignature(SignatureContext ctx) {
		Program.push(Program.Context.IMPLEMENTATION);
		Function f = Function.getFunction(ctx.identifier().getText(), this.currentScopeName());
		if(f == null) {
			System.err.println("Could not find function specified by " + ctx.identifier().getText() + ", fatal error");
			System.exit(-1);
		}
		Program.writeContext(Program.Context.DECL, f.signature() + ";");
		Program.write(f.signature() + " {\n");
	}

	@Override
	public void exitFuncdef(FuncdefContext ctx) {
		Program.write("\n}\n");
		Program.pop();
	}

	@Override
	public void enterInit(InitContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInit(InitContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInline(InlineContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInline(InlineContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLine(LineContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLine(LineContext ctx) {
		Program.write(";\n");
	}

	@Override
	public void enterTypedef(TypedefContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypedef(TypedefContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDeclare(DeclareContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDeclare(DeclareContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAssign(AssignContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAssign(AssignContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterParamlist(ParamlistContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitParamlist(ParamlistContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTuple(TupleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTuple(TupleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVarconst(VarconstContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVarconst(VarconstContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterType(TypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitType(TypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterIdentifier(IdentifierContext ctx) {
	}

	@Override
	public void exitIdentifier(IdentifierContext ctx) {
		
	}

	@Override
	public void exitFunctioncall(FunctioncallContext ctx) {
		Program.write(program.Function.fix(ctx, this.currentScopeName()));
	}

	@Override
	public void exitAnd(AndContext ctx) {
		Program.write("&&");
	}

	@Override
	public void exitOr(OrContext ctx) {
		Program.write("||");
	}
}
