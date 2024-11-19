//package dan.one2one;
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
//	public void testOneToManyRemove(){
//		Manager manager = entityManager.find(Manager.class, 1);
//		entityManager.remove(manager);
//	}
//	
//	@Test
//	public void testUpdate(){
//		Department dept = entityManager.find(Department.class, 1);
//		dept.getMgr().setMgrName("222222222222");
//	}
//	
//	
//	//一对多默认就有懒加载
//	//一个对象与另一个对象有关联,如果查询时,只查询本对象没有查询关联对象.使用到时才发送SQL去查询
//	@Test
//	public void testOneToManyFind(){
//		Department dept = entityManager.find(Department.class, 1);
//		System.out.println("------------------------");
//		
//	}
//	
//	@Test
//	public void insert()
//	{
//		
//		
//		Manager mgr = new Manager();
//		mgr.setMgrName("M-BB");
//		
//		Department dept = new Department();
//		dept.setDeptName("D-BB");
//		dept.setMgr(mgr);
//		
//		entityManager.persist(mgr);
//		//执行保存操作
//		entityManager.persist(dept);
//	
//		
//		
//		
//	}
//	
//
//}
