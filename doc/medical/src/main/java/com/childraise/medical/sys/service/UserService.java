/**
 * 
 */
package com.childraise.medical.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.childraise.medical.sys.dao.UserDao;
import com.childraise.medical.sys.model.User;


/**
 * @author Jason_zh
 * @date 2016Äê6ÔÂ2ÈÕ
 * @version 1.0
 */
@Service("userService")
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public int register(String phone,String password){
		int res = userDao.register(phone,password);
		return res;
	}
	
	public User getUserByPhone(String phone){
		return userDao.getUserByPhone(phone);
	}
	
	public int updatePassword(String password,String phone){
		return userDao.updatePassword(password,phone);
	}
	
	public List<User> findAllUsers(){
		return userDao.findAllUsers();
	}
}
