package node;
import java.util.Vector;

import lexicalAnalyzer.LexicalAnalyzer;

public class CodeSegment extends Node {
	
	private Vector<Instruction> instructions;
	
	public CodeSegment(LexicalAnalyzer lexicalAnalyzer) {
		super(lexicalAnalyzer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String parse(String token) throws Exception {
		// TODO Auto-generated method stub
		String command = lexicalAnalyzer.getToken();
		Instruction.ECommand eCommand = Instruction.ECommand.valueOf(command);
		while (eCommand != null && eCommand != Instruction.ECommand.eEnd ) {
			Instruction instruction = new Instruction(lexicalAnalyzer);
			command = instruction.parse(command);
			instructions.add(instruction);
		}		
		return command;
	}

	@Override
	public String generate() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
