package tw.cactus.course;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tw.cactus.CactusApplication;

@Repository
@Transactional
public class CourseRepo {

	@Autowired
	EntityManager entityManager;
	@Autowired
	CourseBean courseB;

	
//	from User user where user.age=20;
	public List<CourseBean> findCourseTypeOfMusic() {
		String hql = "FROM CourseBean WHERE course_type='music'";

		return entityManager.createQuery(hql, CourseBean.class).getResultList();
	}
	
	public List<CourseBean> findCourseTypeOfCoding() {
        String hql = "FROM CourseBean WHERE course_type='coding'";

        return entityManager.createQuery(hql, CourseBean.class).getResultList();
    }
    public List<CourseBean> findCourseTypeOfSport() {
        String hql = "FROM CourseBean WHERE course_type='sport'";

        return entityManager.createQuery(hql, CourseBean.class).getResultList();
    }
    public List<CourseBean> findCourseTypeOfMusic2() {
        String hql = "FROM CourseBean WHERE course_type='music'";

        return entityManager.createQuery(hql, CourseBean.class).getResultList();
    }
    public List<CourseBean> findCourseTypeOfLan() {
        String hql = "FROM CourseBean WHERE course_type='lan'";

        return entityManager.createQuery(hql, CourseBean.class).getResultList();
    }
    public List<CourseBean> findCourseTypeOfEconomy() {
        String hql = "FROM CourseBean WHERE course_type='economy'";

        return entityManager.createQuery(hql, CourseBean.class).getResultList();
    }
    public List<CourseBean> findCourseTypeOfPhoto() {
        String hql = "FROM CourseBean WHERE course_type='photo'";

        return entityManager.createQuery(hql, CourseBean.class).getResultList();
    }
}

