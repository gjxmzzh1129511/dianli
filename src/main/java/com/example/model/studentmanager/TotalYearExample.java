package com.example.model.studentmanager;

import java.util.ArrayList;
import java.util.List;

public class TotalYearExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TotalYearExample() {
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

        public Criteria andAepIsNull() {
            addCriterion("AEP is null");
            return (Criteria) this;
        }

        public Criteria andAepIsNotNull() {
            addCriterion("AEP is not null");
            return (Criteria) this;
        }

        public Criteria andAepEqualTo(Long value) {
            addCriterion("AEP =", value, "aep");
            return (Criteria) this;
        }

        public Criteria andAepNotEqualTo(Long value) {
            addCriterion("AEP <>", value, "aep");
            return (Criteria) this;
        }

        public Criteria andAepGreaterThan(Long value) {
            addCriterion("AEP >", value, "aep");
            return (Criteria) this;
        }

        public Criteria andAepGreaterThanOrEqualTo(Long value) {
            addCriterion("AEP >=", value, "aep");
            return (Criteria) this;
        }

        public Criteria andAepLessThan(Long value) {
            addCriterion("AEP <", value, "aep");
            return (Criteria) this;
        }

        public Criteria andAepLessThanOrEqualTo(Long value) {
            addCriterion("AEP <=", value, "aep");
            return (Criteria) this;
        }

        public Criteria andAepIn(List<Long> values) {
            addCriterion("AEP in", values, "aep");
            return (Criteria) this;
        }

        public Criteria andAepNotIn(List<Long> values) {
            addCriterion("AEP not in", values, "aep");
            return (Criteria) this;
        }

        public Criteria andAepBetween(Long value1, Long value2) {
            addCriterion("AEP between", value1, value2, "aep");
            return (Criteria) this;
        }

        public Criteria andAepNotBetween(Long value1, Long value2) {
            addCriterion("AEP not between", value1, value2, "aep");
            return (Criteria) this;
        }

        public Criteria andComedIsNull() {
            addCriterion("COMED is null");
            return (Criteria) this;
        }

        public Criteria andComedIsNotNull() {
            addCriterion("COMED is not null");
            return (Criteria) this;
        }

        public Criteria andComedEqualTo(Long value) {
            addCriterion("COMED =", value, "comed");
            return (Criteria) this;
        }

        public Criteria andComedNotEqualTo(Long value) {
            addCriterion("COMED <>", value, "comed");
            return (Criteria) this;
        }

        public Criteria andComedGreaterThan(Long value) {
            addCriterion("COMED >", value, "comed");
            return (Criteria) this;
        }

        public Criteria andComedGreaterThanOrEqualTo(Long value) {
            addCriterion("COMED >=", value, "comed");
            return (Criteria) this;
        }

        public Criteria andComedLessThan(Long value) {
            addCriterion("COMED <", value, "comed");
            return (Criteria) this;
        }

        public Criteria andComedLessThanOrEqualTo(Long value) {
            addCriterion("COMED <=", value, "comed");
            return (Criteria) this;
        }

        public Criteria andComedIn(List<Long> values) {
            addCriterion("COMED in", values, "comed");
            return (Criteria) this;
        }

        public Criteria andComedNotIn(List<Long> values) {
            addCriterion("COMED not in", values, "comed");
            return (Criteria) this;
        }

        public Criteria andComedBetween(Long value1, Long value2) {
            addCriterion("COMED between", value1, value2, "comed");
            return (Criteria) this;
        }

        public Criteria andComedNotBetween(Long value1, Long value2) {
            addCriterion("COMED not between", value1, value2, "comed");
            return (Criteria) this;
        }

        public Criteria andDaytonIsNull() {
            addCriterion("DAYTON is null");
            return (Criteria) this;
        }

        public Criteria andDaytonIsNotNull() {
            addCriterion("DAYTON is not null");
            return (Criteria) this;
        }

        public Criteria andDaytonEqualTo(Long value) {
            addCriterion("DAYTON =", value, "dayton");
            return (Criteria) this;
        }

        public Criteria andDaytonNotEqualTo(Long value) {
            addCriterion("DAYTON <>", value, "dayton");
            return (Criteria) this;
        }

