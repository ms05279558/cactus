package tw.cactus.signUp.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

public interface SignUpServiceInterface {
	boolean checkSignUp(String username, String email);

	boolean sendEmail(String email) throws UnsupportedEncodingException, MessagingException;

	boolean insertRegister(String userName, String email, String password);
}
