package program;

public class Variable extends Scoped {

	final boolean constant;
	boolean assignedAlready = false;

	public static Variable declare(String scopename, boolean constant, String type, String primative, String name, boolean local, boolean _static) {
		int index = name.indexOf(".");
		if(index >= 0) {
			String t = name.substring(0, index);
			String n = name.substring(index + 1);
			Type typ = Scope.getType(scopename, t);
			if(typ == null) {
				System.err.println("Cannot declare variable " + n + " in type " + t + ". Type does not exist or is not in scope, fatal error");
				System.exit(-1);
			}
			typ.addVar(n, declare(scopename, constant, type, primative, n, local, _static));
			return null;
		}
		if(primative != null) {
			return new Primative(primative, name, constant, local);
		}else {
			return new TypeObject(type, name, constant, local);
		}
	}
	
	protected Variable(String type, String name, boolean constant, boolean local) {
		super(name, local);
		this.constant = constant;
	}
}

class Primative extends Variable {
	
	public Primative(String type, String name, boolean constant, boolean local) {
		super(type, name, constant, local);
	}
}

class TypeObject extends Variable {
	
	public TypeObject(String type, String name, boolean constant, boolean local) {
		super(type, name, constant, local);
	}
}
