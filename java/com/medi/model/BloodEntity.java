package com.medi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="blood_groups")

public class BloodEntity {

	
	
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name=" BLOOD_ID")
	private Integer bloodid;
	@Column(name="HOSPITAL_ID")
	private Integer hos_id;
	@Column(name=" BLOOD_GROUP")
	private String blgroup;
	
	public BloodEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BloodEntity(Integer bloodid, Integer hos_id, String blgroup) {
		super();
		this.bloodid = bloodid;
		this.hos_id = hos_id;
		this.blgroup = blgroup;
	}

	public Integer getBloodid() {
		return bloodid;
	}

	public void setBloodid(Integer bloodid) {
		this.bloodid = bloodid;
	}

	public Integer getHos_id() {
		return hos_id;
	}

	public void setHos_id(Integer hos_id) {
		this.hos_id = hos_id;
	}

	public String getBlgroup() {
		return blgroup;
	}

	public void setBlgroup(String blgroup) {
		this.blgroup = blgroup;
	}

	@Override
	public String toString() {
		return "BloodEntity [bloodid=" + bloodid + ", hos_id=" + hos_id + ", blgroup=" + blgroup + "]";
	}
		
	
}


