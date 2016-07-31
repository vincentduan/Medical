/**
 * 
 */
package com.childraise.medical.cms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.childraise.medical.cms.model.Category;
import com.childraise.medical.sys.model.Document;

/**
 * @author Jason_zh
 * @date 2016Äê6ÔÂ12ÈÕ
 * @version 1.0
 */
@Repository
public interface DocumentDao {
	public Document get(int id);
	
	public List<Document> getAllDoc();
	
	public void save(Document document);
}
