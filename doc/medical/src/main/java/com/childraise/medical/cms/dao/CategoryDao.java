package com.childraise.medical.cms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.childraise.medical.cms.model.Category;

/**
 * @author Jason_zh
 * @date 2016Äê6ÔÂ10ÈÕ
 * @version 1.0
 */
@Repository
public interface CategoryDao {
	public List<Category> findlevel1();
	
	public List<Category> findNextLevelById(int id);
	
	public Category findById(int id);
	
	public void save(Category category);
	
	public List<Category> findByPid(int pid);
	
	public List<Category> findAllCate();
}
