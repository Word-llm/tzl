package com.tzl.osms.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

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
public class OrderList extends Model<OrderList> {

    private static final long serialVersionUID=1L;

    /**
     * 订单列表编号
     */
    private Integer orderListId;

    /**
     * 订单编号
     */
    private Integer orderFromId;

    /**
     * 商品编号
     */
    private Integer commodityId;

    /**
     * 商品数量
     */
    private Integer amount;


    public Integer getOrderListId() {
        return orderListId;
    }

    public void setOrderListId(Integer orderListId) {
        this.orderListId = orderListId;
    }

    public Integer getOrderFromId() {
        return orderFromId;
    }

    public void setOrderFromId(Integer orderFromId) {
        this.orderFromId = orderFromId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    protected Serializable pkVal() {
        return this.orderListId;
    }

    @Override
    public String toString() {
        return "OrderList{" +
        "orderListId=" + orderListId +
        ", orderFromId=" + orderFromId +
        ", commodityId=" + commodityId +
        ", amount=" + amount +
        "}";
    }
}
