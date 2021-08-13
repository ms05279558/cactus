package tw.cactus.signUp.repository.Impl;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Repository;

import tw.cactus.login.model.CactusBean;
import tw.cactus.signUp.repository.SignUpRepositoryInterface;

@Repository
public class SignUpRepository implements SignUpRepositoryInterface{
	
	@Autowired
	EntityManager entityManager;
	
	public CactusBean loadByEmail(String email) {
		
		String hql = "from cactus where email=:email";
		Query query = entityManager.createQuery(hql, CactusBean.class).setParameter("email", email);
		CactusBean result;
		try {
			result = (CactusBean) query.getSingleResult();
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}
	
	@Override
	public CactusBean loadByUsername(String userName) {
		String hql = "from cactus where username=:userName";
		Query query = entityManager.createQuery(hql, CactusBean.class).setParameter("userName", userName);
		CactusBean result;
		try {
			result = (CactusBean) query.getSingleResult();
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}	


	
//	public void sendForgotPasswordEmail(String email) {
//
//		String SendEmail = "CactusOfficial88@gmail.com";
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setFrom(SendEmail);
//		message.setTo(email);
//		message.setText("請點選以下網址重新設定密碼" + "\n" + "http://localhost:8080/cactus/resetpassword");
//		message.setSubject("Cactus找回密碼");
//
//		mailSender.send(message);
//		System.out.println("Mail Send...");
//
//	}

	@Override
	public void insertRegister(String userName, String email, String password) {
		CactusBean c1 = new CactusBean();
		c1.setUsername(userName);
		c1.setPassword(password);
		c1.setEmail(email);
		entityManager.persist(c1);
	}

		
		
		
	}
	
	
	//註冊Check Email是否重複 這個不要亂刪我還要
//	public CactusBean checkEmail(CactusBean cBean) {
//		Query<CactusBean> query = (Query<CactusBean>)entityManager.createQuery
//		        ("from cactus where email=:email",CactusBean.class).setParameter("email", cBean.getEmail());
//		        CactusBean result = query.uniqueResult();
//		    if (result == null) {
//		        entityManager.persist(cBean); 
//		        return cBean;
//		    } else 
//		        System.out.println("Email已被註冊");
//		        return null;
//	}


