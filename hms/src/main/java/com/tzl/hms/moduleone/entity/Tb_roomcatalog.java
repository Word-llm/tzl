package com.tzl.hms.moduleone.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import javax.persistence.Entity;
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
@TableName(value = "tb_roomcatalog")
public class Tb_roomcatalog extends Model<Tb_roomcatalog> {

    private static final long serialVersionUID=1L;

    /**
     * 客房类型编号
     */
    @TableId(value = "rc_id", type = IdType.AUTO)
    private Integer rc_id;

    /**
     * 客房类型名称
     */
    private String rc_name;

    /**
     * 床位数
     */
    private Integer rc_bed_number;

    /**
     * 预定价格
     */
    private BigDecimal rc_pre_price;

    /**
     * 预定折扣
     */
    private BigDecimal rc_pre_discount;

    /**
     * 计时最低价
     */
    private BigDecimal rc_hour_base_price;

    /**
     * 计时每小时价
     */
    private BigDecimal rc_per_hour_price;


    public Integer getRc_id() {
        return rc_id;
    }

    public void setRc_id(Integer rc_id) {
        this.rc_id = rc_id;
    }

    public String getRc_name() {
        return rc_name;
    }

    public void setRc_name(String rc_name) {
        this.rc_name = rc_name;
    }

    public Integer getRc_bed_number() {
        return rc_bed_number;
    }

    public void setRc_bed_number(Integer rc_bed_number) {
        this.rc_bed_number = rc_bed_number;
    }

    public BigDecimal getRc_pre_price() {
        return rc_pre_price;
    }

    public void setRc_pre_price(BigDecimal rc_pre_price) {
        this.rc_pre_price = rc_pre_price;
    }

    public BigDecimal getRc_pre_discount() {
        return rc_pre_discount;
    }

    public void setRc_pre_discount(BigDecimal rc_pre_discount) {
        this.rc_pre_discount = rc_pre_discount;
    }

    public BigDecimal getRc_hour_base_price() {
        return rc_hour_base_price;
    }

    public void setRc_hour_base_price(BigDecimal rc_hour_base_price) {
        this.rc_hour_base_price = rc_hour_base_price;
    }

    public BigDecimal getRc_per_hour_price() {
        return rc_per_hour_price;
    }

    public void setRc_per_hour_price(BigDecimal rc_per_hour_price) {
        this.rc_per_hour_price = rc_per_hour_price;
    }

    @Override
    protected Serializable pkVal() {
        return this.rc_id;
    }

    @Override
    public String toString() {
        return "Tb_roomcatalog{" +
        "rc_id=" + rc_id +
        ", rc_name=" + rc_name +
        ", rc_bed_number=" + rc_bed_number +
        ", rc_pre_price=" + rc_pre_price +
        ", rc_pre_discount=" + rc_pre_discount +
        ", rc_hour_base_price=" + rc_hour_base_price +
        ", rc_per_hour_price=" + rc_per_hour_price +
        "}";
    }
}
