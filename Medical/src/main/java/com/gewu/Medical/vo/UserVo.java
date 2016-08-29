package com.gewu.Medical.vo;

import com.gewu.Medical.model.User;

public class UserVo {
	private User user;
	private String status;
	private String message;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserVo [user=" + user + ", status=" + status + ", message="
				+ message + "]";
	}
	
}
