package tw.cactus.signUp.service.impl;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import tw.cactus.login.model.CactusBean;
import tw.cactus.signUp.repository.SignUpRepositoryInterface;
import tw.cactus.signUp.service.SignUpServiceInterface;

@Service
@Transactional
public class SignUpService implements SignUpServiceInterface {
	
	@Autowired
	SignUpRepositoryInterface signUpRepositoryInterface;
	
	@Override
	public boolean checkSignUp(String userName,String email) {
		
		CactusBean c1 = signUpRepositoryInterface.loadByEmail(email);
		CactusBean c2 = signUpRepositoryInterface.loadByUsername(userName);		
		if(c1 == null && c2 == null) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean sendEmail(String email) throws UnsupportedEncodingException, MessagingException {
		return sendEmail(email);
	}

	@Override
	public boolean insertRegister(String userName, String email, String password) {
		boolean flowControl = false;
		signUpRepositoryInterface.insertRegister(userName, email, password);
		CactusBean c1 = signUpRepositoryInterface.loadByUsername(userName);
		if(c1 != null) {
			return true;
		}
		
		return flowControl;
	}

	@Autowired
	private JavaMailSender mailSender;
	
	private boolean sendingEmail(String email) throws UnsupportedEncodingException, MessagingException {
		String SendEmail = "CactusOfficial88@gmail.com";
		String CactusName = "Cactus線上教學平台";
		// SimpleMailMessage message = new SimpleMailMessage();
		// (SendEmail,CactusName);
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		helper.setFrom(SendEmail, CactusName);
		helper.setTo(email);
		helper.setText("您已註冊成功,感謝您");
		helper.setSubject("Cactus註冊成功");
		
		try {
			mailSender.send(message);
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
