package view;

import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class VControlPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JButton buttonRight;
	private JButton buttonLeft;
	
	public VControlPanel() {
		JPanel yGap = new JPanel();
		yGap.setSize(0, 5);
		this.add(yGap);

		LayoutManager layoutManager = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layoutManager);
		
		this.buttonRight = new JButton("<<");
		this.add(buttonRight);
		
		yGap = new JPanel();
		yGap.setSize(0, 1);
		this.add(yGap);
		
		this.buttonLeft = new JButton(">>");
		this.add(buttonLeft);		
		
		yGap = new JPanel();
		yGap.setSize(0, 5);
		this.add(yGap);
	}

	public void initialize() {
		// TODO Auto-generated method stub
		
	}
}
