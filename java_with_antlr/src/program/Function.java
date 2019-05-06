package program;

import java.util.ArrayList;
import java.util.List;

public class Function extends Scoped {
	
	private List<Variable> params = new ArrayList<Variable>(10);
	
	public void addParameter(Variable v) {
		params.add(v);
	}

	public static Function makeFunction(String scopename, String name, boolean local) {
		System.out.println("making " + name);
		int index = name.indexOf(".");
		if(index >= 0) {
			Function f = makeFunction(scopename, name.substring(index + 1), local);
			Scope.getType(Scope.currentScope, name.substring(0, index)).addMethod(name.substring(index + 1), f);
			return f;
		}
		return new Function(name, local);
	}
	
	private Function(String name, boolean local) {
		super(name, local);
	}
	
	private Type t;
	public String signature() {
		String s = String.format("%s %s | ", t == null ? "?" : t.name, this.name);
		for(Variable v : this.params) {
			s += v.toString() + " ";
		}
		return s;
	}
}
