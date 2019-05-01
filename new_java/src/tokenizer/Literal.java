package tokenizer;
import java.util.List;

public abstract class Literal extends Token {
	
	public static void init(List<Token> types) {
		Token[] tokens = {
				new StringLiteral(),
		};
		for(Token t : tokens) {
			types.add(t);
		}
	}
	
	public Literal(String regex) {
		super(regex);	// require whitespace after the token
	}
	public Literal() { }
}

class StringLiteral extends Literal {
	
	public StringLiteral() {
		super("\"(([^\"])(\\\")?)*\"");
	}
	public StringLiteral(String string) { }
}

abstract class NumericLiteral extends Literal {
	
	public NumericLiteral(String regex) {
		super(regex);
	}
	public NumericLiteral() { }
}

class IntLiteral extends NumericLiteral {
	
	public IntLiteral() {
		super("\\d+");
	}
	public IntLiteral(String intlit) { }
}

class RealLiteral extends NumericLiteral {
	
	public RealLiteral() {
		super("\\d+\\.\\d+");
	}
	public RealLiteral(String real) { }
}
