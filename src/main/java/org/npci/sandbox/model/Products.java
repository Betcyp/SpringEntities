package org.npci.sandbox.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Products {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "PRODUCT_NAME", nullable=false)
	private String productName;
	
	@Column(name = "PRODUCT_VERSION", nullable=false)
	private String productVersion;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "USER_ID")
	private Users user;
	
	

	public Products(long id, String productName, String productVersion, Users user) {
		super();
		this.id = id;
		this.productName = productName;
		this.productVersion = productVersion;
		this.user = user;
	}

	

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productVersion=" + productVersion + ", user="
				+ user + "]";
	}


	public Products() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
}
