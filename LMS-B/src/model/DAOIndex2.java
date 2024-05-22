package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class DAOIndex2 {	// attributes
	// associations
	
	// constructors
	public DAOIndex2() {
	}
	public void initialize() {
	}
	// methods
	public Vector<MLecture> getList(String fileName) {
		Vector<MLecture> mLectureList = new Vector<MLecture>();
		try {
			File file = new File("data/"+fileName+".txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				// deserialize
				String line = scanner.nextLine();
				String[] wordList = line.split(" ");
				
				MLecture mLecture = new MLecture();
				mLecture.setId(wordList[0]);
				mLecture.setTitle(wordList[1]);
				mLecture.setLecturer(wordList[2]);
				mLecture.setCredit(wordList[3]);
				mLecture.setTime(wordList[4]);
				
				mLectureList.add(mLecture);				
			}
			scanner.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mLectureList;
	}
}
