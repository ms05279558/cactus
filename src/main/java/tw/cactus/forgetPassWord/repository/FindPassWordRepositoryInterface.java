package tw.cactus.forgetPassWord.repository;

import tw.cactus.login.model.CactusBean;

public interface FindPassWordRepositoryInterface {
	CactusBean checkByEmail(String email);

	void updatePassword(CactusBean c1);

}