        public Criteria andDaytonGreaterThan(Long value) {
            addCriterion("DAYTON >", value, "dayton");
            return (Criteria) this;
        }

        public Criteria andDaytonGreaterThanOrEqualTo(Long value) {
            addCriterion("DAYTON >=", value, "dayton");
            return (Criteria) this;
        }

        public Criteria andDaytonLessThan(Long value) {
            addCriterion("DAYTON <", value, "dayton");
            return (Criteria) this;
        }

        public Criteria andDaytonLessThanOrEqualTo(Long value) {
            addCriterion("DAYTON <=", value, "dayton");
            return (Criteria) this;
        }

        public Criteria andDaytonIn(List<Long> values) {
            addCriterion("DAYTON in", values, "dayton");
            return (Criteria) this;
        }

        public Criteria andDaytonNotIn(List<Long> values) {
            addCriterion("DAYTON not in", values, "dayton");
            return (Criteria) this;
        }

        public Criteria andDaytonBetween(Long value1, Long value2) {
            addCriterion("DAYTON between", value1, value2, "dayton");
            return (Criteria) this;
        }

        public Criteria andDaytonNotBetween(Long value1, Long value2) {
            addCriterion("DAYTON not between", value1, value2, "dayton");
            return (Criteria) this;
        }

        public Criteria andDeokIsNull() {
            addCriterion("DEOK is null");
            return (Criteria) this;
        }

        public Criteria andDeokIsNotNull() {
            addCriterion("DEOK is not null");
            return (Criteria) this;
        }

        public Criteria andDeokEqualTo(Long value) {
            addCriterion("DEOK =", value, "deok");
            return (Criteria) this;
        }

        public Criteria andDeokNotEqualTo(Long value) {
            addCriterion("DEOK <>", value, "deok");
            return (Criteria) this;
        }

        public Criteria andDeokGreaterThan(Long value) {
            addCriterion("DEOK >", value, "deok");
            return (Criteria) this;
        }

        public Criteria andDeokGreaterThanOrEqualTo(Long value) {
            addCriterion("DEOK >=", value, "deok");
            return (Criteria) this;
        }

        public Criteria andDeokLessThan(Long value) {
            addCriterion("DEOK <", value, "deok");
            return (Criteria) this;
        }

        public Criteria andDeokLessThanOrEqualTo(Long value) {
            addCriterion("DEOK <=", value, "deok");
            return (Criteria) this;
        }

        public Criteria andDeokIn(List<Long> values) {
            addCriterion("DEOK in", values, "deok");
            return (Criteria) this;
        }

        public Criteria andDeokNotIn(List<Long> values) {
            addCriterion("DEOK not in", values, "deok");
            return (Criteria) this;
        }

        public Criteria andDeokBetween(Long value1, Long value2) {
            addCriterion("DEOK between", value1, value2, "deok");
            return (Criteria) this;
        }

        public Criteria andDeokNotBetween(Long value1, Long value2) {
            addCriterion("DEOK not between", value1, value2, "deok");
            return (Criteria) this;
        }

        public Criteria andDomIsNull() {
            addCriterion("DOM is null");
            return (Criteria) this;
        }

        public Criteria andDomIsNotNull() {
            addCriterion("DOM is not null");
            return (Criteria) this;
        }

        public Criteria andDomEqualTo(Long value) {
            addCriterion("DOM =", value, "dom");
            return (Criteria) this;
        }

        public Criteria andDomNotEqualTo(Long value) {
            addCriterion("DOM <>", value, "dom");
            return (Criteria) this;
        }

        public Criteria andDomGreaterThan(Long value) {
            addCriterion("DOM >", value, "dom");
            return (Criteria) this;
        }

        public Criteria andDomGreaterThanOrEqualTo(Long value) {
            addCriterion("DOM >=", value, "dom");
            return (Criteria) this;
        }

        public Criteria andDomLessThan(Long value) {
            addCriterion("DOM <", value, "dom");
            return (Criteria) this;
        }

        public Criteria andDomLessThanOrEqualTo(Long value) {
            addCriterion("DOM <=", value, "dom");
            return (Criteria) this;
        }

