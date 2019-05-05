package program;

public class Type extends Scoped {

	public Type(String name, boolean local) {
		this(name, "__type__", local); // I need to define this type
	}
	private final String supertype;
	public Type(String name, String supertype, boolean local) {
		super(name, local && name.indexOf("__") != 0);
		if(local && name.indexOf("__") == 0) {
			System.err.println("type " + name + " cannot be declared local (type names beginning with '__' are reserved for global types), non-fatal error");
		}
		if(name.equals(supertype)) {
			this.supertype = null;
		}else {
			this.supertype = supertype;
		}
	}
}
