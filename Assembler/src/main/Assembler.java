package main;
import codeGenerator.CodeGenerator;
import lexicalAnalyzer.LexicalAnalyzer;
import parser.Parser;

public class Assembler {

	private LexicalAnalyzer lexicalAnalyzer;
	private Parser parser;
	private CodeGenerator codeGenerator;
	
	public Assembler() {
		this.lexicalAnalyzer = new LexicalAnalyzer("test");
		this.parser = new Parser();	
		this.codeGenerator = new CodeGenerator("exe");
		
		this.parser.associate(this.lexicalAnalyzer, this.codeGenerator);
	}
	public void initialize() {
		this.lexicalAnalyzer.initialize();
		this.parser.initialize();
		this.codeGenerator.initialize();
	}
	public void finish() {
		this.lexicalAnalyzer.finish();
		this.parser.initialize();
		this.codeGenerator.initialize();
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


}
