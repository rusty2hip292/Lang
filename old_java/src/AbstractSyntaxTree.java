
public class AbstractSyntaxTree {
	private ASTNode root;
	
	public AbstractSyntaxTree(Tokenizer t) {
		
	}
}

abstract class ASTNode {
	public abstract void addNode(ASTNode n);
}