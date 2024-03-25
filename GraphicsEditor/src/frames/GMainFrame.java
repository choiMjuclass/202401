package frames;
import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import global.Constants.EShapeButtons;

public class GMainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private GMenuBar menuBar;
	private GShapeToolBar shapeToolBar;
	private GDrawingPanel drawingPanel;
	
	// constructor
	public GMainFrame() {
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		LayoutManager layoutManager = new FlowLayout();
//		LayoutManager layoutManager = new CardLayout();
		LayoutManager layoutManager = new BorderLayout();
//		LayoutManager layoutManager = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
		this.setLayout(layoutManager);
	
		this.menuBar = new GMenuBar();
		this.setJMenuBar(this.menuBar);
		
		ShapeActionHandler shapeActionHandler = new ShapeActionHandler();
		this.shapeToolBar = new GShapeToolBar(shapeActionHandler);
		this.add(shapeToolBar, BorderLayout.NORTH);
		
		this.drawingPanel = new GDrawingPanel();
		this.add(drawingPanel, BorderLayout.CENTER);
	}
	
	public class ShapeActionHandler implements ActionListener {;
		@Override
		public void actionPerformed(ActionEvent e) {
			EShapeButtons eShapeButton = EShapeButtons.valueOf(e.getActionCommand());
			drawingPanel.setShapeTool(eShapeButton.getShapeTool());
		}
		
	}
}
