package com.ppn.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="userdetail")
public class UserDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="uDetailID")
	private Integer uDetailID;
	
	@Column(name="realname")
	private String realName;
	
	@Column(name="nickname")
	private String nickName;
	
	@Column(name="phonenumber")
	private String phoneNumer;
	
	@Column(name="birthday")
	private Date birthday;
	
	@Column(name="userphotoname")
	private String userphotoname;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="location")
	private String location;
	
	@Column(name="fk_purse_id")
	private Integer fk_purse_id;
}
