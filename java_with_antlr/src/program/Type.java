package program;

import java.util.HashMap;

public class Type extends Scoped {

	public Type(String name, boolean local) {
		this(name, "__type__", local); // I need to define this type
	}
	private final String supertype;
	public Type(String name, String supertype, boolean local) {
		super(name, local && name.indexOf("__") != 0);
		if(local && name.indexOf("__") == 0) {
			System.err.println("type " + name + " cannot be declared local (type names beginning with '__' are reserved for global types), non-fatal error");
		}
		if(name.equals(supertype)) {
			this.supertype = null;
		}else {
			this.supertype = supertype;
		}
	}
	
	/*
	 * TODO
	 * allow for local fields, methods
	 */
	private HashMap<String, Variable> vars = new HashMap<String, Variable>();
	public void addVar(String name, Variable v) {
		if(v != null) {
			if(vars.get(name) != null) {
				System.err.println("Variable " + name + " already exists in type " + this.name + ", fatal error");
				System.exit(-1);
			}
			vars.put(name, v);
		}
	}
}
