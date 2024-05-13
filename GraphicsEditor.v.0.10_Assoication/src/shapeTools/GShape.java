package shapeTools;
import java.awt.Graphics;
import java.io.Serializable;

public abstract class GShape implements Serializable {
	private static final long serialVersionUID = 1L;

	public enum EDrawingStyle {
		e2PStyle,
		eNPStyle
	}
	public enum EAnchor {
		eMove,
		eResize,
		eRotate		
	}
	private EDrawingStyle eDrawingStyle;	
	protected int x1, y1, x2, y2, ox2, oy2;
	
	public EDrawingStyle getEDrawingStyle() {
		return this.eDrawingStyle;
	}
	
	public GShape(EDrawingStyle eDrawingStyle) {
		this.eDrawingStyle = eDrawingStyle;
		
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
		this.ox2 = 0;
		this.oy2 = 0;
	}
	
	public abstract GShape clone();
	public abstract void drag(Graphics graphics);
	public abstract void draw(Graphics graphics);
	
	public void setOrigin(int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;

		this.ox2 = x1;
		this.oy2 = y1;
		this.x2 = x1;
		this.y2 = y1;
	}
	public void movePoint(int x2, int y2) {
		this.ox2 = this.x2;
		this.oy2 = this.y2;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public void addPoint(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}

	public EAnchor onShape(int x, int y) {
		return null;
	}
}
