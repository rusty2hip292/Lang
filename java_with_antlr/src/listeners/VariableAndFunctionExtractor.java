package listeners;

import antlr.LangParser.*;
import program.Scope;

public class VariableAndFunctionExtractor extends ScopedListener {

	public void exitDeclare(DeclareContext context) {
		try {
			String type = context.type() == null || context.type().identifier() == null ? null : Identifier.identifier(context.type().identifier());
			String primative = context.type() == null || context.type().PRIMATIVE() == null ? null : context.type().PRIMATIVE().toString();
			Scope.addToScope(this.currentScopeName(), program.Variable.declare(this.currentScopeName(), context.varconst().CONST() != null, type, primative, Identifier.identifier(context.assign().lvalue().identifier()), context.LOCAL() != null, context.STATIC() != null));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private FuncdefContext lastContext = null;
	public void exitFuncdef(FuncdefContext context) {
		if(lastContext != context) {
			lastContext = context;
			program.Function f = program.Function.makeFunction(this.currentScopeName(), Identifier.identifier(context.identifier()), context.LOCAL() != null);
			if(f == null) {
				return;
			}
			Scope.addToScope(this.currentScopeName(), f);
			ParamlistContext pc = context.paramlist();
			if(pc.identifier() != null) {
				for(IdentifierContext ic : pc.identifier()) {
					program.Variable v = program.Variable.declare(this.currentScopeName(), false, null, null, Identifier.identifier(ic), false, false);
					f.addParameter(v);
					Scope.addToScope(this.currentScopeName(), v);
				}
			}
		}
	}
}
