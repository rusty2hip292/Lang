package program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Type extends Scoped {
	
	private static Set<Type> allTypes = new HashSet<Type>();

	public Type(String name, boolean local) {
		this(name, "__type__", local); // I need to define this type
	}
	private final String supertype;
	public Type(String name, String supertype, boolean local) {
		super(name, local && name.indexOf("__") != 0);
		allTypes.add(this);
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
	 * allow local fields, methods
	 */
	private HashMap<String, Variable> fields = new HashMap<String, Variable>();
	public void addField(String name, Variable v) {
		if(v != null) {
			if(fields.get(name) != null) {
				System.err.println("Variable " + name + " already exists in type " + this.name + ", fatal error");
				System.exit(-1);
			}
			fields.put(name, v);
		}
	}
	public Variable getField(String name) {
		return this.fields.get(name);
	}
	private HashMap<String, Function> methods = new HashMap<String, Function>();
	public void addMethod(String name, Function f) {
		if(f != null) {
			if(methods.get(name) != null) {
				System.out.println(name);
				System.out.println(methods);
				System.err.println("Method " + name + " already exists in type " + this.name + ", fatal error");
				System.exit(-1);
			}
			methods.put(name, f);
		}
	}
	public Function getMethod(String name) {
		return this.methods.get(name);
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("%s %s extends %s\n", this.local ? "local" : "public", this.name, this.supertype));
		for(Variable field : this.fields.values()) {
			sb.append(String.format("\t%s\n", field));
		}
		for(Function method : this.methods.values()) {
			sb.append(String.format("\t%s\n", method.signature()));
		}
		return sb.toString();
	}
	
	public static void dump() {
		for(Type t : allTypes) {
			System.out.println(t);
		}
	}
}
