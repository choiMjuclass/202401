package control;

import java.util.Vector;

import model.DAOCampus;
import model.MIndex;

public class CIndex {

	private DAOCampus daoCampus;
	public Vector<MIndex> getList(String fileName) {
		this.daoCampus = new DAOCampus();
		Vector<MIndex> mCampusList = this.daoCampus.getList(fileName);
		return mCampusList;
	}

}
