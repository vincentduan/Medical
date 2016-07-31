package com.childraise.medical.sys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.childraise.medical.sys.model.Archive;
import com.childraise.medical.sys.model.User;
/**
 * @author Jason_zh
 * @date 2016Äê6ÔÂ3ÈÕ
 * @version 1.0
 */

@Repository
public interface SystemDao {

	public List<String> getGuidePage(int num);
	
	public List<String> getAdPage();
	
	public Archive getArchive(int uid);
	
	public User selectUser(int id);
	
	public List<Integer> getCollectIds(int uid);
	
	public User selectUserWithColl(int uid);
}
