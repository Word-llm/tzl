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
@TableName(value = "tb_room")
public class Tb_room extends Model<Tb_room> {

    private static final long serialVersionUID=1L;

    /**
     * 客房编号
     */
    @TableId(value = "rm_id", type = IdType.AUTO)
    private Integer rm_id;

    /**
     * 所属区域
     */
    private String rm_area;

    /**
     * 所属楼层
     */
    private String rm_floor;

    /**
     * 实际价格
     */
    private BigDecimal rm_prct_price;

    /**
     * 分机电话
     */
    private String rm_telphone;

    /**
     * 客房状态
     */
    private Integer rm_state;

    /**
     * 是否可用
     */
    private Boolean rm_available;

    /**
     * 房间类别
     */
    private BigDecimal rm_catalog;

    /**
     * 房间图片
     */
    private String rm_picture;

    /**
     * 实际折扣
     */
    private String rm_prct_discount;


    public Integer getRm_id() {
        return rm_id;
    }

    public void setRm_id(Integer rm_id) {
        this.rm_id = rm_id;
    }

    public String getRm_area() {
        return rm_area;
    }

    public void setRm_area(String rm_area) {
        this.rm_area = rm_area;
    }

    public String getRm_floor() {
        return rm_floor;
    }

    public void setRm_floor(String rm_floor) {
        this.rm_floor = rm_floor;
    }

    public BigDecimal getRm_prct_price() {
        return rm_prct_price;
    }

    public void setRm_prct_price(BigDecimal rm_prct_price) {
        this.rm_prct_price = rm_prct_price;
    }

    public String getRm_telphone() {
        return rm_telphone;
    }

    public void setRm_telphone(String rm_telphone) {
        this.rm_telphone = rm_telphone;
    }

    public Integer getRm_state() {
        return rm_state;
    }

    public void setRm_state(Integer rm_state) {
        this.rm_state = rm_state;
    }

    public Boolean getRm_available() {
        return rm_available;
    }

    public void setRm_available(Boolean rm_available) {
        this.rm_available = rm_available;
    }

    public BigDecimal getRm_catalog() {
        return rm_catalog;
    }

    public void setRm_catalog(BigDecimal rm_catalog) {
        this.rm_catalog = rm_catalog;
    }

    public String getRm_picture() {
        return rm_picture;
    }

    public void setRm_picture(String rm_picture) {
        this.rm_picture = rm_picture;
    }

    public String getRm_prct_discount() {
        return rm_prct_discount;
    }

    public void setRm_prct_discount(String rm_prct_discount) {
        this.rm_prct_discount = rm_prct_discount;
    }

    @Override
    protected Serializable pkVal() {
        return this.rm_id;
    }

    @Override
    public String toString() {
        return "Tb_room{" +
        "rm_id=" + rm_id +
        ", rm_area=" + rm_area +
        ", rm_floor=" + rm_floor +
        ", rm_prct_price=" + rm_prct_price +
        ", rm_telphone=" + rm_telphone +
        ", rm_state=" + rm_state +
        ", rm_available=" + rm_available +
        ", rm_catalog=" + rm_catalog +
        ", rm_picture=" + rm_picture +
        ", rm_prct_discount=" + rm_prct_discount +
        "}";
    }
}
