package tw.cactus.cactusbean;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;

import org.hibernate.query.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.bytebuddy.utility.RandomString;

@Repository
@Transactional
public class CactusBeanDao {

	@Autowired
	EntityManager entityManager;
	@Autowired
	CactusBean cb;
	@Autowired
	private JavaMailSender mailSender;

	// Login
	public boolean checkLogin(CactusBean users) {

		String hql = "from CactusBean where username=:user and password=:pwd";
		Query<CactusBean> query = (Query<CactusBean>) entityManager.createQuery(hql, CactusBean.class);
		query.setParameter("user", users.getUsername());
		query.setParameter("pwd", users.getPassword());

		CactusBean result = query.uniqueResult();

		if (result != null) {
			return true;
		}
		return false;
	}

	// 註冊
	public CactusBean registered(CactusBean cBean) {

        Query<CactusBean> query = (Query<CactusBean>)entityManager.createQuery
        ("from cactus where username=:username",CactusBean.class).setParameter("username", cBean.getUsername());
        CactusBean result = query.uniqueResult();
    if (result == null) {

        entityManager.persist(cBean); 
        return cBean;
    } else 
        System.out.println("帳號已被註冊");
        return null;
	}
	
	//註冊Check Email是否重複
	public CactusBean checkEmail(CactusBean cBean) {
		Query<CactusBean> query = (Query<CactusBean>)entityManager.createQuery
		        ("from cactus where email=:email",CactusBean.class).setParameter("email", cBean.getEmail());
		        CactusBean result = query.uniqueResult();
		    if (result == null) {
		        entityManager.persist(cBean); 
		        return cBean;
		    } else 
		        System.out.println("Email已被註冊");
		        return null;
	}
	// 刪單筆
	public void deleteCactus(String username) {

		cb.setUsername(username);
		entityManager.remove(entityManager.contains(cb) ? cb : entityManager.merge(cb));
		
	}

	// 查單筆

//	public CactusBean findByPrimaryKey2(String username) {
//
//		cb = entityManager.find(CactusBean.class, username);
//		return cb;
//	}
	
