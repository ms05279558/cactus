package tw.cactus.service.impl;

import java.util.List;

import tw.cactus.cactusbean.CactusBean;
import tw.cactus.repository.CactusRepository;
import tw.cactus.service.CactusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CactusServiceImpl implements CactusService {

	@Autowired
	CactusRepository cr;
	
	@Override
	public List<CactusBean> findCMembers(){
		return cr.findCMembers();
	}
	
}
