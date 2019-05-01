import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public abstract class Scope {

	private static Parser parser = Parser.parser();
	
	public abstract List<Token> inside();
	
	public Scope() {
		parser.addScope(this);
	}
	protected Scope(boolean b) { }
	
	public void addAll(Scope s) {
		this.types.putAll(s.types);
		this.funcs.putAll(s.funcs);
		this.variables.putAll(s.variables);
	}
	
	private HashMap<String, Type> types = new HashMap<String, Type>();
	public void addType(String name, Type type) {
		if(types.containsKey(name)) {
			throw new IllegalArgumentException("Type " + name + " already defined");
		}
		if(funcs.containsKey(name) || variables.containsKey(name)) {
			throw new IllegalArgumentException("Currently do not support variables or functions with the same name as a type");
		}
		types.put(name, type);
	}
	public Type getType(String name) {
		return types.get(name);
	}
	public Collection<Type> types() {
		return types.values();
	}
	private HashMap<String, FuncDef> funcs = new HashMap<String, FuncDef>();
	public void addFunc(String name, FuncDef func) {
		if(funcs.containsKey(name)) {
			throw new IllegalArgumentException("Function " + name + " already defined");
		}
		if(variables.containsKey(name)) {
			throw new IllegalArgumentException("Currently do not support variables and functions with the same name");
		}
		if(types.containsKey(name)) {
			throw new IllegalArgumentException("Cannot have a function with the same name as a type");
		}
		funcs.put(name, func);
	}
	public Collection<FuncDef> funcs() {
		return funcs.values();
	}
	private HashMap<String, Variable> variables = new HashMap<String, Variable>();
	public void addVar(String name, Variable var) {
		if(variables.containsKey(name)) {
			throw new IllegalArgumentException("Variable " + name + " already defined");
		}
		if(funcs.containsKey(name)) {
			throw new IllegalArgumentException("Currently do not support variables and functions with the same name");
		}
		if(types.containsKey(name)) {
			throw new IllegalArgumentException("Cannot have a variable with the same name as a type");
		}
		variables.put(name, var);
	}
	public Variable getVar(String name) {
		return variables.get(name);
	}
	public Collection<Variable> vars() {
		return variables.values();
	}
}
