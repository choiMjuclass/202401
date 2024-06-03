package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VLoginDialog extends JDialog {
	private static final long serialVersionUID = 1L;
	
	private JLabel labelId;
	private JTextField textId;
	private JLabel labelPassword;
	private JPasswordField textPassword;
	
	private JButton buttonOk;
	private JButton buttonCancel;
	
	
	public VLoginDialog() {
		
	}
	
	private void doOk() {

	}
	
	private void doCancel() {
		
	}
	private class ActionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
