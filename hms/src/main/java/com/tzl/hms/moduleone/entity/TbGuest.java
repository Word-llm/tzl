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
@TableName(value = "tb_guest")
public class TbGuest extends Model<TbGuest> {

    private static final long serialVersionUID=1L;

    /**
     * 客人编号
     */
    @TableId(value = "gt_id", type = IdType.AUTO)
    private Integer gtId;

    /**
     * 客人姓名
     */
    private String gtName;

    /**
     * 客人类型
     */
    private String gtType;

    /**
     * 客人证件类别
     */
    private String gtCardCatalog;

    /**
     * 客人证件号码
     */
    private String gtCardId;

    /**
     * 国籍
     */
    private String gtCountry;

    /**
     * 地址
     */
    private String gtAddress;

    /**
     * 邮编
     */
    private String gtZip;

    /**
     * 公司（工作单位）
     */
    private String gtCompany;

    /**
     * 固定电话
     */
    private String gtTelphone;

    /**
     * 手机
     */
    private String gtMobile;

    /**
     * 性别
     */
    private String gtGender;

    /**
     * email地址
     */
    private String gtEmail;

    /**
     * 创建资料时间
     */
    private LocalDateTime gtGreateTime;


    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    public String getGtName() {
        return gtName;
    }

    public void setGtName(String gtName) {
        this.gtName = gtName;
    }

    public String getGtType() {
        return gtType;
    }

    public void setGtType(String gtType) {
        this.gtType = gtType;
    }

    public String getGtCardCatalog() {
        return gtCardCatalog;
    }

    public void setGtCardCatalog(String gtCardCatalog) {
        this.gtCardCatalog = gtCardCatalog;
    }

    public String getGtCardId() {
        return gtCardId;
    }

    public void setGtCardId(String gtCardId) {
        this.gtCardId = gtCardId;
    }

    public String getGtCountry() {
        return gtCountry;
    }

    public void setGtCountry(String gtCountry) {
        this.gtCountry = gtCountry;
    }

    public String getGtAddress() {
        return gtAddress;
    }

    public void setGtAddress(String gtAddress) {
        this.gtAddress = gtAddress;
    }

    public String getGtZip() {
        return gtZip;
    }

    public void setGtZip(String gtZip) {
        this.gtZip = gtZip;
    }

    public String getGtCompany() {
        return gtCompany;
    }

    public void setGtCompany(String gtCompany) {
        this.gtCompany = gtCompany;
    }

    public String getGtTelphone() {
        return gtTelphone;
    }

    public void setGtTelphone(String gtTelphone) {
        this.gtTelphone = gtTelphone;
    }

    public String getGtMobile() {
        return gtMobile;
    }

    public void setGtMobile(String gtMobile) {
        this.gtMobile = gtMobile;
    }

    public String getGtGender() {
        return gtGender;
    }

    public void setGtGender(String gtGender) {
        this.gtGender = gtGender;
    }

    public String getGtEmail() {
        return gtEmail;
    }

    public void setGtEmail(String gtEmail) {
        this.gtEmail = gtEmail;
    }

    public LocalDateTime getGtGreateTime() {
        return gtGreateTime;
    }

    public void setGtGreateTime(LocalDateTime gtGreateTime) {
        this.gtGreateTime = gtGreateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.gtId;
    }

    @Override
    public String toString() {
        return "TbGuest{" +
        "gtId=" + gtId +
        ", gtName=" + gtName +
        ", gtType=" + gtType +
        ", gtCardCatalog=" + gtCardCatalog +
        ", gtCardId=" + gtCardId +
        ", gtCountry=" + gtCountry +
        ", gtAddress=" + gtAddress +
        ", gtZip=" + gtZip +
        ", gtCompany=" + gtCompany +
        ", gtTelphone=" + gtTelphone +
        ", gtMobile=" + gtMobile +
        ", gtGender=" + gtGender +
        ", gtEmail=" + gtEmail +
        ", gtGreateTime=" + gtGreateTime +
        "}";
    }
}
