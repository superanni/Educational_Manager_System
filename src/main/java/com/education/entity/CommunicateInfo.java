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
public class CommunicateInfo extends Model<CommunicateInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "communicate_id", type = IdType.AUTO)
    private Integer communicateId;
    private Integer studentId;
    private Integer staffId;
    /**
     * 评价时间
     */
    private Date communicateTime;
    /**
     * 评价内容
     */
    private String communicateContent;
    private String communicateXuenian;
    private String communicateXueqi;
    /**
     * 病事假统计
     */
    private Integer leaveCount;
    /**
     * 旷课统计
     */
    private Integer truancyCount;
    /**
     * 奖惩记载
     */
    private String rewardPunish;


    public Integer getCommunicateId() {
        return communicateId;
    }

    public void setCommunicateId(Integer communicateId) {
        this.communicateId = communicateId;
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

    public Date getCommunicateTime() {
        return communicateTime;
    }

    public void setCommunicateTime(Date communicateTime) {
        this.communicateTime = communicateTime;
    }

    public String getCommunicateContent() {
        return communicateContent;
    }

    public void setCommunicateContent(String communicateContent) {
        this.communicateContent = communicateContent;
    }

    public String getCommunicateXuenian() {
        return communicateXuenian;
    }

    public void setCommunicateXuenian(String communicateXuenian) {
        this.communicateXuenian = communicateXuenian;
    }

    public String getCommunicateXueqi() {
        return communicateXueqi;
    }

    public void setCommunicateXueqi(String communicateXueqi) {
        this.communicateXueqi = communicateXueqi;
    }

    public Integer getLeaveCount() {
        return leaveCount;
    }

    public void setLeaveCount(Integer leaveCount) {
        this.leaveCount = leaveCount;
    }

    public Integer getTruancyCount() {
        return truancyCount;
    }

    public void setTruancyCount(Integer truancyCount) {
        this.truancyCount = truancyCount;
    }

    public String getRewardPunish() {
        return rewardPunish;
    }

    public void setRewardPunish(String rewardPunish) {
        this.rewardPunish = rewardPunish;
    }

    @Override
    protected Serializable pkVal() {
        return this.communicateId;
    }

    @Override
    public String toString() {
        return "CommunicateInfo{" +
        ", communicateId=" + communicateId +
        ", studentId=" + studentId +
        ", staffId=" + staffId +
        ", communicateTime=" + communicateTime +
        ", communicateContent=" + communicateContent +
        ", communicateXuenian=" + communicateXuenian +
        ", communicateXueqi=" + communicateXueqi +
        ", leaveCount=" + leaveCount +
        ", truancyCount=" + truancyCount +
        ", rewardPunish=" + rewardPunish +
        "}";
    }
}
