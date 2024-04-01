package frames;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

import shapeTools.GShape;

public class GDrawingPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private boolean bDrawing;
	private Vector<GShape> shapes;
	private GShape shapeTool;
	private GShape currentShape;
	
	public GDrawingPanel() {
		this.setBackground(Color.gray);
		MouseEventHandler mouseEventHandler = new MouseEventHandler();
		this.addMouseListener(mouseEventHandler);		
		this.addMouseMotionListener(mouseEventHandler);
		
		this.bDrawing = false;
		
		this.shapes = new Vector<GShape>();
	}
	public void setShapeTool(GShape shapeTool) {
		this.shapeTool = shapeTool;		
	}
	
	public void paint(Graphics graphics) {
		for (GShape shape: shapes) {
			shape.draw(graphics);
		}		
	}

	private class MouseEventHandler implements MouseListener, MouseMotionListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!bDrawing) {
				currentShape = shapeTool.clone();
				currentShape.setP1(e.getX(), e.getY());
				bDrawing = true;
			} else {
				shapes.add(currentShape);
				bDrawing = false;
			}
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			if (bDrawing) {
				currentShape.setP2(e.getX(), e.getY());
				currentShape.drag(getGraphics());
			}		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			if (!bDrawing) {
				currentShape = shapeTool.clone();
				currentShape.setP1(e.getX(), e.getY());
				bDrawing = true;
			}
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			if (bDrawing) {
				currentShape.setP2(e.getX(), e.getY());
				currentShape.drag(getGraphics());
			}
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			if (bDrawing) {
				shapes.add(currentShape);
				bDrawing = false;
			}
		}


		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("mousemouseEntered");
		}
		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("mousemouseExited");
		}		
	}


}
