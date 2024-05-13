
public class CodeSegment extends Node {

	public CodeSegment(LexicalAnalyzer lexicalAnalyzer) {
		super(lexicalAnalyzer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String parse(String token) throws Exception {
		// TODO Auto-generated method stub
		String command = lexicalAnalyzer.getToken();
		while (!command.equals(EKeyword.eEnd.getText())) {
			Instruction instruction = new Instruction(lexicalAnalyzer);
			command = instruction.parse(command);
		}		
		return command;
	}
}
