package listeners;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.*;
import antlr.CplusplusplusParser.*;

public class EverythingListener extends CplusplusplusBaseListener {

	private Stack<Boolean> shouldOutputStack = new Stack<Boolean>();
	private Stack<Boolean> temporaryModification = new Stack<Boolean>();
	
	public EverythingListener() {
		shouldOutputStack.push(true);
	}
	
	private boolean shouldOutput = true;
	
	public void enterProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		
	}
	
	public void visitTerminal(TerminalNode ctx) {
		boolean reallyShouldOutput = shouldOutput;
		if(this.temporaryModification.size() > 0 && shouldOutput != this.temporaryModification.peek()) {
			reallyShouldOutput = this.temporaryModification.pop();
		}
		if(reallyShouldOutput) {
			System.out.print(ctx.getText());
			//long x = System.currentTimeMillis();
			//while(System.currentTimeMillis() - x < 200);
		}
	}

	@Override
	public void exitCode(CodeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNoout(NooutContext ctx) {
		// TODO Auto-generated method stub
		this.shouldOutput = false;
		this.shouldOutputStack.push(false);
	}

	@Override
	public void exitNoout(NooutContext ctx) {
		// TODO Auto-generated method stub
		this.shouldOutputStack.pop();
		this.shouldOutput = this.shouldOutputStack.peek();
	}

	@Override
	public void enterOut(OutContext ctx) {
		// TODO Auto-generated method stub
		this.shouldOutput = true;
		this.shouldOutputStack.push(true);
	}

	@Override
	public void exitOut(OutContext ctx) {
		// TODO Auto-generated method stub
		this.shouldOutputStack.pop();
		this.shouldOutput = this.shouldOutputStack.peek();
	}

	@Override
	public void enterOursyntax(OursyntaxContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitOursyntax(OursyntaxContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassdef(ClassdefContext ctx) {
		// TODO Auto-generated method stub
		System.out.print("struct");
		this.temporaryModification.push(true);
		this.temporaryModification.push(true);
		this.temporaryModification.push(true);
	}

	@Override
	public void exitClassdef(ClassdefContext ctx) {
		// TODO Auto-generated method stub
		System.out.print(String.format("\ntypedef struct %s* %s;", ctx.IDENTIFIER(), ctx.IDENTIFIER()));
	}

	@Override
	public void enterBracketed(BracketedContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitBracketed(BracketedContext ctx) {
		// TODO Auto-generated method stub
		
	}

}
