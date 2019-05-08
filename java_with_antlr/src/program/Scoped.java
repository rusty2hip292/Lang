package program;

public abstract class Scoped {

	public final String name;
	private String newName = null;
	
	private long counter = 0;
	public String newName() {
		if(newName == null) {
			newName = "autovar" + counter++;
		}
		return newName;
	}
	
	public final boolean local;
	public Scoped(String name) {
		this(name, false);
	}
	public Scoped(String name, boolean local) {
		this.name = name;
		this.local = local;
	}
}
