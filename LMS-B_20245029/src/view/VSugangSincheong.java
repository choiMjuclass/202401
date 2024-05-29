package view;

import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class VSugangSincheong extends JPanel {
	private static final long serialVersionUID = 1L;

	private VSelectionPanel vSelectionPanel;
	private VControlPanel vControlPanel1;
	private VLectureTable vMiridamgiTable;
	private VControlPanel vControlPanel2;
	private VLectureTable vSingcheongTable;	
	
	public VSugangSincheong() {
		LayoutManager layoutManager = new BoxLayout(this, BoxLayout.X_AXIS);
		this.setLayout(layoutManager);
		
		this.vSelectionPanel = new VSelectionPanel();
		this.add(this.vSelectionPanel);
		
		this.vControlPanel1 = new VControlPanel();
		this.add(this.vControlPanel1);
		
		this.vMiridamgiTable = new VLectureTable();
		this.add(vMiridamgiTable);
		
		this.vControlPanel2 = new VControlPanel();
		this.add(this.vControlPanel2);
		
		this.vSingcheongTable = new VLectureTable();
		this.add(vSingcheongTable);
		
		this.vControlPanel1.associate(vSelectionPanel.getLectureTable(), vMiridamgiTable);
		this.vControlPanel2.associate(vMiridamgiTable, vSingcheongTable);
	}
	public void initialize() {
		this.vSelectionPanel.initialize();
		this.vControlPanel1.initialize();
		this.vMiridamgiTable.initialize();
		this.vControlPanel2.initialize();
		this.vSingcheongTable.initialize();
	}
}
