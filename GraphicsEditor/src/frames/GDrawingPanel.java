package frames;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

import shapeTools.GShapeTool;

public class GDrawingPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private GShapeTool shapeTool;
	
	public GDrawingPanel() {
		this.setBackground(Color.gray);
		MouseEventHandler mouseEventHandler = new MouseEventHandler();
		this.addMouseListener(mouseEventHandler);		
		this.addMouseMotionListener(mouseEventHandler);
	}
	public void setShapeTool(GShapeTool shapeTool) {
		this.shapeTool = shapeTool;		
	}
	
	public void paint(Graphics graphics) {
	}
	private void draw(int x, int y) {
		this.shapeTool.draw(this.getGraphics(), x, y, 20, 20);
	}
	private class MouseEventHandler implements MouseListener, MouseMotionListener {
		@Override
		public void mouseClicked(MouseEvent e) {
//			System.out.println(this.getEnclosingMethod());
		}
		@Override
		public void mousePressed(MouseEvent e) {
//			System.out.println(this.getClass().getEnclosingMethod());
			draw(e.getX(), e.getY());
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println(this.getClass().getEnclosingMethod());
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println(this.getClass().getEnclosingMethod());
			draw(e.getX(), e.getY());
			draw(e.getX(), e.getY());	
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
