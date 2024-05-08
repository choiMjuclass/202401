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
		LayoutManager layoutManager = new BoxLayout(this, BoxLayout.X_AXIS);
		this.setLayout(layoutManager);

		this.vCampus = new VIndexTable();
		JScrollPane scrollPane1 = new JScrollPane(this.vCampus);
		this.add(scrollPane1);
		
		this.vCollege = new VIndexTable();
		JScrollPane scrollPane2 = new JScrollPane(this.vCollege);
		this.add(scrollPane2);
		
		this.vDepartment = new VIndexTable();
		JScrollPane scrollPane3 = new JScrollPane(this.vDepartment);
		this.add(scrollPane3);
	}

}
