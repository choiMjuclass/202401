
public class Parser extends Node {
	
	private Program program;
	
	public Parser(LexicalAnalyzer lexicalAnalyzer) {
		super(lexicalAnalyzer);
	}
	
	@Override
	public Node parse() throws Exception {
		// TODO Auto-generated method stub
		String token = this.lexicalAnalyzer.getToken();
		if (token.equals(EKeyword.eProgram.getText())) {
			this.program = new Program(this.lexicalAnalyzer);
			this.program.parse();
		} 
		throw new Exception();
	}
}
