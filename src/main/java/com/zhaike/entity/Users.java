package com.zhaike.entity;

import java.util.Date;

public class Users {
    private Integer id;

    private String nickname;

    private String password;

    private String icon;

    private String gender;

    private Date birthday;

    private String phone;

    private String email;

    private String highesteducation;

    private String graducateschool;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getHighesteducation() {
        return highesteducation;
    }

    public void setHighesteducation(String highesteducation) {
        this.highesteducation = highesteducation == null ? null : highesteducation.trim();
    }

    public String getGraducateschool() {
        return graducateschool;
    }

    public void setGraducateschool(String graducateschool) {
        this.graducateschool = graducateschool == null ? null : graducateschool.trim();
    }
}