package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class VSugangSincheong extends JPanel {
	private static final long serialVersionUID = 1L;

	private VCampus vCampus;
	
	public VSugangSincheong() {		
		this.vCampus = new VCampus();
		JScrollPane scrollPane = new JScrollPane(this.vCampus);	
		this.add(scrollPane);	
	}
	public void initialize() {		
	}
	public void run() {		
	}

}
