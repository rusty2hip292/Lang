import java.util.ArrayList;
import java.util.regex.Matcher;
import java.lang.Iterable;

public abstract class Token {

	public abstract int matches(String token);	// negative for no match, positive for match
	public abstract Token make(String token);	// make a new token of this type
	
	private static final ArrayList<Token> tokens = new ArrayList<Token>();
	
	public static Iterable<Token> tokens() {
		return tokens;
	}
	
	static {
		System.out.println("this is a static line");
		
		// create a single instance of our tokens here
	}
}

// add tokens here

class ConstString extends Token {
	private static final String regex = "\\s*\"([\\s\\S]*?)\"\\s*";
	
	private final String str;
	
	public ConstString(String str) {
		this.str = str;
	}
	
	public int matches(String token) {
		if(MyMatcher.match(regex, token).find()) {
			return 0;
		}
		return -1;
	}
	
	public Token make(String token) {
		Matcher m = MyMatcher.match(regex, token);
		if(m.find()) {
			return new ConstString(m.group(1));
		}
		throw new IllegalArgumentException();
	}
}