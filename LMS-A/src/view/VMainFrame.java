package view;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class VMainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	// attributes
	
	// components
	private VSugangSincheong vSugangSincheong;
	
	public VMainFrame() throws HeadlessException {
		// attributes
		this.setLocation(200,100);
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// components
		this.vSugangSincheong = new VSugangSincheong();
		this.add(vSugangSincheong);
	}
	
	// methods
}
