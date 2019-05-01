import java.util.ArrayList;
import java.util.List;

public class Tuple {

	List<Expression> expressions = new ArrayList<Expression>();
	public Tuple(List<Token> tokens, int index) {
		if(!(tokens.get(index) instanceof OpenParen)) {
			throw new IllegalArgumentException();
		}
		tokens.remove(index);
		Expression e = new Expression(tokens, index);
		if(e == null) {
			throw new IllegalArgumentException();
		}
		while(e != null) {
			expressions.add(e);
			e = new Expression(tokens, index);
		}
		Token temp = null;
		do {
			temp = tokens.remove(index);
		}while(temp instanceof Whitespace);
		if(!(temp instanceof CloseParen)) {
			throw new IllegalArgumentException();
		}
	}
}
