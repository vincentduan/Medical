package com.childraise.medical.cms.model;
/**
 * @author Jason_zh
 * @date 2016Äê6ÔÂ10ÈÕ
 * @version 1.0
 */
public class Category {
	private int id;
	private int pid;
	private String title;
	private int level;
	private String intro;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
}
