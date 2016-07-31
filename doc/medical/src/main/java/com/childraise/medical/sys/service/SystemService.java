/**
 * 
 */
package com.childraise.medical.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.childraise.medical.sys.dao.SystemDao;
import com.childraise.medical.sys.model.Archive;
import com.childraise.medical.sys.model.Document;
import com.childraise.medical.sys.model.User;

/**
 * @author Jason_zh
 * @date 2016Äê6ÔÂ3ÈÕ
 * @version 1.0
 */
@Service("systemService")
public class SystemService {
	@Autowired
	SystemDao systemDao;
	
	public List<String> getGuidePage(int num){
		return systemDao.getGuidePage(num);
	}
	
	public List<String> getAdPage(){
		return systemDao.getAdPage();
	}
	
	public Archive getArchive(int uid){
		return systemDao.getArchive(uid);
	}
	
	public User selectUser(int id){
		return systemDao.selectUser(id);
	}
	
	/*public List<Document> getCollect(int uid){
		List<Integer> cids = systemDao.getCollectIds(uid);
		
	}*/
	public User selectUserWithColl(int uid){
		return systemDao.selectUserWithColl(uid);
	}
}
