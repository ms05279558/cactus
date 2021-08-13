package tw.cactus.login.repository.impl;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import tw.cactus.login.model.CactusBean;
import tw.cactus.login.repository.LoginRepositoryInterface;

public class LoginRepository implements LoginRepositoryInterface {

	@Autowired
	EntityManager entityManager;
	
	@Override
	public CactusBean loadByUsername(String userName) {
		String hql = "from cactus where username=:userName";
		Query<CactusBean> query = (Query<CactusBean>) entityManager.createQuery(hql, CactusBean.class);
		query.setParameter("userName", userName);

		
		CactusBean result = query.uniqueResult();
		return result;
	}

}
