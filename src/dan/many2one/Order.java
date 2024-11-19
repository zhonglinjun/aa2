//package dan.many2one;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Table(name="JPA_ORDERS")
//@Entity
//public class Order {
//
//	
//	//customer  -  order1  order2  order3  order4
//	private Integer id;
//	private String orderName;
//	private Customer customer;
//
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Id
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	@Column(name="ORDER_NAME")
//	public String getOrderName() {
//		return orderName;
//	}
//
//	public void setOrderName(String orderName) {
//		this.orderName = orderName;
//	}
//
//	
//	//懒加载,延迟加载(已经使用到了再去查询)
//	//这个是对于对象里面的包含对象来说的．
//	//FetchType.LAZY  懒加载
//	
//	
//	//find 立即查询
//	//getReference  懒加载
//	@JoinColumn(name = "cust_id")
//	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//
//	@Override
//	public String toString() {
//		return "Order [id=" + id + ", orderName=" + orderName + ", customer=" + customer + "]";
//	}
//	
//	
//
//}
