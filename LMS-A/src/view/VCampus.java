package view;

import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import control.CCampus;
import model.MCampus;

public class VCampus extends JTable {
	// attributes
	private static final long serialVersionUID = 1L;
	
	// components
	private DefaultTableModel model;
	// methods
	public VCampus() {
		String header[] = {	"아이디", "캠퍼스" };
		this.model = new DefaultTableModel(null, header);
		this.setModel(this.model);		

		CCampus cCampus = new CCampus();
		Vector<MCampus> mCampusList = cCampus.getList();
		
		for (MCampus mCampus: mCampusList) {
			String[] row = new String[2];
			row[0] = String.valueOf(mCampus.getId());
			row[1] = mCampus.getName();
			this.model.addRow(row);
		}
		
//		this.model.addColumn(header);
//		this.model.addRow(data);
	}
	
	public void show() {
		this.updateUI();
	}

}
