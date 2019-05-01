import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Parser {
	
	public void dump() {
		System.out.println(header.toString());
		for(Type st : types.values()) {
			st.dump();
		}
		for(FuncDef f : funcs.values()) {
			f.dump();
		}
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
	
	private HashMap<String, Type> types = new HashMap<String, Type>();
	public void addType(String name, Type type) {
		if(types.containsKey(name)) {
			throw new IllegalArgumentException("Type " + name + " already defined");
		}
		types.put(name, type);
	}
	public Type getType(String name) {
		return types.get(name);
	}
	private HashMap<String, FuncDef> funcs = new HashMap<String, FuncDef>();
	public void addFunc(String name, FuncDef func) {
		if(types.containsKey(name)) {
			throw new IllegalArgumentException("Function " + name + " already defined");
		}
		funcs.put(name, func);
	}
}
