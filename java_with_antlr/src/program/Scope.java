package program;

import java.util.HashMap;

public class Scope {

	private static Scope global = new Scope();
	private static Scope currentScope = global;
	private Scope outer;
	private static HashMap<String, HashMap<String, Scope>> scopes = new HashMap<String, HashMap<String, Scope>>();
	
	public static void print() {
		System.out.println(scopes);
	}
	
	private Scope() { }
	public Scope(String scopename) {
		String filename = compiler.Compiler.currentFile();
		if(scopes.get(filename) == null) {
			scopes.put(filename, new HashMap<String, Scope>());
		}
		HashMap<String, Scope> s = scopes.get(filename);
		if(s.get(scopename) != null) {
			throw new IllegalArgumentException();
		}
		s.put(scopename, this);
		this.outer = currentScope;
		currentScope = this;
	}
	public static void closeScope() {
		if(currentScope != global) {
			currentScope = currentScope.outer;
		}
	}
}
