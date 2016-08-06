package com.gewu.Medical.model;

public class Serviceseting {
    private Integer id;

    private Integer doctorid;

    private Boolean pictureconsulting;

    private Boolean telephoneconsultation;

    private Boolean videoconsultation;

    private Boolean consultingpackage;

    private Boolean outpatient;

    private Boolean guidance;

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

    public Boolean getPictureconsulting() {
        return pictureconsulting;
    }

    public void setPictureconsulting(Boolean pictureconsulting) {
        this.pictureconsulting = pictureconsulting;
    }

    public Boolean getTelephoneconsultation() {
        return telephoneconsultation;
    }

    public void setTelephoneconsultation(Boolean telephoneconsultation) {
        this.telephoneconsultation = telephoneconsultation;
    }

    public Boolean getVideoconsultation() {
        return videoconsultation;
    }

    public void setVideoconsultation(Boolean videoconsultation) {
        this.videoconsultation = videoconsultation;
    }

    public Boolean getConsultingpackage() {
        return consultingpackage;
    }

    public void setConsultingpackage(Boolean consultingpackage) {
        this.consultingpackage = consultingpackage;
    }

    public Boolean getOutpatient() {
        return outpatient;
    }

    public void setOutpatient(Boolean outpatient) {
        this.outpatient = outpatient;
    }

    public Boolean getGuidance() {
        return guidance;
    }

    public void setGuidance(Boolean guidance) {
        this.guidance = guidance;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}