package com.tzl.osms.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 沐纤云
 * @since 2020-07-10
 */
@Data
public class Order extends Model<Order> {

    private static final long serialVersionUID=1L;

    /**
     * 订单编号
     */
    private Integer orderFormId;

    /**
     * 订单序号
     */
    private String orderFormNo;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 提交订单时间
     */
    private LocalDateTime submitTime;

    /**
     * 发货时间
     */
    private LocalDateTime consignmentTime;

    /**
     * 总金额
     */
    private BigDecimal totalPrice;

    /**
     * 买家备注
     */
    private String remark;

    /**
     * 买家IP地址
     */
    private String ipAddress;

    /**
     * 买家是否付款
     */
    private Boolean isPayoff;

    /**
     * 是否发货
     */
    private Boolean isConsignment;


    public Integer getOrderFormId() {
        return orderFormId;
    }

    public void setOrderFormId(Integer orderFormId) {
        this.orderFormId = orderFormId;
    }

    public String getOrderFormNo() {
        return orderFormNo;
    }

    public void setOrderFormNo(String orderFormNo) {
        this.orderFormNo = orderFormNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public LocalDateTime getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(LocalDateTime submitTime) {
        this.submitTime = submitTime;
    }

    public LocalDateTime getConsignmentTime() {
        return consignmentTime;
    }

    public void setConsignmentTime(LocalDateTime consignmentTime) {
        this.consignmentTime = consignmentTime;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Boolean getPayoff() {
        return isPayoff;
    }

    public void setPayoff(Boolean isPayoff) {
        this.isPayoff = isPayoff;
    }

    public Boolean getConsignment() {
        return isConsignment;
    }

    public void setConsignment(Boolean isConsignment) {
        this.isConsignment = isConsignment;
    }

    @Override
    protected Serializable pkVal() {
        return this.orderFormId;
    }

    @Override
    public String toString() {
        return "Order{" +
        "orderFormId=" + orderFormId +
        ", orderFormNo=" + orderFormNo +
        ", userId=" + userId +
        ", submitTime=" + submitTime +
        ", consignmentTime=" + consignmentTime +
        ", totalPrice=" + totalPrice +
        ", remark=" + remark +
        ", ipAddress=" + ipAddress +
        ", isPayoff=" + isPayoff +
        ", isConsignment=" + isConsignment +
        "}";
    }
}
