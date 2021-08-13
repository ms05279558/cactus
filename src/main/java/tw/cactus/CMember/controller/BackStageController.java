package tw.cactus.CMember.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tw.cactus.CMember.service.CactusServiceInterface;
import tw.cactus.login.model.CactusBean;
import tw.cactus.model.CactusBeanDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BackStageController {

	@Autowired
	CactusServiceInterface cactusServiceInterface;
	@Autowired
	CactusBeanDao cd;
	@Autowired
	CactusBean cb;
	
//	@GetMapping("/ajaxtest/C_members")
//	public String ajaxtest(Model m) {
//		List<CactusBean> clist = cs.findCMembers();
//		m.addAttribute("cactus",clist);
//		return "/ajaxtest";
//	}
	
//	@GetMapping("/back")
//	public String backindex() {
//		return "/backindex";
//	}
	
	@GetMapping({"/C_members","/back"})
	public String getCactusMembers(Model m) {
		List<CactusBean> clist = cs.findCMembers();
		m.addAttribute("cactus",clist);
		return "/backindex";
	}
	@GetMapping("/ajax/C_members")
	public String getCactusMembers2() {
		return "/ajaxCMember";
	}
	
	@GetMapping("/ajax/CC_members")
	public @ResponseBody List<CactusBean> getCactusMembersajax(){
		return cs.findCMembers();
	}
	
	@DeleteMapping("/Delete_C_member/{username}")
	public String deleteCactusDao(@PathVariable(value = "username") String username)
	{
		cd.deleteCactus(username);
		return "/space";
	}
	
	@GetMapping("/Put_C_member/{username}")
	public String backindextest(@PathVariable(value = "username" ) String username, Model m) {
		cb = cd.findByUserName(username);
		m.addAttribute("username", cb);
		return "/Revise";
	}
	
	@PutMapping("/Put_CC_member/{username}")
	public String update(@PathVariable(value = "username") String username,
			@RequestParam(name="name") String name, @RequestParam(name="email") String email,
			@RequestParam(name="password") String password,@RequestParam(name="birth") String birth,
			@RequestParam(name="cellphone") String cellphone, @RequestParam(name="gender") String gender
			/*@RequestParam String verification_code, @RequestParam Boolean enabled*/ ){

		cd.update(username,name,email,password,birth,cellphone,gender/*,verification_code,enabled*/);				
		return "/space";
	}
	
	
	
	
	
	
	
	
	
	
//	@PutMapping("/Put_CC_member/{username}")
//	public String update(CactusBean cb, @PathVariable(value = "username") String username){
//		 	
//		cd.update(cb);
//				
//		return "/space";
//	}
	
	
	
	
//	@PutMapping("/Put_CC_member")
//	public String revise() {
//		
//		cd.
//		return "/space";
//	}
//	
}
