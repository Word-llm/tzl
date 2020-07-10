package com.tzl.hms.moduleone.entity;

import java.math.BigDecimal;
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
@TableName(value = "tb_balancement")
public class Tb_balancement extends Model<Tb_balancement> {

    private static final long serialVersionUID=1L;

    /**
     * 结账信息编号
     */
    @TableId(value = "bm_id", type = IdType.AUTO)
    private Integer bm_id;

    /**
     * 入住登记订单编号
     */
    private String bm_checkin_order_id;

    /**
     * 客人编号
     */
    private String bm_guset_id;

    /**
     * 结账类型
     */
    private String bm_type;

    /**
     * 应收金额
     */
    private BigDecimal bm_total_rate;

    /**
     * 已付押金
     */
    private BigDecimal bm_paid_money;

    /**
     * 续收金额
     */
    private BigDecimal bm_receiv_money;

    /**
     * 创建时间
     */
    private LocalDateTime bm_create_time;

    /**
     * 操作员
     */
    private String bm_operator;

    /**
     * 支付类型
     */
    private String bm_payment_model;

    /**
     * 结账说明
     */
    private String bm_remark;


    public Integer getBm_id() {
        return bm_id;
    }

    public void setBm_id(Integer bm_id) {
        this.bm_id = bm_id;
    }

    public String getBm_checkin_order_id() {
        return bm_checkin_order_id;
    }

    public void setBm_checkin_order_id(String bm_checkin_order_id) {
        this.bm_checkin_order_id = bm_checkin_order_id;
    }

    public String getBm_guset_id() {
        return bm_guset_id;
    }

    public void setBm_guset_id(String bm_guset_id) {
        this.bm_guset_id = bm_guset_id;
    }

    public String getBm_type() {
        return bm_type;
    }

    public void setBm_type(String bm_type) {
        this.bm_type = bm_type;
    }

    public BigDecimal getBm_total_rate() {
        return bm_total_rate;
    }

    public void setBm_total_rate(BigDecimal bm_total_rate) {
        this.bm_total_rate = bm_total_rate;
    }

    public BigDecimal getBm_paid_money() {
        return bm_paid_money;
    }

    public void setBm_paid_money(BigDecimal bm_paid_money) {
        this.bm_paid_money = bm_paid_money;
    }

    public BigDecimal getBm_receiv_money() {
        return bm_receiv_money;
    }

    public void setBm_receiv_money(BigDecimal bm_receiv_money) {
        this.bm_receiv_money = bm_receiv_money;
    }

    public LocalDateTime getBm_create_time() {
        return bm_create_time;
    }

    public void setBm_create_time(LocalDateTime bm_create_time) {
        this.bm_create_time = bm_create_time;
    }

    public String getBm_operator() {
        return bm_operator;
    }

    public void setBm_operator(String bm_operator) {
        this.bm_operator = bm_operator;
    }

    public String getBm_payment_model() {
        return bm_payment_model;
    }

    public void setBm_payment_model(String bm_payment_model) {
        this.bm_payment_model = bm_payment_model;
    }

    public String getBm_remark() {
        return bm_remark;
    }

    public void setBm_remark(String bm_remark) {
        this.bm_remark = bm_remark;
    }

    @Override
    protected Serializable pkVal() {
        return this.bm_id;
    }

    @Override
    public String toString() {
        return "Tb_balancement{" +
        "bm_id=" + bm_id +
        ", bm_checkin_order_id=" + bm_checkin_order_id +
        ", bm_guset_id=" + bm_guset_id +
        ", bm_type=" + bm_type +
        ", bm_total_rate=" + bm_total_rate +
        ", bm_paid_money=" + bm_paid_money +
        ", bm_receiv_money=" + bm_receiv_money +
        ", bm_create_time=" + bm_create_time +
        ", bm_operator=" + bm_operator +
        ", bm_payment_model=" + bm_payment_model +
        ", bm_remark=" + bm_remark +
        "}";
    }
}
