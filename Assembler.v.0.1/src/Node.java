
public abstract class Node {
	protected LexicalAnalyzer lexicalAnalyzer;
	public Node(LexicalAnalyzer lexicalAnalyzer) {
		this.lexicalAnalyzer = lexicalAnalyzer;
	}
	
	public abstract String parse()throws Exception;
}
