package com.lut.shopping.bean;

import java.io.Serializable;

public class Address implements Serializable {
    private Integer id;

    private String getaddress;

    private String deliveraddress;

    private String delivername;

    private String receivename;

    private String deliverphone;

    private String receivephone;

    private Integer userId;

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

    public String getDelivername() {
        return delivername;
    }

    public void setDelivername(String delivername) {
        this.delivername = delivername == null ? null : delivername.trim();
    }

    public String getReceivename() {
        return receivename;
    }

    public void setReceivename(String receivename) {
        this.receivename = receivename == null ? null : receivename.trim();
    }

    public String getDeliverphone() {
        return deliverphone;
    }

    public void setDeliverphone(String deliverphone) {
        this.deliverphone = deliverphone == null ? null : deliverphone.trim();
    }

    public String getReceivephone() {
        return receivephone;
    }

    public void setReceivephone(String receivephone) {
        this.receivephone = receivephone == null ? null : receivephone.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
        sb.append(", delivername=").append(delivername);
        sb.append(", receivename=").append(receivename);
        sb.append(", deliverphone=").append(deliverphone);
        sb.append(", receivephone=").append(receivephone);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}