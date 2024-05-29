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

import control.CIndex;
import model.MIndex;

public class VIndexTable extends JScrollPane implements IIndexTable {
	// attributes
	private static final long serialVersionUID = 1L;
	// components
	private JTable table;
	private DefaultTableModel model;
	private Vector<MIndex> mIndexList;
	
	// associations
	private IIndexTable next;
	public void setNext(IIndexTable next) { this.next = next; }
	
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
		CIndex cIndex = new CIndex();
		this.mIndexList = cIndex.getList(fileName);
		this.model.setRowCount(0);
		
		for (MIndex mIndex: this.mIndexList) {
			String[] colums = new String[2];
			colums[0] = String.valueOf(mIndex.getId());
			colums[1] = mIndex.getName();			
			this.model.addRow(colums);
		}
		this.showNext(0);
	}
	
	private void showNext(int rowIndex) {
		if (this.next != null) {
			this.next.show(this.mIndexList.get(rowIndex).getLink());
		}		
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
