
public class HeaderSegment extends Node {

	private int sizeStack;
	private int sizeHeap;
	
	public HeaderSegment(LexicalAnalyzer lexicalAnalyzer) {
		super(lexicalAnalyzer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String parse() throws Exception {
		// TODO Auto-generated method stub
		String keyword = lexicalAnalyzer.getToken();
		while (!keyword.equals(EKeyword.eData.getText())) {
			String size = lexicalAnalyzer.getToken();
			if (keyword.equals(EKeyword.eStack.getText())) {
				this.sizeStack = Integer.parseInt(size);
			} else if (keyword.equals(EKeyword.eHeap.getText())) {
				this.sizeHeap = Integer.parseInt(size);
			} else {
				throw new Exception();
			}
			keyword = lexicalAnalyzer.getToken();
		}		
		return null;
	}

}
