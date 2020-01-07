package com.lut.shopping.bean.Ex;

import java.io.Serializable;

public class Price implements Serializable {
    private Integer id;

    private String sname;

    private Double sumprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Double getSumprice() {
        return sumprice;
    }

    public void setSumprice(Double sumprice) {
        this.sumprice = sumprice;
    }
}
