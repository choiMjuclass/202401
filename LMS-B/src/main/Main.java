package main;

import view.VMainFrame;

public class Main {
	// attributes
	
	// components
	private VMainFrame vMainFrame;
	
	// associations
	
	// constructors
	public Main() {
		this.vMainFrame = new VMainFrame();
		this.vMainFrame.setVisible(true);
	}
	public void initialize() {
	}
	// methods
	public void run() {
	}
	
	// main
	public static void main(String[] args) {
		Main main = new Main();
		main.initialize();
		main.run();
		
	}
}
