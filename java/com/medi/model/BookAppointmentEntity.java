package com.medi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookappointment")
public class BookAppointmentEntity {
@Id
@Column(name="User_email")
private String pid;
@Column(name="P_NAME")
private String pname;
@Column(name="CONTACT")
private Integer contact;
@Column(name="ADRESS")
private String adress;
@Column(name="AGE")
private Integer age;
@Column(name="APP_TYPE")
private String atype;
@Column(name="A_DATE")
private Date adate;
public BookAppointmentEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public BookAppointmentEntity(String pid, String pname, Integer contact, String adress, Integer age, String atype,
		Date adate) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.contact = contact;
	this.adress = adress;
	this.age = age;
	this.atype = atype;
	this.adate = adate;
}
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Integer getContact() {
	return contact;
}
public void setContact(Integer contact) {
	this.contact = contact;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getAtype() {
	return atype;
}
public void setAtype(String atype) {
	this.atype = atype;
}
public Date getAdate() {
	return adate;
}
public void setAdate(Date adate) {
	this.adate = adate;
}
@Override
public String toString() {
	return "BookAppointmentEntity [pid=" + pid + ", pname=" + pname + ", contact=" + contact + ", adress=" + adress
			+ ", age=" + age + ", atype=" + atype + ", adate=" + adate + "]";
}












}
