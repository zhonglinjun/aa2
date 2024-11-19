package shuang.one2manyOrmany2one;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@NamedQueries(value = {@NamedQuery(name = "aa",query = "from Order o  where o.id > ?"),
						@NamedQuery(name = "bb",query = "from Order o  where o.id > ?")})



@Cacheable(true)
@Table(name="JPA_ORDERS")
@Entity
public class Order {

	private Integer id;
	private String orderName;
	
	private Customer customer;
	
	public Order() {
		
	}
	
	public Order(Integer id,String orderName)
	{
		this.id = id;
		this.orderName = orderName;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="ORDER_NAME")
	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	
	//懒加载,延迟加载(已经使用到了再去查询)
	@JoinColumn(name = "cust_id")
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderName=" + orderName + "]";
	}

	

}
