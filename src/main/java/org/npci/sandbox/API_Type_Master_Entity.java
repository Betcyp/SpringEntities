package org.npci.sandbox;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "API_TYPE_MASTER")
public class API_Type_Master_Entity {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "TYPE")
	private String apiType;

	@Override
	public String toString() {
		return "API_Type_Master_Entity [id=" + id + ", apiType=" + apiType + "]";
	}

	public API_Type_Master_Entity(int id, String apiType) {
		super();
		this.id = id;
		this.apiType = apiType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApiType() {
		return apiType;
	}

	public void setApiType(String apiType) {
		this.apiType = apiType;
	}
	
}
