package control;

import model.DataAccessObject;
import model.MLogin;
import model.MModel;
import valueObject.VLogin;

public class CLogin {

	public boolean validate(VLogin vLogin) {
		boolean bLoginSuccess = false;
		
		DataAccessObject dataAccessObject = new DataAccessObject();
		MModel mModel = dataAccessObject.getAModel("userid", MLogin.class, vLogin.getUserId());
		
		if (mModel != null) {
			MLogin mLogin = (MLogin) mModel;
			if (vLogin.getPassword().contentEquals(mLogin.getPassword())) {
				bLoginSuccess = true;
			} else {
				// password mismatch
			}
		} else {
			// no userId - ȸ�� ���� �ȵ� Ȥ�� ���̵� �� �� �Է�
		}
		return bLoginSuccess;
	}
}