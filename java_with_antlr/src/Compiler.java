import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Compiler {

	private static ParseTree initAntlr(String program) {
		LangLexer lexer = new LangLexer(CharStreams.fromString(program));
		LangParser lp = new LangParser(new CommonTokenStream(lexer));
		return null;
	}
	
	public static void main(String[] args) {
		for(String program : Reader.read(args)) {
			initAntlr(program);
		}
	}
}
