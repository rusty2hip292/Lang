package depreciated;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;

public class TypeExtractor {
	
	/* DEPRECIATED
	 * find all struct, class, and type lines, capturing which kind of type it is, the name of the type, and an optional hide modifier (hide makes the type local)
	 * 
	 * it would probably make sense for type to become typedef because rn it's kinda confusing
	 
	public static void extractTypes(Code code) {
		Matcher m = MyMatcher.match("(hide\\s+)?(type|class|struct)\\s+(([a-zA-Z_]\\w*?))\\W", code.nostringcode);
		while(m.find()) {
			AbstractType.makeType(m, code.nostringcode);
		}
		AbstractType.resetLocal(code); // finished finding types for this file, forget local types
	}*/
}
