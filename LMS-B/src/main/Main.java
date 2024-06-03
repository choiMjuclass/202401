package main;

import view.VLoginDialog;
import view.VMainFrame;

public class Main {
	// attributes
	
	// components
	private VMainFrame vMainFrame;
	
	// associations
	
	// constructors
	public Main() {
		VLoginDialog loginDialog = new VLoginDialog();
		loginDialog.setVisible(true);
		
		this.vMainFrame = new VMainFrame();
		this.vMainFrame.setVisible(true);
	}
	public void initialize() {
		this.vMainFrame.initialize();
	}
	
	// main
	public static void main(String[] args) {
		Main main = new Main();
		main.initialize();
	}
}
