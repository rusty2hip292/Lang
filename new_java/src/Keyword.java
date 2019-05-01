
import java.util.List;

abstract class Keyword extends Token {
	
	public static void init(List<Token> types) {
		Token[] tokens = {
				new TypeToken(),
				new InlineC(),
				new Header(),
				new End(),
				new Function(),
				new PrimativeToken(),
				new Bind(),
		};
		for(Token t : tokens) {
			types.add(t);
		}
	}
	
	public Keyword(String regex) {
		super(regex, "\\s");	// require whitespace after the token
	}
	public Keyword() { }
}