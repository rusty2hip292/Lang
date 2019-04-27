import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.regex.Matcher;

/*
 * compiles regexes the first time they are used, automatically creates a Matcher
 */
public class MyMatcher {

	private static HashMap<String, Pattern> patterns = new HashMap<String, Pattern>();
	
	public static Matcher match(String regex, String str) {
		Pattern p = patterns.get(regex);
		if(p == null) {
			p = Pattern.compile(regex);
			patterns.put(regex, p);
		}
		return p.matcher(str);
	}
}
