package com.lut.shopping.bean.Ex;

import java.io.Serializable;

public class LeaguerEx implements Serializable {
    private String name;
    private String type;
    private Double discount;
    private String shname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getShname() {
        return shname;
    }

    public void setShname(String shname) {
        this.shname = shname;
    }
}
