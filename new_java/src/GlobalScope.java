import java.util.LinkedList;
import java.util.List;

public class GlobalScope extends Scope {

	public GlobalScope() {
		super(false);
	}
	
	public List<Token> inside() {
		return new LinkedList<Token>();
	}
}
