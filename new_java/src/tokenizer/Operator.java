package tokenizer;
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

abstract class RepeatingOperator extends Operator {
	
	public RepeatingOperator(String op, int count) {
		super(op + "{" + count + "}", String.format("[^%s]", op));
	}
	public RepeatingOperator() { }
}

abstract class SingleOperator extends RepeatingOperator {
	public SingleOperator(String op) {
		super(op, 1);
	}
	public SingleOperator() { }
}

class Plus extends SingleOperator {
	public Plus() {
		super("\\+");
	}
	public Plus(String token) { }
}

class Sub extends SingleOperator {
	public Sub() {
		super("-");
	}
	public Sub(String token) { }
}

class Mult extends SingleOperator {
	public Mult() {
		super("\\*");
	}
	public Mult(String token) { }
}

class Div extends SingleOperator {
	public Div() {
		super("/");
	}
	public Div(String token) { }
}

class Mod extends SingleOperator {
	public Mod() {
		super("%");
	}
	public Mod(String token) { }
}

class Exponent extends SingleOperator {
	public Exponent() {
		super("\\^");
	}
	public Exponent(String token) { }
}

