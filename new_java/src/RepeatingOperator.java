
abstract class RepeatingOperator extends Operator {
	
	public RepeatingOperator(String op, int count) {
		super(op + "{" + count + "}", String.format("[^%s]", op));
	}
	public RepeatingOperator() { }
}