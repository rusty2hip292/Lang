import java.util.HashMap;
import java.util.regex.Matcher;

/*
 * will track the types currently defined
 * this has knowledge of both global types and types only available to the current file (local types)
 * global types contain local types, but local types are removed from global types when a new file is being parsed
 */
public abstract class AbstractType {
	
	private static HashMap<String, AbstractType> types = new HashMap<String, AbstractType>();
	private static HashMap<String, AbstractType> localtypes = new HashMap<String, AbstractType>();

	// I use hidden to denote local types (available only in the current file)
	protected AbstractType(String name, boolean hidden) {
		types.put(name, this);
		if(hidden) {
			localtypes.put(name, this);
		}
		System.out.printf("%s %s %s\n", hidden, name, this.getClass());
	}
	
	public static void makeType(Matcher m, String source) {
		
		// this is left in here to debug the regex used to find types
		/*for(int i = 0; i < m.groupCount(); i++) {
			System.out.print("|" + m.group(i) + "|");
		}
		System.out.println();*/
		
		boolean hidden = (m.group(1) != null);
		String type = m.group(2);
		String name = m.group(3);
		if(type.equals("struct")) {
			new Struct(name, hidden, m, source);
		}else if(type.equals("class")) {
			new Class(name, hidden, m, source);
		}else if(type.equals("type")) {
			new Type(name, hidden, m, source);
		}else {
			throw new IllegalArgumentException(String.format("Could not identify the type %s\n", type));
		}
	}
	
	/*
	 * forget local types
	 */
	public static void resetLocal(Code code) {
		code.setLocalTypes(localtypes);
		for(String s : localtypes.keySet()) {
			types.remove(s);
		}
		localtypes.clear();
		Struct.resetLocal();
		Class.resetLocal();
		Type.resetLocal();
	}
}


/*
 * the following classes are essentially all the same, but more code will be added to handle further parsing of them
 * 
 * I'm thinking type will serve as the equivilent of typedef in C,
 * structs will be the same as C structs (not C++ structs, so will only contain data),
 * and classes will be structs but with a bunch of extra information to handle methods, inheritance, polymorphism, etc.
 * 
 * we may make structs more like classes but without supporting inheritance or interfaces to offer more efficient code but without the runtime flexibility of classes
 */

class Struct extends AbstractType {
	
	public Struct(String name, boolean hidden, Matcher m, String source) {
		super(name, hidden);
		types.put(name, this);
		if(hidden) {
			localtypes.put(name, this);
		}
	}
	
	private static HashMap<String, Struct> types = new HashMap<String, Struct>();
	private static HashMap<String, Struct> localtypes = new HashMap<String, Struct>();
	public static void resetLocal() {
		for(String s : localtypes.keySet()) {
			types.remove(s);
		}
	}
	
	/*
	 * build a capturing group to match any of the current structs, untested
	 */
	public static String makeRegexToFindType() {
		StringBuffer regex = new StringBuffer();
		regex.append("(");
		boolean first = true;
		for(String type : types.keySet()) {
			if(first) {
				first = false;
			}else {
				regex.append("|");
			}
			regex.append(type);
		}
		regex.append(")");
		return regex.toString();
	}
}

class Type extends AbstractType {
	
	public Type(String name, boolean hidden, Matcher m, String source) {
		super(name, hidden);
		types.put(name, this);
		if(hidden) {
			localtypes.put(name, this);
		}
	}
	
	private static HashMap<String, Type> types = new HashMap<String, Type>();
	private static HashMap<String, Type> localtypes = new HashMap<String, Type>();
	public static void resetLocal() {
		for(String s : localtypes.keySet()) {
			types.remove(s);
		}
	}
	
	/*
	 * build a capturing group to match any of the current typedefs, untested
	 */
	public static String makeRegexToFindType() {
		StringBuffer regex = new StringBuffer();
		regex.append("(");
		boolean first = true;
		for(String type : types.keySet()) {
			if(first) {
				first = false;
			}else {
				regex.append("|");
			}
			regex.append(type);
		}
		regex.append(")");
		return regex.toString();
	}
}

class Class extends AbstractType {
	
	public Class(String name, boolean hidden, Matcher m, String source) {
		super(name, hidden);
		types.put(name, this);
		if(hidden) {
			localtypes.put(name, this);
		}
	}
	
	private static HashMap<String, Class> types = new HashMap<String, Class>();
	private static HashMap<String, Class> localtypes = new HashMap<String, Class>();
	public static void resetLocal() {
		for(String s : localtypes.keySet()) {
			types.remove(s);
		}
	}
	
	/*
	 * build a capturing group to match any of the current classes, untested
	 */
	public static String makeRegexToFindType() {
		StringBuffer regex = new StringBuffer();
		regex.append("(");
		boolean first = true;
		for(String type : types.keySet()) {
			if(first) {
				first = false;
			}else {
				regex.append("|");
			}
			regex.append(type);
		}
		regex.append(")");
		return regex.toString();
	}
}