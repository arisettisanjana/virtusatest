package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	  
	@Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private long id;
	   
	   @Column(name="email")
	   private String email;
	   
	   @Column(name="password")
	   private String password;
	   
	   @Column(name="username")
	   private String username;
	   
	   @Column(name="mobileNumber")
	   private String mobileNumber;
	   
	   @Column
	   private String qualification;
	   
	   @Column
	   private boolean active;
	   
	   @Column
	   private String role;
	   
	   public User()
	   {
		   
	   }
	   
	   
	   public User(String email, String password, String username, String mobileNumber, String qualification,
				boolean active, String role) {
			super();
			this.email = email;
			this.password = password;
			this.username = username;
			this.mobileNumber = mobileNumber;
			this.qualification = qualification;
			this.active = active;
			this.role = role;
		}

	   
	   
	   
	   
	  
	  public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getUsername() {
		return username;
	}
	



	public void setUsername(String username) {
		this.username = username;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getQualification() {
		return qualification;
	}



	public void setQualification(String qualification) {
		this.qualification = qualification;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	
   
      
}
