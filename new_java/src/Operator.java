
import java.util.List;

public abstract class Operator extends Token {

	public static void init(List<Token> types) {
		Token[] tokens = {
				new Plus(),
				new Sub(),
				new Mult(),
				new Div(),
				new Mod(),
				new Exponent(),
				new Dot(),
				new Equals(),
		};
		for(Token t : tokens) {
			types.add(t);
		}
	}
	
	public Operator(String regex) {
		super(regex);
	}
	public Operator(String regex, String endBefore) {
		super(regex, endBefore);
	}
	public Operator() { }
}

