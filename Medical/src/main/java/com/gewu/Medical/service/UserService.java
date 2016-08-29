package com.gewu.Medical.service;

import com.gewu.Medical.model.User;

public interface UserService extends BaseService<User> {
	public User queryByCondiction(User user);

	public User register(User user);
}
