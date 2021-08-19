package tw.cactus.service;

import java.util.List;

import tw.cactus.cactusbean.CactusBean;

public interface CactusService {

	List<CactusBean> findCMembers();

}