//package dan.one2one;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Table(name="JPA_MANAGERS")
//@Entity
//public class Manager {
//
//	private Integer id;
//	private String mgrName;
//	
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
//	@Column(name="MGR_NAME")
//	public String getMgrName() {
//		return mgrName;
//	}
//
//	public void setMgrName(String mgrName) {
//		this.mgrName = mgrName;
//	}
//
//
//}
