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
public class TbRoomcatalog extends Model<TbRoomcatalog> {

    private static final long serialVersionUID=1L;

    /**
     * 客房类型编号
     */
    @TableId(value = "rc_id", type = IdType.AUTO)
    private Integer rcId;

    /**
     * 客房类型名称
     */
    private String rcName;

    /**
     * 床位数
     */
    private Integer rcBedNumber;

    /**
     * 预定价格
     */
    private BigDecimal rcPrePrice;

    /**
     * 预定折扣
     */
    private BigDecimal rcPreDiscount;

    /**
     * 计时最低价
     */
    private BigDecimal rcHourBasePrice;

    /**
     * 计时每小时价
     */
    private BigDecimal rcPerHourPrice;


    public Integer getRcId() {
        return rcId;
    }

    public void setRcId(Integer rcId) {
        this.rcId = rcId;
    }

    public String getRcName() {
        return rcName;
    }

    public void setRcName(String rcName) {
        this.rcName = rcName;
    }

    public Integer getRcBedNumber() {
        return rcBedNumber;
    }

    public void setRcBedNumber(Integer rcBedNumber) {
        this.rcBedNumber = rcBedNumber;
    }

    public BigDecimal getRcPrePrice() {
        return rcPrePrice;
    }

    public void setRcPrePrice(BigDecimal rcPrePrice) {
        this.rcPrePrice = rcPrePrice;
    }

    public BigDecimal getRcPreDiscount() {
        return rcPreDiscount;
    }

    public void setRcPreDiscount(BigDecimal rcPreDiscount) {
        this.rcPreDiscount = rcPreDiscount;
    }

    public BigDecimal getRcHourBasePrice() {
        return rcHourBasePrice;
    }

    public void setRcHourBasePrice(BigDecimal rcHourBasePrice) {
        this.rcHourBasePrice = rcHourBasePrice;
    }

    public BigDecimal getRcPerHourPrice() {
        return rcPerHourPrice;
    }

    public void setRcPerHourPrice(BigDecimal rcPerHourPrice) {
        this.rcPerHourPrice = rcPerHourPrice;
    }

    @Override
    protected Serializable pkVal() {
        return this.rcId;
    }

    @Override
    public String toString() {
        return "TbRoomcatalog{" +
        "rcId=" + rcId +
        ", rcName=" + rcName +
        ", rcBedNumber=" + rcBedNumber +
        ", rcPrePrice=" + rcPrePrice +
        ", rcPreDiscount=" + rcPreDiscount +
        ", rcHourBasePrice=" + rcHourBasePrice +
        ", rcPerHourPrice=" + rcPerHourPrice +
        "}";
    }
}
