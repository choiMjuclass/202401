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
	private static final long serialVersionUID = 1L;
	
	private JButton buttonRight;
	private JButton buttonLeft;
	
	private VLectureTable vLectureTable1;
	private VLectureTable vLectureTable2;
	
	public VControlPanel() {
		JPanel yGap = new JPanel();
		yGap.setSize(0, 5);
		this.add(yGap);

		LayoutManager layoutManager = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layoutManager);
		
		ActionHandler actionHandler = new ActionHandler();
		this.buttonLeft = new JButton(">>");
		this.buttonLeft.setActionCommand(">>");
		this.buttonLeft.addActionListener(actionHandler);
		this.add(buttonLeft);		
		
		yGap = new JPanel();
		yGap.setSize(0, 1);
		this.add(yGap);
		
		this.buttonRight = new JButton("<<");
		this.buttonRight.setActionCommand("<<");
		this.buttonRight.addActionListener(actionHandler);
		this.add(buttonRight);
		
		yGap = new JPanel();
		yGap.setSize(0, 5);
		this.add(yGap);
	}
	
	public void associate(VLectureTable vLectureTable1, VLectureTable vLectureTable2) {
		this.vLectureTable1 = vLectureTable1;
		this.vLectureTable2 = vLectureTable2;
	}

	public void initialize() {
		// TODO Auto-generated method stub
		
	}
	
	private void moveRight() {
		Vector<MLecture> mLectureList = this.vLectureTable1.getSelectedRows();
		this.vLectureTable2.addSelectedRows(mLectureList);
	}
	private void moveLeft() {
		Vector<MLecture> mLectureList = this.vLectureTable2.getSelectedRows();
		this.vLectureTable2.addSelectedRows(mLectureList);
	}
	
	private class ActionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getActionCommand().equals(">>")) {
				moveRight();
			} else if (e.getActionCommand().equals("<<")) {
				moveLeft();				
			}
		}		
	}
}
