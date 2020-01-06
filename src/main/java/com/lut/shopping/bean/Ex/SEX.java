package com.lut.shopping.bean.Ex;

import com.lut.shopping.bean.Question;

import java.io.Serializable;
import java.util.List;

public class SEX implements Serializable {
    private String sname;

    private List<Question> qs;

    public List<Question> getQs() {
        return qs;
    }

    public void setQs(List<Question> qs) {
        this.qs = qs;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
