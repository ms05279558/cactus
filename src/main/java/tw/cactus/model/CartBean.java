package tw.cactus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity (name = "cart")
@Table(name = "cart")//小寫
@Component("cart") //給SPRING看
public class CartBean {

	@Id
	@Column(name = "CartId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer CartId;
	
		
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private CactusBean cactusBean;
	
	@ManyToOne
	@JoinColumn(name="COURSEID")
	private CourseBean courseBean ;
	
	public Integer getCartId() {
		return CartId;
	}

	public void setCartId(Integer cartId) {
		CartId = cartId;
	}

	public CactusBean getCactusBean() {
		return cactusBean;
	}

	public void setCactusBean(CactusBean cactusBean) {
		this.cactusBean = cactusBean;
	}

	public CourseBean getCourseBean() {
		return courseBean;
	}

	public void setCourseBean(CourseBean courseBean) {
		this.courseBean = courseBean;
	}

	

	
	

}
