package tw.cactus.CMember.repository;

import java.util.List;

import tw.cactus.login.model.CactusBean;

public interface CactusRepositoryInterface {
	
	void insertCMember(String userName, String email, String password);
	void updateCMember(CactusBean c1);
	void deleteCmember(CactusBean c1);
	List<CactusBean> findCMembers();
	
	

}