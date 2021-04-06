package com.hcl.petpeers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name="USER")
public class User {
	
		
		@Id
		@Column(name="USER_ID")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer userId;
		
		@Column(name="USER_NAME")
		@NotEmpty(message="User name should not be blank.")
		@Size(min=3,max=10)
		private String userName;
		
		
		@Column(name="USER_EMAIl")
		@NotEmpty
		@Size(min=3,max=10)
		private String userEmail;
		
		
		@Column(name="USER_PASSWORD")
		@NotNull
		private String passWord;
		
		
		/*
		 * public User(Integer userId, String userName, String userEmailId, String
		 * passWord) { super(); this.userId = userId; this.userName = userName;
		 * this.userEmailId = userEmailId; this.passWord = passWord; }
		 * 
		 */
		public Integer getUserId() {
			return userId;
		}


		public void setUserId(Integer userId) {
			this.userId = userId;
		}


		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public String getUserEmail() {
			return userEmail;
		}


		public void setUserEmailId(String userEmailId) {
			this.userEmail = userEmailId;
		}


		public String getPassWord() {
			return passWord;
		}


		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}
		
		
		

}