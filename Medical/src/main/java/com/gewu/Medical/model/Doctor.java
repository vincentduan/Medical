package com.gewu.Medical.model;

import java.math.BigDecimal;
import java.util.Date;

public class Doctor {
    private Integer id;

    private String username;

    private String password;

    private String accounttype;

    private String isrealname;

    private String licensenum;

    private String telphone;

    private String status;

    private String role;

    private String email;

    private String hospital;

    private Integer department;

    private String brief;

    private String info;

    private BigDecimal score;

    private Integer fansnum;

    private Integer price;

    private String advantage;

    private String background;

    private String achievement;

    private String avatar;

    private Date createtime;

    private Date updatetime;

    private Boolean isdel;

    private String englishname;

    private String education;

    private String workingexp;

    private String haspersonalclinic;

    private String personalclinicinfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype == null ? null : accounttype.trim();
    }

    public String getIsrealname() {
        return isrealname;
    }

    public void setIsrealname(String isrealname) {
        this.isrealname = isrealname == null ? null : isrealname.trim();
    }

    public String getLicensenum() {
        return licensenum;
    }

    public void setLicensenum(String licensenum) {
        this.licensenum = licensenum == null ? null : licensenum.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital == null ? null : hospital.trim();
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Integer getFansnum() {
        return fansnum;
    }

    public void setFansnum(Integer fansnum) {
        this.fansnum = fansnum;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage == null ? null : advantage.trim();
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background == null ? null : background.trim();
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement == null ? null : achievement.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
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

    public String getEnglishname() {
        return englishname;
    }

    public void setEnglishname(String englishname) {
        this.englishname = englishname == null ? null : englishname.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getWorkingexp() {
        return workingexp;
    }

    public void setWorkingexp(String workingexp) {
        this.workingexp = workingexp == null ? null : workingexp.trim();
    }

    public String getHaspersonalclinic() {
        return haspersonalclinic;
    }

    public void setHaspersonalclinic(String haspersonalclinic) {
        this.haspersonalclinic = haspersonalclinic == null ? null : haspersonalclinic.trim();
    }

    public String getPersonalclinicinfo() {
        return personalclinicinfo;
    }

    public void setPersonalclinicinfo(String personalclinicinfo) {
        this.personalclinicinfo = personalclinicinfo == null ? null : personalclinicinfo.trim();
    }
}