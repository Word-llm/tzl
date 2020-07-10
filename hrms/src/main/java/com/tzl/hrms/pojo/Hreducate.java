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
@TableName("Hreducate")
public class Hreducate extends Model<Hreducate> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String purpose;

    private LocalDate begintime;

    private LocalDate endtime;

    private String datum;

    private String teacher;

    private String student;

    private LocalDate createtime;

    private Boolean educate;

    private String effect;

    private String summarize;


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

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public LocalDate getBegintime() {
        return begintime;
    }

    public void setBegintime(LocalDate begintime) {
        this.begintime = begintime;
    }

    public LocalDate getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDate endtime) {
        this.endtime = endtime;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public LocalDate getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDate createtime) {
        this.createtime = createtime;
    }

    public Boolean getEducate() {
        return educate;
    }

    public void setEducate(Boolean educate) {
        this.educate = educate;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getSummarize() {
        return summarize;
    }

    public void setSummarize(String summarize) {
        this.summarize = summarize;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Hreducate{" +
        "id=" + id +
        ", name=" + name +
        ", purpose=" + purpose +
        ", begintime=" + begintime +
        ", endtime=" + endtime +
        ", datum=" + datum +
        ", teacher=" + teacher +
        ", student=" + student +
        ", createtime=" + createtime +
        ", educate=" + educate +
        ", effect=" + effect +
        ", summarize=" + summarize +
        "}";
    }
}
