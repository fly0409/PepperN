package com.ppn.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="foodtag")
public class FoodTag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FoodTagID")
	private Integer foodtagID;
	
	@Column(name="FoodTagName")
	private String foodTagName;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name="foodtag_user",
			   joinColumns= {@JoinColumn(name="fk_foodTag_id",referencedColumnName = "FoodTagID")},
			   inverseJoinColumns = {@JoinColumn(name="fk_userAccount_id",referencedColumnName="accountID")})
	private Set<UserAccount> userAccounts = new HashSet<UserAccount>();
	
	
}
