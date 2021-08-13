package tw.cactus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import tw.cactus.model.CactusBeanDao;

@Controller
public class ProfileController {

	@GetMapping("/profile")
    public String loginPageAction() {
    	return "profile";
    }	

}
