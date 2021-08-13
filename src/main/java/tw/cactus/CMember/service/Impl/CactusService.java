package tw.cactus.CMember.service.Impl;

import java.util.List;

import tw.cactus.CMember.repository.CactusRepositoryInterface;
import tw.cactus.CMember.service.CactusServiceInterface;
import tw.cactus.login.*;
import tw.cactus.login.model.CactusBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CactusService implements CactusServiceInterface {

	@Autowired
	CactusRepositoryInterface cactusRepositoryInterface;
	
	@Override
	public List<CactusBean> findCMembers(){
		return cactusRepositoryInterface.findCMembers();
	}
	
}
