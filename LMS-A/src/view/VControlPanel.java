package view;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import model.MLecture;

public class VControlPanel extends JPanel {
	// attributes
	private static final long serialVersionUID = 1L;
	// components
	private JButton buttonRight;
	private JButton buttonLeft;
	
	// associations
	private VLectureTable vLectureTable1;
	private VLectureTable vLectureTable2;
	
	public VControlPanel() {
		JPanel yGap = new JPanel();
		yGap.setSize(0, 5);
		this.add(yGap);

		LayoutManager layoutManager = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layoutManager);
		
		ActionListener actionHandler = new ActionHandler();
		
		this.buttonRight = new JButton(">>");
		this.buttonRight.addActionListener(actionHandler);
		this.add(buttonRight);
		
		yGap = new JPanel();
		yGap.setSize(0, 1);
		this.add(yGap);
		
		this.buttonLeft = new JButton("<<");
		this.buttonLeft.addActionListener(actionHandler);
		this.add(buttonLeft);		
		
		yGap = new JPanel();
		yGap.setSize(0, 5);
		this.add(yGap);
	}

	public void initialize() {
		// TODO Auto-generated method stub
		
	}

	public void associate(VLectureTable vLectureTable1, VLectureTable vLectureTable2) {
		// TODO Auto-generated method stub
		this.vLectureTable1 = vLectureTable1;
		this.vLectureTable2 = vLectureTable2;
	}
	
	private void moveRight() {
		Vector<MLecture> selectedLectureList = this.vLectureTable1.getSelectedLectureList();
		this.vLectureTable2.addSelectedLectureList(selectedLectureList);
	}
	
	private void moveLeft() {
		Vector<MLecture> selectedLectureList = this.vLectureTable2.getSelectedLectureList();
		this.vLectureTable1.addSelectedLectureList(selectedLectureList);		
	}
	
	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == buttonRight) {
				moveRight();
			} else if (e.getSource() == buttonLeft) {
				moveLeft();				
			}
		}
		
	}
}
