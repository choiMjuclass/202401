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

public class VLectureTable extends JScrollPane implements IIndex {
	private static final long serialVersionUID = 1L;
	
	// components
	private JTable table;
	private DefaultTableModel model;
	private Vector<MLecture> mLectureList;
	
	// getters and setters
	public Vector<MLecture> getSelectedRows() {
		int index = this.table.getSelectedRow();
		int[] indicesSelected = this.table.getSelectedRows();
		Vector<MLecture> selectedList = new Vector<MLecture>();
		for (int selectedIndex: indicesSelected) {
			selectedList.add(this.mLectureList.get(selectedIndex));
		}
		return selectedList;
	}
	
	public void addSelectedRows(Vector<MLecture> selectedList) {
		for (MLecture mLecture: selectedList) {
			this.mLectureList.add(mLecture);
			String[] row = new String[5];
			row[0] = String.valueOf(mLecture.getId());
			row[1] = mLecture.getName();
			row[2] = mLecture.getLecturer();
			row[3] = String.valueOf(mLecture.getCredit());
			row[4] = mLecture.getTime();
			this.model.addRow(row);
		}
		this.table.updateUI();
	}
	// associations
	
	// methods
	public VLectureTable() {
		// generate Table as a Component
		this.table = new JTable();
		this.setViewportView(this.table);
		
		MouseHandler mouseHandler = new MouseHandler();
		this.table.addMouseListener(mouseHandler);
		this.newModel();
		
		this.mLectureList = new Vector<MLecture>();

	}
	public void initialize() {
		
	}
	private void newModel() {
		// associate the table with a Model
		String header[] = {	"아이디", "강좌명" , "강사", "학점", "시간"};
		this.model = new DefaultTableModel(null, header);
		this.table.setModel(this.model);		
	}
	
	public void show(String fileName) {
		// get data from CCampus
		CLecture cLecture = new CLecture();
		this.mLectureList = cLecture.getList(fileName+".txt");
		// set data to Model
		this.model.setRowCount(0);
		
		for (MLecture mLecture: this.mLectureList) {
			String[] row = new String[5];
			row[0] = String.valueOf(mLecture.getId());
			row[1] = mLecture.getName();
			row[2] = mLecture.getLecturer();
			row[3] = String.valueOf(mLecture.getCredit());
			row[4] = mLecture.getTime();
			this.model.addRow(row);
		}		
		this.updateUI();
		// default
		showNext(0);
	}
	
	private void showNext(int selectedIndex) {
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
