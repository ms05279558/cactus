package tw.cactus.cartpage.repository;

import java.util.List;

import tw.cactus.cartpage.model.CartBean;
import tw.cactus.course.CourseBean;

public interface CartRepo {

	List<CartBean> findByUserId(int userid);

	List<CartBean> findCartList(Integer userId);

	CourseBean getCourse(Integer courseId);
	
	public List<CartBean> findAllCart();
	
	public void remove(Integer cartId);
	
	public void adddel(Integer userid,List<CartBean> c);

}
