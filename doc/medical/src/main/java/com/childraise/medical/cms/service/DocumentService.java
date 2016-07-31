/**
 * 
 */
package com.childraise.medical.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.childraise.medical.cms.dao.DocumentDao;
import com.childraise.medical.cms.model.Category;
import com.childraise.medical.sys.model.Document;

/**
 * @author Jason_zh
 * @date 2016Äê6ÔÂ12ÈÕ
 * @version 1.0
 */
@Service("documentService")
public class DocumentService {
	@Autowired
	private DocumentDao documentDao;
	
	public Document get(int id){
		return documentDao.get(id);
	}
	
	public List<Document> getAllDoc(){
		return documentDao.getAllDoc();
	}
	
	public void save(Document document){
		documentDao.save(document);
	}
}
