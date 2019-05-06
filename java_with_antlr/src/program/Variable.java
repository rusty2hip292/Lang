package program;

public abstract class Variable extends Scoped {

	final boolean constant;
	boolean _static;
	boolean assignedAlready = false;
	
	private Type thisType;

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
			typ.addField(n, declare(scopename, constant, type, primative, n, local, _static));
			return null;
		}
		if(primative != null) {
			return new Primative(primative, name, constant, local, _static);
		}else {
			return new TypeObject(type, name, constant, local, _static);
		}
	}
	
	protected Variable(String type, String name, boolean constant, boolean local, boolean _static) {
		super(name, local);
		this.constant = constant;
		this.thisType = Scope.getType(Scope.currentScope, type);
		this._static = _static;
	}
	
	public String toString() {
		return String.format("%s%s%s%s %s", this.local ? "local " : "", this._static ? "static " : "", this.constant ? "const " : "", this.thisType == null ? "?" : this.thisType.name, this.name);
	}
}

class Primative extends Variable {
	
	public Primative(String type, String name, boolean constant, boolean local, boolean _static) {
		super(type, name, constant, local, _static);
	}
}

class TypeObject extends Variable {
	
	public TypeObject(String type, String name, boolean constant, boolean local, boolean _static) {
		super(type, name, constant, local, _static);
	}
}
