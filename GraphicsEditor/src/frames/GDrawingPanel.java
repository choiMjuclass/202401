package frames;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

import shapeTools.GShape;

public class GDrawingPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private GShape shapeTool;
	
	public GDrawingPanel() {
		this.setBackground(Color.gray);
		MouseEventHandler mouseEventHandler = new MouseEventHandler();
		this.addMouseListener(mouseEventHandler);		
		this.addMouseMotionListener(mouseEventHandler);
	}
	public void setShapeTool(GShape shapeTool) {
		this.shapeTool = shapeTool;		
	}
	
	public void paint(Graphics graphics) {
	}

	private class MouseEventHandler implements MouseListener, MouseMotionListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("mouseClicked");
		}
		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("mousePressed");
			shapeTool.setP1(e.getX(), e.getY());
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println("mouseDragged");
			shapeTool.draw(getGraphics());
			shapeTool.setP2(e.getX(), e.getY());
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("mouseReleased");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			System.out.println(this.getClass().getEnclosingMethod());
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println(this.getClass().getEnclosingMethod());
		}
		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println(this.getClass().getEnclosingMethod());
		}		
	}


}
