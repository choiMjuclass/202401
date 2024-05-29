package control;

import java.util.Vector;

import model.DAOIndex;
import model.DAOIndex2;
import model.MIndex;
import model.MLecture;

public class CLecture {

	private DAOIndex2 daoCampus;
	public CLecture() {
	}

	public Vector<MLecture> getList(String fileName) {
		this.daoCampus = new DAOIndex2();
		Vector<MLecture> mLectureList = this.daoCampus.getList(fileName);
		return mLectureList;
	}

}