	public CactusBean findByUserName(String userName) { //查 .find (用primaryKey查)
		CactusBean c ;
		try {
			System.out.println(userName);
			c = (CactusBean) entityManager.createQuery("from cactus c where c.username = :userName").setParameter("userName", userName).getSingleResult();
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return c;
	}

//	public CactusBean findByUsername(String username) { // 查 .find (用primaryKey查)
//		return entityManager.find(CactusBean.class, username);
//	}

	public void update(String username, String name, String email, String password, String birth, String cellphone,
			String gender /* ,String verification_code,Boolean enabled */) { // 改
				
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

	// SendEmail
	public void sendEmail(String email) throws UnsupportedEncodingException, MessagingException {
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

		mailSender.send(message);
		System.out.println("Mail Send...");
	}

	public void sendForgotPasswordEmail(String email) {

		String SendEmail = "CactusOfficial88@gmail.com";
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(SendEmail);
		message.setTo(email);
		message.setText("請點選以下網址重新設定密碼" + "\n" + "http://localhost:8080/cactus/resetpassword");
		message.setSubject("Cactus找回密碼");

		mailSender.send(message);
		System.out.println("Mail Send...");

	}

//	public void register(CactusBean cb, String siteURL) 
//		 throws UnsupportedEncodingException, MessagingException {
//		CactusBean resultBean1 = entityManager.find(CactusBean.class, cb.getUsername()); 
//		resultBean1.setPassword(cb.getPassword());
//			     
//			    String randomCode = RandomString.make(64);
//			    resultBean1.setVerificationCode(randomCode);
//			    resultBean1.setEnabled(false);
//			     
//			    entityManager.persist(resultBean1);
//			     
//			    sendVerificationEmail(resultBean1, siteURL);
//    }

//	private void sendVerificationEmail(CactusBean cb, String siteURL)  throws MessagingException, UnsupportedEncodingException {
//	    String toAddress = cb.getEmail();
//	    String fromAddress = "CactusOfficial88@gmail.com";
//	    String senderName = "Cactus線上教學平台";
//	    String subject = "Please verify your registration";
//	    String content = "Dear [[name]],<br>"
//	            + "Please click the link below to verify your registration:<br>"
//	            + "<h3><a href=\"[[URL]]\" target=\"_self\">VERIFY</a></h3>"
//	            + "Thank you,<br>"
//	            + "Your company name.";
//	     
//	    MimeMessage message = mailSender.createMimeMessage();
//	    MimeMessageHelper helper = new MimeMessageHelper(message);
//	     
//	    helper.setFrom(fromAddress, senderName);
//	    helper.setTo(toAddress);
//	    helper.setSubject(subject);
//	     
//	    content = content.replace("[[name]]", cb.getUsername());
//	    String verifyURL = siteURL + "/verify?code=" + cb.getVerificationCode();
//	     
//	    content = content.replace("[[URL]]", verifyURL);
//	     
//	    helper.setText(content, true);
//	     
//	    mailSender.send(message);
//	     
//	     
//    }

	// 忘記密碼
	public CactusBean findByEmail(String email) {

//		cb = entityManager.find(CactusBean.class, email);
//		return cb;
		String hql = "from cactus c where c.email=:email";
		CactusBean c1 = null;
		c1 = entityManager.createQuery(hql, CactusBean.class).setParameter("email", email).getSingleResult();

		return c1;
	}

	public void save1(CactusBean c, String password) {
		//CactusBean resultBean1 = (CactusBean) entityManager.createQuery("from cactus c where c.username = :userName").setParameter("userName", userName).getSingleResult();
		CactusBean resultBean1 = entityManager.find(CactusBean.class, c.getUserId());
		resultBean1.setPassword(password);

		entityManager.persist(resultBean1);
	}
//	public CactusBean findemail(String email) {
//		CactusBean c1 = new CactusBean();
//		c1.setEmail(email);
//		c1 = findByEmail(c1.getEmail());
//		return c1;
//	}

	// 老師
//	public boolean teacherQualification(String username) {
//		if (findByUsername(username).getQualification_of_teacher().equals("T")) {
//			return true;
//		}
//		if (findByUsername(username).getQualification_of_teacher().equals("null"))
//			return false;
//		return false;
//	}

//	public CactusBean unchangeableUser(String username) {
//		CactusBean c1 = new CactusBean();
//		c1.setUsername(username);
//		c1 = findByUsername(c1.getUsername());
//		return c1;
//	}

//	public void update(CactusBean cb) { //改 
//		CactusBean member0 = findByUsername(cb.getUsername());  //查到的ID = member0
//		
//		cb.setPassword(member0.getPassword());
//		cb.setEmail(member0.getEmail());
//		cb.setName(member0.getName());
//				
//		entityManager.detach(member0);
//		entityManager.merge(cb);
//	}
//	

//	public void findByPrimaryKey1(String username) {
//		
//		cb.setUsername(username);
//		entityManager.find(CactusBean.class, username);
//		
//	}

//	
//	
//	
//	

//	
//
//	// 查詢
//	public CactusBean selectByUsername(String username) {
//
//		return session.get(CactusBean.class, username);
//	}
//
//	// 查詢多筆
//	public List<CactusBean> selectAll() {
//		Query<CactusBean> query = session.createQuery("from CactusBean", CactusBean.class);
//		return query.list();
//	}
//
//	// update 更新
//	public CactusBean update(String username, String password) {
//		CactusBean resultBean = session.get(CactusBean.class, username);
//		// 不是null 才更新
//		if (resultBean != null) {
//			resultBean.setPassword(password);
//		}
//		return resultBean;
//	}
//
//	// 刪除
//	public boolean delete(String username) {
//		CactusBean resultBean = session.get(CactusBean.class, username);
//		if (resultBean != null) {
//			session.delete(resultBean);
//			return true;
//		}
//		return false;
//	}
//
//	/*
//	 * public void checkUsernameExist(String username) { CactusBean sqlUsername =
//	 * session.get(CactusBean.class, username); if (sqlUsername != null) {
//	 * System.out.println("帳號已被註冊"); }else }
//	 */
//	//登入
//	public CactusBean login(CactusBean cBean) {
//		String username = cBean.getUsername();
//		String password = cBean.getPassword();
//
//		CactusBean resultBean = session.get(CactusBean.class, username); 
//		if (resultBean != null && resultBean.getPassword().equals(password)) {
//
//			return cBean;
//		} else
//
//			return null;
//	}
//
//	public CactusBean updatePassword(String username, String password) {
//
//		CactusBean resultBean = session.get(CactusBean.class, username);
//		if (resultBean != null) {
//			resultBean.setPassword(password);
//		}
//		return resultBean;
//	}
}
