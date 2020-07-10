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
@TableName(value = "tb_checkinitem")
public class Tb_checkinitem extends Model<Tb_checkinitem> {

    private static final long serialVersionUID=1L;

    /**
     * 入住信息登记编号
     */
    @TableId(value = "cim_id", type = IdType.AUTO)
    private Integer cim_id;

    /**
     * 入住登记订单
     */
    private String checkin_order;

    /**
     * 入住房间
     */
    private String room;

    /**
     * 实际价格
     */
    private BigDecimal cim_prct_price;

    /**
     * 折扣
     */
    private BigDecimal cim_discount;

    /**
     * 入住时间
     */
    private LocalDateTime cim_in_datetime;

    /**
     * 离开时间
     */
    private LocalDateTime cim_out_datetime;

    /**
     * 等级状态
     */
    private String cim_state;


    public Integer getCim_id() {
        return cim_id;
    }

    public void setCim_id(Integer cim_id) {
        this.cim_id = cim_id;
    }

    public String getCheckin_order() {
        return checkin_order;
    }

    public void setCheckin_order(String checkin_order) {
        this.checkin_order = checkin_order;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public BigDecimal getCim_prct_price() {
        return cim_prct_price;
    }

    public void setCim_prct_price(BigDecimal cim_prct_price) {
        this.cim_prct_price = cim_prct_price;
    }

    public BigDecimal getCim_discount() {
        return cim_discount;
    }

    public void setCim_discount(BigDecimal cim_discount) {
        this.cim_discount = cim_discount;
    }

    public LocalDateTime getCim_in_datetime() {
        return cim_in_datetime;
    }

    public void setCim_in_datetime(LocalDateTime cim_in_datetime) {
        this.cim_in_datetime = cim_in_datetime;
    }

    public LocalDateTime getCim_out_datetime() {
        return cim_out_datetime;
    }

    public void setCim_out_datetime(LocalDateTime cim_out_datetime) {
        this.cim_out_datetime = cim_out_datetime;
    }

    public String getCim_state() {
        return cim_state;
    }

    public void setCim_state(String cim_state) {
        this.cim_state = cim_state;
    }

    @Override
    protected Serializable pkVal() {
        return this.cim_id;
    }

    @Override
    public String toString() {
        return "Tb_checkinitem{" +
        "cim_id=" + cim_id +
        ", checkin_order=" + checkin_order +
        ", room=" + room +
        ", cim_prct_price=" + cim_prct_price +
        ", cim_discount=" + cim_discount +
        ", cim_in_datetime=" + cim_in_datetime +
        ", cim_out_datetime=" + cim_out_datetime +
        ", cim_state=" + cim_state +
        "}";
    }
}
