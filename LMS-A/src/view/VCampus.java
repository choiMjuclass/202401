package view;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VCampus extends JTable {
	// attributes
	private static final long serialVersionUID = 1L;
	
	// components
	private DefaultTableModel model;
	// methods
	public VCampus() {
		String header[] = {
				"아이디, 캠퍼스"	
			};
		Object[][] data = {
				{"0", "서울"},
				{"1", "용인"}
		};
			
		this.model = new DefaultTableModel(data, header);
		this.setModel(this.model);	
		

//		this.model.addColumn(header);
//		this.model.addRow(data);
	}
	
	public void show() {
		this.updateUI();
	}

}
