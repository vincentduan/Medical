package com.gewu.Medical.vo;

import com.gewu.Medical.model.Article;
import com.gewu.Medical.model.Department;
import com.gewu.Medical.model.Doctor;
import com.gewu.Medical.model.Order;

public class DoctorVo extends Doctor {
	private Department departmentInfo;
	private Article article;
	private Order order;
	

	@Override
	public String toString() {
		return "DoctorVo [departmentInfo=" + departmentInfo + ", article="
				+ article + ", order=" + order + "]";
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Department getDepartmentInfo() {
		return departmentInfo;
	}

	public void setDepartmentInfo(Department departmentInfo) {
		this.departmentInfo = departmentInfo;
	}


	

	
}
