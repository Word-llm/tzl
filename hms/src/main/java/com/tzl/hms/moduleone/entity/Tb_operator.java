package com.tzl.hms.moduleone.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xzh
 * @since 2020-07-10
 */
@Entity
@TableName(value = "tb_operator")
public class Tb_operator extends Model<Tb_operator> {

    private static final long serialVersionUID=1L;

    /**
     * 操作员用户名
     */
    @TableId(value = "op_user_name", type = IdType.AUTO)
    private Integer op_user_name;

    /**
     * 操作员密码
     */
    private String op_password;

    /**
     * 操作员权限
     */
    private String op_privilege;

    /**
     * 地址
     */
    private String op_address;

    /**
     * 姓名
     */
    private String op_name;

    /**
     * 电话
     */
    private String op_telephone;

    /**
     * 手机
     */
    private String op_mobile;

    /**
     * 邮编
     */
    private String op_zip;

    /**
     * 创建时间
     */
    private LocalDateTime op_create_time;


    public Integer getOp_user_name() {
        return op_user_name;
    }

    public void setOp_user_name(Integer op_user_name) {
        this.op_user_name = op_user_name;
    }

    public String getOp_password() {
        return op_password;
    }

    public void setOp_password(String op_password) {
        this.op_password = op_password;
    }

    public String getOp_privilege() {
        return op_privilege;
    }

    public void setOp_privilege(String op_privilege) {
        this.op_privilege = op_privilege;
    }

    public String getOp_address() {
        return op_address;
    }

    public void setOp_address(String op_address) {
        this.op_address = op_address;
    }

    public String getOp_name() {
        return op_name;
    }

    public void setOp_name(String op_name) {
        this.op_name = op_name;
    }

    public String getOp_telephone() {
        return op_telephone;
    }

    public void setOp_telephone(String op_telephone) {
        this.op_telephone = op_telephone;
    }

    public String getOp_mobile() {
        return op_mobile;
    }

    public void setOp_mobile(String op_mobile) {
        this.op_mobile = op_mobile;
    }

    public String getOp_zip() {
        return op_zip;
    }

    public void setOp_zip(String op_zip) {
        this.op_zip = op_zip;
    }

    public LocalDateTime getOp_create_time() {
        return op_create_time;
    }

    public void setOp_create_time(LocalDateTime op_create_time) {
        this.op_create_time = op_create_time;
    }

    @Override
    protected Serializable pkVal() {
        return this.op_user_name;
    }

    @Override
    public String toString() {
        return "Tb_operator{" +
        "op_user_name=" + op_user_name +
        ", op_password=" + op_password +
        ", op_privilege=" + op_privilege +
        ", op_address=" + op_address +
        ", op_name=" + op_name +
        ", op_telephone=" + op_telephone +
        ", op_mobile=" + op_mobile +
        ", op_zip=" + op_zip +
        ", op_create_time=" + op_create_time +
        "}";
    }
}
