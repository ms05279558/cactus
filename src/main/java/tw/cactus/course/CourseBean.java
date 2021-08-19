package tw.cactus.course;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tw.cactus.cactusbean.CactusBean;
import tw.cactus.model.SessionBean;

@Entity @Table(name = "course")//小寫
@Component("course") //給SPRING看

public class CourseBean implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer courseId;
	
	@JsonIgnore
	@OneToMany(mappedBy="courseBean", fetch=FetchType.EAGER)
	private Set<SessionBean> sessionBeans;

	
	private String course_type;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private CactusBean cactusBean;
	
	@Column(name = "COURSE_NAME")
	private String courseName;
	
	@Column(name = "COURSE_DESCRIPTION")
	private String courseDescription;
	private Integer price;
	private String launched; 
	public CourseBean() {};
	public CourseBean(Integer courseId, Set<SessionBean> sessionBeans, String course_type, CactusBean cactusBean,
			String courseName, String courseDescription, Integer price, String launched) {
		super();
		this.courseId = courseId;
		this.sessionBeans = sessionBeans;
		this.course_type = course_type;
		this.cactusBean = cactusBean;
		
		
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.price = price;
		this.launched = launched;
	}
	
	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Set<SessionBean> getSessionBeans() {
		return sessionBeans;
	}

	public void setSessionBeans(Set<SessionBean> sessionBeans) {
		this.sessionBeans = sessionBeans;
	}

	public String getCourse_type() {
		return course_type;
	}

	public void setCourse_type(String course_type) {
		this.course_type = course_type;
	}

	public CactusBean getCactusBean() {
		return cactusBean;
	}

	public void setCactusBean(CactusBean cactusBean) {
		this.cactusBean = cactusBean;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getLaunched() {
		return launched;
	}

	public void setLaunched(String launched) {
		this.launched = launched;
	}


	
	
	
	
}
