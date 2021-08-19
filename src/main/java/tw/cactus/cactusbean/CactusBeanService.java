package tw.cactus.cactusbean;

import java.util.List;

import org.hibernate.Session;

//public class CactusBeanService implements ICactusBeanService {

//	private CactusBeanDao cDao;
//	
//	
//	public CactusBeanService(Session session) {
//        cDao = new CactusBeanDao(session);
//	}
//
//	@Override
//	public CactusBean selectByUsername(String username) {		
//		return cDao.selectByUsername(username);
//	}
//
//	@Override
//	public List<CactusBean> selectAll() {
//		return cDao.selectAll();
//	}
//
//	@Override
//	public CactusBean insert(CactusBean bean) {
//		return cDao.insert(bean);
//	}
//
//	@Override
//	public CactusBean update(String username,String password) {
//		return cDao.update(username, password);
//	}
//
//	@Override
//	public boolean delete(String username) {
//		return cDao.delete(username);
//	}
//	
//	@Override
//	public boolean checkPassword(String username,String password)
//	{
//		if(username.equals(username) && password.equals(password))
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}
//	
//	@Override
//	public CactusBean login(CactusBean bean)
//	{
//		return cDao.login(bean);
//	}
//}
