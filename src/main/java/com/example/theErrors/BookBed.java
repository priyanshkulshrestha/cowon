package com.example.theErrors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookBed {
	@Id
	private String idProofNo;
	@Column
	private String idProof;
	@Column
	private String userName;
	@Column
	private String mobileNumber;
	@Column
	private String userEmail;
	@Column
	private String bedType;
	@Column
	private String hospital;
	private BookBed() {
		
	}
	public BookBed(String idProofNo, String idProof, String userName, String mobileNumber, String userEmail,
			String bedType, String hospital) {
		super();
		this.idProofNo = idProofNo;
		this.idProof = idProof;
		this.userName = userName;
		this.mobileNumber = mobileNumber;
		this.userEmail = userEmail;
		this.bedType = bedType;
		this.hospital = hospital;
	}
	public String getIdProofNo() {
		return idProofNo;
	}
	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}
	public String getIdProof() {
		return idProof;
	}
	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getBedType() {
		return bedType;
	}
	public void setBedType(String bedType) {
		this.bedType = bedType;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	
	
}
