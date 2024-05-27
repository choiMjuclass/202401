public class Assembler {

	private LexicalAnalyzer lexicalAnalyzer;
	private Parser parser;
	
	public Assembler() {
		this.lexicalAnalyzer = new LexicalAnalyzer("test");
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
		this.lexicalAnalyzer.initialize();
		this.parser.initialize()
		;
	}
	public void finish() {
		// TODO Auto-generated method stub
		
	}

}
