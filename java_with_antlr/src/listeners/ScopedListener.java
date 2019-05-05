package listeners;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.*;
import antlr.LangBaseListener;
import antlr.LangParser.*;
import program.Scope;

public abstract class ScopedListener extends LangBaseListener {
	
	private Stack<String> scope = new Stack<String>();
	
	public ScopedListener() {
		scope.add("global");
	}
	
	protected String currentScopeName() {
		return scope.peek();
	}
	
	private BigUnsignedInteger num = new BigUnsignedInteger();
	public void enterBlock(BlockContext context) {
		num.increment();
		scope.push("scope_" + num.toString());
	}
	public void exitBlock(BlockContext context) {
		Scope.closeScope(scope.pop());
	}
}

class BigUnsignedInteger {

	private List<Integer> longs = new ArrayList<Integer>();
	
	public BigUnsignedInteger() {
		longs.add(0);
	}
	
	public BigUnsignedInteger increment() {
		for(int i = 0; i < longs.size(); i++) {
			int l = longs.get(i);
			l++;
			if(l < 0 || l > 9) {
				longs.set(i, 0);
				continue;
			}
			longs.set(i, l);
			return this;
		}
		longs.add(1);
		return this;
	}
	
	public String toString() {
		CharSequence[] ints = new CharSequence[longs.size()];
		for(int i = 0; i < ints.length; i++) {
			ints[i] = "" + longs.get(ints.length - 1 - i);
		}
		return String.join("_", ints);
	}
}
