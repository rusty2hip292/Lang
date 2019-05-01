
class StringLiteral extends Literal {
	
	public StringLiteral() {
		super("\"(([^\"])(\\\")?)*\"");
	}
	public StringLiteral(String string) { }
}