        public Criteria andDomIn(List<Long> values) {
            addCriterion("DOM in", values, "dom");
            return (Criteria) this;
        }

        public Criteria andDomNotIn(List<Long> values) {
            addCriterion("DOM not in", values, "dom");
            return (Criteria) this;
        }

        public Criteria andDomBetween(Long value1, Long value2) {
            addCriterion("DOM between", value1, value2, "dom");
            return (Criteria) this;
        }

        public Criteria andDomNotBetween(Long value1, Long value2) {
            addCriterion("DOM not between", value1, value2, "dom");
            return (Criteria) this;
        }

        public Criteria andDuqIsNull() {
            addCriterion("DUQ is null");
            return (Criteria) this;
        }

        public Criteria andDuqIsNotNull() {
            addCriterion("DUQ is not null");
            return (Criteria) this;
        }

        public Criteria andDuqEqualTo(Long value) {
            addCriterion("DUQ =", value, "duq");
            return (Criteria) this;
        }

        public Criteria andDuqNotEqualTo(Long value) {
            addCriterion("DUQ <>", value, "duq");
            return (Criteria) this;
        }

        public Criteria andDuqGreaterThan(Long value) {
            addCriterion("DUQ >", value, "duq");
            return (Criteria) this;
        }

        public Criteria andDuqGreaterThanOrEqualTo(Long value) {
            addCriterion("DUQ >=", value, "duq");
            return (Criteria) this;
        }

        public Criteria andDuqLessThan(Long value) {
            addCriterion("DUQ <", value, "duq");
            return (Criteria) this;
        }

        public Criteria andDuqLessThanOrEqualTo(Long value) {
            addCriterion("DUQ <=", value, "duq");
            return (Criteria) this;
        }

        public Criteria andDuqIn(List<Long> values) {
            addCriterion("DUQ in", values, "duq");
            return (Criteria) this;
        }

        public Criteria andDuqNotIn(List<Long> values) {
            addCriterion("DUQ not in", values, "duq");
            return (Criteria) this;
        }

        public Criteria andDuqBetween(Long value1, Long value2) {
            addCriterion("DUQ between", value1, value2, "duq");
            return (Criteria) this;
        }

        public Criteria andDuqNotBetween(Long value1, Long value2) {
            addCriterion("DUQ not between", value1, value2, "duq");
            return (Criteria) this;
        }

        public Criteria andEkpcIsNull() {
            addCriterion("EKPC is null");
            return (Criteria) this;
        }

        public Criteria andEkpcIsNotNull() {
            addCriterion("EKPC is not null");
            return (Criteria) this;
        }

