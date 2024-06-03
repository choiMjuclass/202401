package view;

import java.awt.HeadlessException;
import javax.swing.JFrame;

import constants.Constant.MainFrame;

public class VMainFrame extends JFrame {
	// attributes
	private static final long serialVersionUID = MainFrame.VERSION_NUM;	
	
	// components
	private VSugangSincheong vSugangSincheong;
	
	public VMainFrame() throws HeadlessException {
		// attributes
		this.setTitle(MainFrame.TITLE);
		this.setLocation(MainFrame.X, MainFrame.Y);
		this.setSize(MainFrame.WIDTH,MainFrame.HEIGHT);
		
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
