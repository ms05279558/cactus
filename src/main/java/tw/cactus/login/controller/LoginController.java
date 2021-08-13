package tw.cactus.login.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tw.cactus.login.service.LoginServiceInterface;

@Controller
public class LoginController {
	
	@Autowired
	LoginServiceInterface loginServiceInterface;
	
	@PostMapping("/loginCheck.controller")
	public String processAccountCheckAction(@RequestParam(name="username") String username, @RequestParam(name="password") String password, Model m) {
		
		Map<String, String> errors = new HashMap<String, String>();
		m.addAttribute("e", errors);
				
		boolean checkStatus = loginServiceInterface.checkLogin(username, password);
		
		if(checkStatus) {
			return "indexafterlogin";
		}		
		errors.put("msg", "帳號密碼錯誤");
		return "index";
	}
}
