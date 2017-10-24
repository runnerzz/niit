package com.niit.user.domain;


import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;

public class User implements Serializable {

    /**
     * 用户ID
     */
    private int id;
    /**
     * 用户名
     */
    private String name = "";
    /**
     * 用户密码
     */
    private String pwd = "";
    /**
     * 性别
     */
    private String sex = "";
    /**
     * 移动电话
     */
    private String mobile = "";
    /**
     * 移动电话
     */
    private String mobilePhone = "";

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    /**
     * 邮箱
     */
    private String email = "";
    /**
     * 头像
     */
    private String avator = "";
    /**
     * 用户状态
     */
    private String status = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sex='" + sex + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", email='" + email + '\'' +
                ", avator='" + avator + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
