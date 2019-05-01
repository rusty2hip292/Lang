
public abstract class ValidCode extends Token {	// not really, just so I can insert this in

	private final String code;
	public ValidCode(String code) {
		this.code = code;
	}
	
	public String code() {
		return this.code;
	}
}
