package global;

import shapeTools.GOval;
import shapeTools.GRectangle;
import shapeTools.GShape;

public class Constants {
	public enum EShapeButtons {
		eRectangle("rectangle", new GRectangle()),
		eOval("oval", new GOval()), 
		eLine("line", new GRectangle()),
		eLine1("line", new GRectangle()),
		ePolygon("polygon", new GRectangle());
		
		private String text;
		private GShape shapeTool;
		private EShapeButtons(String text, GShape shapeTool) {
			this.text = text;
			this.shapeTool = shapeTool;
		}
		public String getText() { return this.text; }
		public GShape getShapeTool() { return this.shapeTool; }
	}
}
