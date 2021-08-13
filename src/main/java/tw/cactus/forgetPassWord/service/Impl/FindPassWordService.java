package tw.cactus.forgetPassWord.service.Impl;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import tw.cactus.forgetPassWord.repository.FindPassWordRepositoryInterface;
import tw.cactus.forgetPassWord.service.FindPassWordServiceInterface;
import tw.cactus.login.model.CactusBean;
import tw.cactus.login.repository.LoginRepositoryInterface;
import tw.cactus.login.service.LoginServiceInterface;

@Service
@Transactional
public class FindPassWordService implements FindPassWordServiceInterface {
	
	
		
		@Autowired
		FindPassWordRepositoryInterface findPassWordRepositoryInterface;
		
		@Override
		public boolean checkByEmail(String email) {			
			//boolean  = findPassWordServiceInterface.checkByEmail(email);
			
			if(findPassWordRepositoryInterface.checkByEmail(email) != null) 
				return true;	
			return false;
		}
		
//		if(c1.getEmail().equals(email)) {
//			return true;
//		}
//		return false;
//	}


		@Override
		public boolean sendEmail(String email) throws UnsupportedEncodingException, MessagingException {
			return sendEmail(email);
		}
		
		@Override
		public boolean save(String email, String password) {
			CactusBean c1 = findPassWordRepositoryInterface.checkByEmail(email);
			c1.setPassword(password);
			
			findPassWordRepositoryInterface.updatePassword(c1);
			
			CactusBean c2 = findPassWordRepositoryInterface.checkByEmail(email);
		
			return password.equals(c2.getPassword());
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
			helper.setText("請點選以下網址重新設定密碼" + "\n" + "http://localhost:8080/cactus/resetpassword%22");
			helper.setSubject("Cactus找回密碼");
			
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
