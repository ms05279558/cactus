package tw.cactus.signUp.repository;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import tw.cactus.login.model.CactusBean;

public interface SignUpRepositoryInterface {

	CactusBean loadByEmail(String email);
	CactusBean loadByUsername(String userName);
//	void sendForgotPasswordEmail(String email);
	void insertRegister(String userName, String email, String password);

}
