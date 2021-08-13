package tw.cactus.login.service.impl;

import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.cactus.login.service.LoginServiceInterface;
import tw.cactus.login.model.CactusBean;
import tw.cactus.login.repository.LoginRepositoryInterface;

@Service
@Transactional
public class LoginService implements LoginServiceInterface{
	
	@Autowired
	LoginRepositoryInterface loginRepositoryInterface;
	
	@Override
	public boolean checkLogin(String userName, String password) {
		
		CactusBean c1 = loginRepositoryInterface.loadByUsername(userName);
		
		if(c1.getPassword().equals(password)) {
			return true;
		}
		return false;
	}
}
