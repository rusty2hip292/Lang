package program;

import java.util.ArrayList;
import java.util.Stack;

public class Program {

	private static StringBuffer[] sb = new StringBuffer[Context.values().length];
	public static enum Context {
		HEAD(0),
		TYPEDEF(1),
		DECL(2),
		INIT(3),
		MAIN(4),
		IMPLEMENTATION(5),
		NONE(6);
		
		private final int value;
		private Context(int v) {
			this.value = v;
		}
		public int getInt() {
			return value;
		}
	}
	
	static {
		Program.writeContext(Program.Context.MAIN, "int main() {\n");
	}
	
	public static Stack<Context> context = new Stack<Context>();
	private static StringBuffer currentContext;
	public static void push(Context c) {
		//System.out.println(c);
		context.push(c);
		if(sb[c.getInt()] == null) {
			sb[c.getInt()] = new StringBuffer();
		}
		currentContext = sb[c.getInt()];
	}
	public static void write(String code) {
		currentContext.append(code);
	}
	public static void writeContext(Context c, String code) {
		if(sb[c.getInt()] == null) {
			sb[c.getInt()] = new StringBuffer();
		}
		sb[c.getInt()].append(code);
	}
	public static void pop() {
		context.pop();
	}
	
	public static void compile() {
		Program.writeContext(Program.Context.MAIN, "\n}\n");
		StringBuffer program = new StringBuffer();
		for(int i = 0; i < Context.values().length - 1; i++) {
			if(sb[i] != null) {
				program.append(sb[i].toString());
			}
		}
		System.out.println("-----------");
		System.out.println(program.toString());
	}
}