        public Criteria andEkpcEqualTo(Long value) {
            addCriterion("EKPC =", value, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcNotEqualTo(Long value) {
            addCriterion("EKPC <>", value, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcGreaterThan(Long value) {
            addCriterion("EKPC >", value, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcGreaterThanOrEqualTo(Long value) {
            addCriterion("EKPC >=", value, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcLessThan(Long value) {
            addCriterion("EKPC <", value, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcLessThanOrEqualTo(Long value) {
            addCriterion("EKPC <=", value, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcIn(List<Long> values) {
            addCriterion("EKPC in", values, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcNotIn(List<Long> values) {
            addCriterion("EKPC not in", values, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcBetween(Long value1, Long value2) {
            addCriterion("EKPC between", value1, value2, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcNotBetween(Long value1, Long value2) {
            addCriterion("EKPC not between", value1, value2, "ekpc");
            return (Criteria) this;
        }

        public Criteria andFeIsNull() {
            addCriterion("FE is null");
            return (Criteria) this;
        }

        public Criteria andFeIsNotNull() {
            addCriterion("FE is not null");
            return (Criteria) this;
        }

        public Criteria andFeEqualTo(Long value) {
            addCriterion("FE =", value, "fe");
            return (Criteria) this;
        }

        public Criteria andFeNotEqualTo(Long value) {
            addCriterion("FE <>", value, "fe");
            return (Criteria) this;
        }

        public Criteria andFeGreaterThan(Long value) {
            addCriterion("FE >", value, "fe");
            return (Criteria) this;
        }

        public Criteria andFeGreaterThanOrEqualTo(Long value) {
            addCriterion("FE >=", value, "fe");
            return (Criteria) this;
        }

        public Criteria andFeLessThan(Long value) {
            addCriterion("FE <", value, "fe");
            return (Criteria) this;
        }

        public Criteria andFeLessThanOrEqualTo(Long value) {
            addCriterion("FE <=", value, "fe");
            return (Criteria) this;
        }

        public Criteria andFeIn(List<Long> values) {
            addCriterion("FE in", values, "fe");
            return (Criteria) this;
        }

        public Criteria andFeNotIn(List<Long> values) {
            addCriterion("FE not in", values, "fe");
            return (Criteria) this;
        }

        public Criteria andFeBetween(Long value1, Long value2) {
            addCriterion("FE between", value1, value2, "fe");
            return (Criteria) this;
        }

        public Criteria andFeNotBetween(Long value1, Long value2) {
            addCriterion("FE not between", value1, value2, "fe");
            return (Criteria) this;
        }

        public Criteria andNiIsNull() {
            addCriterion("NI is null");
            return (Criteria) this;
        }

        public Criteria andNiIsNotNull() {
            addCriterion("NI is not null");
            return (Criteria) this;
        }

        public Criteria andNiEqualTo(Long value) {
            addCriterion("NI =", value, "ni");
            return (Criteria) this;
        }

        public Criteria andNiNotEqualTo(Long value) {
            addCriterion("NI <>", value, "ni");
            return (Criteria) this;
        }

        public Criteria andNiGreaterThan(Long value) {
            addCriterion("NI >", value, "ni");
            return (Criteria) this;
        }

        public Criteria andNiGreaterThanOrEqualTo(Long value) {
            addCriterion("NI >=", value, "ni");
            return (Criteria) this;
        }

        public Criteria andNiLessThan(Long value) {
            addCriterion("NI <", value, "ni");
            return (Criteria) this;
        }

        public Criteria andNiLessThanOrEqualTo(Long value) {
            addCriterion("NI <=", value, "ni");
            return (Criteria) this;
        }

        public Criteria andNiIn(List<Long> values) {
            addCriterion("NI in", values, "ni");
            return (Criteria) this;
        }

        public Criteria andNiNotIn(List<Long> values) {
            addCriterion("NI not in", values, "ni");
            return (Criteria) this;
        }

        public Criteria andNiBetween(Long value1, Long value2) {
            addCriterion("NI between", value1, value2, "ni");
            return (Criteria) this;
        }

        public Criteria andNiNotBetween(Long value1, Long value2) {
            addCriterion("NI not between", value1, value2, "ni");
            return (Criteria) this;
        }

        public Criteria andPjmwIsNull() {
            addCriterion("PJMW is null");
            return (Criteria) this;
        }

        public Criteria andPjmwIsNotNull() {
            addCriterion("PJMW is not null");
            return (Criteria) this;
        }

        public Criteria andPjmwEqualTo(Long value) {
            addCriterion("PJMW =", value, "pjmw");
            return (Criteria) this;
        }

        public Criteria andPjmwNotEqualTo(Long value) {
            addCriterion("PJMW <>", value, "pjmw");
            return (Criteria) this;
        }

        public Criteria andPjmwGreaterThan(Long value) {
            addCriterion("PJMW >", value, "pjmw");
            return (Criteria) this;
        }

        public Criteria andPjmwGreaterThanOrEqualTo(Long value) {
            addCriterion("PJMW >=", value, "pjmw");
            return (Criteria) this;
        }

        public Criteria andPjmwLessThan(Long value) {
            addCriterion("PJMW <", value, "pjmw");
            return (Criteria) this;
        }

        public Criteria andPjmwLessThanOrEqualTo(Long value) {
            addCriterion("PJMW <=", value, "pjmw");
            return (Criteria) this;
        }

        public Criteria andPjmwIn(List<Long> values) {
            addCriterion("PJMW in", values, "pjmw");
            return (Criteria) this;
        }

        public Criteria andPjmwNotIn(List<Long> values) {
            addCriterion("PJMW not in", values, "pjmw");
            return (Criteria) this;
        }

        public Criteria andPjmwBetween(Long value1, Long value2) {
            addCriterion("PJMW between", value1, value2, "pjmw");
            return (Criteria) this;
        }

        public Criteria andPjmwNotBetween(Long value1, Long value2) {
            addCriterion("PJMW not between", value1, value2, "pjmw");
            return (Criteria) this;
        }

        public Criteria andPjmeIsNull() {
            addCriterion("PJME is null");
            return (Criteria) this;
        }

        public Criteria andPjmeIsNotNull() {
            addCriterion("PJME is not null");
            return (Criteria) this;
        }

        public Criteria andPjmeEqualTo(Long value) {
            addCriterion("PJME =", value, "pjme");
            return (Criteria) this;
        }
//        后加的
        public Criteria andYearEqualTo(String value) {
            addCriterion("Year =", value, "year");
            return (Criteria) this;
        }
        public Criteria andPjmeNotEqualTo(Long value) {
            addCriterion("PJME <>", value, "pjme");
            return (Criteria) this;
        }

        public Criteria andPjmeGreaterThan(Long value) {
            addCriterion("PJME >", value, "pjme");
            return (Criteria) this;
        }

        public Criteria andPjmeGreaterThanOrEqualTo(Long value) {
            addCriterion("PJME >=", value, "pjme");
            return (Criteria) this;
        }

        public Criteria andPjmeLessThan(Long value) {
            addCriterion("PJME <", value, "pjme");
            return (Criteria) this;
        }

        public Criteria andPjmeLessThanOrEqualTo(Long value) {
            addCriterion("PJME <=", value, "pjme");
            return (Criteria) this;
        }

        public Criteria andPjmeIn(List<Long> values) {
            addCriterion("PJME in", values, "pjme");
            return (Criteria) this;
        }

        public Criteria andPjmeNotIn(List<Long> values) {
            addCriterion("PJME not in", values, "pjme");
            return (Criteria) this;
        }

        public Criteria andPjmeBetween(Long value1, Long value2) {
            addCriterion("PJME between", value1, value2, "pjme");
            return (Criteria) this;
        }

        public Criteria andPjmeNotBetween(Long value1, Long value2) {
            addCriterion("PJME not between", value1, value2, "pjme");
            return (Criteria) this;
        }

        public Criteria andPjmLoadIsNull() {
            addCriterion("PJM_Load is null");
            return (Criteria) this;
        }

        public Criteria andPjmLoadIsNotNull() {
            addCriterion("PJM_Load is not null");
            return (Criteria) this;
        }

        public Criteria andPjmLoadEqualTo(Long value) {
            addCriterion("PJM_Load =", value, "pjmLoad");
            return (Criteria) this;
        }

        public Criteria andPjmLoadNotEqualTo(Long value) {
            addCriterion("PJM_Load <>", value, "pjmLoad");
            return (Criteria) this;
        }

        public Criteria andPjmLoadGreaterThan(Long value) {
            addCriterion("PJM_Load >", value, "pjmLoad");
            return (Criteria) this;
        }

        public Criteria andPjmLoadGreaterThanOrEqualTo(Long value) {
            addCriterion("PJM_Load >=", value, "pjmLoad");
            return (Criteria) this;
        }

        public Criteria andPjmLoadLessThan(Long value) {
            addCriterion("PJM_Load <", value, "pjmLoad");
            return (Criteria) this;
        }

        public Criteria andPjmLoadLessThanOrEqualTo(Long value) {
            addCriterion("PJM_Load <=", value, "pjmLoad");
            return (Criteria) this;
        }

        public Criteria andPjmLoadIn(List<Long> values) {
            addCriterion("PJM_Load in", values, "pjmLoad");
            return (Criteria) this;
        }

        public Criteria andPjmLoadNotIn(List<Long> values) {
            addCriterion("PJM_Load not in", values, "pjmLoad");
            return (Criteria) this;
        }

        public Criteria andPjmLoadBetween(Long value1, Long value2) {
            addCriterion("PJM_Load between", value1, value2, "pjmLoad");
            return (Criteria) this;
        }

        public Criteria andPjmLoadNotBetween(Long value1, Long value2) {
            addCriterion("PJM_Load not between", value1, value2, "pjmLoad");
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