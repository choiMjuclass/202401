package main;
import view.VSugangSincheong;

public class LMS {
	// attributes
	
	// components
	private VSugangSincheong vSugangSincheong;
	
	// constructor
	public LMS() {
		this.vSugangSincheong = new VSugangSincheong();
	}
	public void initialize() {
		this.vSugangSincheong.initialize();
	}
	
	// methods
	public void run() {
		this.vSugangSincheong.run();
	}
}
