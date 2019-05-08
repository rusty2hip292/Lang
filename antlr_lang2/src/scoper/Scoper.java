package scoper;

import java.util.HashMap;

public class Scoper {

	private static Scoper global = new Scoper(null);
	private static Scoper current;
	private HashMap<String, Scoper> inside = new HashMap<String, Scoper>();
	private HashMap<String, Scopable> items = new HashMap<String, Scopable>();
	private Scoper outer;
	
	public static void dump() {
		System.out.println(global.toString(""));
	}
	public String toString(String tabs) {
		StringBuffer sb = new StringBuffer();
		sb.append(tabs + items.toString());
		tabs += "\t";
		for(Scoper s : this.inside.values()) {
			sb.append("\n" + s.toString(tabs));
		}
		return sb.toString();
	}
	
	public static void openScope(String name) {
		if(current.inside.get(name) == null) {
			current.inside.put(name, new Scoper());
		}else {
			current = current.inside.get(name);
		}
	}
	public static void closeScope() {
		if(current != global) {
			current = current.outer;
		}
	}
	public static void add(Scopable s, String localToFile) {
		if(current == global && localToFile != null) {
			openScope(localToFile);
			add(s, null);
			closeScope();
		}else {
			if(current.items.get(s.name) != null) {
				System.err.println(String.format("Scoped entity %s already exists"));
				System.exit(-1);
			}
			current.items.put(s.name, s);
		}
	}
	public static Scopable get(String name, String filename) {
		if(current == global) {
			openScope(filename);
			Scopable s = current.get(name);
			closeScope();
			if(s != null) {
				return s;
			}
		}
		return current.get(name);
	}
	private Scopable get(String name) {
		Scopable s = this.items.get(name);
		if(s != null) {
			return s;
		}else if(current.outer != null) {
			return current.outer.get(name);
		}
		return null;
	}

	private Scoper(Scoper prev) {
		this.outer = prev;
		current = this;
	}
	private Scoper() {
		this(current);
	}
	
	private static class Test extends Scopable {
		
		public Test(String name) {
			super(name);
		}
		public String toString() {
			return this.name;
		}
	}
}
