package com.cy.study.dal.model;

import java.io.Serializable;
import java.util.Date;

public class ShopOrderStat implements Serializable {
    private Long id;

    private Integer period;

    private Short periodType;

    private Integer shopId;

    private Integer orderTotalCount;

    private Long orderTotalAmount;

    private Integer orderAvgAmount;

    private Integer itemClassCount;

    private Double itemTotalCount;

    private Integer itemTotalAmount;

    private Date gmtCreate;

    private Date gmtModify;

    private Short status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Short getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Short periodType) {
        this.periodType = periodType;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getOrderTotalCount() {
        return orderTotalCount;
    }

    public void setOrderTotalCount(Integer orderTotalCount) {
        this.orderTotalCount = orderTotalCount;
    }

    public Long getOrderTotalAmount() {
        return orderTotalAmount;
    }

    public void setOrderTotalAmount(Long orderTotalAmount) {
        this.orderTotalAmount = orderTotalAmount;
    }

    public Integer getOrderAvgAmount() {
        return orderAvgAmount;
    }

    public void setOrderAvgAmount(Integer orderAvgAmount) {
        this.orderAvgAmount = orderAvgAmount;
    }

    public Integer getItemClassCount() {
        return itemClassCount;
    }

    public void setItemClassCount(Integer itemClassCount) {
        this.itemClassCount = itemClassCount;
    }

    public Double getItemTotalCount() {
        return itemTotalCount;
    }

    public void setItemTotalCount(Double itemTotalCount) {
        this.itemTotalCount = itemTotalCount;
    }

    public Integer getItemTotalAmount() {
        return itemTotalAmount;
    }

    public void setItemTotalAmount(Integer itemTotalAmount) {
        this.itemTotalAmount = itemTotalAmount;
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
        ShopOrderStat other = (ShopOrderStat) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPeriod() == null ? other.getPeriod() == null : this.getPeriod().equals(other.getPeriod()))
            && (this.getPeriodType() == null ? other.getPeriodType() == null : this.getPeriodType().equals(other.getPeriodType()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
            && (this.getOrderTotalCount() == null ? other.getOrderTotalCount() == null : this.getOrderTotalCount().equals(other.getOrderTotalCount()))
            && (this.getOrderTotalAmount() == null ? other.getOrderTotalAmount() == null : this.getOrderTotalAmount().equals(other.getOrderTotalAmount()))
            && (this.getOrderAvgAmount() == null ? other.getOrderAvgAmount() == null : this.getOrderAvgAmount().equals(other.getOrderAvgAmount()))
            && (this.getItemClassCount() == null ? other.getItemClassCount() == null : this.getItemClassCount().equals(other.getItemClassCount()))
            && (this.getItemTotalCount() == null ? other.getItemTotalCount() == null : this.getItemTotalCount().equals(other.getItemTotalCount()))
            && (this.getItemTotalAmount() == null ? other.getItemTotalAmount() == null : this.getItemTotalAmount().equals(other.getItemTotalAmount()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModify() == null ? other.getGmtModify() == null : this.getGmtModify().equals(other.getGmtModify()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        result = prime * result + ((getPeriodType() == null) ? 0 : getPeriodType().hashCode());
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        result = prime * result + ((getOrderTotalCount() == null) ? 0 : getOrderTotalCount().hashCode());
        result = prime * result + ((getOrderTotalAmount() == null) ? 0 : getOrderTotalAmount().hashCode());
        result = prime * result + ((getOrderAvgAmount() == null) ? 0 : getOrderAvgAmount().hashCode());
        result = prime * result + ((getItemClassCount() == null) ? 0 : getItemClassCount().hashCode());
        result = prime * result + ((getItemTotalCount() == null) ? 0 : getItemTotalCount().hashCode());
        result = prime * result + ((getItemTotalAmount() == null) ? 0 : getItemTotalAmount().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModify() == null) ? 0 : getGmtModify().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}