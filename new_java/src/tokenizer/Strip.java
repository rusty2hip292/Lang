package tokenizer;
import java.util.List;

public abstract class Strip extends Token {
	
	public static void init(List<Token> types) {
		Token[] tokens = {
				new Comment(),
				new Newline(),
				new NotNewline(),
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

abstract class Whitespace extends Strip {
	public Whitespace(String white) {
		super(white);
	}
	public Whitespace() { }
}
class Newline extends Whitespace {
	public Newline() {
		super("\r?\n");
	}
	public Newline(String newline) { }
}
class NotNewline extends Whitespace {
	public NotNewline() {
		super("[^\\S\r\n]+");
	}
	public NotNewline(String white) { }
}