import java.util.ArrayList;
import java.util.HashMap;

/*
 * wrapper for a file's source code
 * contains each line (so we can offer good syntax error messages),
 * the code with comments stripped out, and the code with comments
 * and strings stripped out (this makes parsing easier, because we don't
 * need to worry about keywords inside of strings)
 */
public class Code {

	public final ArrayList<String> lines;
	public final String code;
	public final String nostringcode;
	public final Tokenizer tokenizer;
	
	public Code(ArrayList<String> lines) {
		this.lines = lines;
		this.code = stripComments(Compiler.toMassiveString(lines));
		this.nostringcode = stripStrings(this.code);
		this.tokenizer = new Tokenizer(lines);
	}
	
	// haven't tested these regex's much, but I think they work
	
	/*
	 * remove comments, as they will only interfere with parsing
	 */
	private static String stripComments(String str) {
		return str
				.replaceAll("/\\*[\\s\\S]*?\\*/", "")	// remove block comments
				.replaceAll("(//|#).*", "");			// remove single-line comments, begun using // or #
	}
	
	/*
	 * split around all non escaped quotes, take every other section (which were not enclosed in quotes)
	 * this does not support single-quote strings, which is fine with me
	 */
	private static String stripStrings(String str) {
		String[] parts = str.split("[^\\\\]\"");
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < parts.length; i += 2) {
			sb.append(parts[i]);
		}
		return sb.toString();
	}
}
