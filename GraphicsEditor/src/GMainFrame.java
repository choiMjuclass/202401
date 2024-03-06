import javax.swing.JFrame;

public class GMainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private GMenuBar menuBar;
	
	// constructor
	public GMainFrame() {
		this.setSize(400, 600);
		
		this.menuBar = new GMenuBar();
		this.setJMenuBar(this.menuBar);
	}


}
