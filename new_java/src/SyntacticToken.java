
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