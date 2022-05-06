package org.npci.sandbox;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "API")
public class API_Entity {
	
	@Id 
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "NAME", nullable=false)
	private String apiName;
	
	@Column(name = "TYPE", nullable=false)
	private String apiType;
	
	@Column(name = "REQUEST_MESSAGE_CONFIGURATION", nullable=false)
	private String reqMsgConfg;

	@Override
	public String toString() {
		return "API [apiName=" + apiName + ", apiType=" + apiType + ", reqMsgConfg=" + reqMsgConfg + "]";
	}

	public API_Entity(String apiName, String apiType, String reqMsgConfg) {
		super();
		this.apiName = apiName;
		this.apiType = apiType;
		this.reqMsgConfg = reqMsgConfg;
	}

	public API_Entity() {
		super();
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getApiType() {
		return apiType;
	}

	public void setApiType(String apiType) {
		this.apiType = apiType;
	}

	public String getReqMsgConfg() {
		return reqMsgConfg;
	}

	public void setReqMsgConfg(String reqMsgConfg) {
		this.reqMsgConfg = reqMsgConfg;
	}
	
}
