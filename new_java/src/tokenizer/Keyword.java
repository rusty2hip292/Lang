package tokenizer;
import java.util.List;

abstract class Keyword extends Token {
	
	public static void init(List<Token> types) {
		Token[] tokens = {
				new Type(),
				new InlineC(),
				new Header(),
				new End(),
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

class InlineC extends Keyword {
	public InlineC() {
		super("inline(-C)?");
	}
	public InlineC(String inline) { }
}

class End extends Keyword {
	public End() {
		super("end");
	}
	public End(String end) { }
}

class Header extends Keyword {
	public Header() {
		super("header");
	}
	public Header(String header) { }
}