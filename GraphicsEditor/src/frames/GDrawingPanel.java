package frames;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.Vector;

import javax.swing.JPanel;

import shapeTools.GShape;
import shapeTools.GShape.EAnchors;
import shapeTools.GShape.EDrawingStyle;

public class GDrawingPanel extends JPanel {
	// attributes
	private static final long serialVersionUID = 1L;
	private enum EDrawingState {
		eIdle,
		e2PState,
		eNPState,
		eTransformation
	}
	private EDrawingState eDrawingState;
//	private enum ETransformation {
//		eDraw,
//		eMove,
//		eResize,
//		eRotate
//	}
//	private ETransformation eTransformation;
	
	// components
	private Vector<GShape> shapes;
	private GShape shapeTool;
	private GShape currentShape;
	
	// constructors
	public GDrawingPanel() {
		// attributes
		this.setBackground(Color.WHITE);
		this.eDrawingState = EDrawingState.eIdle;
//		this.eTransformation = null;
		// components
		MouseEventHandler mouseEventHandler = new MouseEventHandler();
		this.addMouseListener(mouseEventHandler);		
		this.addMouseMotionListener(mouseEventHandler);
		// dynamic components
		this.shapes = new Vector<GShape>();
	}
	public void intitialize() {
	}
	
	// setters and getters	
	public void setShapeTool(GShape shapeTool) {
		this.shapeTool = shapeTool;		
	}
	public Vector<GShape> getShapes() { return this.shapes; }
	public void setShapes(Object object) { this.shapes = (Vector<GShape>)object; }
	
	// methods

	public void paint(Graphics graphics) {
		for (GShape shape: shapes) {
			shape.draw(graphics);
		}		
	}

	private BufferedImage bufferedImage;
	private Graphics2D graphics;
	private void startDrawing(int x, int y) {
		bufferedImage = new BufferedImage(
				this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
		
		graphics = (Graphics2D) bufferedImage.getGraphics();
		graphics.setColor(this.getForeground());
		graphics.setBackground(this.getBackground());
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		
		currentShape = shapeTool.clone();
		currentShape.setOrigin(x, y);
	}
	private void keepDrawing(int x, int y) {
		currentShape.movePoint(x, y);
		
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		currentShape.drag(graphics);
		getGraphics().drawImage(bufferedImage, 0, 0, this.getWidth(), this.getHeight(), this);
	}
	private void ContinueDrawing(int x, int y) {
		currentShape.addPoint(x, y);
	}
	private void stopDrawing(int x, int y) {
//		currentShape.addPoint(x, y);
		shapes.add(currentShape);
		currentShape.setSelected(getGraphics());
	}
	
	private GShape onShape(int x, int y) {
		for (GShape shape: this.shapes) {
			boolean isShape = shape.onShape(x, y);
			if (isShape) {
				return shape;
			}
		}
		return null;		
	}
	
	private void changeCursor(int x, int y) {
		GShape shape = this.onShape(x, y);
		if (shape == null) {
			this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		} else {
			this.setCursor(shape.getCursor());
		}
		
	}
	
	private class MouseEventHandler implements MouseListener, MouseMotionListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 1) {
				mouse1Clicked(e);
			} else if (e.getClickCount() == 2) {
				mouse2Clicked(e);
			}
		}
		
		private void mouse1Clicked(MouseEvent e) {
			if (eDrawingState == EDrawingState.eIdle) {
				if (shapeTool.getEDrawingStyle() == EDrawingStyle.eNPStyle) {
					startDrawing(e.getX(), e.getY());
					eDrawingState = EDrawingState.eNPState;
				}
			} else if (eDrawingState == EDrawingState.eNPState) {
				ContinueDrawing(e.getX(), e.getY());
				eDrawingState = EDrawingState.eNPState;
			}			
		}
		private void mouse2Clicked(MouseEvent e) {
			if (eDrawingState == EDrawingState.eNPState) {
				stopDrawing(e.getX(), e.getY());
				eDrawingState = EDrawingState.eIdle;
			}		

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			if (eDrawingState == EDrawingState.eIdle) {
				changeCursor(e.getX(), e.getY());				
			} else if (eDrawingState == EDrawingState.eNPState) {
				keepDrawing(e.getX(), e.getY());
				eDrawingState = EDrawingState.eNPState;
			}		
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			if (eDrawingState == EDrawingState.eIdle) {
				currentShape = onShape(e.getX(), e.getY());
				if (currentShape == null) {
					if (shapeTool.getEDrawingStyle() == EDrawingStyle.e2PStyle) {
						startDrawing(e.getX(), e.getY());
						eDrawingState = EDrawingState.e2PState;
					}
				} else {
					if (currentShape.getSelectedAnchor() == EAnchors.eMM) {
						currentShape.startMove(getGraphics(), e.getX(), e.getY());
					} else if (currentShape.getSelectedAnchor() == EAnchors.eRR) {
						
					} else {
						currentShape.startResize(getGraphics(), e.getX(), e.getY());
					}
					eDrawingState = EDrawingState.eTransformation;
				}
			}
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			if (eDrawingState == EDrawingState.e2PState) {
				keepDrawing(e.getX(), e.getY());
			} else if (eDrawingState == EDrawingState.eTransformation) {
				if (currentShape.getSelectedAnchor() == EAnchors.eMM) {
					currentShape.keepMove(getGraphics(), e.getX(), e.getY());
				} else if (currentShape.getSelectedAnchor() == EAnchors.eRR) {
					
				} else {
					currentShape.keepResize(getGraphics(), e.getX(), e.getY());
				}
			}
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			if (eDrawingState == EDrawingState.e2PState) {
				stopDrawing(e.getX(), e.getY());
				eDrawingState = EDrawingState.eIdle;
			} else if (eDrawingState == EDrawingState.eTransformation) {
				if (currentShape.getSelectedAnchor() == EAnchors.eMM) {
					currentShape.stopMove(getGraphics(), e.getX(), e.getY());
				} else if (currentShape.getSelectedAnchor() == EAnchors.eRR) {
					
				} else {
					currentShape.stopResize(getGraphics(), e.getX(), e.getY());
				}
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
