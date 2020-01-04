package com.lut.shopping.bean;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andGetaddressIsNull() {
            addCriterion("getaddress is null");
            return (Criteria) this;
        }

        public Criteria andGetaddressIsNotNull() {
            addCriterion("getaddress is not null");
            return (Criteria) this;
        }

        public Criteria andGetaddressEqualTo(String value) {
            addCriterion("getaddress =", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressNotEqualTo(String value) {
            addCriterion("getaddress <>", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressGreaterThan(String value) {
            addCriterion("getaddress >", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressGreaterThanOrEqualTo(String value) {
            addCriterion("getaddress >=", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressLessThan(String value) {
            addCriterion("getaddress <", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressLessThanOrEqualTo(String value) {
            addCriterion("getaddress <=", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressLike(String value) {
            addCriterion("getaddress like", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressNotLike(String value) {
            addCriterion("getaddress not like", value, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressIn(List<String> values) {
            addCriterion("getaddress in", values, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressNotIn(List<String> values) {
            addCriterion("getaddress not in", values, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressBetween(String value1, String value2) {
            addCriterion("getaddress between", value1, value2, "getaddress");
            return (Criteria) this;
        }

        public Criteria andGetaddressNotBetween(String value1, String value2) {
            addCriterion("getaddress not between", value1, value2, "getaddress");
            return (Criteria) this;
        }

        public Criteria andDeliveraddressIsNull() {
            addCriterion("deliveraddress is null");
            return (Criteria) this;
        }

        public Criteria andDeliveraddressIsNotNull() {
            addCriterion("deliveraddress is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveraddressEqualTo(String value) {
            addCriterion("deliveraddress =", value, "deliveraddress");
            return (Criteria) this;
        }

        public Criteria andDeliveraddressNotEqualTo(String value) {
            addCriterion("deliveraddress <>", value, "deliveraddress");
            return (Criteria) this;
        }

        public Criteria andDeliveraddressGreaterThan(String value) {
            addCriterion("deliveraddress >", value, "deliveraddress");
            return (Criteria) this;
        }

        public Criteria andDeliveraddressGreaterThanOrEqualTo(String value) {
            addCriterion("deliveraddress >=", value, "deliveraddress");
            return (Criteria) this;
        }

        public Criteria andDeliveraddressLessThan(String value) {
            addCriterion("deliveraddress <", value, "deliveraddress");
            return (Criteria) this;
        }

        public Criteria andDeliveraddressLessThanOrEqualTo(String value) {
            addCriterion("deliveraddress <=", value, "deliveraddress");
            return (Criteria) this;
        }

        public Criteria andDeliveraddressLike(String value) {
            addCriterion("deliveraddress like", value, "deliveraddress");
            return (Criteria) this;
        }

        public Criteria andDeliveraddressNotLike(String value) {
            addCriterion("deliveraddress not like", value, "deliveraddress");
            return (Criteria) this;
        }

        public Criteria andDeliveraddressIn(List<String> values) {
            addCriterion("deliveraddress in", values, "deliveraddress");
            return (Criteria) this;
        }

        public Criteria andDeliveraddressNotIn(List<String> values) {
            addCriterion("deliveraddress not in", values, "deliveraddress");
            return (Criteria) this;
        }

        public Criteria andDeliveraddressBetween(String value1, String value2) {
            addCriterion("deliveraddress between", value1, value2, "deliveraddress");
            return (Criteria) this;
        }

        public Criteria andDeliveraddressNotBetween(String value1, String value2) {
            addCriterion("deliveraddress not between", value1, value2, "deliveraddress");
            return (Criteria) this;
        }

        public Criteria andDelivernameIsNull() {
            addCriterion("delivername is null");
            return (Criteria) this;
        }

        public Criteria andDelivernameIsNotNull() {
            addCriterion("delivername is not null");
            return (Criteria) this;
        }

        public Criteria andDelivernameEqualTo(String value) {
            addCriterion("delivername =", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameNotEqualTo(String value) {
            addCriterion("delivername <>", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameGreaterThan(String value) {
            addCriterion("delivername >", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameGreaterThanOrEqualTo(String value) {
            addCriterion("delivername >=", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameLessThan(String value) {
            addCriterion("delivername <", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameLessThanOrEqualTo(String value) {
            addCriterion("delivername <=", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameLike(String value) {
            addCriterion("delivername like", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameNotLike(String value) {
            addCriterion("delivername not like", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameIn(List<String> values) {
            addCriterion("delivername in", values, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameNotIn(List<String> values) {
            addCriterion("delivername not in", values, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameBetween(String value1, String value2) {
            addCriterion("delivername between", value1, value2, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameNotBetween(String value1, String value2) {
            addCriterion("delivername not between", value1, value2, "delivername");
            return (Criteria) this;
        }

        public Criteria andReceivenameIsNull() {
            addCriterion("receivename is null");
            return (Criteria) this;
        }

        public Criteria andReceivenameIsNotNull() {
            addCriterion("receivename is not null");
            return (Criteria) this;
        }

        public Criteria andReceivenameEqualTo(String value) {
            addCriterion("receivename =", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotEqualTo(String value) {
            addCriterion("receivename <>", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameGreaterThan(String value) {
            addCriterion("receivename >", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameGreaterThanOrEqualTo(String value) {
            addCriterion("receivename >=", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameLessThan(String value) {
            addCriterion("receivename <", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameLessThanOrEqualTo(String value) {
            addCriterion("receivename <=", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameLike(String value) {
            addCriterion("receivename like", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotLike(String value) {
            addCriterion("receivename not like", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameIn(List<String> values) {
            addCriterion("receivename in", values, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotIn(List<String> values) {
            addCriterion("receivename not in", values, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameBetween(String value1, String value2) {
            addCriterion("receivename between", value1, value2, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotBetween(String value1, String value2) {
            addCriterion("receivename not between", value1, value2, "receivename");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneIsNull() {
            addCriterion("deliverphone is null");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneIsNotNull() {
            addCriterion("deliverphone is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneEqualTo(String value) {
            addCriterion("deliverphone =", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneNotEqualTo(String value) {
            addCriterion("deliverphone <>", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneGreaterThan(String value) {
            addCriterion("deliverphone >", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneGreaterThanOrEqualTo(String value) {
            addCriterion("deliverphone >=", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneLessThan(String value) {
            addCriterion("deliverphone <", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneLessThanOrEqualTo(String value) {
            addCriterion("deliverphone <=", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneLike(String value) {
            addCriterion("deliverphone like", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneNotLike(String value) {
            addCriterion("deliverphone not like", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneIn(List<String> values) {
            addCriterion("deliverphone in", values, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneNotIn(List<String> values) {
            addCriterion("deliverphone not in", values, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneBetween(String value1, String value2) {
            addCriterion("deliverphone between", value1, value2, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneNotBetween(String value1, String value2) {
            addCriterion("deliverphone not between", value1, value2, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneIsNull() {
            addCriterion("receivephone is null");
            return (Criteria) this;
        }

        public Criteria andReceivephoneIsNotNull() {
            addCriterion("receivephone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivephoneEqualTo(String value) {
            addCriterion("receivephone =", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotEqualTo(String value) {
            addCriterion("receivephone <>", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneGreaterThan(String value) {
            addCriterion("receivephone >", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneGreaterThanOrEqualTo(String value) {
            addCriterion("receivephone >=", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneLessThan(String value) {
            addCriterion("receivephone <", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneLessThanOrEqualTo(String value) {
            addCriterion("receivephone <=", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneLike(String value) {
            addCriterion("receivephone like", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotLike(String value) {
            addCriterion("receivephone not like", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneIn(List<String> values) {
            addCriterion("receivephone in", values, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotIn(List<String> values) {
            addCriterion("receivephone not in", values, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneBetween(String value1, String value2) {
            addCriterion("receivephone between", value1, value2, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotBetween(String value1, String value2) {
            addCriterion("receivephone not between", value1, value2, "receivephone");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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