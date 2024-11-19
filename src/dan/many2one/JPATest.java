//package dan.many2one;
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
//	@Test
//	public void testManyToOneRemove(){
//		//Order order = entityManager.find(Order.class, 1);
//		//entityManager.remove(order);
//		
//		Customer customer = entityManager.find(Customer.class, 1);
//		entityManager.remove(customer);
//	}
//	
//	@Test
//	public void testManyToOneUpdate(){
//		Order order = entityManager.find(Order.class, 1);
//		
//		order.getCustomer().setLastName("xxxxxxxxxxxxxxx");
//		
//	
//	}
//	
//	
//	@Test
//	public void query()
//	{
//		Order order = entityManager.getReference(Order.class, 1);
//		//Order order = entityManager.getReference(Order.class, 1);
//		
//		System.out.println("----------------------");
//		System.out.println(order.getOrderName());
//		System.out.println("----------------------");
//		System.out.println(order.getCustomer().getLastName());
//	}
//	
//	//保存保存 1 的多对一时, 建议先一端, 后保存 n 的一端, 这样不会多出额外的 UPDATE 语句.
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
//		order1.setCustomer(customer);
//		
//		Order order2 = new Order();
//		order2.setOrderName("订2");
//		order2.setCustomer(customer);
//		
//		Order order3 = new Order();
//		order3.setOrderName("订3");
//		order3.setCustomer(customer);
//		
//		
//		
//		
//		
//		//先要保存一的这方
//		entityManager.persist(customer);//id
//	
//		
//		//因为维护关系不属于order这端,
//		//谁维护,谁管理关联字段
//		entityManager.persist(order1);//order 顺便一走漏 维护关系
//		entityManager.persist(order2);
//		entityManager.persist(order3);
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
