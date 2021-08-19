package tw.cactus.course;

import java.util.List;

import tw.cactus.cartpage.model.CartBean;
import tw.cactus.course.CourseBean;

public interface CourseService {

// 暫時註解

	List<CartBean> findByUserId(int userid);

	List<CourseBean> findByUserId2(CourseBean coursebean);
	
//	public CactusBean selectByUsername(String username);
//	public List<CactusBean> selectAll();
//	public CactusBean insert(CactusBean bean);
//	public CactusBean update(String username,String password);
//	public boolean delete(String username);
//	public boolean checkPassword(String username,String password)@Override
	
//	pub

	
}
