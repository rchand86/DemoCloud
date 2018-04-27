package com.soprasteria.sopramatch.domain;

public class AdOneUser {
	
	private String employeeID;
	private String displayName;
	private String telephoneNumber;
	private String mail;
	private String SteriaStartDate;
	private String department;
	private byte[] thumbnailPhoto;

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String string) {
		this.employeeID = string;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSteriaStartDate() {
		return SteriaStartDate;
	}

	public void setSteriaStartDate(String steriaStartDate) {
		SteriaStartDate = steriaStartDate;
	}

	public String getDepartment() {
		return department;
	}
	public byte[] getThumbnailPhoto() {
		return thumbnailPhoto;
	}

	public void setThumbnailPhoto(byte[] thumbnailPhoto) {
		this.thumbnailPhoto = thumbnailPhoto;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("EmpID [ ").append(employeeID).append(" ] mail [ ").append(mail).append(" ]")
				.append(" Display Name [ ").append(displayName).append(" ]").toString();
	}

}
