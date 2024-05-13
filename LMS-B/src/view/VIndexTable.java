package view;

import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import control.CCampus;
import model.MCampus;

public class VIndexTable extends JScrollPane {
	// attributes
	private static final long serialVersionUID = 1L;
	// components
	private JTable table;
	private DefaultTableModel model;
	// associations
	private VIndexTable next;
	public void setNext(VIndexTable next) { this.next = next; }
	
	public VIndexTable() {
		// components
		// table
		this.table = new JTable();
		this.setViewportView(this.table);
		// model
		String[] header = {"아이디", "캠퍼스"};	
		this.model = new DefaultTableModel(null, header);
		// associate
		this.table.setModel(model);		
	}
	public void initialize() {
	}
	
	public void show(String fileName) {
		// get data
		CCampus cCampus = new CCampus();
		Vector<MCampus> mCampusList = cCampus.getList(fileName);
		for (MCampus mCampus: mCampusList) {
			String[] row = new String[2];
			row[0] = String.valueOf(mCampus.getId());
			row[1] = mCampus.getName();
			
			this.model.addRow(row);
		}
		if (this.next != null) {
			this.next.show(mCampusList.get(0).getLink());
		}
	}


}