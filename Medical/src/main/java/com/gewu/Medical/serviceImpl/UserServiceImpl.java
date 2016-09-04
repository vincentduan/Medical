package com.gewu.Medical.serviceImpl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gewu.Medical.dao.UserMapper;
import com.gewu.Medical.model.User;
import com.gewu.Medical.model.UserExample;
import com.gewu.Medical.model.UserExample.Criteria;
import com.gewu.Medical.service.UserService;
import com.gewu.Medical.utils.Page;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(User t) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(t);
	}

	@Override
	public int update(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void queryByPage(Page<User> page, User t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public User queryByCondiction(User user) {
		if(user==null){
			return null;
		}
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		if(user.getUsername()!=null){
			criteria.andUsernameEqualTo(user.getUsername());
		}
		if(user.getTelphone()!=null){
			criteria.andTelphoneEqualTo(user.getTelphone());
		}
		if(user.getPassword()!=null){
			criteria.andPasswordEqualTo(user.getPassword());
		}
		List<User> users = userMapper.selectByExample(example);
		if(users.size()>0){
			return users.get(0);
		}
		return null;
	}

	@Override
	public User register(User user) {
		if(StringUtils.isNotEmpty(user.getUsername())&&StringUtils.isNotEmpty(user.getTelphone())){
			
			
		}
		return null;
	}

}
