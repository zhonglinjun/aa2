//package dan.many2many;
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
//	public void delete()
//	{
//		Item c1 = entityManager.find(Item.class, 2);
//		entityManager.remove(c1);
//	}
//	
//	@Test
//	public void query()
//	{
//		Item it = entityManager.find(Item.class,1);
//		System.out.println(it.getItemName());
//		
//	}
//	
//	
//	@Test
//	public void update()
//	{
//		
//		Item i1 = new Item();
//		i1.setItemName("i-1");
//	
//		Item i2 = new Item();
//		i2.setItemName("i-2");
//		
//		Category c1 = new Category();
//		c1.setCategoryName("C-1");
//		
//		Category c2 = new Category();
//		c2.setCategoryName("C-2");
//		
//		//设置关联关系
//		i1.getCategories().add(c1);
//		i1.getCategories().add(c2);
//		
//		i2.getCategories().add(c1);
//		i2.getCategories().add(c2);
//		
//		
//		
//		
//		//执行保存
//		entityManager.persist(i1);
//		entityManager.persist(i2);
//		entityManager.persist(c1);
//		entityManager.persist(c2);
//	}
//	
//	
//	
//
//}
