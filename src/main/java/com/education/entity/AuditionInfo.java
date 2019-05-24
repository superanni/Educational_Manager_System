package com.education.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-24
 */
public class AuditionInfo extends Model<AuditionInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "audition_id", type = IdType.AUTO)
    private Integer auditionId;
    private Integer studentId;
    private Date auditionTime;
    private String auditionAddr;
    private String auditionCourse;
    private String auditionDesc;


    public Integer getAuditionId() {
        return auditionId;
    }

    public void setAuditionId(Integer auditionId) {
        this.auditionId = auditionId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Date getAuditionTime() {
        return auditionTime;
    }

    public void setAuditionTime(Date auditionTime) {
        this.auditionTime = auditionTime;
    }

    public String getAuditionAddr() {
        return auditionAddr;
    }

    public void setAuditionAddr(String auditionAddr) {
        this.auditionAddr = auditionAddr;
    }

    public String getAuditionCourse() {
        return auditionCourse;
    }

    public void setAuditionCourse(String auditionCourse) {
        this.auditionCourse = auditionCourse;
    }

    public String getAuditionDesc() {
        return auditionDesc;
    }

    public void setAuditionDesc(String auditionDesc) {
        this.auditionDesc = auditionDesc;
    }

    @Override
    protected Serializable pkVal() {
        return this.auditionId;
    }

    @Override
    public String toString() {
        return "AuditionInfo{" +
        ", auditionId=" + auditionId +
        ", studentId=" + studentId +
        ", auditionTime=" + auditionTime +
        ", auditionAddr=" + auditionAddr +
        ", auditionCourse=" + auditionCourse +
        ", auditionDesc=" + auditionDesc +
        "}";
    }
}
