package org.npci.sandbox;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "XML_REQUEST")
public class XML_Request_Entity {
	
	@Id 
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="FIELD_NAME", nullable=false)
	private String fieldName;
	
	@Column(name="FIELD_TYPE", nullable=false)
	private String fieldType;

	@Column(name="VALUE_TYPE", nullable=false)
	private String valueType;
	
	@Column(name="MANDATORY_OPTIONAL", nullable=false)
	private String mandateOpt;
	
	@Column(name="MAX_LENGTH", nullable=false)
	private int maxLength;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "xml")
	private Request_Entity rqst;

	

	@Override
	public String toString() {
		return "XML_Request_Entity [id=" + id + ", fieldName=" + fieldName + ", fieldType=" + fieldType + ", valueType="
				+ valueType + ", mandateOpt=" + mandateOpt + ", maxLength=" + maxLength + ", rqst=" + rqst + "]";
	}

	public XML_Request_Entity(int id, String fieldName, String fieldType, String valueType, String mandateOpt,
			int maxLength, Request_Entity rqst) {
		super();
		this.id = id;
		this.fieldName = fieldName;
		this.fieldType = fieldType;
		this.valueType = valueType;
		this.mandateOpt = mandateOpt;
		this.maxLength = maxLength;
		this.rqst= rqst;
	}

	public XML_Request_Entity() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getValueType() {
		return valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	public String getMandateOpt() {
		return mandateOpt;
	}

	public void setMandateOpt(String mandateOpt) {
		this.mandateOpt = mandateOpt;
	}

	public int getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}

	public Request_Entity getRqst() {
		return rqst;
	}

	public void setRqst(Request_Entity rqst) {
		this.rqst = rqst;
	}
	
}
