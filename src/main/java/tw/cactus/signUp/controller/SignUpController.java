package tw.cactus.signUp.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tw.cactus.login.model.CactusBean;
import tw.cactus.model.CactusBeanDao;
import tw.cactus.signUp.service.SignUpServiceInterface;

@Controller
public class SignUpController {
	

	@Autowired
	private SignUpServiceInterface signUpServiceInterface;
	
	@Autowired
	private CactusBean cb;
//	
//	@GetMapping("/etest")
//	public String eTest() {
//		return "Etest";
//	}
	
	@GetMapping("/signUpPage")
    public String loginPageAction() {
    	return "SignUp";
    }
    	
	 	@PostMapping("/signUp.controller")
		public String signUpPageAction(@RequestParam String username, @RequestParam String email,
				@RequestParam String password, Model m) throws UnsupportedEncodingException, MessagingException{

			Map<String, String> errors = new HashMap<String, String>();
			m.addAttribute("errors", errors);


			if(signUpServiceInterface.checkSignUp(username, email)) {
				if(signUpServiceInterface.insertRegister(username, email, password)) {
					if(signUpServiceInterface.sendEmail(email)){
						return "index";
					}
				}
			}
			//別刪我要用
//			if (cDao.checkEmail(cBean) == null) {
//				errors.put("exists", "Email已被註冊");
//				return "SignUp";
//			}
			errors.put("exists", "帳號已被註冊");
			return "SignUp";


		}

	      
	        
	}	
   