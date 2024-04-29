import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Assembler {

	private enum EInstruction {
		eDirective,
		eLabel,
		eOP0,
		eOP1,
		eOP2
	}
	
	private class Line {
		private String line;
		
		void parse(Scanner scanner) {
			this.line = scanner.nextLine();
			this.line = this.line.stripLeading();
			String[] tokens = this.line.split(" ");
			if (tokens.length == 0) {				
			} else if (tokens.length == 1) {
				System.out.println("1:" + line);
			} else if (tokens.length == 2) {				
				System.out.println("2:" + line);
			} else if (tokens.length == 3) {				
				System.out.println("3:" + line);
			}
		}
	}
	
	private Vector<Line> lines;
	
	private String sourceFileName;
	private String binaryFileName;	
	private Scanner scanner;
	
	// constructors
	public Assembler() {
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
				Line line = new Line();
				line.parse(scanner);			
			}
			this.scanner.close();
			
			this.scanner = new Scanner(file);
			while (this.scanner.hasNext()) {
				Line line = new Line();
				line.parse(scanner);			
			}
			this.scanner.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
