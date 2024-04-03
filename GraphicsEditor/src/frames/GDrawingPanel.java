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
	
	private enum EDrawingState {
		eIdle,
		eDrawing
	}
	private EDrawingState eDrawingState;
	
	private Vector<GShape> shapes;
	private GShape shapeTool;
	private GShape currentShape;
	
	public GDrawingPanel() {
		
		this.setBackground(Color.gray);
		MouseEventHandler mouseEventHandler = new MouseEventHandler();
		this.addMouseListener(mouseEventHandler);		
		this.addMouseMotionListener(mouseEventHandler);
		
		this.eDrawingState = EDrawingState.eIdle;
		
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
		}
		@Override
		public void mouseMoved(MouseEvent e) {
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			if (eDrawingState == EDrawingState.eIdle) {
				currentShape = shapeTool.clone();
				currentShape.setP1(e.getX(), e.getY());
				eDrawingState = EDrawingState.eDrawing;
			}
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			if (eDrawingState == EDrawingState.eDrawing) {
				currentShape.setP2(e.getX(), e.getY());
				currentShape.drag(getGraphics());
			}
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			if (eDrawingState == EDrawingState.eDrawing) {
				shapes.add(currentShape);
				eDrawingState = EDrawingState.eIdle;
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}
		@Override
		public void mouseExited(MouseEvent e) {
		}		
	}


}
