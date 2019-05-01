import java.util.LinkedList;
import java.util.List;

public class FuncDef extends Scope {

	private static Parser parser = Parser.parser();
	
	private List<Token> inside = new LinkedList<Token>();
	public Token addToken(Token t) {
		inside.add(t);
		return t;
	}
	private final String name;
	public FuncDef(Token n) {
		if(n instanceof Name) {
			parser.addFunc(n.from, this);
			this.name = n.from;
		}else {
			System.out.println(n.getClass());
			throw new IllegalArgumentException("Type token not followed by a Name symbol");
		}
	}
	
	public void dump() {
		System.out.println(String.format("function %s: %s", name, inside));
	}
}
