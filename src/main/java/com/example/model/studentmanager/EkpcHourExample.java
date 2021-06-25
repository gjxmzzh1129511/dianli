package com.example.model.studentmanager;

import java.util.ArrayList;
import java.util.List;

public class EkpcHourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EkpcHourExample() {
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

        public Criteria andEkpcIsNull() {
            addCriterion("ekpc is null");
            return (Criteria) this;
        }

        public Criteria andEkpcIsNotNull() {
            addCriterion("ekpc is not null");
            return (Criteria) this;
        }

        public Criteria andEkpcEqualTo(Double value) {
            addCriterion("ekpc =", value, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcNotEqualTo(Double value) {
            addCriterion("ekpc <>", value, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcGreaterThan(Double value) {
            addCriterion("ekpc >", value, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcGreaterThanOrEqualTo(Double value) {
            addCriterion("ekpc >=", value, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcLessThan(Double value) {
            addCriterion("ekpc <", value, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcLessThanOrEqualTo(Double value) {
            addCriterion("ekpc <=", value, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcIn(List<Double> values) {
            addCriterion("ekpc in", values, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcNotIn(List<Double> values) {
            addCriterion("ekpc not in", values, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcBetween(Double value1, Double value2) {
            addCriterion("ekpc between", value1, value2, "ekpc");
            return (Criteria) this;
        }

        public Criteria andEkpcNotBetween(Double value1, Double value2) {
            addCriterion("ekpc not between", value1, value2, "ekpc");
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