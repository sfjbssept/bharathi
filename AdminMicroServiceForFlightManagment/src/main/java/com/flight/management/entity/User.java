package com.flight.management.entity;

import java.util.Objects;

public class User {
	
	private String userName;
	private String userRole;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userRole=" + userRole + ", password=" + password + "]";
	}
	public User(String userName, String userRole, String password) {
		super();
		this.userName = userName;
		this.userRole = userRole;
		this.password = password;
	}
	public User() {
	}
	@Override
	public int hashCode() {
		return Objects.hash(password, userName, userRole);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(password, other.password) && Objects.equals(userName, other.userName)
				&& Objects.equals(userRole, other.userRole);
	}
	
	
	
	

}
