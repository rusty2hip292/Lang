
class Name extends Token {
	public Name() {
		super("[a-zA-Z_]\\w*");
	}
	public Name(String name) { }
}