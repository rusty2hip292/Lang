package program;

import java.util.HashMap;

public class Scope {

	private static Scope global = new Scope();
	private static Scope currentScope = global;
	private Scope outer;
	private static HashMap<String, HashMap<String, Scope>> scopes = new HashMap<String, HashMap<String, Scope>>();
	private HashMap<String, Scoped> items = new HashMap<String, Scoped>();
	
	public static void print() {
		System.out.println("global: " + global + "\nscoped: " + scopes);
	}
	
	public String toString() {
		return items.toString();
	}
	
	private Scope() { }
	private static Scope getScope(String scopename) {
		return getScope(scopename, true);
	}
	private static Scope getScope(String scopename, boolean make) {
		if(scopename.equals("global")) {
			return global;
		}
		String filename = compiler.Compiler.currentFile();
		HashMap<String, Scope> map = scopes.get(filename);
		if(map == null) {
			if(!make) {
				return null;
			}
			map = new HashMap<String, Scope>();
			scopes.put(filename, map);
			map.put("local", new Scope());
		}
		Scope s = map.get(scopename);
		if(s == null) {
			if(!make) {
				return null;
			}
			s = new Scope();
			map.put(scopename, s);
			
		}
		return s;
	}
	public static void closeScope(String scopename) {
		if(getScope(scopename, false) == null) {
			return;
		}
		if(currentScope != global) {
			currentScope = currentScope.outer;
		}
	}
	
	public static void addToScope(String scopename, Scoped item) {
		Scope s = getScope(item.local ? "local" : scopename);
		if(s.getItem(item.name) != null) {
			throw new IllegalArgumentException();
		}
		s.items.put(item.name, item);
	}
	
	public static Type getType(String scopename, String typename) {
		Scoped s = getItem(scopename, typename);
		if(s == null || !(s instanceof Type)) {
			return null;
		}
		return (Type) s;
	}
	private static Scoped getItem(String scopename, String item) {
		return getScope(scopename).getItem(item);
	}
	private Scoped getItem(String item) {
		if(this == global) {
			Scoped temp = getScope("local").items.get(item);
			if(temp != null) {
				return temp;
			}
		}
		if(this.items.get(item) != null) {
			return this.items.get(item);
		}
		if(this.outer == null) {
			return null;
		}
		return this.outer.getItem(item);
	}
}
