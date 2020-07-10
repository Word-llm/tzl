package com.tzl.osms.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author 沐纤云
 * @since 2020-07-10
 */
@Data
@TableName(value = "user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    @TableId(type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private Boolean sex;

    /**
     * 住址
     */
    private String address;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 邮寄地址
     */
    private String post;

    /**
     * Email地址
     */
    private String email;

    /**
     * 注册时间
     */
    private LocalDateTime regTime;

    /**
     * 注册IP地址
     */
    private String regIpAddress;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getRegTime() {
        return regTime;
    }

    public void setRegTime(LocalDateTime regTime) {
        this.regTime = regTime;
    }

    public String getRegIpAddress() {
        return regIpAddress;
    }

    public void setRegIpAddress(String regIpAddress) {
        this.regIpAddress = regIpAddress;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName=" + userName +
                ", password=" + password +
                ", name=" + name +
                ", sex=" + sex +
                ", address=" + address +
                ", phone=" + phone +
                ", post=" + post +
                ", email=" + email +
                ", regTime=" + regTime +
                ", regIpAddress=" + regIpAddress +
                "}";
    }
}
