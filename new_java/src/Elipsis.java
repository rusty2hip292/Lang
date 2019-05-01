
class Elipsis extends SyntacticToken {
	public Elipsis() {
		super("\\.{3}", "[^.]");
	}
	public Elipsis(String elipsis) { }
}