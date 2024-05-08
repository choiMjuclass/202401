package view;

import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class VSelectionPanel extends JPanel {
	// attributes
	private static final long serialVersionUID = 1L;
	
	// components
	private VIndexPanel vIndexPanel;
	private VLectureTable vLectureTable;
	
	public VSelectionPanel() {
		
		// components
		LayoutManager layoutManager = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layoutManager);
		
		this.vIndexPanel = new VIndexPanel();
		this.add(vIndexPanel);
		
		this.vLectureTable = new VLectureTable();
		this.add(vLectureTable);
	}

	public void initialize() {
		this.vIndexPanel.initialize();
		this.vLectureTable.initialize();		
	}

}
