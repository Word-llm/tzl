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
public class TbOperator extends Model<TbOperator> {

    private static final long serialVersionUID=1L;

    /**
     * 操作员用户名
     */
    @TableId(value = "op_user_name", type = IdType.AUTO)
    private Integer opUserName;

    /**
     * 操作员密码
     */
    private String opPassword;

    /**
     * 操作员权限
     */
    private String opPrivilege;

    /**
     * 地址
     */
    private String opAddress;

    /**
     * 姓名
     */
    private String opName;

    /**
     * 电话
     */
    private String opTelephone;

    /**
     * 手机
     */
    private String opMobile;

    /**
     * 邮编
     */
    private String opZip;

    /**
     * 创建时间
     */
    private LocalDateTime opCreateTime;


    public Integer getOpUserName() {
        return opUserName;
    }

    public void setOpUserName(Integer opUserName) {
        this.opUserName = opUserName;
    }

    public String getOpPassword() {
        return opPassword;
    }

    public void setOpPassword(String opPassword) {
        this.opPassword = opPassword;
    }

    public String getOpPrivilege() {
        return opPrivilege;
    }

    public void setOpPrivilege(String opPrivilege) {
        this.opPrivilege = opPrivilege;
    }

    public String getOpAddress() {
        return opAddress;
    }

    public void setOpAddress(String opAddress) {
        this.opAddress = opAddress;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName;
    }

    public String getOpTelephone() {
        return opTelephone;
    }

    public void setOpTelephone(String opTelephone) {
        this.opTelephone = opTelephone;
    }

    public String getOpMobile() {
        return opMobile;
    }

    public void setOpMobile(String opMobile) {
        this.opMobile = opMobile;
    }

    public String getOpZip() {
        return opZip;
    }

    public void setOpZip(String opZip) {
        this.opZip = opZip;
    }

    public LocalDateTime getOpCreateTime() {
        return opCreateTime;
    }

    public void setOpCreateTime(LocalDateTime opCreateTime) {
        this.opCreateTime = opCreateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.opUserName;
    }

    @Override
    public String toString() {
        return "TbOperator{" +
        "opUserName=" + opUserName +
        ", opPassword=" + opPassword +
        ", opPrivilege=" + opPrivilege +
        ", opAddress=" + opAddress +
        ", opName=" + opName +
        ", opTelephone=" + opTelephone +
        ", opMobile=" + opMobile +
        ", opZip=" + opZip +
        ", opCreateTime=" + opCreateTime +
        "}";
    }
}
