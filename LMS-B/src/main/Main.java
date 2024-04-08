package main;
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
	public void run() {
		this.lms.run();
	}
	
	// main
	public static void main(String[] args) {
		Main main = new Main();
		main.initialize();
		main.run();
		
	}
}
