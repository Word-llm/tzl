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
@TableName(value = "tb_checkinorder")
public class Tb_checkinorder extends Model<Tb_checkinorder> {

    private static final long serialVersionUID=1L;

    /**
     * 入住登记订单编号
     */
    @TableId(value = "cio_id", type = IdType.AUTO)
    private Integer cio_id;

    /**
     * 入住登记信息列表
     */
    private String checkin_items;

    /**
     * 客人名称
     */
    private String cio_guest_name;

    /**
     * 人数
     */
    private Integer cio_man_number;

    /**
     * 客人类别
     */
    private String cio_guest_catalog;

    /**
     * 客人类型
     */
    private String cio_guest_type;

    /**
     * 团队名称
     */
    private String cio_group_name;

    /**
     * 客人证件类别
     */
    private String cio_guest_card_catalog;

    /**
     * 客人证件号码
     */
    private String cio_guest_card_id;

    /**
     * 事由
     */
    private String cio_cause;

    /**
     * 登记状态
     */
    private String cio_state;

    /**
     * 客人入住时间
     */
    private LocalDateTime cio_in_date_time;

    /**
     * 预计离开时间
     */
    private LocalDateTime cio_pre_out_date_time;

    /**
     * 实际离开时间
     */
    private LocalDateTime cio_prc_out_date_time;

    /**
     * 支付类型
     */
    private String cio_payment_model;

    /**
     * 已付押金
     */
    private BigDecimal cio_paid_money;

    /**
     * 有无预约
     */
    private String cio_is_reserv_id;

    /**
     * 操作员
     */
    private String cio_operator;

    /**
     * 客人性别
     */
    private String cio_guest_gender;

    /**
     * 总费用
     */
    private BigDecimal cio_tota_rate;

    /**
     * 加床费
     */
    private BigDecimal cio_red_rate;

    /**
     * 等级单号
     */
    private String cio_order_id;


    public Integer getCio_id() {
        return cio_id;
    }

    public void setCio_id(Integer cio_id) {
        this.cio_id = cio_id;
    }

    public String getCheckin_items() {
        return checkin_items;
    }

    public void setCheckin_items(String checkin_items) {
        this.checkin_items = checkin_items;
    }

    public String getCio_guest_name() {
        return cio_guest_name;
    }

    public void setCio_guest_name(String cio_guest_name) {
        this.cio_guest_name = cio_guest_name;
    }

    public Integer getCio_man_number() {
        return cio_man_number;
    }

    public void setCio_man_number(Integer cio_man_number) {
        this.cio_man_number = cio_man_number;
    }

    public String getCio_guest_catalog() {
        return cio_guest_catalog;
    }

    public void setCio_guest_catalog(String cio_guest_catalog) {
        this.cio_guest_catalog = cio_guest_catalog;
    }

    public String getCio_guest_type() {
        return cio_guest_type;
    }

    public void setCio_guest_type(String cio_guest_type) {
        this.cio_guest_type = cio_guest_type;
    }

    public String getCio_group_name() {
        return cio_group_name;
    }

    public void setCio_group_name(String cio_group_name) {
        this.cio_group_name = cio_group_name;
    }

    public String getCio_guest_card_catalog() {
        return cio_guest_card_catalog;
    }

    public void setCio_guest_card_catalog(String cio_guest_card_catalog) {
        this.cio_guest_card_catalog = cio_guest_card_catalog;
    }

    public String getCio_guest_card_id() {
        return cio_guest_card_id;
    }

    public void setCio_guest_card_id(String cio_guest_card_id) {
        this.cio_guest_card_id = cio_guest_card_id;
    }

    public String getCio_cause() {
        return cio_cause;
    }

    public void setCio_cause(String cio_cause) {
        this.cio_cause = cio_cause;
    }

    public String getCio_state() {
        return cio_state;
    }

    public void setCio_state(String cio_state) {
        this.cio_state = cio_state;
    }

    public LocalDateTime getCio_in_date_time() {
        return cio_in_date_time;
    }

    public void setCio_in_date_time(LocalDateTime cio_in_date_time) {
        this.cio_in_date_time = cio_in_date_time;
    }

    public LocalDateTime getCio_pre_out_date_time() {
        return cio_pre_out_date_time;
    }

    public void setCio_pre_out_date_time(LocalDateTime cio_pre_out_date_time) {
        this.cio_pre_out_date_time = cio_pre_out_date_time;
    }

    public LocalDateTime getCio_prc_out_date_time() {
        return cio_prc_out_date_time;
    }

    public void setCio_prc_out_date_time(LocalDateTime cio_prc_out_date_time) {
        this.cio_prc_out_date_time = cio_prc_out_date_time;
    }

    public String getCio_payment_model() {
        return cio_payment_model;
    }

    public void setCio_payment_model(String cio_payment_model) {
        this.cio_payment_model = cio_payment_model;
    }

    public BigDecimal getCio_paid_money() {
        return cio_paid_money;
    }

    public void setCio_paid_money(BigDecimal cio_paid_money) {
        this.cio_paid_money = cio_paid_money;
    }

    public String getCio_is_reserv_id() {
        return cio_is_reserv_id;
    }

    public void setCio_is_reserv_id(String cio_is_reserv_id) {
        this.cio_is_reserv_id = cio_is_reserv_id;
    }

    public String getCio_operator() {
        return cio_operator;
    }

    public void setCio_operator(String cio_operator) {
        this.cio_operator = cio_operator;
    }

    public String getCio_guest_gender() {
        return cio_guest_gender;
    }

    public void setCio_guest_gender(String cio_guest_gender) {
        this.cio_guest_gender = cio_guest_gender;
    }

    public BigDecimal getCio_tota_rate() {
        return cio_tota_rate;
    }

    public void setCio_tota_rate(BigDecimal cio_tota_rate) {
        this.cio_tota_rate = cio_tota_rate;
    }

    public BigDecimal getCio_red_rate() {
        return cio_red_rate;
    }

    public void setCio_red_rate(BigDecimal cio_red_rate) {
        this.cio_red_rate = cio_red_rate;
    }

    public String getCio_order_id() {
        return cio_order_id;
    }

    public void setCio_order_id(String cio_order_id) {
        this.cio_order_id = cio_order_id;
    }

    @Override
    protected Serializable pkVal() {
        return this.cio_id;
    }

    @Override
    public String toString() {
        return "Tb_checkinorder{" +
        "cio_id=" + cio_id +
        ", checkin_items=" + checkin_items +
        ", cio_guest_name=" + cio_guest_name +
        ", cio_man_number=" + cio_man_number +
        ", cio_guest_catalog=" + cio_guest_catalog +
        ", cio_guest_type=" + cio_guest_type +
        ", cio_group_name=" + cio_group_name +
        ", cio_guest_card_catalog=" + cio_guest_card_catalog +
        ", cio_guest_card_id=" + cio_guest_card_id +
        ", cio_cause=" + cio_cause +
        ", cio_state=" + cio_state +
        ", cio_in_date_time=" + cio_in_date_time +
        ", cio_pre_out_date_time=" + cio_pre_out_date_time +
        ", cio_prc_out_date_time=" + cio_prc_out_date_time +
        ", cio_payment_model=" + cio_payment_model +
        ", cio_paid_money=" + cio_paid_money +
        ", cio_is_reserv_id=" + cio_is_reserv_id +
        ", cio_operator=" + cio_operator +
        ", cio_guest_gender=" + cio_guest_gender +
        ", cio_tota_rate=" + cio_tota_rate +
        ", cio_red_rate=" + cio_red_rate +
        ", cio_order_id=" + cio_order_id +
        "}";
    }
}
