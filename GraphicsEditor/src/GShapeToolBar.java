import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

public class GShapeToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public enum EShapeButtons {
		eRectangle,
		eOval, 
		eLine,
		ePolygon
	}
	private JRadioButton rectangleButton;
	private JRadioButton ovalButton;
	private JRadioButton lineButton;
	private JRadioButton polygonButton;
	
	public GShapeToolBar(GMainFrame.ShapeActionHandler shapeActionHandler) {
		ButtonGroup buttonGroup = new ButtonGroup();
		
		this.rectangleButton = new JRadioButton("rectangle");
		this.rectangleButton.addActionListener(shapeActionHandler);
		this.add(rectangleButton);
		buttonGroup.add(rectangleButton);
		
		this.ovalButton = new JRadioButton("oval");
		this.ovalButton.addActionListener(shapeActionHandler);
		this.add(ovalButton);
		buttonGroup.add(ovalButton);
		
		this.lineButton = new JRadioButton("line");
		this.lineButton.addActionListener(shapeActionHandler);
		this.add(lineButton);
		buttonGroup.add(lineButton);
		
		this.polygonButton = new JRadioButton("polygon");
		this.polygonButton.addActionListener(shapeActionHandler);
		this.add(polygonButton);
		buttonGroup.add(polygonButton);
	}
}
