package com.twoGroup.educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@TableName("audition_info")
public class AuditionInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "audition_id", type = IdType.AUTO)
    private Integer auditionId;
    @TableField("student_id")
    private Integer studentId;
    @TableField("audition_time")
    private Date auditionTime;
    @TableField("audition_addr")
    private String auditionAddr;
    @TableField("audition_course")
    private String auditionCourse;
    @TableField("audition_desc")
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
    public String toString() {
        return "AuditionInfo{" +
        "auditionId=" + auditionId +
        ", studentId=" + studentId +
        ", auditionTime=" + auditionTime +
        ", auditionAddr=" + auditionAddr +
        ", auditionCourse=" + auditionCourse +
        ", auditionDesc=" + auditionDesc +
        "}";
    }
}
