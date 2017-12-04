package com.cy.study.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderItemExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andItemBarcodeIsNull() {
            addCriterion("item_barcode is null");
            return (Criteria) this;
        }

        public Criteria andItemBarcodeIsNotNull() {
            addCriterion("item_barcode is not null");
            return (Criteria) this;
        }

        public Criteria andItemBarcodeEqualTo(String value) {
            addCriterion("item_barcode =", value, "itemBarcode");
            return (Criteria) this;
        }

        public Criteria andItemBarcodeNotEqualTo(String value) {
            addCriterion("item_barcode <>", value, "itemBarcode");
            return (Criteria) this;
        }

        public Criteria andItemBarcodeGreaterThan(String value) {
            addCriterion("item_barcode >", value, "itemBarcode");
            return (Criteria) this;
        }

        public Criteria andItemBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("item_barcode >=", value, "itemBarcode");
            return (Criteria) this;
        }

        public Criteria andItemBarcodeLessThan(String value) {
            addCriterion("item_barcode <", value, "itemBarcode");
            return (Criteria) this;
        }

        public Criteria andItemBarcodeLessThanOrEqualTo(String value) {
            addCriterion("item_barcode <=", value, "itemBarcode");
            return (Criteria) this;
        }

        public Criteria andItemBarcodeLike(String value) {
            addCriterion("item_barcode like", value, "itemBarcode");
            return (Criteria) this;
        }

        public Criteria andItemBarcodeNotLike(String value) {
            addCriterion("item_barcode not like", value, "itemBarcode");
            return (Criteria) this;
        }

        public Criteria andItemBarcodeIn(List<String> values) {
            addCriterion("item_barcode in", values, "itemBarcode");
            return (Criteria) this;
        }

        public Criteria andItemBarcodeNotIn(List<String> values) {
            addCriterion("item_barcode not in", values, "itemBarcode");
            return (Criteria) this;
        }

        public Criteria andItemBarcodeBetween(String value1, String value2) {
            addCriterion("item_barcode between", value1, value2, "itemBarcode");
            return (Criteria) this;
        }

        public Criteria andItemBarcodeNotBetween(String value1, String value2) {
            addCriterion("item_barcode not between", value1, value2, "itemBarcode");
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

        public Criteria andItemPriceIsNull() {
            addCriterion("item_price is null");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNotNull() {
            addCriterion("item_price is not null");
            return (Criteria) this;
        }

        public Criteria andItemPriceEqualTo(Integer value) {
            addCriterion("item_price =", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotEqualTo(Integer value) {
            addCriterion("item_price <>", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThan(Integer value) {
            addCriterion("item_price >", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_price >=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThan(Integer value) {
            addCriterion("item_price <", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThanOrEqualTo(Integer value) {
            addCriterion("item_price <=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceIn(List<Integer> values) {
            addCriterion("item_price in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotIn(List<Integer> values) {
            addCriterion("item_price not in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceBetween(Integer value1, Integer value2) {
            addCriterion("item_price between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("item_price not between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemVipPriceIsNull() {
            addCriterion("item_vip_price is null");
            return (Criteria) this;
        }

        public Criteria andItemVipPriceIsNotNull() {
            addCriterion("item_vip_price is not null");
            return (Criteria) this;
        }

        public Criteria andItemVipPriceEqualTo(Integer value) {
            addCriterion("item_vip_price =", value, "itemVipPrice");
            return (Criteria) this;
        }

        public Criteria andItemVipPriceNotEqualTo(Integer value) {
            addCriterion("item_vip_price <>", value, "itemVipPrice");
            return (Criteria) this;
        }

        public Criteria andItemVipPriceGreaterThan(Integer value) {
            addCriterion("item_vip_price >", value, "itemVipPrice");
            return (Criteria) this;
        }

        public Criteria andItemVipPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_vip_price >=", value, "itemVipPrice");
            return (Criteria) this;
        }

        public Criteria andItemVipPriceLessThan(Integer value) {
            addCriterion("item_vip_price <", value, "itemVipPrice");
            return (Criteria) this;
        }

        public Criteria andItemVipPriceLessThanOrEqualTo(Integer value) {
            addCriterion("item_vip_price <=", value, "itemVipPrice");
            return (Criteria) this;
        }

        public Criteria andItemVipPriceIn(List<Integer> values) {
            addCriterion("item_vip_price in", values, "itemVipPrice");
            return (Criteria) this;
        }

        public Criteria andItemVipPriceNotIn(List<Integer> values) {
            addCriterion("item_vip_price not in", values, "itemVipPrice");
            return (Criteria) this;
        }

        public Criteria andItemVipPriceBetween(Integer value1, Integer value2) {
            addCriterion("item_vip_price between", value1, value2, "itemVipPrice");
            return (Criteria) this;
        }

        public Criteria andItemVipPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("item_vip_price not between", value1, value2, "itemVipPrice");
            return (Criteria) this;
        }

        public Criteria andItemCostPriceIsNull() {
            addCriterion("item_cost_price is null");
            return (Criteria) this;
        }

        public Criteria andItemCostPriceIsNotNull() {
            addCriterion("item_cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andItemCostPriceEqualTo(Integer value) {
            addCriterion("item_cost_price =", value, "itemCostPrice");
            return (Criteria) this;
        }

        public Criteria andItemCostPriceNotEqualTo(Integer value) {
            addCriterion("item_cost_price <>", value, "itemCostPrice");
            return (Criteria) this;
        }

        public Criteria andItemCostPriceGreaterThan(Integer value) {
            addCriterion("item_cost_price >", value, "itemCostPrice");
            return (Criteria) this;
        }

        public Criteria andItemCostPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_cost_price >=", value, "itemCostPrice");
            return (Criteria) this;
        }

        public Criteria andItemCostPriceLessThan(Integer value) {
            addCriterion("item_cost_price <", value, "itemCostPrice");
            return (Criteria) this;
        }

        public Criteria andItemCostPriceLessThanOrEqualTo(Integer value) {
            addCriterion("item_cost_price <=", value, "itemCostPrice");
            return (Criteria) this;
        }

        public Criteria andItemCostPriceIn(List<Integer> values) {
            addCriterion("item_cost_price in", values, "itemCostPrice");
            return (Criteria) this;
        }

        public Criteria andItemCostPriceNotIn(List<Integer> values) {
            addCriterion("item_cost_price not in", values, "itemCostPrice");
            return (Criteria) this;
        }

        public Criteria andItemCostPriceBetween(Integer value1, Integer value2) {
            addCriterion("item_cost_price between", value1, value2, "itemCostPrice");
            return (Criteria) this;
        }

        public Criteria andItemCostPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("item_cost_price not between", value1, value2, "itemCostPrice");
            return (Criteria) this;
        }

        public Criteria andItemInfoIsNull() {
            addCriterion("item_info is null");
            return (Criteria) this;
        }

        public Criteria andItemInfoIsNotNull() {
            addCriterion("item_info is not null");
            return (Criteria) this;
        }

        public Criteria andItemInfoEqualTo(String value) {
            addCriterion("item_info =", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotEqualTo(String value) {
            addCriterion("item_info <>", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoGreaterThan(String value) {
            addCriterion("item_info >", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoGreaterThanOrEqualTo(String value) {
            addCriterion("item_info >=", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoLessThan(String value) {
            addCriterion("item_info <", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoLessThanOrEqualTo(String value) {
            addCriterion("item_info <=", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoLike(String value) {
            addCriterion("item_info like", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotLike(String value) {
            addCriterion("item_info not like", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoIn(List<String> values) {
            addCriterion("item_info in", values, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotIn(List<String> values) {
            addCriterion("item_info not in", values, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoBetween(String value1, String value2) {
            addCriterion("item_info between", value1, value2, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotBetween(String value1, String value2) {
            addCriterion("item_info not between", value1, value2, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemCountIsNull() {
            addCriterion("item_count is null");
            return (Criteria) this;
        }

        public Criteria andItemCountIsNotNull() {
            addCriterion("item_count is not null");
            return (Criteria) this;
        }

        public Criteria andItemCountEqualTo(Double value) {
            addCriterion("item_count =", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountNotEqualTo(Double value) {
            addCriterion("item_count <>", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountGreaterThan(Double value) {
            addCriterion("item_count >", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountGreaterThanOrEqualTo(Double value) {
            addCriterion("item_count >=", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountLessThan(Double value) {
            addCriterion("item_count <", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountLessThanOrEqualTo(Double value) {
            addCriterion("item_count <=", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountIn(List<Double> values) {
            addCriterion("item_count in", values, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountNotIn(List<Double> values) {
            addCriterion("item_count not in", values, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountBetween(Double value1, Double value2) {
            addCriterion("item_count between", value1, value2, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountNotBetween(Double value1, Double value2) {
            addCriterion("item_count not between", value1, value2, "itemCount");
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

        public Criteria andItemUnitIsNull() {
            addCriterion("item_unit is null");
            return (Criteria) this;
        }

        public Criteria andItemUnitIsNotNull() {
            addCriterion("item_unit is not null");
            return (Criteria) this;
        }

        public Criteria andItemUnitEqualTo(String value) {
            addCriterion("item_unit =", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotEqualTo(String value) {
            addCriterion("item_unit <>", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitGreaterThan(String value) {
            addCriterion("item_unit >", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitGreaterThanOrEqualTo(String value) {
            addCriterion("item_unit >=", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitLessThan(String value) {
            addCriterion("item_unit <", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitLessThanOrEqualTo(String value) {
            addCriterion("item_unit <=", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitLike(String value) {
            addCriterion("item_unit like", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotLike(String value) {
            addCriterion("item_unit not like", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitIn(List<String> values) {
            addCriterion("item_unit in", values, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotIn(List<String> values) {
            addCriterion("item_unit not in", values, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitBetween(String value1, String value2) {
            addCriterion("item_unit between", value1, value2, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotBetween(String value1, String value2) {
            addCriterion("item_unit not between", value1, value2, "itemUnit");
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