package listeners;

public class Identifier {

	private Identifier() { }
	
	public static String identifier(antlr.LangParser.IdentifierContext context) {
		if(context.DOT() == null) {
			return context.IDENTIFIER().toString();
		}
		StringBuffer sb = new StringBuffer();
		boolean first = true;
		for(antlr.LangParser.IdentifierContext ic : context.identifier()) {
			if(first) {
				first = false;
			}else {
				sb.append(".");
			}
			sb.append(identifier(ic));
		}
		return sb.toString();
	}
}
