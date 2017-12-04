package com.cy.study.dal.model;

import java.io.Serializable;
import java.util.Date;

public class OrderItem implements Serializable {
    private Long id;

    private Long orderId;

    private Long itemId;

    private String itemBarcode;

    private String itemName;

    private String itemSpec;

    private Integer itemPrice;

    private Integer itemVipPrice;

    private Integer itemCostPrice;

    private String itemInfo;

    private Double itemCount;

    private Date gmtCreate;

    private Date gmtModify;

    private Short status;

    private String itemUnit;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemBarcode() {
        return itemBarcode;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode == null ? null : itemBarcode.trim();
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

    public Integer getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Integer itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getItemVipPrice() {
        return itemVipPrice;
    }

    public void setItemVipPrice(Integer itemVipPrice) {
        this.itemVipPrice = itemVipPrice;
    }

    public Integer getItemCostPrice() {
        return itemCostPrice;
    }

    public void setItemCostPrice(Integer itemCostPrice) {
        this.itemCostPrice = itemCostPrice;
    }

    public String getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(String itemInfo) {
        this.itemInfo = itemInfo == null ? null : itemInfo.trim();
    }

    public Double getItemCount() {
        return itemCount;
    }

    public void setItemCount(Double itemCount) {
        this.itemCount = itemCount;
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

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit == null ? null : itemUnit.trim();
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
        OrderItem other = (OrderItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getItemBarcode() == null ? other.getItemBarcode() == null : this.getItemBarcode().equals(other.getItemBarcode()))
            && (this.getItemName() == null ? other.getItemName() == null : this.getItemName().equals(other.getItemName()))
            && (this.getItemSpec() == null ? other.getItemSpec() == null : this.getItemSpec().equals(other.getItemSpec()))
            && (this.getItemPrice() == null ? other.getItemPrice() == null : this.getItemPrice().equals(other.getItemPrice()))
            && (this.getItemVipPrice() == null ? other.getItemVipPrice() == null : this.getItemVipPrice().equals(other.getItemVipPrice()))
            && (this.getItemCostPrice() == null ? other.getItemCostPrice() == null : this.getItemCostPrice().equals(other.getItemCostPrice()))
            && (this.getItemInfo() == null ? other.getItemInfo() == null : this.getItemInfo().equals(other.getItemInfo()))
            && (this.getItemCount() == null ? other.getItemCount() == null : this.getItemCount().equals(other.getItemCount()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModify() == null ? other.getGmtModify() == null : this.getGmtModify().equals(other.getGmtModify()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getItemUnit() == null ? other.getItemUnit() == null : this.getItemUnit().equals(other.getItemUnit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getItemBarcode() == null) ? 0 : getItemBarcode().hashCode());
        result = prime * result + ((getItemName() == null) ? 0 : getItemName().hashCode());
        result = prime * result + ((getItemSpec() == null) ? 0 : getItemSpec().hashCode());
        result = prime * result + ((getItemPrice() == null) ? 0 : getItemPrice().hashCode());
        result = prime * result + ((getItemVipPrice() == null) ? 0 : getItemVipPrice().hashCode());
        result = prime * result + ((getItemCostPrice() == null) ? 0 : getItemCostPrice().hashCode());
        result = prime * result + ((getItemInfo() == null) ? 0 : getItemInfo().hashCode());
        result = prime * result + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModify() == null) ? 0 : getGmtModify().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getItemUnit() == null) ? 0 : getItemUnit().hashCode());
        return result;
    }
}