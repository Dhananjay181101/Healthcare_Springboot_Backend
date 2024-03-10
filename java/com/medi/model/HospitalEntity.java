package com.medi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hospital")
public class HospitalEntity {

	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name=" HID")
	private Integer hid;
	@Column(name="HNAME")
	private Integer hname;
	@Column(name=" HADRESS")
	private String hadress;
	@Column(name=" HCONTACT")
	private Integer hcontact;
	public HospitalEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HospitalEntity(Integer hid, Integer hname, String hadress, Integer hcontact) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.hadress = hadress;
		this.hcontact = hcontact;
	}
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public Integer getHname() {
		return hname;
	}
	public void setHname(Integer hname) {
		this.hname = hname;
	}
	public String getHadress() {
		return hadress;
	}
	public void setHadress(String hadress) {
		this.hadress = hadress;
	}
	public Integer getHcontact() {
		return hcontact;
	}
	public void setHcontact(Integer hcontact) {
		this.hcontact = hcontact;
	}
	@Override
	public String toString() {
		return "HospitalEntity [hid=" + hid + ", hname=" + hname + ", hadress=" + hadress + ", hcontact=" + hcontact
				+ "]";
	}	
	
	
	
}
