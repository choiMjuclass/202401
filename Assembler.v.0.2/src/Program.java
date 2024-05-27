
public class Program extends Node {

	private String name;
	
	private HeaderSegment headerSegment;
	private DataSegment dataSegment;
	private CodeSegment codeSegment;
	
	public Program(LexicalAnalyzer lexicalAnalyzer) {
		super(lexicalAnalyzer);
	}

	@Override
	public String parse(String token) throws Exception {
		// TODO Auto-generated method stub
		this.name = lexicalAnalyzer.getToken();
		token = lexicalAnalyzer.getToken();
		if (token.equals(EKeyword.eHeader.getText())) {
			headerSegment = new HeaderSegment(lexicalAnalyzer);
			token = headerSegment.parse(token);
		} else {
			throw new Exception();
		}
		
		if (token.equals(EKeyword.eData.getText())) {
			dataSegment = new DataSegment(lexicalAnalyzer);			
			token = dataSegment.parse(token);
		} else {
			throw new Exception();
		} 
		
		if (token.equals(EKeyword.eCode.getText())) {
			codeSegment = new CodeSegment(lexicalAnalyzer);
			token = codeSegment.parse(token);
		} else {
			throw new Exception();
		}
	
		return null;
	}

}
