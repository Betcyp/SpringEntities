package org.npci.sandbox;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product_Entity {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "PRODUCT_NAME", nullable=false)
	private String productName;
	
	@Column(name = "PRODUCT_VERSION", nullable=false)
	private String productVersion;
	
	@Override
	public String toString() {
		return "Product_Entity [id=" + id + ", productName=" + productName + ", productVersion="
				+ productVersion + "]";
	}
	
	public Product_Entity(int id,String productName, String productVersion) {
		super();
		this.id = id;
		this.productName = productName;
		this.productVersion = productVersion;
		
	}

	public Product_Entity() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
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
	
}
