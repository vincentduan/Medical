package com.gewu.Medical.model;

import java.util.ArrayList;
import java.util.List;

public class ServicesetingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ServicesetingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNull() {
            addCriterion("doctorid is null");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNotNull() {
            addCriterion("doctorid is not null");
            return (Criteria) this;
        }

        public Criteria andDoctoridEqualTo(Integer value) {
            addCriterion("doctorid =", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotEqualTo(Integer value) {
            addCriterion("doctorid <>", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThan(Integer value) {
            addCriterion("doctorid >", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctorid >=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThan(Integer value) {
            addCriterion("doctorid <", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThanOrEqualTo(Integer value) {
            addCriterion("doctorid <=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridIn(List<Integer> values) {
            addCriterion("doctorid in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotIn(List<Integer> values) {
            addCriterion("doctorid not in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridBetween(Integer value1, Integer value2) {
            addCriterion("doctorid between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotBetween(Integer value1, Integer value2) {
            addCriterion("doctorid not between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andPictureconsultingIsNull() {
            addCriterion("pictureConsulting is null");
            return (Criteria) this;
        }

        public Criteria andPictureconsultingIsNotNull() {
            addCriterion("pictureConsulting is not null");
            return (Criteria) this;
        }

        public Criteria andPictureconsultingEqualTo(Boolean value) {
            addCriterion("pictureConsulting =", value, "pictureconsulting");
            return (Criteria) this;
        }

        public Criteria andPictureconsultingNotEqualTo(Boolean value) {
            addCriterion("pictureConsulting <>", value, "pictureconsulting");
            return (Criteria) this;
        }

        public Criteria andPictureconsultingGreaterThan(Boolean value) {
            addCriterion("pictureConsulting >", value, "pictureconsulting");
            return (Criteria) this;
        }

        public Criteria andPictureconsultingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pictureConsulting >=", value, "pictureconsulting");
            return (Criteria) this;
        }

        public Criteria andPictureconsultingLessThan(Boolean value) {
            addCriterion("pictureConsulting <", value, "pictureconsulting");
            return (Criteria) this;
        }

        public Criteria andPictureconsultingLessThanOrEqualTo(Boolean value) {
            addCriterion("pictureConsulting <=", value, "pictureconsulting");
            return (Criteria) this;
        }

        public Criteria andPictureconsultingIn(List<Boolean> values) {
            addCriterion("pictureConsulting in", values, "pictureconsulting");
            return (Criteria) this;
        }

        public Criteria andPictureconsultingNotIn(List<Boolean> values) {
            addCriterion("pictureConsulting not in", values, "pictureconsulting");
            return (Criteria) this;
        }

        public Criteria andPictureconsultingBetween(Boolean value1, Boolean value2) {
            addCriterion("pictureConsulting between", value1, value2, "pictureconsulting");
            return (Criteria) this;
        }

        public Criteria andPictureconsultingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pictureConsulting not between", value1, value2, "pictureconsulting");
            return (Criteria) this;
        }

        public Criteria andTelephoneconsultationIsNull() {
            addCriterion("telephoneConsultation is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneconsultationIsNotNull() {
            addCriterion("telephoneConsultation is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneconsultationEqualTo(Boolean value) {
            addCriterion("telephoneConsultation =", value, "telephoneconsultation");
            return (Criteria) this;
        }

        public Criteria andTelephoneconsultationNotEqualTo(Boolean value) {
            addCriterion("telephoneConsultation <>", value, "telephoneconsultation");
            return (Criteria) this;
        }

        public Criteria andTelephoneconsultationGreaterThan(Boolean value) {
            addCriterion("telephoneConsultation >", value, "telephoneconsultation");
            return (Criteria) this;
        }

        public Criteria andTelephoneconsultationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("telephoneConsultation >=", value, "telephoneconsultation");
            return (Criteria) this;
        }

        public Criteria andTelephoneconsultationLessThan(Boolean value) {
            addCriterion("telephoneConsultation <", value, "telephoneconsultation");
            return (Criteria) this;
        }

        public Criteria andTelephoneconsultationLessThanOrEqualTo(Boolean value) {
            addCriterion("telephoneConsultation <=", value, "telephoneconsultation");
            return (Criteria) this;
        }

        public Criteria andTelephoneconsultationIn(List<Boolean> values) {
            addCriterion("telephoneConsultation in", values, "telephoneconsultation");
            return (Criteria) this;
        }

        public Criteria andTelephoneconsultationNotIn(List<Boolean> values) {
            addCriterion("telephoneConsultation not in", values, "telephoneconsultation");
            return (Criteria) this;
        }

        public Criteria andTelephoneconsultationBetween(Boolean value1, Boolean value2) {
            addCriterion("telephoneConsultation between", value1, value2, "telephoneconsultation");
            return (Criteria) this;
        }

        public Criteria andTelephoneconsultationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("telephoneConsultation not between", value1, value2, "telephoneconsultation");
            return (Criteria) this;
        }

        public Criteria andVideoconsultationIsNull() {
            addCriterion("videoConsultation is null");
            return (Criteria) this;
        }

        public Criteria andVideoconsultationIsNotNull() {
            addCriterion("videoConsultation is not null");
            return (Criteria) this;
        }

        public Criteria andVideoconsultationEqualTo(Boolean value) {
            addCriterion("videoConsultation =", value, "videoconsultation");
            return (Criteria) this;
        }

        public Criteria andVideoconsultationNotEqualTo(Boolean value) {
            addCriterion("videoConsultation <>", value, "videoconsultation");
            return (Criteria) this;
        }

        public Criteria andVideoconsultationGreaterThan(Boolean value) {
            addCriterion("videoConsultation >", value, "videoconsultation");
            return (Criteria) this;
        }

        public Criteria andVideoconsultationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("videoConsultation >=", value, "videoconsultation");
            return (Criteria) this;
        }

        public Criteria andVideoconsultationLessThan(Boolean value) {
            addCriterion("videoConsultation <", value, "videoconsultation");
            return (Criteria) this;
        }

        public Criteria andVideoconsultationLessThanOrEqualTo(Boolean value) {
            addCriterion("videoConsultation <=", value, "videoconsultation");
            return (Criteria) this;
        }

        public Criteria andVideoconsultationIn(List<Boolean> values) {
            addCriterion("videoConsultation in", values, "videoconsultation");
            return (Criteria) this;
        }

        public Criteria andVideoconsultationNotIn(List<Boolean> values) {
            addCriterion("videoConsultation not in", values, "videoconsultation");
            return (Criteria) this;
        }

        public Criteria andVideoconsultationBetween(Boolean value1, Boolean value2) {
            addCriterion("videoConsultation between", value1, value2, "videoconsultation");
            return (Criteria) this;
        }

        public Criteria andVideoconsultationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("videoConsultation not between", value1, value2, "videoconsultation");
            return (Criteria) this;
        }

        public Criteria andConsultingpackageIsNull() {
            addCriterion("consultingPackage is null");
            return (Criteria) this;
        }

        public Criteria andConsultingpackageIsNotNull() {
            addCriterion("consultingPackage is not null");
            return (Criteria) this;
        }

        public Criteria andConsultingpackageEqualTo(Boolean value) {
            addCriterion("consultingPackage =", value, "consultingpackage");
            return (Criteria) this;
        }

        public Criteria andConsultingpackageNotEqualTo(Boolean value) {
            addCriterion("consultingPackage <>", value, "consultingpackage");
            return (Criteria) this;
        }

        public Criteria andConsultingpackageGreaterThan(Boolean value) {
            addCriterion("consultingPackage >", value, "consultingpackage");
            return (Criteria) this;
        }

        public Criteria andConsultingpackageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("consultingPackage >=", value, "consultingpackage");
            return (Criteria) this;
        }

        public Criteria andConsultingpackageLessThan(Boolean value) {
            addCriterion("consultingPackage <", value, "consultingpackage");
            return (Criteria) this;
        }

        public Criteria andConsultingpackageLessThanOrEqualTo(Boolean value) {
            addCriterion("consultingPackage <=", value, "consultingpackage");
            return (Criteria) this;
        }

        public Criteria andConsultingpackageIn(List<Boolean> values) {
            addCriterion("consultingPackage in", values, "consultingpackage");
            return (Criteria) this;
        }

        public Criteria andConsultingpackageNotIn(List<Boolean> values) {
            addCriterion("consultingPackage not in", values, "consultingpackage");
            return (Criteria) this;
        }

        public Criteria andConsultingpackageBetween(Boolean value1, Boolean value2) {
            addCriterion("consultingPackage between", value1, value2, "consultingpackage");
            return (Criteria) this;
        }

        public Criteria andConsultingpackageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("consultingPackage not between", value1, value2, "consultingpackage");
            return (Criteria) this;
        }

        public Criteria andOutpatientIsNull() {
            addCriterion("outPatient is null");
            return (Criteria) this;
        }

        public Criteria andOutpatientIsNotNull() {
            addCriterion("outPatient is not null");
            return (Criteria) this;
        }

        public Criteria andOutpatientEqualTo(Boolean value) {
            addCriterion("outPatient =", value, "outpatient");
            return (Criteria) this;
        }

        public Criteria andOutpatientNotEqualTo(Boolean value) {
            addCriterion("outPatient <>", value, "outpatient");
            return (Criteria) this;
        }

        public Criteria andOutpatientGreaterThan(Boolean value) {
            addCriterion("outPatient >", value, "outpatient");
            return (Criteria) this;
        }

        public Criteria andOutpatientGreaterThanOrEqualTo(Boolean value) {
            addCriterion("outPatient >=", value, "outpatient");
            return (Criteria) this;
        }

        public Criteria andOutpatientLessThan(Boolean value) {
            addCriterion("outPatient <", value, "outpatient");
            return (Criteria) this;
        }

        public Criteria andOutpatientLessThanOrEqualTo(Boolean value) {
            addCriterion("outPatient <=", value, "outpatient");
            return (Criteria) this;
        }

        public Criteria andOutpatientIn(List<Boolean> values) {
            addCriterion("outPatient in", values, "outpatient");
            return (Criteria) this;
        }

        public Criteria andOutpatientNotIn(List<Boolean> values) {
            addCriterion("outPatient not in", values, "outpatient");
            return (Criteria) this;
        }

        public Criteria andOutpatientBetween(Boolean value1, Boolean value2) {
            addCriterion("outPatient between", value1, value2, "outpatient");
            return (Criteria) this;
        }

        public Criteria andOutpatientNotBetween(Boolean value1, Boolean value2) {
            addCriterion("outPatient not between", value1, value2, "outpatient");
            return (Criteria) this;
        }

        public Criteria andGuidanceIsNull() {
            addCriterion("guidance is null");
            return (Criteria) this;
        }

        public Criteria andGuidanceIsNotNull() {
            addCriterion("guidance is not null");
            return (Criteria) this;
        }

        public Criteria andGuidanceEqualTo(Boolean value) {
            addCriterion("guidance =", value, "guidance");
            return (Criteria) this;
        }

        public Criteria andGuidanceNotEqualTo(Boolean value) {
            addCriterion("guidance <>", value, "guidance");
            return (Criteria) this;
        }

        public Criteria andGuidanceGreaterThan(Boolean value) {
            addCriterion("guidance >", value, "guidance");
            return (Criteria) this;
        }

        public Criteria andGuidanceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("guidance >=", value, "guidance");
            return (Criteria) this;
        }

        public Criteria andGuidanceLessThan(Boolean value) {
            addCriterion("guidance <", value, "guidance");
            return (Criteria) this;
        }

        public Criteria andGuidanceLessThanOrEqualTo(Boolean value) {
            addCriterion("guidance <=", value, "guidance");
            return (Criteria) this;
        }

        public Criteria andGuidanceIn(List<Boolean> values) {
            addCriterion("guidance in", values, "guidance");
            return (Criteria) this;
        }

        public Criteria andGuidanceNotIn(List<Boolean> values) {
            addCriterion("guidance not in", values, "guidance");
            return (Criteria) this;
        }

        public Criteria andGuidanceBetween(Boolean value1, Boolean value2) {
            addCriterion("guidance between", value1, value2, "guidance");
            return (Criteria) this;
        }

        public Criteria andGuidanceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("guidance not between", value1, value2, "guidance");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("isDel is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("isDel is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(Boolean value) {
            addCriterion("isDel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(Boolean value) {
            addCriterion("isDel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(Boolean value) {
            addCriterion("isDel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isDel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(Boolean value) {
            addCriterion("isDel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(Boolean value) {
            addCriterion("isDel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<Boolean> values) {
            addCriterion("isDel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<Boolean> values) {
            addCriterion("isDel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(Boolean value1, Boolean value2) {
            addCriterion("isDel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isDel not between", value1, value2, "isdel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}