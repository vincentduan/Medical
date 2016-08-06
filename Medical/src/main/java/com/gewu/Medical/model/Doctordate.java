package com.gewu.Medical.model;

import java.util.Date;

public class Doctordate {
    private Integer id;

    private Integer doctorid;

    private Integer userid;

    private Integer orderid;

    private Date orderdate;

    private String info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

	@Override
	public String toString() {
		return "Doctordate [id=" + id + ", doctorid=" + doctorid + ", userid="
				+ userid + ", orderid=" + orderid + ", orderdate=" + orderdate
				+ ", info=" + info + "]";
	}
}