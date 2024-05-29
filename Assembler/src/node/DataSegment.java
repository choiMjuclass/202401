package node;
import java.util.Vector;

import lexicalAnalyzer.EKeyword;
import lexicalAnalyzer.LexicalAnalyzer;

public class DataSegment extends Node {

	public class Symbol {
		private String name;
		private int size;
		
		public Symbol(String name, int size) {
			this.name = name;
			this.size = size;
		}
		public String getName() {return name;}
		public int getSize() {return size;}
	}
	private Vector<Symbol> symbolTable;
	
	public DataSegment(LexicalAnalyzer lexicalAnalyzer) {
		super(lexicalAnalyzer);
		this.symbolTable = new Vector<Symbol>();
	}

	@Override
	public String parse(String token) throws Exception {
		// TODO Auto-generated method stub
		String name = lexicalAnalyzer.getToken();
		while (!name.equals(EKeyword.eCode.getText())) {
			int size = Integer.parseInt(lexicalAnalyzer.getToken());
			
			Symbol symbol = new Symbol(name, size);
			this.symbolTable.add(symbol);
			
			name = lexicalAnalyzer.getToken();
		}		
		return name;
	}

	@Override
	public String generate() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
