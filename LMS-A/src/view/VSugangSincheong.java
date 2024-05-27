package view;

import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class VSugangSincheong extends JPanel {
	// attributes
	private static final long serialVersionUID = 1L;
	// components
	private VSelectionPanel vSelectionPanel;
	private VControlPanel vControlPanel1;
	private VLectureTable vMiridamgi;
	private VControlPanel vControlPanel2;	
	private VLectureTable vSincheong;
	
	// methods
	public VSugangSincheong() {
		
		LayoutManager layoutManager = new BoxLayout(this, BoxLayout.X_AXIS);
		this.setLayout(layoutManager);
		
		// components
		this.vSelectionPanel = new VSelectionPanel();
		this.add(vSelectionPanel);
		
		this.vControlPanel1 = new VControlPanel();
		this.add(vControlPanel1);
		
		this.vMiridamgi = new VLectureTable();
		this.add(vMiridamgi);
		
		this.vControlPanel2 = new VControlPanel();
		this.add(vControlPanel2);
		
		this.vSincheong = new VLectureTable();
		this.add(vSincheong);
		
		// associations
		this.vControlPanel1.associate(this.vSelectionPanel.getLectureTable(), this.vMiridamgi );
		this.vControlPanel2.associate(this.vMiridamgi, this.vSincheong);
		
	}
	public void initialize() {
		this.vSelectionPanel.initialize();
		this.vControlPanel1.initialize();
		this.vMiridamgi.initialize();
		this.vControlPanel2.initialize();
		this.vSincheong.initialize();
	}
	
	public void finish() {
	}	
	public void run() {
	}
}
