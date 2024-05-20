package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import control.CCampus;
import model.MCampus;

public class VIndexTable extends JScrollPane {
	// attributes
	private static final long serialVersionUID = 1L;
	private boolean bInitialized;
	// components
	private JTable table;
	private DefaultTableModel model;
	private Vector<MCampus> mCampusList;
	
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
		
		// set listener
		MouseHandler mouseHandler = new MouseHandler();
		this.table.addMouseListener(mouseHandler);

	}
	public void initialize() {
	}
	
	public void show(String fileName) {
		// get data
		CCampus cCampus = new CCampus();
		this.mCampusList = cCampus.getList(fileName);
		this.model.setRowCount(0);
		
		for (MCampus mCampus: this.mCampusList) {
			String[] row = new String[2];
			row[0] = String.valueOf(mCampus.getId());
			row[1] = mCampus.getName();			
			this.model.addRow(row);
		}
		this.showNext(0);
	}
	
	private void showNext(int rowIndex) {
		if (this.next != null) {
			this.next.show(this.mCampusList.get(rowIndex).getLink());
		}		
	}	
//	private class TableModelHandler implements TableModelListener {
//		@Override
//		public void tableChanged(TableModelEvent e) {
//			// TODO Auto-generated method stub
//			int rowIndex = e.getFirstRow();
//			showNext(rowIndex);
//		}
//		
//	}
	
	private class MouseHandler implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			int row = table.getSelectedRow();
			showNext(row);			
		}
		@Override
		public void mousePressed(MouseEvent e) {
		}
		@Override
		public void mouseReleased(MouseEvent e) {
		}
		@Override
		public void mouseEntered(MouseEvent e) {
		}
		@Override
		public void mouseExited(MouseEvent e) {
		}
		
	}
}
