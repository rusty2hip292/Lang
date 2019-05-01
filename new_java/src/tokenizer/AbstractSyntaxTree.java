package tokenizer;

import tokenizer.*;

public class AbstractSyntaxTree {

	public AbstractSyntaxTree(Tokenizer t) {
		for(Token tok : t) {
			if(!(tok instanceof Whitespace)) {
				System.out.println(tok);
			}
		}
	}
}
