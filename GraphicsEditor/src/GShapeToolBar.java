import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

public class GShapeToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;

	private JRadioButton rectangleButton;
	private JRadioButton ovalButton;
	private JRadioButton lineButton;
	private JRadioButton polygonButton;
	
	public GShapeToolBar() {
		ButtonGroup buttonGroup = new ButtonGroup();
		
		this.rectangleButton = new JRadioButton("rectangle");
		this.add(rectangleButton);
		buttonGroup.add(rectangleButton);
		
		this.ovalButton = new JRadioButton("oval");
		this.add(ovalButton);
		buttonGroup.add(ovalButton);
		
		this.lineButton = new JRadioButton("line");
		this.add(lineButton);
		buttonGroup.add(lineButton);
		
		this.polygonButton = new JRadioButton("polygon");
		this.add(polygonButton);
		buttonGroup.add(polygonButton);
	}
}
