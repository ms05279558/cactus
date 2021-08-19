package tw.cactus.cartpage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import tw.cactus.cactusbean.CactusBean;
import tw.cactus.cartpage.model.CartBean;
import tw.cactus.cartpage.service.CartService;
import tw.cactus.course.CourseBean;

@Controller
@SessionAttributes("cactusBean")
public class CartController {

    @Autowired
    private CartService cartService;
    
    //購物車頁面 select from 購物車 table
    @GetMapping({"/testbuy"})
	public String findByName(Model m, @ModelAttribute("cactusBean") CactusBean cactusBean) {
		List<CourseBean>cartlist1 = cartService.findSelectedCourse(cactusBean.getUserId());
		m.addAttribute("course",cartlist1);
		return "/testbuy";
	}
    
    
    //購物車page移除購物車 delete from 購物車table
    @GetMapping("/cart")
	public String goToCart1(Model m){
		List<CartBean> cartlist = cartService.findAllCart();
		m.addAttribute("cactus",cartlist);
		return "cart";
	}
	
	@DeleteMapping("/delete/{cartId}")
	public String deletFromCart(@PathVariable(value = "cartId" ) Integer cartId){
		cartService.remove(cartId);		
		return "space2";
	}

	
	// 交易完成 移除cart gfrom 購物車table 加上 inseret交易紀錄
	
	@GetMapping("/cart1")
	public void delete(Integer userid,List<CartBean> c) {
		
		cartService.adddel(userid, c);
		
	}	
	
	
	
	
	
}
