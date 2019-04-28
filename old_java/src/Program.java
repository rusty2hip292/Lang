import java.util.ArrayList;

public class Program {

	private ArrayList<Scope> scopes = new ArrayList<Scope>(); // not a stack because may need to traverse to find vars, methods
	private ArrayList<AbstractSyntaxTree> programElements = new ArrayList<AbstractSyntaxTree>();
}
