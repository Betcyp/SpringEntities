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
@Table(name = "API")
public class Api {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "NAME", nullable=false)
	private String apiName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "API_TYPE_MASTER_ID")
	private API_Type_Master_Entity apiType ;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "REQUEST_ID")
	private Request_Entity rqstMsgConfg;

	@Override
	public String toString() {
		return "Api [id=" + id + ", apiName=" + apiName + ", apiType=" + apiType + ", rqstMsgConfg=" + rqstMsgConfg + "]";
	}

	public Api(int id, String apiName, API_Type_Master_Entity apiType, Request_Entity rqstMsgConfg) {
		super();
		this.id = id;
		this.apiName = apiName;
		this.apiType = apiType;
		this.rqstMsgConfg = rqstMsgConfg;
	}

	public Api() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public API_Type_Master_Entity getApiType() {
		return apiType;
	}

	public void setApiType(API_Type_Master_Entity apiType) {
		this.apiType = apiType;
	}

	public Request_Entity getRqstMsgConfg() {
		return rqstMsgConfg;
	}

	public void setRqstMsgConfg(Request_Entity rqstMsgConfg) {
		this.rqstMsgConfg = rqstMsgConfg;
	}	
}
