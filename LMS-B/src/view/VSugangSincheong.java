package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class VSugangSincheong extends JPanel {
	private static final long serialVersionUID = 1L;

	private VIndexPanel vIndexPanel;
	private VControlPanel vControlPanel1;
	private VLectureTable vMiridamgiTable;
	private VControlPanel vControlPanel2;
	private VLectureTable vSingcheongTable;	
	
	public VSugangSincheong() {
		this.vIndexPanel = new VIndexPanel();
		this.add(this.vIndexPanel);
		
		this.vControlPanel1 = new VControlPanel();
		this.add(this.vControlPanel1);
		
		this.vMiridamgiTable = new VLectureTable();
		JScrollPane scrollPane1 = new JScrollPane(this.vMiridamgiTable);
		this.add(scrollPane1);
		
		this.vControlPanel2 = new VControlPanel();
		this.add(this.vControlPanel2);
		
		this.vSingcheongTable = new VLectureTable();
		JScrollPane scrollPane2 = new JScrollPane(this.vSingcheongTable);
		this.add(scrollPane2);
	}
	public void initialize() {		
	}
	public void run() {		
	}

}
