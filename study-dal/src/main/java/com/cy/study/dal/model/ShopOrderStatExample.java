package com.cy.study.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopOrderStatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopOrderStatExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Integer value) {
            addCriterion("period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Integer value) {
            addCriterion("period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Integer value) {
            addCriterion("period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Integer value) {
            addCriterion("period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Integer> values) {
            addCriterion("period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Integer> values) {
            addCriterion("period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Integer value1, Integer value2) {
            addCriterion("period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("period not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIsNull() {
            addCriterion("period_type is null");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIsNotNull() {
            addCriterion("period_type is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeEqualTo(Short value) {
            addCriterion("period_type =", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotEqualTo(Short value) {
            addCriterion("period_type <>", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeGreaterThan(Short value) {
            addCriterion("period_type >", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("period_type >=", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLessThan(Short value) {
            addCriterion("period_type <", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLessThanOrEqualTo(Short value) {
            addCriterion("period_type <=", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIn(List<Short> values) {
            addCriterion("period_type in", values, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotIn(List<Short> values) {
            addCriterion("period_type not in", values, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeBetween(Short value1, Short value2) {
            addCriterion("period_type between", value1, value2, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotBetween(Short value1, Short value2) {
            addCriterion("period_type not between", value1, value2, "periodType");
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

        public Criteria andOrderTotalCountIsNull() {
            addCriterion("order_total_count is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalCountIsNotNull() {
            addCriterion("order_total_count is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalCountEqualTo(Integer value) {
            addCriterion("order_total_count =", value, "orderTotalCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalCountNotEqualTo(Integer value) {
            addCriterion("order_total_count <>", value, "orderTotalCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalCountGreaterThan(Integer value) {
            addCriterion("order_total_count >", value, "orderTotalCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_total_count >=", value, "orderTotalCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalCountLessThan(Integer value) {
            addCriterion("order_total_count <", value, "orderTotalCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("order_total_count <=", value, "orderTotalCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalCountIn(List<Integer> values) {
            addCriterion("order_total_count in", values, "orderTotalCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalCountNotIn(List<Integer> values) {
            addCriterion("order_total_count not in", values, "orderTotalCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("order_total_count between", value1, value2, "orderTotalCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_total_count not between", value1, value2, "orderTotalCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountIsNull() {
            addCriterion("order_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountIsNotNull() {
            addCriterion("order_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountEqualTo(Long value) {
            addCriterion("order_total_amount =", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotEqualTo(Long value) {
            addCriterion("order_total_amount <>", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountGreaterThan(Long value) {
            addCriterion("order_total_amount >", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("order_total_amount >=", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountLessThan(Long value) {
            addCriterion("order_total_amount <", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountLessThanOrEqualTo(Long value) {
            addCriterion("order_total_amount <=", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountIn(List<Long> values) {
            addCriterion("order_total_amount in", values, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotIn(List<Long> values) {
            addCriterion("order_total_amount not in", values, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountBetween(Long value1, Long value2) {
            addCriterion("order_total_amount between", value1, value2, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotBetween(Long value1, Long value2) {
            addCriterion("order_total_amount not between", value1, value2, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAvgAmountIsNull() {
            addCriterion("order_avg_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAvgAmountIsNotNull() {
            addCriterion("order_avg_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAvgAmountEqualTo(Integer value) {
            addCriterion("order_avg_amount =", value, "orderAvgAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAvgAmountNotEqualTo(Integer value) {
            addCriterion("order_avg_amount <>", value, "orderAvgAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAvgAmountGreaterThan(Integer value) {
            addCriterion("order_avg_amount >", value, "orderAvgAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAvgAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_avg_amount >=", value, "orderAvgAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAvgAmountLessThan(Integer value) {
            addCriterion("order_avg_amount <", value, "orderAvgAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAvgAmountLessThanOrEqualTo(Integer value) {
            addCriterion("order_avg_amount <=", value, "orderAvgAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAvgAmountIn(List<Integer> values) {
            addCriterion("order_avg_amount in", values, "orderAvgAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAvgAmountNotIn(List<Integer> values) {
            addCriterion("order_avg_amount not in", values, "orderAvgAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAvgAmountBetween(Integer value1, Integer value2) {
            addCriterion("order_avg_amount between", value1, value2, "orderAvgAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAvgAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_avg_amount not between", value1, value2, "orderAvgAmount");
            return (Criteria) this;
        }

        public Criteria andItemClassCountIsNull() {
            addCriterion("item_class_count is null");
            return (Criteria) this;
        }

        public Criteria andItemClassCountIsNotNull() {
            addCriterion("item_class_count is not null");
            return (Criteria) this;
        }

        public Criteria andItemClassCountEqualTo(Integer value) {
            addCriterion("item_class_count =", value, "itemClassCount");
            return (Criteria) this;
        }

        public Criteria andItemClassCountNotEqualTo(Integer value) {
            addCriterion("item_class_count <>", value, "itemClassCount");
            return (Criteria) this;
        }

        public Criteria andItemClassCountGreaterThan(Integer value) {
            addCriterion("item_class_count >", value, "itemClassCount");
            return (Criteria) this;
        }

        public Criteria andItemClassCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_class_count >=", value, "itemClassCount");
            return (Criteria) this;
        }

        public Criteria andItemClassCountLessThan(Integer value) {
            addCriterion("item_class_count <", value, "itemClassCount");
            return (Criteria) this;
        }

        public Criteria andItemClassCountLessThanOrEqualTo(Integer value) {
            addCriterion("item_class_count <=", value, "itemClassCount");
            return (Criteria) this;
        }

        public Criteria andItemClassCountIn(List<Integer> values) {
            addCriterion("item_class_count in", values, "itemClassCount");
            return (Criteria) this;
        }

        public Criteria andItemClassCountNotIn(List<Integer> values) {
            addCriterion("item_class_count not in", values, "itemClassCount");
            return (Criteria) this;
        }

        public Criteria andItemClassCountBetween(Integer value1, Integer value2) {
            addCriterion("item_class_count between", value1, value2, "itemClassCount");
            return (Criteria) this;
        }

        public Criteria andItemClassCountNotBetween(Integer value1, Integer value2) {
            addCriterion("item_class_count not between", value1, value2, "itemClassCount");
            return (Criteria) this;
        }

        public Criteria andItemTotalCountIsNull() {
            addCriterion("item_total_count is null");
            return (Criteria) this;
        }

        public Criteria andItemTotalCountIsNotNull() {
            addCriterion("item_total_count is not null");
            return (Criteria) this;
        }

        public Criteria andItemTotalCountEqualTo(Double value) {
            addCriterion("item_total_count =", value, "itemTotalCount");
            return (Criteria) this;
        }

        public Criteria andItemTotalCountNotEqualTo(Double value) {
            addCriterion("item_total_count <>", value, "itemTotalCount");
            return (Criteria) this;
        }

        public Criteria andItemTotalCountGreaterThan(Double value) {
            addCriterion("item_total_count >", value, "itemTotalCount");
            return (Criteria) this;
        }

        public Criteria andItemTotalCountGreaterThanOrEqualTo(Double value) {
            addCriterion("item_total_count >=", value, "itemTotalCount");
            return (Criteria) this;
        }

        public Criteria andItemTotalCountLessThan(Double value) {
            addCriterion("item_total_count <", value, "itemTotalCount");
            return (Criteria) this;
        }

        public Criteria andItemTotalCountLessThanOrEqualTo(Double value) {
            addCriterion("item_total_count <=", value, "itemTotalCount");
            return (Criteria) this;
        }

        public Criteria andItemTotalCountIn(List<Double> values) {
            addCriterion("item_total_count in", values, "itemTotalCount");
            return (Criteria) this;
        }

        public Criteria andItemTotalCountNotIn(List<Double> values) {
            addCriterion("item_total_count not in", values, "itemTotalCount");
            return (Criteria) this;
        }

        public Criteria andItemTotalCountBetween(Double value1, Double value2) {
            addCriterion("item_total_count between", value1, value2, "itemTotalCount");
            return (Criteria) this;
        }

        public Criteria andItemTotalCountNotBetween(Double value1, Double value2) {
            addCriterion("item_total_count not between", value1, value2, "itemTotalCount");
            return (Criteria) this;
        }

        public Criteria andItemTotalAmountIsNull() {
            addCriterion("item_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andItemTotalAmountIsNotNull() {
            addCriterion("item_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andItemTotalAmountEqualTo(Integer value) {
            addCriterion("item_total_amount =", value, "itemTotalAmount");
            return (Criteria) this;
        }

        public Criteria andItemTotalAmountNotEqualTo(Integer value) {
            addCriterion("item_total_amount <>", value, "itemTotalAmount");
            return (Criteria) this;
        }

        public Criteria andItemTotalAmountGreaterThan(Integer value) {
            addCriterion("item_total_amount >", value, "itemTotalAmount");
            return (Criteria) this;
        }

        public Criteria andItemTotalAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_total_amount >=", value, "itemTotalAmount");
            return (Criteria) this;
        }

        public Criteria andItemTotalAmountLessThan(Integer value) {
            addCriterion("item_total_amount <", value, "itemTotalAmount");
            return (Criteria) this;
        }

        public Criteria andItemTotalAmountLessThanOrEqualTo(Integer value) {
            addCriterion("item_total_amount <=", value, "itemTotalAmount");
            return (Criteria) this;
        }

        public Criteria andItemTotalAmountIn(List<Integer> values) {
            addCriterion("item_total_amount in", values, "itemTotalAmount");
            return (Criteria) this;
        }

        public Criteria andItemTotalAmountNotIn(List<Integer> values) {
            addCriterion("item_total_amount not in", values, "itemTotalAmount");
            return (Criteria) this;
        }

        public Criteria andItemTotalAmountBetween(Integer value1, Integer value2) {
            addCriterion("item_total_amount between", value1, value2, "itemTotalAmount");
            return (Criteria) this;
        }

        public Criteria andItemTotalAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("item_total_amount not between", value1, value2, "itemTotalAmount");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNull() {
            addCriterion("gmt_modify is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNotNull() {
            addCriterion("gmt_modify is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyEqualTo(Date value) {
            addCriterion("gmt_modify =", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotEqualTo(Date value) {
            addCriterion("gmt_modify <>", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThan(Date value) {
            addCriterion("gmt_modify >", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modify >=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThan(Date value) {
            addCriterion("gmt_modify <", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modify <=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIn(List<Date> values) {
            addCriterion("gmt_modify in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotIn(List<Date> values) {
            addCriterion("gmt_modify not in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyBetween(Date value1, Date value2) {
            addCriterion("gmt_modify between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modify not between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
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