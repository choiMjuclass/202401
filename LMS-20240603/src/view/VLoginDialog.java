package view;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

public class VLoginDialog extends JDialog {
	private static final long serialVersionUID = 1L;

	private JButton buttonOk;
	private JButton buttonCancel;
	
	public VLoginDialog() {
		this.setSize(400, 200);
		LayoutManager layoutManager = new FlowLayout();
		this.setLayout(layoutManager);
		
		// TODO Auto-generated constructor stub
		ActionHandler actionHandler = new ActionHandler();
		this.buttonOk = new JButton("OK");
		this.buttonOk.addActionListener(actionHandler);
		this.add(this.buttonOk);
		
		this.buttonCancel = new JButton("Cancel");
		this.buttonCancel.addActionListener(actionHandler);
		this.add(this.buttonCancel);		
	}
	private void doOk() {
	}
	private void doCancel() {
	}
	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == buttonOk) {
				doOk();
			} else if (e.getSource() == buttonOk) {
				doCancel();
			}			
			dispose();
		}		
	}
}
