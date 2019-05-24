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
public class TrackRecordInfo extends Model<TrackRecordInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "track_record_id", type = IdType.AUTO)
    private Integer trackRecordId;
    private Integer studentId;
    private String trackRecordTitle;
    private String trackRecordContent;
    private Date trackRecordTime;
    private Integer enrollment;
    private Date nextRecordTime;


    public Integer getTrackRecordId() {
        return trackRecordId;
    }

    public void setTrackRecordId(Integer trackRecordId) {
        this.trackRecordId = trackRecordId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getTrackRecordTitle() {
        return trackRecordTitle;
    }

    public void setTrackRecordTitle(String trackRecordTitle) {
        this.trackRecordTitle = trackRecordTitle;
    }

    public String getTrackRecordContent() {
        return trackRecordContent;
    }

    public void setTrackRecordContent(String trackRecordContent) {
        this.trackRecordContent = trackRecordContent;
    }

    public Date getTrackRecordTime() {
        return trackRecordTime;
    }

    public void setTrackRecordTime(Date trackRecordTime) {
        this.trackRecordTime = trackRecordTime;
    }

    public Integer getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Integer enrollment) {
        this.enrollment = enrollment;
    }

    public Date getNextRecordTime() {
        return nextRecordTime;
    }

    public void setNextRecordTime(Date nextRecordTime) {
        this.nextRecordTime = nextRecordTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.trackRecordId;
    }

    @Override
    public String toString() {
        return "TrackRecordInfo{" +
        ", trackRecordId=" + trackRecordId +
        ", studentId=" + studentId +
        ", trackRecordTitle=" + trackRecordTitle +
        ", trackRecordContent=" + trackRecordContent +
        ", trackRecordTime=" + trackRecordTime +
        ", enrollment=" + enrollment +
        ", nextRecordTime=" + nextRecordTime +
        "}";
    }
}
