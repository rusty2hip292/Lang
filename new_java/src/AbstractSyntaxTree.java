
public class AbstractSyntaxTree {

	public AbstractSyntaxTree(Tokenizer t) {
		for(Token tok : t.tokenize()) {
			if(!(tok instanceof Whitespace)) {
				System.out.println(tok);
			}
		}
	}
}
