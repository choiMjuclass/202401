
public class Parser extends Node {
	
	private Program program;
	
	public Parser(LexicalAnalyzer lexicalAnalyzer) {
		super(lexicalAnalyzer);
	}
	public void initialize() {
		
	}
	@Override
	public String parse(String token) throws Exception {
		// TODO Auto-generated method stub
		token = this.lexicalAnalyzer.getToken();
		if (token.equals(EKeyword.eProgram.getText())) {
			this.program = new Program(this.lexicalAnalyzer);
			this.program.parse(token);
		} 
		throw new Exception();
	}
}
