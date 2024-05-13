package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class DAOCampus {
	
	public DAOCampus() {
	}

	public Vector<MIndex> getList(String fileName) {
		Vector<MIndex> campusList = new Vector<MIndex>();
		try {
			File file = new File("data/"+fileName);
			Scanner scanner = new Scanner(file);
			String line = null;
			while (scanner.hasNext()) {
				line = scanner.nextLine();
				
				MIndex mCampus = new MIndex();
				String[] wordList = line.split(" ");
				mCampus.setId(Integer.parseInt(wordList[0]));
				mCampus.setName(wordList[1]);
				mCampus.setFileName(wordList[2]);
				
				campusList.add(mCampus);
			}
			scanner.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return campusList;
	}

}
