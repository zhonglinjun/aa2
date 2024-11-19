//package dan.one2many;
//
//import java.util.Iterator;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//public class JPATest {
//
//	private EntityManagerFactory entityManagerFactory;
//	private EntityManager entityManager;
//	private EntityTransaction transaction;
//	
//	@Before
//	public void init(){
//		entityManagerFactory = Persistence.createEntityManagerFactory("jpa-1");
//		entityManager = entityManagerFactory.createEntityManager();
//		transaction = entityManager.getTransaction();
//		transaction.begin();
//	}
//	
//	@After
//	public void destroy(){
//		transaction.commit();
//		entityManager.close();
//		entityManagerFactory.close();
//	}
//	
//	
//	//默认情况下, 若删除 1 的一端, 则会先把关联的 n 的一端的外键置空, 然后进行删除. 
//		//可以通过 @OneToMany 的 cascade 属性来修改默认的删除策略. 
//	@Test
//	public void testOneToManyRemove(){
//		Customer customer = entityManager.find(Customer.class, 2);
//		entityManager.remove(customer);
//	}
//	
//	@Test
//	public void testUpdate(){
//		Customer customer = entityManager.find(Customer.class, 1);
//		
//	
//		customer.getOrders().iterator().next().setOrderName("111111");
//		//customer.getOrders().iterator().next().setOrderName("O-XXX-10");
////		Iterator<Order> iter = customer.getOrders().iterator();
////		while (iter.hasNext()) {
////			Order order  = iter.next();
////			order.setOrderName("111111111111");
////		}
//	}
//	
//	
//	//一对多默认就有懒加载
//	//一个对象与另一个对象有关联,如果查询时,只查询本对象没有查询关联对象.使用到时才发送SQL去查询
//	@Test
//	public void testOneToManyFind(){
//		Customer customer = entityManager.find(Customer.class, 1);
//		System.out.println("----------------");
//		System.out.println(customer.getLastName());
//		
//		System.out.println("----------------------");
//		System.out.println(customer.getOrders());
//		//System.out.println(customer.getLastName());
//	
//		//System.out.println("0-00000000000000000000000");
//		//System.out.println(customer.getOrders().size());
//	}
//	
//	//外面一般不使用一对多，一般会使用多对一
//	//一对多不管怎么插入数据,都会有多余的UPDATE语句
//	@Test
//	public void insert()
//	{
//		Customer customer = new Customer();
//		customer.setAge(20);
//		customer.setLastName("林波");
//		customer.setEmail("linbo@qq.com");
//		
//		
//		Order order1 = new Order();
//		order1.setOrderName("订1");
//		
//		Order order2 = new Order();
//		order2.setOrderName("订2");
//		
//		Order order3 = new Order();
//		order3.setOrderName("订3");
//		
//		
//		
//	
//		
//		
//		
//		customer.getOrders().add(order1);
//		customer.getOrders().add(order2);
//		customer.getOrders().add(order3);
//		
//		
//		
//		
//		
//		
//		//现在维护关系是顾客方（一的一方）
//		//等订单插完以后（多的一方），顾客再来维护关联字段
//		entityManager.persist(customer);
//		
//		//因为维护关系不属于order这端,
//		//谁维护,谁管理关联字段
//		entityManager.persist(order1);
//		entityManager.persist(order2);
//		entityManager.persist(order3);
//		
//		
//	
//		
//		
//		
//		
//		
//	}
//	
//
//}
