
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
