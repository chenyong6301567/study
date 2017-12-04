package com.cy.study.dal.model;

import java.io.Serializable;
import java.util.Date;

public class ShoppingCart implements Serializable {
    private Long id;

    private Long userId;

    private Long itemId;

    private String itemBarcode;

    private String itemName;

    private Integer itemPrice;

    private Integer itemVipPrice;

    private Integer itemConstPrice;

    private String attribute;

    private Long deviceId;

    private Integer cashierId;

    private Short status;

    private Date gmtCreate;

    private Date gmtModify;

    private Integer shopId;

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

    public Integer getItemConstPrice() {
        return itemConstPrice;
    }

    public void setItemConstPrice(Integer itemConstPrice) {
        this.itemConstPrice = itemConstPrice;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
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

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
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
        ShoppingCart other = (ShoppingCart) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getItemBarcode() == null ? other.getItemBarcode() == null : this.getItemBarcode().equals(other.getItemBarcode()))
            && (this.getItemName() == null ? other.getItemName() == null : this.getItemName().equals(other.getItemName()))
            && (this.getItemPrice() == null ? other.getItemPrice() == null : this.getItemPrice().equals(other.getItemPrice()))
            && (this.getItemVipPrice() == null ? other.getItemVipPrice() == null : this.getItemVipPrice().equals(other.getItemVipPrice()))
            && (this.getItemConstPrice() == null ? other.getItemConstPrice() == null : this.getItemConstPrice().equals(other.getItemConstPrice()))
            && (this.getAttribute() == null ? other.getAttribute() == null : this.getAttribute().equals(other.getAttribute()))
            && (this.getDeviceId() == null ? other.getDeviceId() == null : this.getDeviceId().equals(other.getDeviceId()))
            && (this.getCashierId() == null ? other.getCashierId() == null : this.getCashierId().equals(other.getCashierId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModify() == null ? other.getGmtModify() == null : this.getGmtModify().equals(other.getGmtModify()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getItemBarcode() == null) ? 0 : getItemBarcode().hashCode());
        result = prime * result + ((getItemName() == null) ? 0 : getItemName().hashCode());
        result = prime * result + ((getItemPrice() == null) ? 0 : getItemPrice().hashCode());
        result = prime * result + ((getItemVipPrice() == null) ? 0 : getItemVipPrice().hashCode());
        result = prime * result + ((getItemConstPrice() == null) ? 0 : getItemConstPrice().hashCode());
        result = prime * result + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        result = prime * result + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        result = prime * result + ((getCashierId() == null) ? 0 : getCashierId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModify() == null) ? 0 : getGmtModify().hashCode());
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        return result;
    }
}