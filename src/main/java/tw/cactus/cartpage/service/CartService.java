package tw.cactus.cartpage.service;

import java.util.List;

import tw.cactus.cartpage.model.CartBean;
import tw.cactus.course.CourseBean;

public interface CartService {

// 暫時註解

	List<CartBean> findByUserId(int userid);

	List<CourseBean> findSelectedCourse(Integer userId);
	
	public List<CartBean> findAllCart();
	
	public void remove(Integer cartId);
	
	public void adddel(Integer userid,List<CartBean> c);
	
//	public CactusBean selectByUsername(String username);
//	public List<CactusBean> selectAll();
//	public CactusBean insert(CactusBean bean);
//	public CactusBean update(String username,String password);
//	public boolean delete(String username);
//	public boolean checkPassword(String username,String password)@Override
	
//	pub

	
}
