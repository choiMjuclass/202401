package control;

import java.util.Vector;

import model.DAOIndex;
import model.MIndex;

public class CIndex {

	private DAOIndex daoCampus;
	public CIndex() {
	}

	public Vector<MIndex> getList(String fileName) {
		this.daoCampus = new DAOIndex();
		Vector<MIndex> mCampusList = this.daoCampus.getList(fileName);
		return mCampusList;
	}

}
