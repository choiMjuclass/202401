public class Main {
	// attributes
	
	// components
	private LMS lms;
	
	// constructor
	public Main() {
		// attributes
		
		// component
		this.lms = new LMS();
		
		// associations
	}
	private void initialize() {
		this.lms.initialize();
	}
	
	// methods
	
	
	public static void main(String[] args) {
		Main main = new Main();
		main.initialize();
	}


	

}
