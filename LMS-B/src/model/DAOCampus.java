package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class DAOCampus {	// attributes
	// associations
	
	// constructors
	public DAOCampus() {
	}
	public void initialize() {
	}
	// methods
	public Vector<MCampus> getList() {
		Vector<MCampus> mCampusList = new Vector<MCampus>();
		try {
			File file = new File("data/root");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				// deserialize
				String line = scanner.nextLine();
				String[] wordList = line.split(" ");
				
				MCampus mCampus = new MCampus();
				mCampus.setId(Integer.parseInt(wordList[0]));
				mCampus.setName(wordList[1]);
				mCampus.setLink(wordList[2]);
				
				mCampusList.add(mCampus);				
			}
			scanner.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mCampusList;
	}
}
