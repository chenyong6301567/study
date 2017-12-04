package com.cy.study.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderRefoudExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderRefoudExample() {
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

        public Criteria andOrdersIdIsNull() {
            addCriterion("orders_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIsNotNull() {
            addCriterion("orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdEqualTo(Long value) {
            addCriterion("orders_id =", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotEqualTo(Long value) {
            addCriterion("orders_id <>", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThan(Long value) {
            addCriterion("orders_id >", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThanOrEqualTo(Long value) {
            addCriterion("orders_id >=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThan(Long value) {
            addCriterion("orders_id <", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThanOrEqualTo(Long value) {
            addCriterion("orders_id <=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIn(List<Long> values) {
            addCriterion("orders_id in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotIn(List<Long> values) {
            addCriterion("orders_id not in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdBetween(Long value1, Long value2) {
            addCriterion("orders_id between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotBetween(Long value1, Long value2) {
            addCriterion("orders_id not between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andRefoudAmountIsNull() {
            addCriterion("refoud_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefoudAmountIsNotNull() {
            addCriterion("refoud_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefoudAmountEqualTo(Double value) {
            addCriterion("refoud_amount =", value, "refoudAmount");
            return (Criteria) this;
        }

        public Criteria andRefoudAmountNotEqualTo(Double value) {
            addCriterion("refoud_amount <>", value, "refoudAmount");
            return (Criteria) this;
        }

        public Criteria andRefoudAmountGreaterThan(Double value) {
            addCriterion("refoud_amount >", value, "refoudAmount");
            return (Criteria) this;
        }

        public Criteria andRefoudAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("refoud_amount >=", value, "refoudAmount");
            return (Criteria) this;
        }

        public Criteria andRefoudAmountLessThan(Double value) {
            addCriterion("refoud_amount <", value, "refoudAmount");
            return (Criteria) this;
        }

        public Criteria andRefoudAmountLessThanOrEqualTo(Double value) {
            addCriterion("refoud_amount <=", value, "refoudAmount");
            return (Criteria) this;
        }

        public Criteria andRefoudAmountIn(List<Double> values) {
            addCriterion("refoud_amount in", values, "refoudAmount");
            return (Criteria) this;
        }

        public Criteria andRefoudAmountNotIn(List<Double> values) {
            addCriterion("refoud_amount not in", values, "refoudAmount");
            return (Criteria) this;
        }

        public Criteria andRefoudAmountBetween(Double value1, Double value2) {
            addCriterion("refoud_amount between", value1, value2, "refoudAmount");
            return (Criteria) this;
        }

        public Criteria andRefoudAmountNotBetween(Double value1, Double value2) {
            addCriterion("refoud_amount not between", value1, value2, "refoudAmount");
            return (Criteria) this;
        }

        public Criteria andRefoudCauseIsNull() {
            addCriterion("refoud_cause is null");
            return (Criteria) this;
        }

        public Criteria andRefoudCauseIsNotNull() {
            addCriterion("refoud_cause is not null");
            return (Criteria) this;
        }

        public Criteria andRefoudCauseEqualTo(String value) {
            addCriterion("refoud_cause =", value, "refoudCause");
            return (Criteria) this;
        }

        public Criteria andRefoudCauseNotEqualTo(String value) {
            addCriterion("refoud_cause <>", value, "refoudCause");
            return (Criteria) this;
        }

        public Criteria andRefoudCauseGreaterThan(String value) {
            addCriterion("refoud_cause >", value, "refoudCause");
            return (Criteria) this;
        }

        public Criteria andRefoudCauseGreaterThanOrEqualTo(String value) {
            addCriterion("refoud_cause >=", value, "refoudCause");
            return (Criteria) this;
        }

        public Criteria andRefoudCauseLessThan(String value) {
            addCriterion("refoud_cause <", value, "refoudCause");
            return (Criteria) this;
        }

        public Criteria andRefoudCauseLessThanOrEqualTo(String value) {
            addCriterion("refoud_cause <=", value, "refoudCause");
            return (Criteria) this;
        }

        public Criteria andRefoudCauseLike(String value) {
            addCriterion("refoud_cause like", value, "refoudCause");
            return (Criteria) this;
        }

        public Criteria andRefoudCauseNotLike(String value) {
            addCriterion("refoud_cause not like", value, "refoudCause");
            return (Criteria) this;
        }

        public Criteria andRefoudCauseIn(List<String> values) {
            addCriterion("refoud_cause in", values, "refoudCause");
            return (Criteria) this;
        }

        public Criteria andRefoudCauseNotIn(List<String> values) {
            addCriterion("refoud_cause not in", values, "refoudCause");
            return (Criteria) this;
        }

        public Criteria andRefoudCauseBetween(String value1, String value2) {
            addCriterion("refoud_cause between", value1, value2, "refoudCause");
            return (Criteria) this;
        }

        public Criteria andRefoudCauseNotBetween(String value1, String value2) {
            addCriterion("refoud_cause not between", value1, value2, "refoudCause");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(Short value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(Short value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(Short value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(Short value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(Short value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(Short value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<Short> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<Short> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(Short value1, Short value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(Short value1, Short value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andAfterSaleMemberIdIsNull() {
            addCriterion("after_sale_member_id is null");
            return (Criteria) this;
        }

        public Criteria andAfterSaleMemberIdIsNotNull() {
            addCriterion("after_sale_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andAfterSaleMemberIdEqualTo(Integer value) {
            addCriterion("after_sale_member_id =", value, "afterSaleMemberId");
            return (Criteria) this;
        }

        public Criteria andAfterSaleMemberIdNotEqualTo(Integer value) {
            addCriterion("after_sale_member_id <>", value, "afterSaleMemberId");
            return (Criteria) this;
        }

        public Criteria andAfterSaleMemberIdGreaterThan(Integer value) {
            addCriterion("after_sale_member_id >", value, "afterSaleMemberId");
            return (Criteria) this;
        }

        public Criteria andAfterSaleMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("after_sale_member_id >=", value, "afterSaleMemberId");
            return (Criteria) this;
        }

        public Criteria andAfterSaleMemberIdLessThan(Integer value) {
            addCriterion("after_sale_member_id <", value, "afterSaleMemberId");
            return (Criteria) this;
        }

        public Criteria andAfterSaleMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("after_sale_member_id <=", value, "afterSaleMemberId");
            return (Criteria) this;
        }

        public Criteria andAfterSaleMemberIdIn(List<Integer> values) {
            addCriterion("after_sale_member_id in", values, "afterSaleMemberId");
            return (Criteria) this;
        }

        public Criteria andAfterSaleMemberIdNotIn(List<Integer> values) {
            addCriterion("after_sale_member_id not in", values, "afterSaleMemberId");
            return (Criteria) this;
        }

        public Criteria andAfterSaleMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("after_sale_member_id between", value1, value2, "afterSaleMemberId");
            return (Criteria) this;
        }

        public Criteria andAfterSaleMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("after_sale_member_id not between", value1, value2, "afterSaleMemberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
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

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPayContentIsNull() {
            addCriterion("pay_content is null");
            return (Criteria) this;
        }

        public Criteria andPayContentIsNotNull() {
            addCriterion("pay_content is not null");
            return (Criteria) this;
        }

        public Criteria andPayContentEqualTo(String value) {
            addCriterion("pay_content =", value, "payContent");
            return (Criteria) this;
        }

        public Criteria andPayContentNotEqualTo(String value) {
            addCriterion("pay_content <>", value, "payContent");
            return (Criteria) this;
        }

        public Criteria andPayContentGreaterThan(String value) {
            addCriterion("pay_content >", value, "payContent");
            return (Criteria) this;
        }

        public Criteria andPayContentGreaterThanOrEqualTo(String value) {
            addCriterion("pay_content >=", value, "payContent");
            return (Criteria) this;
        }

        public Criteria andPayContentLessThan(String value) {
            addCriterion("pay_content <", value, "payContent");
            return (Criteria) this;
        }

        public Criteria andPayContentLessThanOrEqualTo(String value) {
            addCriterion("pay_content <=", value, "payContent");
            return (Criteria) this;
        }

        public Criteria andPayContentLike(String value) {
            addCriterion("pay_content like", value, "payContent");
            return (Criteria) this;
        }

        public Criteria andPayContentNotLike(String value) {
            addCriterion("pay_content not like", value, "payContent");
            return (Criteria) this;
        }

        public Criteria andPayContentIn(List<String> values) {
            addCriterion("pay_content in", values, "payContent");
            return (Criteria) this;
        }

        public Criteria andPayContentNotIn(List<String> values) {
            addCriterion("pay_content not in", values, "payContent");
            return (Criteria) this;
        }

        public Criteria andPayContentBetween(String value1, String value2) {
            addCriterion("pay_content between", value1, value2, "payContent");
            return (Criteria) this;
        }

        public Criteria andPayContentNotBetween(String value1, String value2) {
            addCriterion("pay_content not between", value1, value2, "payContent");
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