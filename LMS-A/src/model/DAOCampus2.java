package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class DAOCampus2 {
	
	public DAOCampus2() {
	}

	public Vector<MLecture> getList(String fileName) {
		Vector<MLecture> lectureList = new Vector<MLecture>();
		try {
			File file = new File("data/"+fileName);
			Scanner scanner = new Scanner(file);
			String line = null;
			while (scanner.hasNext()) {
				line = scanner.nextLine();
				
				MLecture mLecture = new MLecture();
				String[] wordList = line.split(" ");
				mLecture.setId(wordList[0]);
				mLecture.setName(wordList[1]);
				mLecture.setLecturer(wordList[2]);
				mLecture.setCredit(wordList[3]);
				mLecture.setTime(wordList[4]);			
				lectureList.add(mLecture);
			}
			scanner.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lectureList;
	}

}
