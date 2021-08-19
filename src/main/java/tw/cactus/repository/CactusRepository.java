package tw.cactus.repository;

import java.util.List;

import tw.cactus.cactusbean.CactusBean;

public interface CactusRepository {

	List<CactusBean> findCMembers();

}