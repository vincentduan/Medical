package com.gewu.Medical.vo;

import java.util.List;

import com.gewu.Medical.model.Article;
import com.gewu.Medical.model.Doctor;
import com.gewu.Medical.model.User;

public class ArticleVo {
	private Doctor doctor;
	private List<User> user;
	private String message;
	private Article article;
	private List<Article> scanAricles;
	private String isCollected;
	
	public String getIsCollected() {
		return isCollected;
	}
	public void setIsCollected(String isCollected) {
		this.isCollected = isCollected;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Article> getScanAricles() {
		return scanAricles;
	}
	public void setScanAricles(List<Article> scanAricles) {
		this.scanAricles = scanAricles;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	
	
}
