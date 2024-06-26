package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class DAOIndex {	// attributes
	// associations
	
	// constructors
	public DAOIndex() {
	}
	public void initialize() {
	}
	// methods
	public Vector<MIndex> getList(String fileName) {
		Vector<MIndex> mCampusList = new Vector<MIndex>();
		try {
			File file = new File("data/"+fileName+".txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				// deserialize
				String line = scanner.nextLine();
				String[] wordList = line.split(" ");
				
				MIndex mCampus = new MIndex();
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
