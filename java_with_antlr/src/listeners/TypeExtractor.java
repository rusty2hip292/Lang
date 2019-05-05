package listeners;

import java.lang.reflect.Method;

import antlr.LangParser.*;
import program.Scope;

public class TypeExtractor extends ScopedListener {

	public void exitTypedef(TypedefContext context) {
		try {
			if(context.EXTENDS() == null) {
				Scope.addToScope(this.currentScopeName(), new program.Type(context.IDENTIFIER(0).toString(), context.LOCAL() != null));
			}else {
				Scope.addToScope(this.currentScopeName(), new program.Type(context.IDENTIFIER(0).toString(), context.IDENTIFIER(1).toString(), context.LOCAL() != null));
			}
		}catch(Exception e) {
			System.err.println("type " + context.IDENTIFIER(0) + " already defined, fatal error");
			System.exit(-1);
		}
	}
}
