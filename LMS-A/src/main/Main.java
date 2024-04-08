package main;
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
	private void run() {
		this.lms.run();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.initialize();
		main.run();
	}


	

}
