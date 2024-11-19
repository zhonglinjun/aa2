//package com.yr.entity;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.TableGenerator;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.persistence.Transient;
//
//@Table(name = "jpa_user")
//@Entity
//public class User {
//	
//	
//	//@GeneratedValue(strategy = GenerationType.IDENTITY)
//	
//	//把另一个表里同的数据字段查询出来做为我这个表的主键值
////	@TableGenerator(name="abc",table="jpa_id",
////	pkColumnName="PK_NAME",
////	valueColumnName="PK_VALUE",
////	pkColumnValue="CUSTOMER_ID",
////	allocationSize=50)
//	
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private int id;
//	
//	@Column(name = "name1",length = 100,nullable = false)
//	private String name;
//	private String addr;
//	@Transient
//	private int age;
//	
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date birth;
//	
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String getAddr() {
//		return addr;
//	}
//	public void setAddr(String addr) {
//		this.addr = addr;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public Date getBirth() {
//		return birth;
//	}
//	public void setBirth(Date birth) {
//		this.birth = birth;
//	}
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", name=" + name + ", addr=" + addr + ", age=" + age + ", birth=" + birth + "]";
//	}
//	
//}
