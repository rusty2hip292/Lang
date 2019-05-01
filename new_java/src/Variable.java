import java.util.List;

public class Variable extends NotRunnable implements Expression {
	
	private static Parser parser = Parser.parser();

	public static boolean makeVariables(List<Token> tokens) {
		for(int i = 0, j = 1; j < tokens.size(); i++, j++) {
			Token t1 = tokens.get(i);
			if(!(t1 instanceof Name)) {
				continue;
			}
			Type t = parser.getType(t1.from);
			if(t == null) {
				continue;
			}
			Token t2 = null;
			while(true) {
				t2 = tokens.get(j);
				if(t2 instanceof Whitespace) {
					tokens.remove(j);
				}else {
					break;
				}
				if(j >= tokens.size()) {
					return false;
				}
			}
			System.out.println(String.format("%s %s\n", t1, t2));
			if(t2 instanceof Name) {
				tokens.remove(j);
				tokens.set(i, new Variable(t, t2.from));
				return true;
			}
		}
		return false;
	}
	
	private final Type type; private final String name;
	public Variable(Type type, String name) {
		System.out.println(String.format("found variable %s", name));
		this.type = type;
		this.name = name;
		parser.addVar(this.name, this);
	}
}
