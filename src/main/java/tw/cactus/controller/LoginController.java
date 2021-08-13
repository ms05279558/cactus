package tw.cactus.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import tw.cactus.login.service.LoginServiceInterface;
import tw.cactus.model.CactusBean;
import tw.cactus.model.CactusBeanDao;
import tw.cactus.model.CourseBean;
import tw.cactus.model.SessionBean;
import tw.cactus.model.SessionBeanDao;





@Controller
public class LoginController {
	
	
	
	@Autowired
	private CactusBeanDao cDao;
	
	@Autowired
	private SessionBeanDao sbd;
	
//	private CactusBean cBean;
//	@Autowired
	static CactusBean c1;
	
	@GetMapping("/homeLoginPage")
    public String loginPageAction() {

    	return "index";
    }
//	@RequestMapping(path = "/Login.controller", method = RequestMethod.GET)
//    public String loginPageAction2() {
//    	return "Login";
//    } 備用
//	@PostMapping("/loginCheck.controller")
//	public String processAccountCheckAction(@RequestParam(name="username") String username, @RequestParam(name="password") String password, Model m) {
//		
//		Map<String, String> errors = new HashMap<String, String>();
//		m.addAttribute("e", errors);
//				
//		boolean checkStatus = loginServiceInterface.checkLogin(username, password);
//		
//		if(checkStatus) {			
//			m.addAttribute("username", cDao.findByPrimaryKey2(username).getName());
//			return "indexafterlogin";
//		}		
//		errors.put("msg", "帳號密碼錯誤");
//		return "index";
//	}
//	@PostMapping("/loginCheck.controller")
//    public String processAccountCheckAction(@RequestParam(name="username") String username, @RequestParam(name="password") String password, Model m) {
//
//        Map<String, String> errors = new HashMap<String, String>();
//        m.addAttribute("e", errors);
//                c1= cDao.findByUserName(username);
//        boolean checkStatus = checkLogin(password, c1);
//        if(checkStatus) {
//            m.addAttribute("username", c1.getName());
//
//            return "indexafterlogin";
//        }
//        errors.put("msg", "帳號密碼錯誤");
//        return "index";
//    }
	
//	private boolean checkLogin(String password, CactusBean userInDB) {
//		if(password.equals(userInDB.getPassword())) {
//			return true;
//		}
//		return false;
//	}
	
	@GetMapping("/showProfile")
	public String beTeacherOrNot() {//首頁判斷是否為教師資個後選擇跳轉頁面
		if(cDao.teacherQualification(c1.getUsername())) {

			return "/showTeacherProfile";
		}
		System.out.println(c1.getUsername());
		return "/showProfile";
	}		
	
	@GetMapping("/teacher")
	public @ResponseBody CactusBean agreement() {//按下成為教師後跳轉我同意頁面
		return cDao.findByUserName(c1.getUsername());
		
	}
	
	@GetMapping("/information")
	public @ResponseBody CactusBean showYourInformation() {//顯示個人資料
		return cDao.findByUserName(c1.getUsername());
		
	}
	
	@GetMapping("/information3")
	public @ResponseBody CactusBean showYourInformation1() {//顯示個人資料
		return cDao.findByUserName(c1.getUsername());
		
	}
	@GetMapping("/information1")
	public @ResponseBody CactusBean beTeacher() {//按下同意去資料庫更改教師資格
		cDao.findByUserName(c1.getUsername()).setQualificationOfTeacher(true);
		return cDao.findByUserName(c1.getUsername());		
	}
//	@GetMapping("/information1")
//	public String beTeacher() {//按下同意去資料庫更改教師資格
//		cDao.findByUsername(c1.getUsername()).setQualification_of_teacher("T");
//		return "showTeacherProfile";		
//	}
	
	
	@GetMapping("/RevisePage")
	public @ResponseBody CactusBean revise() {
		
		return cDao.findByUserName(c1.getUsername());		
	}
	
//	@GetMapping("/RevisePage"){
//		public @ResponseBody CactusBean 
//		return cDao.findByUsername(c1.getUsername());
//	}
	
//	@GetMapping("/Reviseyourdata")
//	public @ResponseBody CactusBean update(
//			@RequestParam String name, 
//			@RequestParam String password,
//			@RequestParam String birth,
//			@RequestParam String cellphone,
//			@RequestParam String email){
//		System.out.println(name);
//		c1=cDao.update2(c1.getUsername(),name,password,birth,cellphone,email);
//		return c1;
//		
//	}
	@PutMapping("/CactusRevise")
	public @ResponseBody CactusBean update(
			  @RequestBody CactusBean member
			) {
		   c1=cDao.update2(c1.getUsername(),member.getName(),member.getBirth(),member.getCellphone(),member.getEmail(),member.getGender());	
		return c1;
	}


	@PutMapping("/p@ssW0rdRevisePage")
	public @ResponseBody CactusBean updatepassword(
			  @RequestBody CactusBean member
			) {
		   c1=cDao.updatePassword(c1.getUsername(),member.getPassword());	
		return c1;
	}
	
	@GetMapping("/findCourse")
	public @ResponseBody CourseBean getCourse() {
		SessionBean s1 = new SessionBean();
		CourseBean co = new CourseBean();
		s1 = (SessionBean) sbd.findByPrimaryKey(c1);
		co = (CourseBean) sbd.findByPrimaryKey2(c1);
		return co ;
	}
	
}
