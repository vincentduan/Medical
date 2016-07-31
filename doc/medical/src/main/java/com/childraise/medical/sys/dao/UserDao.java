/**
 * 
 */
package com.childraise.medical.sys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.childraise.medical.sys.model.User;

/**
 * @author Jason_zh
 * @date 2016Äê6ÔÂ2ÈÕ
 * @version 1.0
 */
@Repository
public interface UserDao {
	public int register(String phone,String password);
	
	public User getUserByPhone(String phone);
	
	public int updatePassword(String password,String phone);
	
	public List<User> findAllUsers();
}
