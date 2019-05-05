package program;

public abstract class Scoped {

	public final String name;
	public final boolean local;
	public Scoped(String name) {
		this(name, false);
	}
	public Scoped(String name, boolean local) {
		this.name = name;
		this.local = local;
	}
}
