package tw.cactus.cactusbean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tw.cactus.course.CourseBean;
import tw.cactus.model.SessionBean;



@Entity (name = "cactus")
@Table(name = "cactus")//小寫
@Component("cactus") //給SPRING看
public class CactusBean {
	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	private String username;
	
	private String email;

	private String password;
	private String name;
	private String gender;
	private String birth;
	private String cellphone;
	@Column(name = "qualification_of_teacher")
	private Boolean qualificationOfTeacher;
	
	@JsonIgnore
	@OneToMany(mappedBy="cactusBean", fetch=FetchType.EAGER)
	private Set<CourseBean> courseBeans;
	
	@JsonIgnore
	@OneToMany(mappedBy="cactusBean", fetch=FetchType.EAGER)
	private Set<SessionBean> sessionBeans;
	
	public Boolean getQualificationOfTeacher() {
		return qualificationOfTeacher;
	}

	public void setQualificationOfTeacher(Boolean qualificationOfTeacher) {
		this.qualificationOfTeacher = qualificationOfTeacher;
	}
	public CactusBean() {}

	public CactusBean(Integer userId, String username, String email, String password, String name, String gender,
			String birth, String cellphone, Boolean qualificationOfTeacher, Set<CourseBean> courseBeans,
			Set<SessionBean> sessionBeans) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.cellphone = cellphone;
		this.qualificationOfTeacher = qualificationOfTeacher;
		this.courseBeans = courseBeans;
		this.sessionBeans = sessionBeans;
	}

	public CactusBean(String username2, String password2) {
		// TODO Auto-generated constructor stub
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public Set<CourseBean> getCourseBeans() {
		return courseBeans;
	}

	public void setCourseBeans(Set<CourseBean> courseBeans) {
		this.courseBeans = courseBeans;
	}

	public Set<SessionBean> getSessionBeans() {
		return sessionBeans;
	}

	public void setSessionBeans(Set<SessionBean> sessionBeans) {
		this.sessionBeans = sessionBeans;
	}
	

}
