package main;
public class Main {
	// attributes
	
	// components
	private VMainFrame vMainFrame;
	
	// constructor
	public Main() {
		// attributes
		
		// component
		this.vMainFrame = new VMainFrame();
		this.vMainFrame.setVisible(true);
		
		// associations
	}
	private void initialize() {
	}
	
	// methods
	private void run() {
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.initialize();
		main.run();
	}


	

}
