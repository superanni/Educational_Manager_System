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
public class AttendanceInfo extends Model<AttendanceInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "attendance_id", type = IdType.AUTO)
    private Integer attendanceId;
    private Integer studentId;
    private Integer staffId;
    private String attendanceDesc;
    private String attendanceState;
    private Date attendanceTime;
    private String attendanceRemark;
    private String attendanceXuenian;
    private String attendanceXueqi;
    private String attendanceMonth;


    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getAttendanceDesc() {
        return attendanceDesc;
    }

    public void setAttendanceDesc(String attendanceDesc) {
        this.attendanceDesc = attendanceDesc;
    }

    public String getAttendanceState() {
        return attendanceState;
    }

    public void setAttendanceState(String attendanceState) {
        this.attendanceState = attendanceState;
    }

    public Date getAttendanceTime() {
        return attendanceTime;
    }

    public void setAttendanceTime(Date attendanceTime) {
        this.attendanceTime = attendanceTime;
    }

    public String getAttendanceRemark() {
        return attendanceRemark;
    }

    public void setAttendanceRemark(String attendanceRemark) {
        this.attendanceRemark = attendanceRemark;
    }

    public String getAttendanceXuenian() {
        return attendanceXuenian;
    }

    public void setAttendanceXuenian(String attendanceXuenian) {
        this.attendanceXuenian = attendanceXuenian;
    }

    public String getAttendanceXueqi() {
        return attendanceXueqi;
    }

    public void setAttendanceXueqi(String attendanceXueqi) {
        this.attendanceXueqi = attendanceXueqi;
    }

    public String getAttendanceMonth() {
        return attendanceMonth;
    }

    public void setAttendanceMonth(String attendanceMonth) {
        this.attendanceMonth = attendanceMonth;
    }

    @Override
    protected Serializable pkVal() {
        return this.attendanceId;
    }

    @Override
    public String toString() {
        return "AttendanceInfo{" +
        ", attendanceId=" + attendanceId +
        ", studentId=" + studentId +
        ", staffId=" + staffId +
        ", attendanceDesc=" + attendanceDesc +
        ", attendanceState=" + attendanceState +
        ", attendanceTime=" + attendanceTime +
        ", attendanceRemark=" + attendanceRemark +
        ", attendanceXuenian=" + attendanceXuenian +
        ", attendanceXueqi=" + attendanceXueqi +
        ", attendanceMonth=" + attendanceMonth +
        "}";
    }
}
