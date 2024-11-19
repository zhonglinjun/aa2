//package com.yr.entity;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.FlushModeType;
//import javax.persistence.Persistence;
//
//import org.hibernate.FlushMode;
//
//public class Main {
//	public static void main(String[] args) throws InterruptedException {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-1");
//		
//		//配置属性
//		
//		EntityManager entityManager =  entityManagerFactory.createEntityManager();
//		
//		
//		
//		EntityTransaction et =  entityManager.getTransaction();
//		et.begin();
//		
//		//临时--新建--瞬间    新建对象，没有主键值
//		//脱管--游离          对象有主键值，但是与数据库没有关联        
//		//托管--持久          对象有主键值，并且与数据库有关联  
//		//删除                对象有主键值，与数据以前有关联，但是数据库不存啦
//		
//		
//		//persist 只能保存临时对象， 不能保存游离对象
////		User user = new User();
////		user.setName("111");
////		user.setAge(11);
////		user.setAddr("aa");
////		user.setBirth(new Date());
////		
////		entityManager.persist(user);
////		
////		System.out.println(user.getId());
//		
//		
//		
//		//只能删除持久化对象
////		User user = new User();
////		user.setId(3);
////		entityManager.remove(user);
//		
//		
//		
//		//find 立即查询，查询不值返回NULL
//		//User user1 = entityManager.find(User.class, 1);
//		//getReference 延迟加载，不会立即查询，使用时才会查询。查询不到结果直接抛异常
//		//User user = entityManager.getReference(User.class, 1);
//		//System.out.println("----------------------------------");
//		//System.out.println(user);
//		
//		
//		
//
//		//操作持久化对象有就是相当于修改
//		
//		
//		
//		
//		//meger 方法
////		User user = new User();
////		user.setId(18);
////		user.setName("3333333");
////		user.setAge(122133);
////		user.setAddr("222a3333a");
////		user.setBirth(new Date());
////		
////		entityManager.merge(user);
////		
//		//entityManager.setFlushMode(FlushModeType.AUTO);
//		
//		
//		//flush 手动发送SQL
//		//User user1 = entityManager.find(User.class, 3);
//		//user1.setName("aaaaa2");
//		
//		
//		User user1 = entityManager.find(User.class, 3);
//		System.out.println(user1);
//		
//		
//		Thread.sleep(10 * 1000);
//
//		System.out.println(user1);
//	
//		
//		
//	
//		//事务  同一个事务当中，查询数据多次，返回的结果是一样的。
//		
//		
//		
//		
//		et.commit();  //flush()
//		
//		entityManager.close();
//		entityManagerFactory.close();
//		
//	}
//}
