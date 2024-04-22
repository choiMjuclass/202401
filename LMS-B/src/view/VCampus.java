package view;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VCampus extends JTable {
	private static final long serialVersionUID = 1L;

	private DefaultTableModel model;
	
	public VCampus() {
		
		String[] header = {"아이디", "캠퍼스"};
		String[][] data = {
				{"0", "인문"},
				{"1", "자연"},
				{"2", "공학"}
		};		
		this.model = new DefaultTableModel(data, header);
		
		this.setModel(model);
	}
}
