package listeners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.regex.*;

import antlr.*;
import antlr.CplusplusplusParser.*;

public class EverythingListener extends CplusplusplusBaseListener {

	private Stack<Boolean> shouldOutputStack = new Stack<Boolean>();
	
	private boolean inClassdef = false;
	
	private HashMap<String, String> init = new HashMap<String, String>();
	StringBuffer insideClassdef = new StringBuffer();
	
	private static Pattern p = Pattern.compile("[\\s]*([a-zA-Z_][a-zA-Z_0-9]*)[\\s]*(.+?)[\\s]*=[\\s]*((.|\\s)+?)[\\s]*;");
	private void handle(String className) {
		StringBuffer prev = this.insideClassdef;
		this.insideClassdef = new StringBuffer();
		Matcher m = p.matcher(prev.toString());
		StringBuffer initials = new StringBuffer();
		initials.append(String.format("(temp%s = (%s) malloc(sizeof(struct %s)), ", className, className, className));
		while(m.find()) {
			String type = m.group(1);
			String name = m.group(2);
			String adjustedName = name.replaceAll("(\\(\\*)|(\\)\\([^*].*$)", "").replaceAll(".+? |\\*", "");
			//System.err.println(adjustedName);
			String value = m.group(3);
			System.out.println(String.format("%s %s;", type, name, value));
			initials.append(String.format("temp%s->%s = %s, ", className, adjustedName, value));
		}
		initials.append(String.format("temp%s);", className));
		init.put(className, initials.toString());
	}
	
	public EverythingListener() {
		shouldOutputStack.push(true);
	}
	
	private boolean shouldOutput = true;
	
	public void enterProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		
	}
	
	public void visitTerminal(TerminalNode ctx) {
		if(shouldOutput) {
			if(inClassdef) {
				this.insideClassdef.append(ctx.getText());
			}else {
				System.out.print(ctx.getText());
			}
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
	public void exitClassdef(ClassdefContext ctx) {
		// TODO Auto-generated method stub
		String s = ctx.IDENTIFIER().toString();
		handle(s);
		System.out.print("};");
		if(this.inClassdef) {
			System.out.print(String.format("\ntypedef struct %s* %s;\n%s temp%s;", s, s, s, s));
		}
		this.inClassdef = false;
	}

	@Override
	public void enterClassdef(ClassdefContext ctx) {
		// TODO Auto-generated method stub
		this.inClassdef = true;
	}

	@Override
	public void enterBracketed(BracketedContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitBracketed(BracketedContext ctx) {
		// TODO Auto-generated method stub
		
	}
	
	public void enterEof(EofContext ctx) {
		this.shouldOutputStack.add(false);
		this.shouldOutput = false;
	}
	public void exitEof(EofContext ctx) {
		this.shouldOutputStack.pop();
		this.shouldOutput = this.shouldOutputStack.peek();
	}
	
	public void exitNew_(New_Context ctx) {
		System.out.print(init.get(ctx.IDENTIFIER().toString()));
	}

}
