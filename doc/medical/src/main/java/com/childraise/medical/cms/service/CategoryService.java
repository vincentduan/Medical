package com.childraise.medical.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.childraise.medical.cms.dao.CategoryDao;
import com.childraise.medical.cms.model.Category;

/**
 * @author Jason_zh
 * @date 2016Äê6ÔÂ10ÈÕ
 * @version 1.0
 */
@Service("categoryService")
public class CategoryService {
	@Autowired
	private CategoryDao categoryDao;
	
	public List<Category> findlevel1(){
		return categoryDao.findlevel1();
	}
	
	public List<Category> findNextLevelById(int id){
		return categoryDao.findNextLevelById(id);
	}
	
	public Category findById(int id){
		return categoryDao.findById(id);
	}
	
	public void save(Category category){
		categoryDao.save(category);
	}
	
	public List<Category> findByPid(int pid){
		return categoryDao.findByPid(pid);
	}
	

	public List<Category> findAllCate(){
		return categoryDao.findAllCate();
	}
}
