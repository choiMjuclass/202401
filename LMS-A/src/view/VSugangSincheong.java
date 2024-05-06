package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class VSugangSincheong extends JPanel {
	// attributes
	private static final long serialVersionUID = 1L;
	// components
	private VIndexPanel vIndexPanel;
	private VControlPanel vControlPanel1;
	private VLectureTable vMiridamgi;
	private VControlPanel vControlPanel2;	
	private VLectureTable vSincheong;
	
	// methods
	public VSugangSincheong() {
		// components
		this.vIndexPanel = new VIndexPanel();
		this.add(vIndexPanel);
		
		this.vControlPanel1 = new VControlPanel();
		this.add(vControlPanel1);
		
		this.vMiridamgi = new VLectureTable();
		JScrollPane scrollPane1 = new JScrollPane(vMiridamgi);
		this.add(scrollPane1);
		
		this.vControlPanel2 = new VControlPanel();
		this.add(vControlPanel2);
		
		this.vSincheong = new VLectureTable();
		JScrollPane scrollPane2 = new JScrollPane(vSincheong);
		this.add(scrollPane2);
		
	}
	public void initialize() {
	}
	public void finish() {
	}	
	public void run() {
	}
}
