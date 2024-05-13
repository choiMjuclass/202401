package view;

import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class VIndexPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private VIndexTable vCampus;
	private VIndexTable vCollege;
	private VIndexTable vDepartment;
	
	VIndexPanel() {
		// components
		LayoutManager layoutManager = new BoxLayout(this, BoxLayout.X_AXIS);
		this.setLayout(layoutManager);

		this.vCampus = new VIndexTable();
		this.add(vCampus);
		
		this.vCollege = new VIndexTable();
		this.add(vCollege);
		
		this.vDepartment = new VIndexTable();
		this.add(vDepartment);
		
		// associations
		this.vCampus.setNext(vCollege);
		this.vCollege.setNext(vDepartment);
	}

	public void initialize() {		
		this.vCampus.initialize();
		this.vCollege.initialize();
		this.vDepartment.initialize();
		
		this.vCampus.show("root");
	}
}
