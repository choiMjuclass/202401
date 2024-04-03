
public class Main {

	private MicroProcessor microProcessor;
	private Main() {
		this.microProcessor = new MicroProcessor();
	}
	private void initialize() {
		this.microProcessor.initialize();
	}
	private void run() {
		this.microProcessor.run();
	} 
	private void finish() {
		this.microProcessor.finish();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.initialize();
		main.run();
		main.finish();
	}
}
