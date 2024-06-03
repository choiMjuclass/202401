package main;

import view.VLoginDialog;
import view.VMainFrame;

public class Main {
	// attributes
	
	// components
	private VMainFrame vMainFrame;
	
	// constructor
	public Main() {
		VLoginDialog loginDialog = new VLoginDialog();
		loginDialog.setVisible(true);
		
		// component
		this.vMainFrame = new VMainFrame();
		this.vMainFrame.setVisible(true);
	}
	private void initialize() {
		this.vMainFrame.initialize();
	}

	
	public static void main(String[] args) {
		Main main = new Main();
		main.initialize();
	}


	

}
