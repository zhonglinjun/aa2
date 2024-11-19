//package dan.many2many;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//@Table(name="ITEMS")
//@Entity
//public class Item {
//
//	private Integer id;
//	private String itemName;
//	
//	private Set<Category> categories = new HashSet<>();
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
//	@Column(name="ITEM_NAME")
//	public String getItemName() {
//		return itemName;
//	}
//
//	public void setItemName(String itemName) {
//		this.itemName = itemName;
//	}
//
//	//a (1-n)  qq  b(n-1)
//	
//	
//	@JoinTable(name="ITEM_CATEGORY",
//			joinColumns={@JoinColumn(name="i_ID", referencedColumnName="ID")},
//			inverseJoinColumns={@JoinColumn(name="c_ID", referencedColumnName="ID")})
//	@ManyToMany(fetch = FetchType.EAGER)
//	public Set<Category> getCategories() {
//		return categories;
//	}
//
//	public void setCategories(Set<Category> categories) {
//		this.categories = categories;
//	}
//}
