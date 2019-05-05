package listeners;

import antlr.LangBaseListener;
import antlr.LangParser.*;
import program.Program;

public abstract class ContextListener extends LangBaseListener {

	public void enterInit(InitContext context) {
		Program.push(Program.Context.INIT);
	}
	public void exitInit(InitContext context) {
		Program.pop();
	}
	
	public void enterProgram(ProgramContext context) {
		if(compiler.Compiler.currentFile().equals(compiler.Compiler.mainProgram())) {
			Program.push(Program.Context.MAIN);
		}else {
			Program.push(Program.Context.NONE);
		}
	}
	public void exitProgram(ProgramContext context) {
		Program.pop();
	}
}
