package com.cy.study.dal.model;

import java.io.Serializable;
import java.util.Date;

public class OrderRefoud implements Serializable {
    private Long id;

    private Long ordersId;

    private Double refoudAmount;

    private String refoudCause;

    private Short payWay;

    private Integer afterSaleMemberId;

    private Integer memberId;

    private Date gmtCreate;

    private Date gmtModify;

    private Short status;

    private String account;

    private String payContent;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Long ordersId) {
        this.ordersId = ordersId;
    }

    public Double getRefoudAmount() {
        return refoudAmount;
    }

    public void setRefoudAmount(Double refoudAmount) {
        this.refoudAmount = refoudAmount;
    }

    public String getRefoudCause() {
        return refoudCause;
    }

    public void setRefoudCause(String refoudCause) {
        this.refoudCause = refoudCause == null ? null : refoudCause.trim();
    }

    public Short getPayWay() {
        return payWay;
    }

    public void setPayWay(Short payWay) {
        this.payWay = payWay;
    }

    public Integer getAfterSaleMemberId() {
        return afterSaleMemberId;
    }

    public void setAfterSaleMemberId(Integer afterSaleMemberId) {
        this.afterSaleMemberId = afterSaleMemberId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPayContent() {
        return payContent;
    }

    public void setPayContent(String payContent) {
        this.payContent = payContent == null ? null : payContent.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderRefoud other = (OrderRefoud) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrdersId() == null ? other.getOrdersId() == null : this.getOrdersId().equals(other.getOrdersId()))
            && (this.getRefoudAmount() == null ? other.getRefoudAmount() == null : this.getRefoudAmount().equals(other.getRefoudAmount()))
            && (this.getRefoudCause() == null ? other.getRefoudCause() == null : this.getRefoudCause().equals(other.getRefoudCause()))
            && (this.getPayWay() == null ? other.getPayWay() == null : this.getPayWay().equals(other.getPayWay()))
            && (this.getAfterSaleMemberId() == null ? other.getAfterSaleMemberId() == null : this.getAfterSaleMemberId().equals(other.getAfterSaleMemberId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModify() == null ? other.getGmtModify() == null : this.getGmtModify().equals(other.getGmtModify()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getPayContent() == null ? other.getPayContent() == null : this.getPayContent().equals(other.getPayContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrdersId() == null) ? 0 : getOrdersId().hashCode());
        result = prime * result + ((getRefoudAmount() == null) ? 0 : getRefoudAmount().hashCode());
        result = prime * result + ((getRefoudCause() == null) ? 0 : getRefoudCause().hashCode());
        result = prime * result + ((getPayWay() == null) ? 0 : getPayWay().hashCode());
        result = prime * result + ((getAfterSaleMemberId() == null) ? 0 : getAfterSaleMemberId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModify() == null) ? 0 : getGmtModify().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getPayContent() == null) ? 0 : getPayContent().hashCode());
        return result;
    }
}