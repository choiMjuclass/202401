public class Main {
	// attributes
	
	// components
	private LMS lms;
	
	// associations
	
	// constructors
	public Main() {
		this.lms = new LMS();
	}
	public void initialize() {
		this.lms.initialize();
	}
	// methods
	
	// main
	public static void main(String[] args) {
		Main main = new Main();
		main.initialize();
		
	}
}
