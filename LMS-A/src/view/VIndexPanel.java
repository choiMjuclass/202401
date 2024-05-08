package view;

import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class VIndexPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private VIndexTable vCampus;
	private VIndexTable vCollege;
	private VIndexTable vDepartment;
	
	public VIndexPanel() {
		LayoutManager layoutManager = new BoxLayout(this, BoxLayout.X_AXIS);
		this.setLayout(layoutManager);
		
		this.vCampus = new VIndexTable();
		this.add(vCampus);
		
		this.vCollege = new VIndexTable();
		this.add(vCollege);
		
		this.vDepartment = new VIndexTable();
		this.add(vDepartment);
	}

	public void initialize() {
		this.vCampus.show("root");
	}

}
