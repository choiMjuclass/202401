package view;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class VMainFrame extends JFrame {
	// attributes
	private static final long serialVersionUID = 1L;	
	
	// components
	private VSugangSincheong vSugangSincheong;
	
	public VMainFrame() throws HeadlessException {
		// attributes
		this.setTitle("수강신청");
		this.setLocation(300, 100);
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// components
		this.vSugangSincheong = new VSugangSincheong();
		this.add(vSugangSincheong);
	}

	public void initialize() {
		this.vSugangSincheong.initialize();		
	}

	// methods
}
