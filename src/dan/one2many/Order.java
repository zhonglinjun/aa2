//package dan.one2many;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Table(name="JPA_ORDERS")
//@Entity
//public class Order {
//
//	private Integer id;
//	private String orderName;
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
//}
