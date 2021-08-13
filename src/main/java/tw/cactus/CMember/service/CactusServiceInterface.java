package tw.cactus.CMember.service;

import java.util.List;

import tw.cactus.login.model.CactusBean;

public interface CactusServiceInterface {

	List<CactusBean> findCMembers();

}