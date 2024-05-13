public class Assembler {

	private LexicalAnalyzer lexicalAnalyzer;
	private Parser parser;
	
	public Assembler() {
		this.lexicalAnalyzer = new LexicalAnalyzer("source/test.txt");
		this.parser = new Parser(this.lexicalAnalyzer);		
	}
	
	// methods
	public void run() {	
		try {
			this.parser.parse(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void initialize() {
	}
	public void finish() {
		// TODO Auto-generated method stub
		
	}

}
