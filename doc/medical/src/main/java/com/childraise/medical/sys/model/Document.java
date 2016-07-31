/**
 * 
 */
package com.childraise.medical.sys.model;

import com.childraise.medical.cms.model.Category;

/**
 * @author Jason_zh
 * @date 2016Äê6ÔÂ11ÈÕ
 * @version 1.0
 */
public class Document {
	private int id;
	private Category category;
	private String title;
	private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
