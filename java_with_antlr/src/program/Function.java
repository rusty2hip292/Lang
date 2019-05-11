package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import antlr.LangParser.FunctioncallContext;

public class Function extends Scoped {
	
	private List<Variable> params = new ArrayList<Variable>(10);
	
	public void addParameter(Variable v) {
		params.add(v);
	}
	
	public static Function getFunction(String name, String scopename) {
		int index = name.indexOf(".");
		if(index < 0) {
			return Scope.getFunction(scopename, name);
		}
		int part = 0;
		String[] parts = name.split("\\.");
		Variable v = Scope.getVariable(scopename, parts[part++]);
		while(v != null && v.type() != null) {
			if(part == parts.length - 1) {
				break;
			}
			v = v.type().getField(parts[part++]);
		}
		if(v != null && v.type() != null) {
			Function f = v.type().getMethod(parts[part]);
			if(f != null) {
				return f;
			}
		}
		part = 0;
		Type t = Scope.getType(scopename, parts[0]);
		while(t != null && part < parts.length - 1) {
			v = t.getField(parts[part++]);
			if(v == null) {
				break;
			}
			t = v.type();
		}
		if(t != null) {
			return t.getMethod(parts[part]);
		}
		return null;
	}
	
	public static String fix(FunctioncallContext context, String scopename) {
		String name = context.identifier().getText();
		int index = name.indexOf(".");
		if(index < 0) {
			Function f = Scope.getFunction(scopename, context.identifier().getText());
			//System.out.println(scopename);
			//System.out.println(f);
			String call = "";
			call += f.newName() + "(";
			boolean first = true;
			for(Variable v : f.params) {
				if(first) {
					first = false;
				}else {
					call += ", ";
				}
				call += v.newName();
			}
			call += ")";
			return call;
		}
		int part = 0;
		String[] parts = name.split("\\.");
		Variable v = Scope.getVariable(scopename, parts[part++]);
		while(v != null && v.type() != null) {
			if(part == parts.length - 1) {
				break;
			}
			v = v.type().getField(parts[part++]);
		}
		if(v != null && v.type() != null) {
			Function f = v.type().getMethod(parts[part]);
			return "// TODO handle methods";
		}
		System.err.println("Could not invoke method " + parts[part] + ", fatal error");
		System.exit(-1);
		return null;
	}
	
	public static Function makeFunction(String scopename, String name, boolean local) {
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
