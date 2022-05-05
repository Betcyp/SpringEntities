package org.npci.sandbox;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BANK_ERROR_CODE_MASTER")
public class Bank_Error_Code_Master_Entity {
	
	@Id 
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="ERROR_CODE")
	private int errorCode;
	
	@Column(name="ERROR_DESC")
	private String errorDesc;

	@Override
	public String toString() {
		return "Bank_Error_Code_Master_Entity [id=" + id + ", errorCode=" + errorCode + ", errorDesc=" + errorDesc
				+ "]";
	}

	public Bank_Error_Code_Master_Entity(int id, int errorCode, String errorDesc) {
		super();
		this.id = id;
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}

	public Bank_Error_Code_Master_Entity() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	
}
