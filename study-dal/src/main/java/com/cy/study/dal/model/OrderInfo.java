package com.cy.study.dal.model;

import java.io.Serializable;
import java.util.Date;

public class OrderInfo implements Serializable {
    private Long id;

    private Long userId;

    private Integer payAmount;

    private Integer effeAmount;

    private Long deviceId;

    private Integer cashierId;

    private Integer shopId;

    private String attribute;

    private Short status;

    private Date gmtCreate;

    private Date gmtModify;

    private Short payWay;

    private Integer amount;

    private Long couponId;

    private Integer creditAmount;

    private Integer discountAmount;

    private Integer costAmount;

    private Date gmtPay;

    private Date gmtReceive;

    private String seq;

    private String userAddress;

    private Date gmtDistribution;

    private Date gmtBuild;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getEffeAmount() {
        return effeAmount;
    }

    public void setEffeAmount(Integer effeAmount) {
        this.effeAmount = effeAmount;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getCashierId() {
        return cashierId;
    }

    public void setCashierId(Integer cashierId) {
        this.cashierId = cashierId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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

    public Short getPayWay() {
        return payWay;
    }

    public void setPayWay(Short payWay) {
        this.payWay = payWay;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Integer getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Integer creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Integer getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(Integer costAmount) {
        this.costAmount = costAmount;
    }

    public Date getGmtPay() {
        return gmtPay;
    }

    public void setGmtPay(Date gmtPay) {
        this.gmtPay = gmtPay;
    }

    public Date getGmtReceive() {
        return gmtReceive;
    }

    public void setGmtReceive(Date gmtReceive) {
        this.gmtReceive = gmtReceive;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq == null ? null : seq.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Date getGmtDistribution() {
        return gmtDistribution;
    }

    public void setGmtDistribution(Date gmtDistribution) {
        this.gmtDistribution = gmtDistribution;
    }

    public Date getGmtBuild() {
        return gmtBuild;
    }

    public void setGmtBuild(Date gmtBuild) {
        this.gmtBuild = gmtBuild;
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
        OrderInfo other = (OrderInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPayAmount() == null ? other.getPayAmount() == null : this.getPayAmount().equals(other.getPayAmount()))
            && (this.getEffeAmount() == null ? other.getEffeAmount() == null : this.getEffeAmount().equals(other.getEffeAmount()))
            && (this.getDeviceId() == null ? other.getDeviceId() == null : this.getDeviceId().equals(other.getDeviceId()))
            && (this.getCashierId() == null ? other.getCashierId() == null : this.getCashierId().equals(other.getCashierId()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
            && (this.getAttribute() == null ? other.getAttribute() == null : this.getAttribute().equals(other.getAttribute()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModify() == null ? other.getGmtModify() == null : this.getGmtModify().equals(other.getGmtModify()))
            && (this.getPayWay() == null ? other.getPayWay() == null : this.getPayWay().equals(other.getPayWay()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getCouponId() == null ? other.getCouponId() == null : this.getCouponId().equals(other.getCouponId()))
            && (this.getCreditAmount() == null ? other.getCreditAmount() == null : this.getCreditAmount().equals(other.getCreditAmount()))
            && (this.getDiscountAmount() == null ? other.getDiscountAmount() == null : this.getDiscountAmount().equals(other.getDiscountAmount()))
            && (this.getCostAmount() == null ? other.getCostAmount() == null : this.getCostAmount().equals(other.getCostAmount()))
            && (this.getGmtPay() == null ? other.getGmtPay() == null : this.getGmtPay().equals(other.getGmtPay()))
            && (this.getGmtReceive() == null ? other.getGmtReceive() == null : this.getGmtReceive().equals(other.getGmtReceive()))
            && (this.getSeq() == null ? other.getSeq() == null : this.getSeq().equals(other.getSeq()))
            && (this.getUserAddress() == null ? other.getUserAddress() == null : this.getUserAddress().equals(other.getUserAddress()))
            && (this.getGmtDistribution() == null ? other.getGmtDistribution() == null : this.getGmtDistribution().equals(other.getGmtDistribution()))
            && (this.getGmtBuild() == null ? other.getGmtBuild() == null : this.getGmtBuild().equals(other.getGmtBuild()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPayAmount() == null) ? 0 : getPayAmount().hashCode());
        result = prime * result + ((getEffeAmount() == null) ? 0 : getEffeAmount().hashCode());
        result = prime * result + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        result = prime * result + ((getCashierId() == null) ? 0 : getCashierId().hashCode());
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        result = prime * result + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModify() == null) ? 0 : getGmtModify().hashCode());
        result = prime * result + ((getPayWay() == null) ? 0 : getPayWay().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getCouponId() == null) ? 0 : getCouponId().hashCode());
        result = prime * result + ((getCreditAmount() == null) ? 0 : getCreditAmount().hashCode());
        result = prime * result + ((getDiscountAmount() == null) ? 0 : getDiscountAmount().hashCode());
        result = prime * result + ((getCostAmount() == null) ? 0 : getCostAmount().hashCode());
        result = prime * result + ((getGmtPay() == null) ? 0 : getGmtPay().hashCode());
        result = prime * result + ((getGmtReceive() == null) ? 0 : getGmtReceive().hashCode());
        result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
        result = prime * result + ((getUserAddress() == null) ? 0 : getUserAddress().hashCode());
        result = prime * result + ((getGmtDistribution() == null) ? 0 : getGmtDistribution().hashCode());
        result = prime * result + ((getGmtBuild() == null) ? 0 : getGmtBuild().hashCode());
        return result;
    }
}