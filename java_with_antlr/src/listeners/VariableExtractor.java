package listeners;

import antlr.LangParser.*;
import program.Scope;

public class VariableExtractor extends ScopedListener {

	public void exitDeclare(DeclareContext context) {
		try {
			String type = context.type() == null || context.type().identifier() == null ? null : Identifier.identifier(context.type().identifier());
			String primative = context.type() == null || context.type().PRIMATIVE() == null ? null : context.type().PRIMATIVE().toString();
			Scope.addToScope(this.currentScopeName(), program.Variable.declare(this.currentScopeName(), context.varconst().CONST() != null, type, primative, Identifier.identifier(context.assign().lvalue().identifier()), context.LOCAL() != null, context.STATIC() != null));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void exitFuncdef(FuncdefContext context) {
		ParamlistContext pc = context.paramlist();
		if(pc.identifier() != null) {
			for(IdentifierContext ic : pc.identifier()) {
				Scope.addToScope(this.currentScopeName(), program.Variable.declare(this.currentScopeName(), false, null, null, Identifier.identifier(ic), false, false));
			}
		}
	}
}
