package com.lut.shopping.bean.Ex;

import com.lut.shopping.bean.User;

import java.io.Serializable;
import java.util.List;

public class ShopEx implements Serializable {
    private Integer id;
    private String name;
    private Double score;
    private User user;
    private List<RepertoryEx> repertoryExList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<RepertoryEx> getRepertoryExList() {
        return repertoryExList;
    }

    public void setRepertoryExList(List<RepertoryEx> repertoryExList) {
        this.repertoryExList = repertoryExList;
    }
}
