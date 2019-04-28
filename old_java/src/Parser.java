
public class Parser {

	public static void parse(Code c) {
		Tokenizer t = new Tokenizer(c.lines);
		while(t.hasNext()) {
			System.out.println(t.next());
		}
	}
}
