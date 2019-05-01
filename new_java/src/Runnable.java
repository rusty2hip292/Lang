
public class Runnable extends ValidCode {
	
	public Runnable(String code) {
		super(code);
	}
	public Runnable(Runnable first, Runnable second) {
		super(first.code() + second.code());
	}
}