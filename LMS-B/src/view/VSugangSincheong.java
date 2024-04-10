package view;

import java.awt.Color;

import javax.swing.JPanel;

import control.CCampus;

public class VSugangSincheong extends JPanel {
	private static final long serialVersionUID = 1L;

	private CCampus cCampus;
	public VSugangSincheong() {
		this.setBackground(Color.RED);
		
		this.cCampus = new CCampus();
		this.cCampus.getList();
		
	}
	public void initialize() {
		
	}

	public void run() {
		
	}

}
