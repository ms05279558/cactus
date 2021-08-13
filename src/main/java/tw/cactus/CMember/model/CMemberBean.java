package tw.cactus.CMember.model;

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

import tw.cactus.model.CourseBean;
import tw.cactus.model.SessionBean;


@Entity (name = "cmember")
@Table(name = "cmember")//小寫
@Component("cmember") //給SPRING看
public class CMemberBean {
	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	private String username;
	
	private String email;

	private String password;
	

	@JsonIgnore
	@OneToMany(mappedBy="cmemberBean", fetch=FetchType.LAZY)
	private Set<CourseBean> courseBeans;
	
	@JsonIgnore
	@OneToMany(mappedBy="cmemberBean", fetch=FetchType.LAZY)
	private Set<SessionBean> sessionBeans;
	
	
	public CMemberBean() {}

	public CMemberBean(Integer userId, String username, String email, String password, String name, String gender,
			String birth, String cellphone, Boolean qualificationOfTeacher, Set<CourseBean> courseBeans,
			Set<SessionBean> sessionBeans) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.password = password;

	}

	public CMemberBean(String username2, String password2) {
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


}