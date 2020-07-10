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
public class TbCheckinitem extends Model<TbCheckinitem> {

    private static final long serialVersionUID=1L;

    /**
     * 入住信息登记编号
     */
    @TableId(value = "cim_id", type = IdType.AUTO)
    private Integer cimId;

    /**
     * 入住登记订单
     */
    private String checkinOrder;

    /**
     * 入住房间
     */
    private String room;

    /**
     * 实际价格
     */
    private BigDecimal cimPrctPrice;

    /**
     * 折扣
     */
    private BigDecimal cimDiscount;

    /**
     * 入住时间
     */
    private LocalDateTime cimInDatetime;

    /**
     * 离开时间
     */
    private LocalDateTime cimOutDatetime;

    /**
     * 等级状态
     */
    private String cimState;


    public Integer getCimId() {
        return cimId;
    }

    public void setCimId(Integer cimId) {
        this.cimId = cimId;
    }

    public String getCheckinOrder() {
        return checkinOrder;
    }

    public void setCheckinOrder(String checkinOrder) {
        this.checkinOrder = checkinOrder;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public BigDecimal getCimPrctPrice() {
        return cimPrctPrice;
    }

    public void setCimPrctPrice(BigDecimal cimPrctPrice) {
        this.cimPrctPrice = cimPrctPrice;
    }

    public BigDecimal getCimDiscount() {
        return cimDiscount;
    }

    public void setCimDiscount(BigDecimal cimDiscount) {
        this.cimDiscount = cimDiscount;
    }

    public LocalDateTime getCimInDatetime() {
        return cimInDatetime;
    }

    public void setCimInDatetime(LocalDateTime cimInDatetime) {
        this.cimInDatetime = cimInDatetime;
    }

    public LocalDateTime getCimOutDatetime() {
        return cimOutDatetime;
    }

    public void setCimOutDatetime(LocalDateTime cimOutDatetime) {
        this.cimOutDatetime = cimOutDatetime;
    }

    public String getCimState() {
        return cimState;
    }

    public void setCimState(String cimState) {
        this.cimState = cimState;
    }

    @Override
    protected Serializable pkVal() {
        return this.cimId;
    }

    @Override
    public String toString() {
        return "TbCheckinitem{" +
        "cimId=" + cimId +
        ", checkinOrder=" + checkinOrder +
        ", room=" + room +
        ", cimPrctPrice=" + cimPrctPrice +
        ", cimDiscount=" + cimDiscount +
        ", cimInDatetime=" + cimInDatetime +
        ", cimOutDatetime=" + cimOutDatetime +
        ", cimState=" + cimState +
        "}";
    }
}
