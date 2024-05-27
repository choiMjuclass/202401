package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import model.MLecture;

public class VControlPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	// components
	private JButton buttonLeft;
	private JButton buttonRight;
	
	// associations
	private VLectureTable vRectureTableLeft;
	private VLectureTable vRectureTableRight;
	
	public VControlPanel() {
		BoxLayout layoutManager = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layoutManager);
		
		ActionHandler actionHandler = new ActionHandler();
		
		this.buttonLeft= new JButton("<<");
		this.buttonLeft.addActionListener(actionHandler);
		this.add(this.buttonLeft);
		
		this.buttonRight= new JButton(">>");
		this.buttonRight.addActionListener(actionHandler);
		this.add(this.buttonRight);
	}
	
	public void initialize() {
		// TODO Auto-generated method stub		
	}

	public void associate(VLectureTable vRectureTableLeft, VLectureTable vRectureTableRight) {
		// TODO Auto-generated method stub
		this.vRectureTableLeft = vRectureTableLeft;
		this.vRectureTableRight = vRectureTableRight;		
	}
	private void moveLeft() {
		// TODO Auto-generated method stub
		Vector<MLecture> selectedList = this.vRectureTableRight.getSelectedList();
		this.vRectureTableLeft.addSelectedList(selectedList);
	}
	private void moverRight() {
		// TODO Auto-generated method stub
		Vector<MLecture> selectedList = this.vRectureTableLeft.getSelectedList();
		this.vRectureTableRight.addSelectedList(selectedList);
	}
	
	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==buttonLeft) {
				moveLeft();
			} else if (e.getSource()==buttonRight) {
				moverRight();				
			}
		}		
	}
}
