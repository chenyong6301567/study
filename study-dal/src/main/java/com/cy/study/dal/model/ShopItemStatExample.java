package com.cy.study.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopItemStatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopItemStatExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemSpecIsNull() {
            addCriterion("item_spec is null");
            return (Criteria) this;
        }

        public Criteria andItemSpecIsNotNull() {
            addCriterion("item_spec is not null");
            return (Criteria) this;
        }

        public Criteria andItemSpecEqualTo(String value) {
            addCriterion("item_spec =", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecNotEqualTo(String value) {
            addCriterion("item_spec <>", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecGreaterThan(String value) {
            addCriterion("item_spec >", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecGreaterThanOrEqualTo(String value) {
            addCriterion("item_spec >=", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecLessThan(String value) {
            addCriterion("item_spec <", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecLessThanOrEqualTo(String value) {
            addCriterion("item_spec <=", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecLike(String value) {
            addCriterion("item_spec like", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecNotLike(String value) {
            addCriterion("item_spec not like", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecIn(List<String> values) {
            addCriterion("item_spec in", values, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecNotIn(List<String> values) {
            addCriterion("item_spec not in", values, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecBetween(String value1, String value2) {
            addCriterion("item_spec between", value1, value2, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecNotBetween(String value1, String value2) {
            addCriterion("item_spec not between", value1, value2, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andSalesCountIsNull() {
            addCriterion("sales_count is null");
            return (Criteria) this;
        }

        public Criteria andSalesCountIsNotNull() {
            addCriterion("sales_count is not null");
            return (Criteria) this;
        }

        public Criteria andSalesCountEqualTo(Integer value) {
            addCriterion("sales_count =", value, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountNotEqualTo(Integer value) {
            addCriterion("sales_count <>", value, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountGreaterThan(Integer value) {
            addCriterion("sales_count >", value, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_count >=", value, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountLessThan(Integer value) {
            addCriterion("sales_count <", value, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountLessThanOrEqualTo(Integer value) {
            addCriterion("sales_count <=", value, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountIn(List<Integer> values) {
            addCriterion("sales_count in", values, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountNotIn(List<Integer> values) {
            addCriterion("sales_count not in", values, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountBetween(Integer value1, Integer value2) {
            addCriterion("sales_count between", value1, value2, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_count not between", value1, value2, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesAmountIsNull() {
            addCriterion("sales_amount is null");
            return (Criteria) this;
        }

        public Criteria andSalesAmountIsNotNull() {
            addCriterion("sales_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSalesAmountEqualTo(Integer value) {
            addCriterion("sales_amount =", value, "salesAmount");
            return (Criteria) this;
        }

        public Criteria andSalesAmountNotEqualTo(Integer value) {
            addCriterion("sales_amount <>", value, "salesAmount");
            return (Criteria) this;
        }

        public Criteria andSalesAmountGreaterThan(Integer value) {
            addCriterion("sales_amount >", value, "salesAmount");
            return (Criteria) this;
        }

        public Criteria andSalesAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_amount >=", value, "salesAmount");
            return (Criteria) this;
        }

        public Criteria andSalesAmountLessThan(Integer value) {
            addCriterion("sales_amount <", value, "salesAmount");
            return (Criteria) this;
        }

        public Criteria andSalesAmountLessThanOrEqualTo(Integer value) {
            addCriterion("sales_amount <=", value, "salesAmount");
            return (Criteria) this;
        }

        public Criteria andSalesAmountIn(List<Integer> values) {
            addCriterion("sales_amount in", values, "salesAmount");
            return (Criteria) this;
        }

        public Criteria andSalesAmountNotIn(List<Integer> values) {
            addCriterion("sales_amount not in", values, "salesAmount");
            return (Criteria) this;
        }

        public Criteria andSalesAmountBetween(Integer value1, Integer value2) {
            addCriterion("sales_amount between", value1, value2, "salesAmount");
            return (Criteria) this;
        }

        public Criteria andSalesAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_amount not between", value1, value2, "salesAmount");
            return (Criteria) this;
        }

        public Criteria andSalesAvgPriceIsNull() {
            addCriterion("sales_avg_price is null");
            return (Criteria) this;
        }

        public Criteria andSalesAvgPriceIsNotNull() {
            addCriterion("sales_avg_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalesAvgPriceEqualTo(Double value) {
            addCriterion("sales_avg_price =", value, "salesAvgPrice");
            return (Criteria) this;
        }

        public Criteria andSalesAvgPriceNotEqualTo(Double value) {
            addCriterion("sales_avg_price <>", value, "salesAvgPrice");
            return (Criteria) this;
        }

        public Criteria andSalesAvgPriceGreaterThan(Double value) {
            addCriterion("sales_avg_price >", value, "salesAvgPrice");
            return (Criteria) this;
        }

        public Criteria andSalesAvgPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sales_avg_price >=", value, "salesAvgPrice");
            return (Criteria) this;
        }

        public Criteria andSalesAvgPriceLessThan(Double value) {
            addCriterion("sales_avg_price <", value, "salesAvgPrice");
            return (Criteria) this;
        }

        public Criteria andSalesAvgPriceLessThanOrEqualTo(Double value) {
            addCriterion("sales_avg_price <=", value, "salesAvgPrice");
            return (Criteria) this;
        }

        public Criteria andSalesAvgPriceIn(List<Double> values) {
            addCriterion("sales_avg_price in", values, "salesAvgPrice");
            return (Criteria) this;
        }

        public Criteria andSalesAvgPriceNotIn(List<Double> values) {
            addCriterion("sales_avg_price not in", values, "salesAvgPrice");
            return (Criteria) this;
        }

        public Criteria andSalesAvgPriceBetween(Double value1, Double value2) {
            addCriterion("sales_avg_price between", value1, value2, "salesAvgPrice");
            return (Criteria) this;
        }

        public Criteria andSalesAvgPriceNotBetween(Double value1, Double value2) {
            addCriterion("sales_avg_price not between", value1, value2, "salesAvgPrice");
            return (Criteria) this;
        }

        public Criteria andAmountRateIsNull() {
            addCriterion("amount_rate is null");
            return (Criteria) this;
        }

        public Criteria andAmountRateIsNotNull() {
            addCriterion("amount_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAmountRateEqualTo(Double value) {
            addCriterion("amount_rate =", value, "amountRate");
            return (Criteria) this;
        }

        public Criteria andAmountRateNotEqualTo(Double value) {
            addCriterion("amount_rate <>", value, "amountRate");
            return (Criteria) this;
        }

        public Criteria andAmountRateGreaterThan(Double value) {
            addCriterion("amount_rate >", value, "amountRate");
            return (Criteria) this;
        }

        public Criteria andAmountRateGreaterThanOrEqualTo(Double value) {
            addCriterion("amount_rate >=", value, "amountRate");
            return (Criteria) this;
        }

        public Criteria andAmountRateLessThan(Double value) {
            addCriterion("amount_rate <", value, "amountRate");
            return (Criteria) this;
        }

        public Criteria andAmountRateLessThanOrEqualTo(Double value) {
            addCriterion("amount_rate <=", value, "amountRate");
            return (Criteria) this;
        }

        public Criteria andAmountRateIn(List<Double> values) {
            addCriterion("amount_rate in", values, "amountRate");
            return (Criteria) this;
        }

        public Criteria andAmountRateNotIn(List<Double> values) {
            addCriterion("amount_rate not in", values, "amountRate");
            return (Criteria) this;
        }

        public Criteria andAmountRateBetween(Double value1, Double value2) {
            addCriterion("amount_rate between", value1, value2, "amountRate");
            return (Criteria) this;
        }

        public Criteria andAmountRateNotBetween(Double value1, Double value2) {
            addCriterion("amount_rate not between", value1, value2, "amountRate");
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