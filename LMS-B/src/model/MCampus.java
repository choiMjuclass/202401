package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MCampus {
	// attributes
	
	// components
	
	// associations
	
	// constructors
	public MCampus() {
	}
	public void initialize() {
	}
	// methods
	public void getList() {
		try {
			File file = new File("data/root");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String word = scanner.next();
			}
			scanner.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
