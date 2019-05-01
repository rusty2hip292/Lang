
public class Type {

	protected final String name;
	public Type(String name) {
		this.name = name;
	}
	public void dump() {
		System.out.println(String.format("type %s", name));
	}
}
