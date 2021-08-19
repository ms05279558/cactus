package tw.cactus.cactusbean;

import java.util.List;

import javax.persistence.EntityManager;

import tw.cactus.repository.CactusRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties.Session;
import org.springframework.stereotype.Repository;

@Repository
public class CactusRepositoryImpl implements CactusRepository {

	
	@Autowired
	EntityManager em;
	
	@Override
	public List<CactusBean> findCMembers(){
		
		String hql ="FROM cactus";
		return em.createQuery(hql, CactusBean.class).getResultList();
	}
}
