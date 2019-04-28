import java.util.ArrayList;

/*
 * this has not even really been started, I was thinking it would behave like a stream that outputs tokens while tracking where we are in the code
 */
public class Tokenizer {

	private ArrayList<String> lines;
	private int line = 0;
	private int col = 0;
	
	public Tokenizer(ArrayList<String> lines) {
		this.lines = lines;
	}
	
	public boolean hasNext() {
		return line < lines.size() || col < lines.get(lines.size() - 1).length();
	}
	public String next() {
		String tok = "";
		for(; line < lines.size(); line++) {
			char[] charr = lines.get(line).toCharArray();
			for(int i = col; i < charr.length; i++) {
				tok += charr[i];
				for(Token t : Token.tokens()) {
					int m = t.matches(tok);
					if(m >= 0) {	// matches
						col -= m;
						return tok;
					}
				}
			}
		}
		throw new IllegalArgumentException("Could not parse a token from " + tok);
	}
	
	public String restOfLine() {
		return lines.get(line++).substring(col);
	}
}
