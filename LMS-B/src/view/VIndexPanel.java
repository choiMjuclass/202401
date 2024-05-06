package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class VIndexPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private VIndexTable vCampus;
	private VIndexTable vCollege;
	private VIndexTable vDepartment;
	
	VIndexPanel() {
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
