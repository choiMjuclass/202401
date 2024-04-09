package shapeTools;
import java.awt.Graphics2D;

public class GLine extends GShape {
	
	public GLine() {
		super(EDrawingStyle.e2PStyle);
	}	
	public GLine clone() {
		return new GLine();
	}
	
//	@Override
//	public void drag(Graphics2D graphics) {
//		Graphics2D graphics2D = (Graphics2D) graphics;
//		graphics2D.setXORMode(graphics2D.getBackground());
//		// erase old shape 
//		graphics2D.drawLine(x1, y1, ox2, oy2);	
//		// draw new shape
//		graphics2D.drawLine(x1, y1, x2, y2);	
//	}
	@Override
	public void draw(Graphics2D graphics) {
		// TODO Auto-generated method stub
		graphics.drawLine(x1, y1, ox2, oy2);	
		
	}
}
