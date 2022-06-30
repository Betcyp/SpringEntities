package org.npci.sandbox.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "REQUEST")
public class Request_Entity {
	
	@Id 
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "XML_ID")
	private XML_Request_Entity xml;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "JSON_ID")
	private JSON_Request_Entity json;
	

	@Override
	public String toString() {
		return "Request_Entity [id=" + id + ", xml=" + xml + ", json=" + json + "]";
	}

	public Request_Entity(int id, XML_Request_Entity xml, JSON_Request_Entity json) {
		super();
		this.id = id;
		this.xml = xml;
		this.json = json;
	}

	public Request_Entity() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public XML_Request_Entity getXml() {
		return xml;
	}


	public void setXml(XML_Request_Entity xml) {
		this.xml = xml;
	}

	public JSON_Request_Entity getJson() {
		return json;
	}

	public void setJson(JSON_Request_Entity json) {
		this.json = json;
	}
	
	
}
