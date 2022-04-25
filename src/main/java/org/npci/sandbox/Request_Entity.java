package org.npci.sandbox;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REQUEST")
public class Request_Entity {
	@Id 
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="REQUEST_TYPE")
	private String requestType;

	@Override
	public String toString() {
		return "Request_Entity [id=" + id + ", requestType=" + requestType + "]";
	}

	public Request_Entity(int id, String requestType) {
		super();
		this.id = id;
		this.requestType = requestType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
}
