package program;

public class Variable extends Scoped {

	public static Variable declare(String varconst, String type, String name) {
		System.out.println(String.format("%s %s %s", varconst, type, name));
		return null;
	}
	
	protected Variable(String name, boolean local) {
		super(name, local);
	}
}

class Primative extends Variable {
	
	public Primative(String name, boolean local) {
		super(name, local);
	}
}
