package com.tzl.osms.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class CommodityMessage extends Model<CommodityMessage> {

    private static final long serialVersionUID=1L;

    /**
     * 商品编号
     */
    private Integer commodityId;

    /**
     * 商品名称
     */
    private String commodityName;

    /**
     * 商品种类
     */
    private Integer commodityClass;

    /**
     * 生产厂家
     */
    private String manufacturer;

    /**
     * 商品描述
     */
    private BigDecimal commodityDepicts;

    /**
     * 商品价格
     */
    private BigDecimal commodityPrice;

    /**
     * 帆成网价格
     */
    private BigDecimal fcPrice;

    /**
     * 商品总数量
     */
    private Integer commodityAmount;

    /**
     * 商品剩余数量
     */
    @TableField("commodity_Leave_num")
    private Integer commodityLeaveNum;

    /**
     * 商品上架时间
     */
    private LocalDateTime regTime;

    /**
     * 商品图片
     */
    private String image;


    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Integer getCommodityClass() {
        return commodityClass;
    }

    public void setCommodityClass(Integer commodityClass) {
        this.commodityClass = commodityClass;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public BigDecimal getCommodityDepicts() {
        return commodityDepicts;
    }

    public void setCommodityDepicts(BigDecimal commodityDepicts) {
        this.commodityDepicts = commodityDepicts;
    }

    public BigDecimal getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(BigDecimal commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public BigDecimal getFcPrice() {
        return fcPrice;
    }

    public void setFcPrice(BigDecimal fcPrice) {
        this.fcPrice = fcPrice;
    }

    public Integer getCommodityAmount() {
        return commodityAmount;
    }

    public void setCommodityAmount(Integer commodityAmount) {
        this.commodityAmount = commodityAmount;
    }

    public Integer getCommodityLeaveNum() {
        return commodityLeaveNum;
    }

    public void setCommodityLeaveNum(Integer commodityLeaveNum) {
        this.commodityLeaveNum = commodityLeaveNum;
    }

    public LocalDateTime getRegTime() {
        return regTime;
    }

    public void setRegTime(LocalDateTime regTime) {
        this.regTime = regTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    protected Serializable pkVal() {
        return this.commodityId;
    }

    @Override
    public String toString() {
        return "CommodityMessage{" +
        "commodityId=" + commodityId +
        ", commodityName=" + commodityName +
        ", commodityClass=" + commodityClass +
        ", manufacturer=" + manufacturer +
        ", commodityDepicts=" + commodityDepicts +
        ", commodityPrice=" + commodityPrice +
        ", fcPrice=" + fcPrice +
        ", commodityAmount=" + commodityAmount +
        ", commodityLeaveNum=" + commodityLeaveNum +
        ", regTime=" + regTime +
        ", image=" + image +
        "}";
    }
}
