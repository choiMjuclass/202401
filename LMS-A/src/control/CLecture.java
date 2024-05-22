package control;

import java.util.Vector;

import model.DAOCampus;
import model.DAOCampus2;
import model.MIndex;
import model.MLecture;

public class CLecture {

	private DAOCampus2 daoCampus;
	public Vector<MLecture> getList(String fileName) {
		this.daoCampus = new DAOCampus2();
		Vector<MLecture> mLectureList = this.daoCampus.getList(fileName);
		return mLectureList;
	}
}
