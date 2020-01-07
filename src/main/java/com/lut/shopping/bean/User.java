package com.lut.shopping.bean;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    private Integer unum;

    private Integer code;

    private String name;

    private String password;

    private String question;

    private String answer;

    private Double member;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUnum() {
        return unum;
    }

    public void setUnum(Integer unum) {
        this.unum = unum;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Double getMember() {
        return member;
    }

    public void setMember(Double member) {
        this.member = member;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", unum=").append(unum);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", question=").append(question);
        sb.append(", answer=").append(answer);
        sb.append(", member=").append(member);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}