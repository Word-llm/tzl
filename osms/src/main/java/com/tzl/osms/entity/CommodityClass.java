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
public class CommodityClass extends Model<CommodityClass> {

    private static final long serialVersionUID=1L;

    /**
     * 商品种类编号
     */
    private Integer commodityClassId;

    /**
     * 商品种类名称
     */
    private String commodityClassName;


    public Integer getCommodityClassId() {
        return commodityClassId;
    }

    public void setCommodityClassId(Integer commodityClassId) {
        this.commodityClassId = commodityClassId;
    }

    public String getCommodityClassName() {
        return commodityClassName;
    }

    public void setCommodityClassName(String commodityClassName) {
        this.commodityClassName = commodityClassName;
    }

    @Override
    protected Serializable pkVal() {
        return this.commodityClassId;
    }

    @Override
    public String toString() {
        return "CommodityClass{" +
        "commodityClassId=" + commodityClassId +
        ", commodityClassName=" + commodityClassName +
        "}";
    }
}
