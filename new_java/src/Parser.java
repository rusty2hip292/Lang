import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Parser {
	
	public void dump() {
		System.out.println(header.toString());
		for(Type st : getScope().types()) {
			st.dump();
		}
		for(FuncDef f : getScope().funcs()) {
			f.dump();
		}
		System.out.println(getScope().vars());
	}
	
	private StringBuffer header = new StringBuffer();
	private Parser() { }
	public static Parser parser() {
		if(parser == null) {
			parser = new Parser();
		}
		return parser;
	}
	
	private final List<Tokenizer> toParse = new LinkedList<Tokenizer>();
	private static Parser parser = null;

	public void parse(Tokenizer t) {	// will save functions, but actual program is overwritten each parse
		toParse.add(t);
		System.out.println(t);
	}
	public void parse() {
		for(Tokenizer t : toParse) {
			extractTypesAndFunctions(t);
		}
		for(Tokenizer t : toParse) {
			List<Token> tokens = t.tokenList();
			handle(tokens);
		}
		handleScopes();
		// more here?
		
		Tokenizer main = toParse.get(toParse.size() - 1);
		System.out.println(main.tokenList());
	}
	
	private void handle(List<Token> tokens) {
		Compiler.debug("handling %s\n", tokens);
		while(Variable.makeVariables(tokens));
	}
	
	public String toString() {
		return this.header.toString();
	}
	
	private void extractTypesAndFunctions(Tokenizer t) {
		extractTypesAndFunctions(t.tokenList());
	}
	private void extractTypesAndFunctions(List<Token> tokens) {
		for(int i = 0; i < tokens.size() - 1; i++) {
			if(tokens.get(i) instanceof TypeToken) {
				tokens.remove(i);
				while(tokens.get(i) instanceof Whitespace) {
					tokens.remove(i);
				}
				new TypeDef(tokens.remove(i));
				i--;
			}else if(tokens.get(i) instanceof Function) {
				tokens.remove(i);
				while(tokens.get(i) instanceof Whitespace) {
					tokens.remove(i);
				}
				FuncDef fd = new FuncDef(tokens.remove(i));
				Token temp;
				do {
					temp = fd.addToken(tokens.remove(i));
				}while(!(temp instanceof End));
				i--;
			}else if(tokens.get(i) instanceof Header) {
				tokens.remove(i);
				while(!(tokens.get(i) instanceof End)) {
					header.append(tokens.remove(i).from);
				}
				tokens.remove(i);
				header.append("\n");
			}else if(tokens.get(i) instanceof PrimativeToken) {
				tokens.remove(i);
				Token temp;
				while(tokens.get(i) instanceof Whitespace) {
					tokens.remove(i);
				}
				new Primative(tokens.remove(i));
				i--;
			}
		}
	}
	
	public void addFunc(String name, FuncDef func) {
		getScope().addFunc(name, func);
	}
	public void addVar(String name, Variable var) {
		getScope().addVar(name, var);
	}
	public void addType(String name, Type type) {
		getScope().addType(name, type);
	}
	public Type getType(String name) {
		return getScope().getType(name);
	}
	public Variable getVar(String name) {
		return getScope().getVar(name);
	}
	
	private Scope current = null;
	private Stack<Scope> scopes = new Stack<Scope>();
	public Scope getScope() {
		return current;
	}
	public void addScope(Scope s) {
		if(this.current == null) {
			this.current = new GlobalScope();
		}
		s.addAll(this.getScope());
		this.scopes.push(s);
	}
	private void handleScopes() {
		while(scopes.size() > 0) {
			current = scopes.pop();
			handle(current.inside());
		}
	}
}
