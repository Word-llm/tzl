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
@TableName("Hrjob")
public class Hrjob extends Model<Hrjob> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private Boolean sex;

    private Integer age;

    private String job;

    private String specialty;

    private String studyeffort;

    private String school;

    private String tel;

    private String email;

    private LocalDate createtime;

    private String content;

    private Boolean isstock;


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

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getStudyeffort() {
        return studyeffort;
    }

    public void setStudyeffort(String studyeffort) {
        this.studyeffort = studyeffort;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDate createtime) {
        this.createtime = createtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getIsstock() {
        return isstock;
    }

    public void setIsstock(Boolean isstock) {
        this.isstock = isstock;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Hrjob{" +
        "id=" + id +
        ", name=" + name +
        ", sex=" + sex +
        ", age=" + age +
        ", job=" + job +
        ", specialty=" + specialty +
        ", studyeffort=" + studyeffort +
        ", school=" + school +
        ", tel=" + tel +
        ", email=" + email +
        ", createtime=" + createtime +
        ", content=" + content +
        ", isstock=" + isstock +
        "}";
    }
}
