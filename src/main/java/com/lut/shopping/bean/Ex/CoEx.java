package com.lut.shopping.bean.Ex;

import com.lut.shopping.bean.Order;

import java.io.Serializable;
import java.util.List;

public class CoEx implements Serializable {
    private Integer id;
    private String cname;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
