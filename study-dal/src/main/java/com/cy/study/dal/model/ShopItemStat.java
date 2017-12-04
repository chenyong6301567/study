package com.cy.study.dal.model;

import java.io.Serializable;
import java.util.Date;

public class ShopItemStat implements Serializable {
    private Long id;

    private Integer period;

    private Short periodType;

    private Integer shopId;

    private Long itemId;

    private String itemName;

    private String itemSpec;

    private Integer salesCount;

    private Integer salesAmount;

    private Double salesAvgPrice;

    private Double amountRate;

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

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec == null ? null : itemSpec.trim();
    }

    public Integer getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(Integer salesCount) {
        this.salesCount = salesCount;
    }

    public Integer getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(Integer salesAmount) {
        this.salesAmount = salesAmount;
    }

    public Double getSalesAvgPrice() {
        return salesAvgPrice;
    }

    public void setSalesAvgPrice(Double salesAvgPrice) {
        this.salesAvgPrice = salesAvgPrice;
    }

    public Double getAmountRate() {
        return amountRate;
    }

    public void setAmountRate(Double amountRate) {
        this.amountRate = amountRate;
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
        ShopItemStat other = (ShopItemStat) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPeriod() == null ? other.getPeriod() == null : this.getPeriod().equals(other.getPeriod()))
            && (this.getPeriodType() == null ? other.getPeriodType() == null : this.getPeriodType().equals(other.getPeriodType()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getItemName() == null ? other.getItemName() == null : this.getItemName().equals(other.getItemName()))
            && (this.getItemSpec() == null ? other.getItemSpec() == null : this.getItemSpec().equals(other.getItemSpec()))
            && (this.getSalesCount() == null ? other.getSalesCount() == null : this.getSalesCount().equals(other.getSalesCount()))
            && (this.getSalesAmount() == null ? other.getSalesAmount() == null : this.getSalesAmount().equals(other.getSalesAmount()))
            && (this.getSalesAvgPrice() == null ? other.getSalesAvgPrice() == null : this.getSalesAvgPrice().equals(other.getSalesAvgPrice()))
            && (this.getAmountRate() == null ? other.getAmountRate() == null : this.getAmountRate().equals(other.getAmountRate()))
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
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getItemName() == null) ? 0 : getItemName().hashCode());
        result = prime * result + ((getItemSpec() == null) ? 0 : getItemSpec().hashCode());
        result = prime * result + ((getSalesCount() == null) ? 0 : getSalesCount().hashCode());
        result = prime * result + ((getSalesAmount() == null) ? 0 : getSalesAmount().hashCode());
        result = prime * result + ((getSalesAvgPrice() == null) ? 0 : getSalesAvgPrice().hashCode());
        result = prime * result + ((getAmountRate() == null) ? 0 : getAmountRate().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModify() == null) ? 0 : getGmtModify().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}