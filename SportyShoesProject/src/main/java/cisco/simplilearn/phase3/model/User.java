package cisco.simplilearn.phase3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User {
	
@Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 @Column(name = "user_id")
 private int userId;
 
 @Column(name = "user_name")
 private String userNmae;
 
 @Column(name = "password")
 private String password;
 
 @Column(name = "email")
 private String email;
 
 @Column(name = "phone_number")
 private long phone_number;

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserNmae() {
	return userNmae;
}

public void setUserNmae(String userNmae) {
	this.userNmae = userNmae;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getPhone_number() {
	return phone_number;
}

public void setPhone_number(long phone_number) {
	this.phone_number = phone_number;
}
@Override
	public String toString() {
		return "User [userId=" + userId + ", userNmae=" + userNmae + ", password=" + password + ", email=" + email
				+ ", phone_number=" + phone_number + "]";
	}
 
}
