package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import control.CIndex;
import control.CLecture;
import model.MIndex;
import model.MLecture;

public class VLectureTable extends JScrollPane implements IIndexTable {
	// attributes
	private static final long serialVersionUID = 1L;
	// components
	private JTable table;
	private DefaultTableModel model;
	private Vector<MLecture> mLectureList;
	
	// associations
	private IIndexTable next;
	public void setNext(IIndexTable next) { this.next = next; }
	
	public VLectureTable() {
		// components
		// table
		this.table = new JTable();
		this.setViewportView(this.table);
		
		// model
		String[] header = {"아이디", "강좌명", "강사", "학점", "시간"};	
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
		CLecture cLecture = new CLecture();
		this.mLectureList = cLecture.getList(fileName);
		this.model.setRowCount(0);
		
		for (MLecture mLecture: this.mLectureList) {
			String[] columns = new String[5];
			columns[0] = mLecture.getId();
			columns[1] = mLecture.getTitle();		
			columns[2] = mLecture.getLecturer();	
			columns[3] = mLecture.getCredit();	
			columns[4] = mLecture.getTime();	
			this.model.addRow(columns);
		}
		this.showNext(0);
	}
	
	private void showNext(int rowIndex) {
	}	
	
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
