package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MCampus {
	
	public MCampus() {
	}

	public void getList() {
		try {
			File file = new File("data/root");
			Scanner scanner = new Scanner(file);
			String word = scanner.next();
			scanner.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
