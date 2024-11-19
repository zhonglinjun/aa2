//package dan.one2many;
//
//
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.persistence.Transient;
// 
//@Table(name="JPA_CUTOMERS")
//@Entity
//public class Customer {
//
//	private Integer id;
//	private String lastName;
//
//	private String email;
//	private int age;
//	
//	//set  list 
//	//set不能有重复的值.  list可以有重复的值
//	private Set<Order> orders = new HashSet<>();
//	
//	
//	public Customer() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	public Customer(String lastName, int age) {
//		super();
//		this.lastName = lastName;
//		this.age = age;
//	}
//
//
//
//
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Id
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//
//	//需要关联字段,如果没有配置,就会自动帮我们创建关联表.
//	//caseade 级联操作
//	@JoinColumn(name = "cust_id")
//	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
//	public Set<Order> getOrders() {
//		return orders;
//	}
//
//	public void setOrders(Set<Order> orders) {
//		this.orders = orders;
//	}
//
//
//}
