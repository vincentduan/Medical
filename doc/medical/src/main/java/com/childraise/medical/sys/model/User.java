package com.childraise.medical.sys.model;

import java.util.List;

/**
 * @author Jason_zh
 * @date 2016Äê6ÔÂ2ÈÕ
 * @version 1.0
 */
public class User {
	private int id;
	private String phone;
	private String password;
	private String name;
	private String join_id;
	private int is_vip;
	private int account_m;
	
	private List<Document> collection;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJoin_id() {
		return join_id;
	}
	public void setJoin_id(String join_id) {
		this.join_id = join_id;
	}
	public int getIs_vip() {
		return is_vip;
	}
	public void setIs_vip(int is_vip) {
		this.is_vip = is_vip;
	}
	public int getAccount_m() {
		return account_m;
	}
	public void setAccount_m(int account_m) {
		this.account_m = account_m;
	}
	public List<Document> getCollection() {
		return collection;
	}
	public void setCollection(List<Document> collection) {
		this.collection = collection;
	}
}
