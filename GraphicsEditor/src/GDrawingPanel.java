import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GDrawingPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public GDrawingPanel() {
		this.setBackground(Color.gray);
	}
	
	public void paint(Graphics graphics) {
		graphics.drawRect(20, 30, 20, 30);
	}

}
