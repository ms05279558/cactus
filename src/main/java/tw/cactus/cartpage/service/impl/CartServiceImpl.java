package tw.cactus.cartpage.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.cactus.cartpage.model.CartBean;
import tw.cactus.cartpage.repository.CartRepo;
import tw.cactus.cartpage.service.CartService;
import tw.cactus.course.CourseBean;

@Service
@Transactional
public class CartServiceImpl implements CartService {
	@Autowired
	CartRepo cartRepo;

	@Override
	public List<CartBean> findByUserId(int userid) {
		return cartRepo.findByUserId(userid);
	}

	@Override
	public List<CourseBean> findSelectedCourse(Integer userId) {
		List<CartBean> cartList = cartRepo.findCartList(userId);
		List<CourseBean> coursetList = new ArrayList<CourseBean>();
		for(CartBean cb: cartList) {
			Integer courseId = cb.getCourseBean().getCourseId();
			coursetList.add(cartRepo.getCourse(courseId));
		}
		return coursetList;
	}
	
	
	@Override
	public List<CartBean> findAllCart(){
			return cartRepo.findAllCart();
		}
	@Override
	public void remove(Integer cartId){
			cartRepo.remove(cartId);
	}
	@Override
	public void adddel(Integer userid,List<CartBean> c) {
			cartRepo.findAllCart();
	}

}
