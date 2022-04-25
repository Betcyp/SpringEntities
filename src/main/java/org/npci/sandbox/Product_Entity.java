package org.npci.sandbox;
// server.port = 8086
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
	private int productId;
	
	@Column(name = "PRODUCT_ICON")
	private String productIcon;
	
	@Column(name = "PRODUCT_NAME")
	private String productName;
	
	@Column(name = "PRODUCT_VERSION")
	private String productVersion;
	
	@Column(name = "IS_ACTIVE")
	private  String isActive;

	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productIcon=" + productIcon + ", productName=" + productName
				+ ", productVersion=" + productVersion + ", isActive=" + isActive + "]";
	}
	
	
	public Product_Entity(String productName, String productVersion, String productIcon, String isActive, int productId) {
		super();
		this.productName = productName;
		this.productVersion = productVersion;
		this.productIcon = productIcon;
		this.isActive = isActive;
		this.productId = productId;
	}


	public long getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductIcon() {
		return productIcon;
	}

	public void setProductIcon(String productIcon) {
		this.productIcon = productIcon;
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

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	
}
