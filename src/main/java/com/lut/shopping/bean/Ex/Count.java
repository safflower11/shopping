package com.lut.shopping.bean.Ex;

import java.io.Serializable;

public class Count implements Serializable {

    private String cname;

    private int ct;

    public int getCt() {
        return ct;
    }

    public void setCt(int ct) {
        this.ct = ct;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
