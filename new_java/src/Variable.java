import java.util.List;

public class Variable extends NotRunnable {
	
	private static Parser parser = Parser.parser();

	public Variable makeVariable(List<Token> tokens) {
		if(tokens.size() <= 1) {
			return null;
		}
		Token temp = tokens.remove(0);
		while(temp != null && temp instanceof Whitespace) {
			temp = tokens.remove(0);
		}
		if(temp == null || !(temp instanceof Name)) {
			throw new IllegalArgumentException();
		}
		Type t = parser.getType(temp.from);
		if(t == null) {
			throw new IllegalArgumentException();
		}
		temp = tokens.remove(0);
		while(temp != null && temp instanceof Whitespace) {
			temp = tokens.remove(0);
		}
		if(temp == null || !(temp instanceof Name)) {
			throw new IllegalArgumentException();
		}
		return new Variable(type, temp.from);
	}
	
	private Type type; private final String name;
	public Variable(Type type, String name) {
		this.type = type;
		this.name = name;
	}
}
