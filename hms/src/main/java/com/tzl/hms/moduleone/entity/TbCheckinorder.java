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
@TableName(value = "tb_checkinorder")
public class TbCheckinorder extends Model<TbCheckinorder> {

    private static final long serialVersionUID=1L;

    /**
     * 入住登记订单编号
     */
    @TableId(value = "cio_id", type = IdType.AUTO)
    private Integer cioId;

    /**
     * 入住登记信息列表
     */
    private String checkinItems;

    /**
     * 客人名称
     */
    private String cioGuestName;

    /**
     * 人数
     */
    private Integer cioManNumber;

    /**
     * 客人类别
     */
    private String cioGuestCatalog;

    /**
     * 客人类型
     */
    private String cioGuestType;

    /**
     * 团队名称
     */
    private String cioGroupName;

    /**
     * 客人证件类别
     */
    private String cioGuestCardCatalog;

    /**
     * 客人证件号码
     */
    private String cioGuestCardId;

    /**
     * 事由
     */
    private String cioCause;

    /**
     * 登记状态
     */
    private String cioState;

    /**
     * 客人入住时间
     */
    private LocalDateTime cioInDateTime;

    /**
     * 预计离开时间
     */
    private LocalDateTime cioPreOutDateTime;

    /**
     * 实际离开时间
     */
    private LocalDateTime cioPrcOutDateTime;

    /**
     * 支付类型
     */
    private String cioPaymentModel;

    /**
     * 已付押金
     */
    private BigDecimal cioPaidMoney;

    /**
     * 有无预约
     */
    private String cioIsReservId;

    /**
     * 操作员
     */
    private String cioOperator;

    /**
     * 客人性别
     */
    private String cioGuestGender;

    /**
     * 总费用
     */
    private BigDecimal cioTotaRate;

    /**
     * 加床费
     */
    private BigDecimal cioRedRate;

    /**
     * 等级单号
     */
    private String cioOrderId;


    public Integer getCioId() {
        return cioId;
    }

    public void setCioId(Integer cioId) {
        this.cioId = cioId;
    }

    public String getCheckinItems() {
        return checkinItems;
    }

    public void setCheckinItems(String checkinItems) {
        this.checkinItems = checkinItems;
    }

    public String getCioGuestName() {
        return cioGuestName;
    }

    public void setCioGuestName(String cioGuestName) {
        this.cioGuestName = cioGuestName;
    }

    public Integer getCioManNumber() {
        return cioManNumber;
    }

    public void setCioManNumber(Integer cioManNumber) {
        this.cioManNumber = cioManNumber;
    }

    public String getCioGuestCatalog() {
        return cioGuestCatalog;
    }

    public void setCioGuestCatalog(String cioGuestCatalog) {
        this.cioGuestCatalog = cioGuestCatalog;
    }

    public String getCioGuestType() {
        return cioGuestType;
    }

    public void setCioGuestType(String cioGuestType) {
        this.cioGuestType = cioGuestType;
    }

    public String getCioGroupName() {
        return cioGroupName;
    }

    public void setCioGroupName(String cioGroupName) {
        this.cioGroupName = cioGroupName;
    }

    public String getCioGuestCardCatalog() {
        return cioGuestCardCatalog;
    }

    public void setCioGuestCardCatalog(String cioGuestCardCatalog) {
        this.cioGuestCardCatalog = cioGuestCardCatalog;
    }

    public String getCioGuestCardId() {
        return cioGuestCardId;
    }

    public void setCioGuestCardId(String cioGuestCardId) {
        this.cioGuestCardId = cioGuestCardId;
    }

    public String getCioCause() {
        return cioCause;
    }

    public void setCioCause(String cioCause) {
        this.cioCause = cioCause;
    }

    public String getCioState() {
        return cioState;
    }

    public void setCioState(String cioState) {
        this.cioState = cioState;
    }

    public LocalDateTime getCioInDateTime() {
        return cioInDateTime;
    }

    public void setCioInDateTime(LocalDateTime cioInDateTime) {
        this.cioInDateTime = cioInDateTime;
    }

    public LocalDateTime getCioPreOutDateTime() {
        return cioPreOutDateTime;
    }

    public void setCioPreOutDateTime(LocalDateTime cioPreOutDateTime) {
        this.cioPreOutDateTime = cioPreOutDateTime;
    }

    public LocalDateTime getCioPrcOutDateTime() {
        return cioPrcOutDateTime;
    }

    public void setCioPrcOutDateTime(LocalDateTime cioPrcOutDateTime) {
        this.cioPrcOutDateTime = cioPrcOutDateTime;
    }

    public String getCioPaymentModel() {
        return cioPaymentModel;
    }

    public void setCioPaymentModel(String cioPaymentModel) {
        this.cioPaymentModel = cioPaymentModel;
    }

    public BigDecimal getCioPaidMoney() {
        return cioPaidMoney;
    }

    public void setCioPaidMoney(BigDecimal cioPaidMoney) {
        this.cioPaidMoney = cioPaidMoney;
    }

    public String getCioIsReservId() {
        return cioIsReservId;
    }

    public void setCioIsReservId(String cioIsReservId) {
        this.cioIsReservId = cioIsReservId;
    }

    public String getCioOperator() {
        return cioOperator;
    }

    public void setCioOperator(String cioOperator) {
        this.cioOperator = cioOperator;
    }

    public String getCioGuestGender() {
        return cioGuestGender;
    }

    public void setCioGuestGender(String cioGuestGender) {
        this.cioGuestGender = cioGuestGender;
    }

    public BigDecimal getCioTotaRate() {
        return cioTotaRate;
    }

    public void setCioTotaRate(BigDecimal cioTotaRate) {
        this.cioTotaRate = cioTotaRate;
    }

    public BigDecimal getCioRedRate() {
        return cioRedRate;
    }

    public void setCioRedRate(BigDecimal cioRedRate) {
        this.cioRedRate = cioRedRate;
    }

    public String getCioOrderId() {
        return cioOrderId;
    }

    public void setCioOrderId(String cioOrderId) {
        this.cioOrderId = cioOrderId;
    }

    @Override
    protected Serializable pkVal() {
        return this.cioId;
    }

    @Override
    public String toString() {
        return "TbCheckinorder{" +
        "cioId=" + cioId +
        ", checkinItems=" + checkinItems +
        ", cioGuestName=" + cioGuestName +
        ", cioManNumber=" + cioManNumber +
        ", cioGuestCatalog=" + cioGuestCatalog +
        ", cioGuestType=" + cioGuestType +
        ", cioGroupName=" + cioGroupName +
        ", cioGuestCardCatalog=" + cioGuestCardCatalog +
        ", cioGuestCardId=" + cioGuestCardId +
        ", cioCause=" + cioCause +
        ", cioState=" + cioState +
        ", cioInDateTime=" + cioInDateTime +
        ", cioPreOutDateTime=" + cioPreOutDateTime +
        ", cioPrcOutDateTime=" + cioPrcOutDateTime +
        ", cioPaymentModel=" + cioPaymentModel +
        ", cioPaidMoney=" + cioPaidMoney +
        ", cioIsReservId=" + cioIsReservId +
        ", cioOperator=" + cioOperator +
        ", cioGuestGender=" + cioGuestGender +
        ", cioTotaRate=" + cioTotaRate +
        ", cioRedRate=" + cioRedRate +
        ", cioOrderId=" + cioOrderId +
        "}";
    }
}
