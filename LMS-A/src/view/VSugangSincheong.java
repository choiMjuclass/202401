package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class VSugangSincheong extends JPanel {
	// attributes
	private static final long serialVersionUID = 1L;
	// components
	private VCampus vCampus;
	
	// methods
	public VSugangSincheong() {
		this.vCampus = new VCampus();
		JScrollPane scrollPane = new JScrollPane(this.vCampus);
		this.add(scrollPane);
		
	}
	public void initialize() {
	}
	public void finish() {
	}	
	public void run() {
	}
}
