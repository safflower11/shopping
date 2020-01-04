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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
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