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
	// methods
	public VIndexTable() {
		// generate Table as a Component
		this.table = new JTable();
		this.setViewportView(this.table);
		
		// associate the table with a Model
		String header[] = {	"아이디", "캠퍼스" };
		this.model = new DefaultTableModel(null, header);
		this.table.setModel(this.model);
	}
	
	public void show(String fileName) {
		// get data from CCampus
		CCampus cCampus = new CCampus();
		Vector<MCampus> mCampusList = cCampus.getList(fileName);
		// set data to Model
		for (MCampus mCampus: mCampusList) {
			String[] row = new String[2];
			row[0] = String.valueOf(mCampus.getId());
			row[1] = mCampus.getName();
			this.model.addRow(row);
		}		this.updateUI();
	}

}
