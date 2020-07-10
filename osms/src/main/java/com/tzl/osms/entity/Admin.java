package com.tzl.osms.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

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
public class Admin extends Model<Admin> {

    private static final long serialVersionUID=1L;

    /**
     * 管理员编号
     */
    private Integer adminId;

    /**
     * 管理员用户名
     */
    private String userName;

    /**
     * 管理员密码
     */
    private String password;


    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
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

    @Override
    protected Serializable pkVal() {
        return this.adminId;
    }

    @Override
    public String toString() {
        return "Admin{" +
        "adminId=" + adminId +
        ", userName=" + userName +
        ", password=" + password +
        "}";
    }
}
