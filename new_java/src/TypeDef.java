
class TypeDef extends Type {
	
	private static Parser parser = Parser.parser();
	
	public TypeDef(Token n) {
		super(n.from);
		if(n instanceof Name) {
			parser.addType(n.from, this);
		}else {
			System.out.println(n.getClass());
			throw new IllegalArgumentException("Type token not followed by a Name symbol");
		}
	}
}