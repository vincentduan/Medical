/**
 * 
 */
package com.childraise.medical.sys.model;

/**
 * @author Jason_zh
 * @date 2016��6��12��
 * @version 1.0
 */
public class Archive {
	private int id;
	private String title;
	private String content;
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
