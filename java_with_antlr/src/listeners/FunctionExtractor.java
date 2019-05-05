package listeners;

import antlr.LangParser.*;
import program.Scope;

public class FunctionExtractor extends ScopedListener {

	public void exitFuncdef(FuncdefContext context) {
		Scope.addToScope(this.currentScopeName(), new program.Function(Identifier.identifier(context.identifier()), context.LOCAL() != null));
	}
}
