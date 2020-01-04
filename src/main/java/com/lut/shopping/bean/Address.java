package com.lut.shopping.bean;

import java.io.Serializable;

public class Address implements Serializable {
    private Integer id;

    private String getaddress;

    private String deliveraddress;

    private String receivename;

    private String phone;

    private Integer userId;

    private Integer shopId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGetaddress() {
        return getaddress;
    }

    public void setGetaddress(String getaddress) {
        this.getaddress = getaddress == null ? null : getaddress.trim();
    }

    public String getDeliveraddress() {
        return deliveraddress;
    }

    public void setDeliveraddress(String deliveraddress) {
        this.deliveraddress = deliveraddress == null ? null : deliveraddress.trim();
    }

    public String getReceivename() {
        return receivename;
    }

    public void setReceivename(String receivename) {
        this.receivename = receivename == null ? null : receivename.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", getaddress=").append(getaddress);
        sb.append(", deliveraddress=").append(deliveraddress);
        sb.append(", receivename=").append(receivename);
        sb.append(", phone=").append(phone);
        sb.append(", userId=").append(userId);
        sb.append(", shopId=").append(shopId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}