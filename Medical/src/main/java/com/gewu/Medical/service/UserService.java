package com.gewu.Medical.service;

import java.util.List;

import com.gewu.Medical.model.User;

public interface UserService extends BaseService<User> {
	public User queryByCondiction(User user);

	public User register(User user);

	public List<User> findByUserIds(List<Integer> userids);
}
