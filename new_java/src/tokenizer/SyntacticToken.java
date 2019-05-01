package tokenizer;
import java.util.List;

public abstract class SyntacticToken extends Token {

	public static void init(List<Token> types) {
		Token[] tokens = {
				new OpenParen(),
				new CloseParen(),
				new Elipsis(),
				new Comma(),
				new Colon(),
				new SemiColon(),
		};
		for(Token t : tokens) {
			types.add(t);
		}
	}
	
	public SyntacticToken(String regex, String notIncluding) {
		super(regex, notIncluding);
	}
	public SyntacticToken(String regex) {
		super(regex);
	}
	public SyntacticToken() { }
}

class OpenParen extends SyntacticToken {
	public OpenParen() {
		super("\\(");
	}
	public OpenParen(String paren) { }
}
class CloseParen extends SyntacticToken {
	public CloseParen() {
		super("\\)");
	}
	public CloseParen(String paren) { }
}

class Elipsis extends SyntacticToken {
	public Elipsis() {
		super("\\.{3}", "[^.]");
	}
	public Elipsis(String elipsis) { }
}

class Comma extends SyntacticToken {
	public Comma() {
		super(",");
	}
	public Comma(String comma) { }
}

class Colon extends SyntacticToken {
	public Colon() {
		super(":");
	}
	public Colon(String comma) { }
}

class SemiColon extends SyntacticToken {
	public SemiColon() {
		super(";");
	}
	public SemiColon(String comma) { }
}