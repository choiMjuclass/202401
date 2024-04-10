package main;

import java.awt.HeadlessException;
import javax.swing.JFrame;

import view.VSugangSincheong;

public class VMainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private VSugangSincheong vSugangSincheong;
	
	public VMainFrame() throws HeadlessException {
		// components
		this.vSugangSincheong = new VSugangSincheong();
		this.add(vSugangSincheong);
	}
}
