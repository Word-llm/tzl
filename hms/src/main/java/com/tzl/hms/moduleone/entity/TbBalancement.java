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
public class TbBalancement extends Model<TbBalancement> {

    private static final long serialVersionUID=1L;

    /**
     * 结账信息编号
     */
    @TableId(value = "bm_id", type = IdType.AUTO)
    private Integer bmId;

    /**
     * 入住登记订单编号
     */
    private String bmCheckinOrderId;

    /**
     * 客人编号
     */
    private String bmGusetId;

    /**
     * 结账类型
     */
    private String bmType;

    /**
     * 应收金额
     */
    private BigDecimal bmTotalRate;

    /**
     * 已付押金
     */
    private BigDecimal bmPaidMoney;

    /**
     * 续收金额
     */
    private BigDecimal bmReceivMoney;

    /**
     * 创建时间
     */
    private LocalDateTime bmCreateTime;

    /**
     * 操作员
     */
    private String bmOperator;

    /**
     * 支付类型
     */
    private String bmPaymentModel;

    /**
     * 结账说明
     */
    private String bmRemark;


    public Integer getBmId() {
        return bmId;
    }

    public void setBmId(Integer bmId) {
        this.bmId = bmId;
    }

    public String getBmCheckinOrderId() {
        return bmCheckinOrderId;
    }

    public void setBmCheckinOrderId(String bmCheckinOrderId) {
        this.bmCheckinOrderId = bmCheckinOrderId;
    }

    public String getBmGusetId() {
        return bmGusetId;
    }

    public void setBmGusetId(String bmGusetId) {
        this.bmGusetId = bmGusetId;
    }

    public String getBmType() {
        return bmType;
    }

    public void setBmType(String bmType) {
        this.bmType = bmType;
    }

    public BigDecimal getBmTotalRate() {
        return bmTotalRate;
    }

    public void setBmTotalRate(BigDecimal bmTotalRate) {
        this.bmTotalRate = bmTotalRate;
    }

    public BigDecimal getBmPaidMoney() {
        return bmPaidMoney;
    }

    public void setBmPaidMoney(BigDecimal bmPaidMoney) {
        this.bmPaidMoney = bmPaidMoney;
    }

    public BigDecimal getBmReceivMoney() {
        return bmReceivMoney;
    }

    public void setBmReceivMoney(BigDecimal bmReceivMoney) {
        this.bmReceivMoney = bmReceivMoney;
    }

    public LocalDateTime getBmCreateTime() {
        return bmCreateTime;
    }

    public void setBmCreateTime(LocalDateTime bmCreateTime) {
        this.bmCreateTime = bmCreateTime;
    }

    public String getBmOperator() {
        return bmOperator;
    }

    public void setBmOperator(String bmOperator) {
        this.bmOperator = bmOperator;
    }

    public String getBmPaymentModel() {
        return bmPaymentModel;
    }

    public void setBmPaymentModel(String bmPaymentModel) {
        this.bmPaymentModel = bmPaymentModel;
    }

    public String getBmRemark() {
        return bmRemark;
    }

    public void setBmRemark(String bmRemark) {
        this.bmRemark = bmRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.bmId;
    }

    @Override
    public String toString() {
        return "TbBalancement{" +
        "bmId=" + bmId +
        ", bmCheckinOrderId=" + bmCheckinOrderId +
        ", bmGusetId=" + bmGusetId +
        ", bmType=" + bmType +
        ", bmTotalRate=" + bmTotalRate +
        ", bmPaidMoney=" + bmPaidMoney +
        ", bmReceivMoney=" + bmReceivMoney +
        ", bmCreateTime=" + bmCreateTime +
        ", bmOperator=" + bmOperator +
        ", bmPaymentModel=" + bmPaymentModel +
        ", bmRemark=" + bmRemark +
        "}";
    }
}
