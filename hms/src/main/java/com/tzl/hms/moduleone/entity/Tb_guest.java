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
public class Tb_guest extends Model<Tb_guest> {

    private static final long serialVersionUID=1L;

    /**
     * 客人编号
     */
    @TableId(value = "gt_id", type = IdType.AUTO)
    private Integer gt_id;

    /**
     * 客人姓名
     */
    private String gt_name;

    /**
     * 客人类型
     */
    private String gt_type;

    /**
     * 客人证件类别
     */
    private String gt_card_catalog;

    /**
     * 客人证件号码
     */
    private String gt_card_id;

    /**
     * 国籍
     */
    private String gt_country;

    /**
     * 地址
     */
    private String gt_address;

    /**
     * 邮编
     */
    private String gt_zip;

    /**
     * 公司（工作单位）
     */
    private String gt_company;

    /**
     * 固定电话
     */
    private String gt_telphone;

    /**
     * 手机
     */
    private String gt_mobile;

    /**
     * 性别
     */
    private String gt_gender;

    /**
     * email地址
     */
    private String gt_email;

    /**
     * 创建资料时间
     */
    private LocalDateTime gt_greate_time;


    public Integer getGt_id() {
        return gt_id;
    }

    public void setGt_id(Integer gt_id) {
        this.gt_id = gt_id;
    }

    public String getGt_name() {
        return gt_name;
    }

    public void setGt_name(String gt_name) {
        this.gt_name = gt_name;
    }

    public String getGt_type() {
        return gt_type;
    }

    public void setGt_type(String gt_type) {
        this.gt_type = gt_type;
    }

    public String getGt_card_catalog() {
        return gt_card_catalog;
    }

    public void setGt_card_catalog(String gt_card_catalog) {
        this.gt_card_catalog = gt_card_catalog;
    }

    public String getGt_card_id() {
        return gt_card_id;
    }

    public void setGt_card_id(String gt_card_id) {
        this.gt_card_id = gt_card_id;
    }

    public String getGt_country() {
        return gt_country;
    }

    public void setGt_country(String gt_country) {
        this.gt_country = gt_country;
    }

    public String getGt_address() {
        return gt_address;
    }

    public void setGt_address(String gt_address) {
        this.gt_address = gt_address;
    }

    public String getGt_zip() {
        return gt_zip;
    }

    public void setGt_zip(String gt_zip) {
        this.gt_zip = gt_zip;
    }

    public String getGt_company() {
        return gt_company;
    }

    public void setGt_company(String gt_company) {
        this.gt_company = gt_company;
    }

    public String getGt_telphone() {
        return gt_telphone;
    }

    public void setGt_telphone(String gt_telphone) {
        this.gt_telphone = gt_telphone;
    }

    public String getGt_mobile() {
        return gt_mobile;
    }

    public void setGt_mobile(String gt_mobile) {
        this.gt_mobile = gt_mobile;
    }

    public String getGt_gender() {
        return gt_gender;
    }

    public void setGt_gender(String gt_gender) {
        this.gt_gender = gt_gender;
    }

    public String getGt_email() {
        return gt_email;
    }

    public void setGt_email(String gt_email) {
        this.gt_email = gt_email;
    }

    public LocalDateTime getGt_greate_time() {
        return gt_greate_time;
    }

    public void setGt_greate_time(LocalDateTime gt_greate_time) {
        this.gt_greate_time = gt_greate_time;
    }

    @Override
    protected Serializable pkVal() {
        return this.gt_id;
    }

    @Override
    public String toString() {
        return "Tb_guest{" +
        "gt_id=" + gt_id +
        ", gt_name=" + gt_name +
        ", gt_type=" + gt_type +
        ", gt_card_catalog=" + gt_card_catalog +
        ", gt_card_id=" + gt_card_id +
        ", gt_country=" + gt_country +
        ", gt_address=" + gt_address +
        ", gt_zip=" + gt_zip +
        ", gt_company=" + gt_company +
        ", gt_telphone=" + gt_telphone +
        ", gt_mobile=" + gt_mobile +
        ", gt_gender=" + gt_gender +
        ", gt_email=" + gt_email +
        ", gt_greate_time=" + gt_greate_time +
        "}";
    }
}
