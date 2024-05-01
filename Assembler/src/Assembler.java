import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Assembler {
	
	private enum EInstruction {
		eSegmentHead,
		eLabel,
		eOP0,
		eOP1,
		eOP2,
		eRgister,
		eConstant,
		eName
	}
	
	private enum EParseState {
		eProgramStart,
		eHeadSegementStart,
		eDataSegmentStart,
		eCodeSegementStart,
		eProgramEnd
	}
	private EParseState eParseState;
	
	private String sProgramStart = ".program";
	private String sProgramEnd = ".end";	
	
	private String[] sSegmentHeadList = {
			".head",".data", ".code" 
	};
	private String[] sOp0List = {
			"halt"
	};
	private String[] sOp1List = {
			"jump", "ge"
	};
	private String[] sOp2List = {
			"move", "cmp", "add"
	};

	private class Token {
		private EInstruction eInstruction;
		private String name;
		private String value;
		
		public EInstruction geteInstruction() {	return this.eInstruction; }
		public void seteInstruction(EInstruction eInstruction) {this.eInstruction = eInstruction;}
		public String getName() {return this.name;}
		public void setName(String name) {this.name = name;}
		public String getValue() {return this.value;}
		public void setValue(String value) {this.value = value; }
		
	}
	private class Instruction {

		private void parse0(String command) {
			if (command.equals(sProgramStart)) {
				
			} else if (command.equals(sProgramEnd)) {
				
			} else {
				for (String segmentHead : sSegmentHeadList) {
					if (command.equals(segmentHead)) {
						
					}
				}
			}
			
		}
		private void parse1(String command, String operand1) {
		}
		private void parse2(String command, String operand1, String operand2) {
		}
	
		boolean parse(String line) {
			String[] tokens = line.split(" ");
			
			if (tokens.length == 0) {
			} else if (tokens.length == 1) {
				parse0(tokens[0]);
			} else if (tokens.length == 2) {				
				parse1(tokens[0], tokens[1]);
			} else if (tokens.length == 3) {				
				parse2(tokens[0], tokens[1], tokens[2]);
			}
			return true;
		}

	}
	
	private Vector<Instruction> instructionList;
	
	private String sourceFileName;
	private String binaryFileName;	
	private Scanner scanner;
	
	// constructors
	public Assembler() {
		this.eParseState = EParseState.eProgramEnd;
		sourceFileName = "source/test.txt";
	}
	public void initialize() {
	}
	public void finish() {
	}
	
	// methods
	public void run() {		
		try {
			File file = new File(sourceFileName);
			
			this.scanner = new Scanner(file);
			while (this.scanner.hasNext()) {
				String line = scanner.nextLine();
				Instruction instuction = new Instruction();
				instuction.parse(line);
				this.instructionList.add(instuction);
			}
			this.scanner.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
