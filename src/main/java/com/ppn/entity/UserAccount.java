package com.ppn.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="UserAccount")
public class UserAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="accountID")
	private Integer accountID;
	
	@Column(name="acoount_index")
	private String acoount_index;
	
	@Column(name="password")
	private String password;
	
	@Column(name="fk_accountDetail_id")
	@Transient
	private Integer detailID;
	
	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name="fk_levelDetail_id")
	private UserDetail userDetail;
	
	@ManyToMany(mappedBy="userAccounts")
	private Set<FoodTag> foodtags =new HashSet<FoodTag>();
	
	@Column(name="fk_levelDetail_id")
	private Integer fk_levelDetail_id;
	
	@Column(name="fk_accountCat")
	private Integer fk_accountCat;
	
	
	public UserAccount() {	
	}
	

	public Integer getAccountID() {
		return accountID;
	}

	public void setAccountID(Integer accountID) {
		this.accountID = accountID;
	}

	public String getAcoount_index() {
		return acoount_index;
	}

	public void setAcoount_index(String acoount_index) {
		this.acoount_index = acoount_index;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getDetailID() {
		return detailID;
	}

	public void setDetailID(Integer detailID) {
		this.detailID = detailID;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	public Set<FoodTag> getFoodtags() {
		return foodtags;
	}

	public void setFoodtags(Set<FoodTag> foodtags) {
		this.foodtags = foodtags;
	}

	public Integer getFk_levelDetail_id() {
		return fk_levelDetail_id;
	}

	public void setFk_levelDetail_id(Integer fk_levelDetail_id) {
		this.fk_levelDetail_id = fk_levelDetail_id;
	}

	public Integer getFk_accountCat() {
		return fk_accountCat;
	}

	public void setFk_accountCat(Integer fk_accountCat) {
		this.fk_accountCat = fk_accountCat;
	}
	
	
}
