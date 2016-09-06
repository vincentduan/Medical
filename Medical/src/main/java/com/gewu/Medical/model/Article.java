package com.gewu.Medical.model;

import java.util.Date;

public class Article {
    private Integer id;

    private Integer doctorid;

    private String doctorName;

    private String title;

    private Integer categoryParent;

    private Integer categoryChild;

    private String status;

    private String info;

    private Date createtime;

    private Date updatetime;

    private Boolean isdel;

    private String document;

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

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getCategoryParent() {
        return categoryParent;
    }

    public void setCategoryParent(Integer categoryParent) {
        this.categoryParent = categoryParent;
    }

    public Integer getCategoryChild() {
        return categoryChild;
    }

    public void setCategoryChild(Integer categoryChild) {
        this.categoryChild = categoryChild;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Boolean getIsdel() {
        return isdel;
    }

    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document == null ? null : document.trim();
    }
}