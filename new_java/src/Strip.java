import java.util.List;

public abstract class Strip extends Token {
	
	public static void init(List<Token> types) {
		Token[] tokens = {
				new Comment(),
				new Whitespace(),
		};
		for(Token t : tokens) {
			types.add(t);
		}
	}

	public Strip(String regex) {
		super(regex);
	}
	public Strip() { }
}

class Comment extends Strip {
	public Comment() {
		super("(/\\*[\\s\\S]*\\*/|//.*)");
	}
	public Comment(String comment) { }
}

class Whitespace extends Strip {
	public Whitespace() {
		super("\\s*");
	}
	public Whitespace(String white) { }
}