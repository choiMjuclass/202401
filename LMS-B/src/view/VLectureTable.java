package view;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VLectureTable extends JScrollPane {
	private static final long serialVersionUID = 1L;
	
	private JTable table;
	
	public VLectureTable() {
		this.table = new JTable();
		this.setViewportView(table);
	}

}
