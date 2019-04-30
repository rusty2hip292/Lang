import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Token {
	
	public static ArrayList<Token> types = new ArrayList<Token>();
	public static void init() {
		Strip.init(types);
		Keyword.init(types);
		Literal.init(types);
		types.add(new Name());
	}
	
	public final String regex;
	private final Pattern p;
	protected String from;
	protected Token() {
		regex = null;
		p = null;
	}
	public Token(String regex, String mustBeNext) {
		this.regex = String.format("^(%s)(%s[\\s\\S]*?)$", regex, mustBeNext);
		System.out.println(String.format("%s = %s", this.getClass(), this.regex));
		p = Pattern.compile(this.regex);
	}
	public Token(String regex) {
		this(regex, "");
	}
	
	public String attemptMatch(String code, List<Token> tokens) {
		Matcher m = p.matcher(code);
		if(m.find()) {
			try {
				Token newToken = this.getClass().getConstructor(String.class).newInstance(m.group(1));
				newToken.from = m.group(1);
				tokens.add(newToken);
			}catch(Exception e) {
				if(e instanceof java.lang.NoSuchMethodException) {
					Compiler.panic(String.format("%s has no constructor with single String argument", this.getClass()));
				}
				Compiler.panic(e.getMessage());
			}
			return m.group(m.groupCount());
		}
		return code;
	}
	
	public static String match(String code, List<Token> tokens) {
		for(Token t : types) {
			String rest = t.attemptMatch(code, tokens);
			if(!code.equals(rest)) {
				return rest;
			}
		}
		Compiler.panic(String.format("%s", code.split(" ")[0]));
		return null;
	}
	
	public String toString() {
		return String.format("%s: %s|", this.getClass(), this.from);
	}
}

class Name extends Token {
	public Name() {
		super("[a-zA-Z_]\\w*");
	}
	public Name(String name) { }
}