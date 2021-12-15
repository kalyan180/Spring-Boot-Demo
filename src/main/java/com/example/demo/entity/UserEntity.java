package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="USER_ENTITY")
@Table(name ="USER_ENTITY")
public class UserEntity {
	
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public Long getU_mobile() {
		return u_mobile;
	}
	public void setU_mobile(Long u_mobile) {
		this.u_mobile = u_mobile;
	}
	public Integer getU_real_id() {
		return u_real_id;
	}
	public void setU_real_id(Integer u_real_id) {
		this.u_real_id = u_real_id;
	}
	@Id
	private Integer u_id;
	@Column
	private String u_name;
	@Column
	private String u_email;
	@Column
	private Long u_mobile;
	@Column
	private Integer u_real_id; 
	
	

}
