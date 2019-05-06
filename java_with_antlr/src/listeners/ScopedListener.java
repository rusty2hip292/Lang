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
	//private Stack<BlockContext> contexts = new Stack<BlockContext>();
	
	public ScopedListener() {
		scope.add("global");
		//contexts.add(null);
	}
	
	protected String currentScopeName() {
		return scope.peek();
	}
	
	private BigUnsignedInteger num = new BigUnsignedInteger();
	public void enterBlock(BlockContext context) {
		num.increment();
		//contexts.push(context);
		scope.push("scope_" + num.toString());
		Scope.currentScope = scope.peek();
	}
	public void exitBlock(BlockContext context) {
		//System.out.println(context.toString());
		//System.out.println(scope.size());
		//if(context == contexts.peek()) {
			//contexts.pop();
			Scope.closeScope(scope.pop());
		//}
		Scope.currentScope = scope.peek();
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
