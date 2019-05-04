package listeners;

import org.antlr.v4.runtime.*;
import antlr.LangBaseListener;
import antlr.LangParser.*;

public class TypeExtractor extends LangBaseListener {

	public void enterTypedef(TypedefContext context) {
		System.out.println("typedef");
	}
}
