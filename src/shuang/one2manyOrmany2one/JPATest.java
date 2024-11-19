package shuang.one2manyOrmany2one;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JPATest {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private EntityTransaction transaction;
	
	@Before
	public void init(){
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa-1");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
	}
	
	@After
	public void destroy(){
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	
	
	@Test
	public void update()
	{
		//String jpql = "update Customer set lastName = ? where id = ? ";
		String jpql = "delete from Customer where id = ?";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, 8);
		
		query.executeUpdate();
		
	}
	
	@Test
	public void aaaa()
	{
		//先到缓存当中查询，如果找到就直接返回结果，如果没有找到，去数据库里面查询。
		//如果数据库查询到数据，返回查询结果，并且把结果放在缓存当中
		
		
		//一级缓存又叫EntityManager缓存，同一个EntityManager才有缓存的效果
		
		Order order1 = entityManager.find(Order.class, 1);
		Order order2 = entityManager.find(Order.class, 1);
	}
	
	//一级缓存是同一个entityManager,不可卸载,默认使用(内置)
	//二级缓存同同一个entityManagerFactory,默认不使用,需要手动配置(外置)
	@Test
	public void find()
	{
	
		
		//String sql = "select new shuang.one2manyOrmany2one.Order(o.id,o.orderName) from Order o";
		
		
		//JPA会使用二级缓存，只会把结果进行缓存，但是自己的SQL不会去缓存里面找数据
		
		//from Order  = {结果集}
		//
		//List<Object[]> list = entityManager.createQuery("select o.orderName,count(o.id) from Order o group by o.orderName having count(o.id) > 1 ").getResultList();
		
		
		String sql = "from shuang.one2manyOrmany2one.Customer c left join shuang.one2manyOrmany2one.Order o ";
		
		List<Customer> list = entityManager.createQuery(sql).getResultList();
		for (Customer customer : list) {
			System.out.println(customer);
		}
		
		
		
		
		
		
//		List<Order> list = entityManager.createNamedQuery("bb").setParameter(1, 0).getResultList();
		
		
	
		
		
		
//		List<Object[]> list = entityManager.createQuery(sql).getResultList();
//		
//		for (Object[] objects : list) {
//			System.out.println(objects[0] + "   "  + objects[1]);
//		}
//		
		
		
	}

	
	//若是双向 1-n 的关联关系, 执行保存时
	//若先保存 n 的一端, 再保存 1 的一端, 默认情况下, 会多出 n 条 UPDATE 语句.
	//若先保存 1 的一端, 则会多出 n 条 UPDATE 语句
	//在进行双向 1-n 关联关系时, 建议使用 n 的一方来维护关联关系, 而 1 的一方不维护关联系, 这样会有效的减少 SQL 语句. 
	//注意: 若在 1 的一端的 @OneToMany 中使用 mappedBy 属性, 则 @OneToMany 端就不能再使用 @JoinColumn 属性了. 
	
	//单向 1-n 关联关系执行保存时, 一定会多出 UPDATE 语句.
	//因为 n 的一端在插入时不会同时插入外键列. 
	@Test
	public void insert()
	{
		
		Customer customer = new Customer();
		customer.setAge(18);
		customer.setEmail("mm@163.com");
		customer.setLastName("MM");
		
		
		
		
		Order order1 = new Order();
		order1.setOrderName("O-MM-1");
		
		
		
		Order order2 = new Order();
		order2.setOrderName("O-MM-2");
		
		//建立关联关系
		customer.getOrders().add(order1);
		customer.getOrders().add(order2);
		
		
		order1.setCustomer(customer);
		order2.setCustomer(customer);
		
		//执行保存操作
		//谁维护,谁管理关联字段
		//客户维护一次,
		//订单维护一次
		
		
		//先插订单,客户还没有ID.
		//插再客户,插完以后,通过UPDATE来维护 
		//订单再维护一次
		
		
		
		
		entityManager.persist(customer);//插入客户,维护关联
		
		entityManager.persist(order1);//等着维护
		entityManager.persist(order2);
		
	
		
		
	
		
		//先插入客户,

		
		
		//Customer customer = entityManager.find(Customer.class, 1);
		/*System.out.println(customer);
		System.out.println("-----------------------");
		System.out.println(customer.getOrders());
		Order order = entityManager.find(Order.class, 1);*/
		//entityManager.remove(customer);
		
//		Customer customer= entityManager.find(Customer.class, 1);
//		System.out.println(customer.toString());
//		transaction.commit();
//		entityManager.close();
//		
//		
//		
//		entityManager = entityManagerFactory.createEntityManager();
//		transaction = entityManager.getTransaction();
//		transaction.begin();
//		Customer customer1= entityManager.find(Customer.class, 1);
//		System.out.println(customer1.toString());
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-1");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		
		Order order1 = entityManager.find(Order.class, 1);
		Order order2 = entityManager.find(Order.class, 1);
	
		
		
		//FROM Customer c LEFT OUTER JOIN FETCH c.orders WHERE c.id = ?
		//            from jpa_orders o inner join jpa_cutomers c on o.cust_id = c.id
		/*String sql = "select o FROM Order1 o inner join o.customer";
		Query query = entityManager.createQuery(sql);
		List<Order1> list = query.getResultList();
		for (Order1 order : list) {
			System.out.println(order.toString());
		}*/
		
//		String sql = "select c.id,length(c.lastName) from Customer c";
//		Query query = entityManager.createQuery(sql);
//		List<Object[]> list = query.getResultList();
//		for (Object[] objects : list) {
//			System.out.println(objects[0] + "   " + objects[1]);
//		}
		
		/*List<Customer> list = query.getResultList();
		for (Customer customer : list) {
			System.out.println(customer.toString());
		}*/
		
		/* sql ="select o.orderName,count(*) from Order1 o group by orderName having count(*) > 1";
		Query query = entityManager.createQuery(sql);
		List<Object[]> list = query.getResultList();
		for (Object[] objects : list) {
			System.out.println(objects[0] + "   " + objects[1]);
		}*/
		
			
		
//		String sql = "from Order1 where customer = ?";
//		
//		Customer customer = new Customer();
//		customer.setId(1);
//		
//		
//		
//		Query query = entityManager.createQuery(sql);
//		query.setParameter(1, customer);
//		List<Order1> list = query.getResultList();
//		for (Order1 order : list) {
//			System.out.println(order.toString());
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	
	@Test
	public void aa()
	{
		String sql = "from Order1 order by id asc";
//		String sql ="select new Order(o.id,o.orderName) from Ordera o where o.id > ?";
		Query query = entityManager.createQuery(sql);
//		query.setParameter(1, 1);
		/*<Object[]> list = query.getResultList();
		for (Object[] objects : list) {
			System.out.println(objects[0]);
		}*/
		List<Order> list = query.getResultList();
		for (Order order : list) {
			System.out.println(order.toString());
		}
	}

}
