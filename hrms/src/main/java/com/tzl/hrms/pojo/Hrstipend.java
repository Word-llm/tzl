package com.tzl.hrms.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jl
 * @since 2020-07-10
 */
@Entity
@TableName("Hrstipend")
public class Hrstipend extends Model<Hrstipend> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String basic;

    private Float eat;

    private Float house;

    private LocalDate granttime;

    private Float scot;

    private Float duty;

    private Float punishment;

    private Float other;

    private Float totalize;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public Float getEat() {
        return eat;
    }

    public void setEat(Float eat) {
        this.eat = eat;
    }

    public Float getHouse() {
        return house;
    }

    public void setHouse(Float house) {
        this.house = house;
    }

    public LocalDate getGranttime() {
        return granttime;
    }

    public void setGranttime(LocalDate granttime) {
        this.granttime = granttime;
    }

    public Float getScot() {
        return scot;
    }

    public void setScot(Float scot) {
        this.scot = scot;
    }

    public Float getDuty() {
        return duty;
    }

    public void setDuty(Float duty) {
        this.duty = duty;
    }

    public Float getPunishment() {
        return punishment;
    }

    public void setPunishment(Float punishment) {
        this.punishment = punishment;
    }

    public Float getOther() {
        return other;
    }

    public void setOther(Float other) {
        this.other = other;
    }

    public Float getTotalize() {
        return totalize;
    }

    public void setTotalize(Float totalize) {
        this.totalize = totalize;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Hrstipend{" +
        "id=" + id +
        ", name=" + name +
        ", basic=" + basic +
        ", eat=" + eat +
        ", house=" + house +
        ", granttime=" + granttime +
        ", scot=" + scot +
        ", duty=" + duty +
        ", punishment=" + punishment +
        ", other=" + other +
        ", totalize=" + totalize +
        "}";
    }
}
