package tw.cactus.login.service;

import tw.cactus.login.model.CactusBean;

public interface LoginServiceInterface {
	boolean checkLogin(String username, String password);
	
}
