package com.hjj.bean;

/**
 * @author haojunjie
 * @create 2022-06-15 0:33
 */
public class User {
	private String userName;

	private Long id;

	@Override
	public String toString() {
		return "User{" +
				"userName='" + userName + '\'' +
				", id=" + id +
				'}';
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
