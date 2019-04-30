import java.util.List;

abstract class Keyword extends Token {
	
	public static void init(List<Token> types) {
		Token[] tokens = {
				new Type(),
		};
		for(Token t : tokens) {
			types.add(t);
		}
	}
	
	public Keyword(String regex) {
		super(regex, "\\s");	// require whitespace after the token
	}
	public Keyword() { }
}

class Type extends Keyword {
	public Type() {
		super("type");
	}
	public Type(String type) { }
}