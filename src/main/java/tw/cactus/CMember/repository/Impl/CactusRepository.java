package tw.cactus.CMember.repository.Impl;

import java.util.List;

import javax.persistence.EntityManager;

import tw.cactus.CMember.repository.CactusRepositoryInterface;
import tw.cactus.login.model.CactusBean;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties.Session;
import org.springframework.stereotype.Repository;

@Repository
public class CactusRepository implements CactusRepositoryInterface {

	
	@Autowired
	EntityManager entityManager;
	
	@Override
	public List<CactusBean> findCMembers(){
		
		String hql ="FROM CactusBean";
		return em.createQuery(hql, CactusBean.class).getResultList();
	}
	

	public void update(String username, String name, String email, String password, String birth, String cellphone,
			String gender /* ,String verification_code,Boolean enabled */) { // 改後台資料
				
		CactusBean resultBean1 = (CactusBean) entityManager.createQuery("from cactus c where c.username = :userName").setParameter("userName", username).getSingleResult();
			
		resultBean1.setPassword(password);
		resultBean1.setEmail(email);
		resultBean1.setName(name);
		resultBean1.setBirth(birth);
		resultBean1.setCellphone(cellphone);
		resultBean1.setGender(gender);
//		resultBean1.setGender(verification_code);
//		resultBean1.setEnabled(enabled);
		entityManager.persist(resultBean1);

	}


	@Override
	public void insertCMember(String userName, String email, String password) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateCMember(CactusBean c1) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteCmember(CactusBean c1) {
		// TODO Auto-generated method stub
		
	}
}
