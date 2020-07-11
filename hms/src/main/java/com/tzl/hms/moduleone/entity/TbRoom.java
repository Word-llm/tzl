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
public class TbRoom extends Model<TbRoom> {

    private static final long serialVersionUID=1L;

    /**
     * 客房状态
     */
    public static final String[] STATES = {"空闲","预定","租用","结账","清洁","锁房"};
    /**
     * 客房颜色状态数组
     */
    public static final String[] COLORSTATES = {"#008CD2","#FF7D00","#FFE000","#E40090","#00AF4D","#E80033"};
    public static final Integer STATE_VACANT = 0;   //空闲状态
    public static final Integer STATE_RESERVED = 1; //预定状态
    public static final Integer STATE_RENTED = 2;   //租用状态
    public static final Integer STATE_CHECKOUT = 3; //结账状态
    public static final Integer STATE_CLEANED = 4;  //清洁状态
    public static final Integer STATE_BLOCKED = 5;  //锁房状态


    /**
     * 客房编号
     */
    @TableId(value = "rm_id", type = IdType.AUTO)
    private Integer rmId;

    /**
     * 所属区域
     */
    private String rmArea;

    /**
     * 所属楼层
     */
    private String rmFloor;

    /**
     * 实际价格
     */
    private BigDecimal rmPrctPrice;

    /**
     * 分机电话
     */
    private String rmTelphone;

    /**
     * 客房状态
     */
    private Integer rmState;

    /**
     * 是否可用
     */
    private Boolean rmAvailable;

    /**
     * 房间类别
     */
    private BigDecimal rmCatalog;

    /**
     * 房间图片
     */
    private String rmPicture;

    /**
     * 实际折扣
     */
    private String rmPrctDiscount;


    public Integer getRmId() {
        return rmId;
    }

    public void setRmId(Integer rmId) {
        this.rmId = rmId;
    }

    public String getRmArea() {
        return rmArea;
    }

    public void setRmArea(String rmArea) {
        this.rmArea = rmArea;
    }

    public String getRmFloor() {
        return rmFloor;
    }

    public void setRmFloor(String rmFloor) {
        this.rmFloor = rmFloor;
    }

    public BigDecimal getRmPrctPrice() {
        return rmPrctPrice;
    }

    public void setRmPrctPrice(BigDecimal rmPrctPrice) {
        this.rmPrctPrice = rmPrctPrice;
    }

    public String getRmTelphone() {
        return rmTelphone;
    }

    public void setRmTelphone(String rmTelphone) {
        this.rmTelphone = rmTelphone;
    }

    public Integer getRmState() {
        return rmState;
    }

    public void setRmState(Integer rmState) {
        this.rmState = rmState;
    }

    public Boolean getRmAvailable() {
        return rmAvailable;
    }

    public void setRmAvailable(Boolean rmAvailable) {
        this.rmAvailable = rmAvailable;
    }

    public BigDecimal getRmCatalog() {
        return rmCatalog;
    }

    public void setRmCatalog(BigDecimal rmCatalog) {
        this.rmCatalog = rmCatalog;
    }

    public String getRmPicture() {
        return rmPicture;
    }

    public void setRmPicture(String rmPicture) {
        this.rmPicture = rmPicture;
    }

    public String getRmPrctDiscount() {
        return rmPrctDiscount;
    }

    public void setRmPrctDiscount(String rmPrctDiscount) {
        this.rmPrctDiscount = rmPrctDiscount;
    }

    @Override
    protected Serializable pkVal() {
        return this.rmId;
    }

    @Override
    public String toString() {
        return "TbRoom{" +
        "rmId=" + rmId +
        ", rmArea=" + rmArea +
        ", rmFloor=" + rmFloor +
        ", rmPrctPrice=" + rmPrctPrice +
        ", rmTelphone=" + rmTelphone +
        ", rmState=" + rmState +
        ", rmAvailable=" + rmAvailable +
        ", rmCatalog=" + rmCatalog +
        ", rmPicture=" + rmPicture +
        ", rmPrctDiscount=" + rmPrctDiscount +
        "}";
    }
}
