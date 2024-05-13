package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import control.CIndex;
import model.MIndex;

public class VIndexTable extends JScrollPane {
	// attributes
	private static final long serialVersionUID = 1L;
	
	// components
	private JTable table;
	private DefaultTableModel model;
	
	// associations
	private VIndexTable next;	
	public void setNext(VIndexTable next) { this.next = next; }
	
	// methods
	public VIndexTable() {
		// generate Table as a Component
		this.table = new JTable();
		this.setViewportView(this.table);
		
		MouseHandler mouseHandler = new MouseHandler();
		this.table.addMouseListener(mouseHandler);
		
		// associate the table with a Model
		String header[] = {	"아이디", "캠퍼스" };
		this.model = new DefaultTableModel(null, header);
		this.table.setModel(this.model);
	}
	
	public void show(String fileName) {
		// get data from CCampus
		CIndex cIndex = new CIndex();
		Vector<MIndex> mIndexList = cIndex.getList(fileName+".txt");
		// set data to Model
		for (MIndex mIndex: mIndexList) {
			String[] row = new String[2];
			row[0] = String.valueOf(mIndex.getId());
			row[1] = mIndex.getName();
			this.model.addRow(row);
		}		
		this.updateUI();
		
		if (this.next != null) {
			this.next.show(mIndexList.get(0).getFileName());
		}
	}
	
	private void showNext(int selectedIndex) {
		if (this.next != null) {
			this.next.show(mIndexList.get(0).getFileName());
		}
	}
	
	private class MouseHandler implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			showNext(table.getSelectedRow());
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
