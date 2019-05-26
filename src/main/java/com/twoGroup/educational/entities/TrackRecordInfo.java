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
@TableName("track_record_info")
public class TrackRecordInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "track_record_id", type = IdType.AUTO)
    private Integer trackRecordId;
    @TableField("student_id")
    private Integer studentId;
    @TableField("track_record_title")
    private String trackRecordTitle;
    @TableField("track_record_content")
    private String trackRecordContent;
    @TableField("track_record_time")
    private Date trackRecordTime;
    private Integer enrollment;
    @TableField("next_record_time")
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
    public String toString() {
        return "TrackRecordInfo{" +
        "trackRecordId=" + trackRecordId +
        ", studentId=" + studentId +
        ", trackRecordTitle=" + trackRecordTitle +
        ", trackRecordContent=" + trackRecordContent +
        ", trackRecordTime=" + trackRecordTime +
        ", enrollment=" + enrollment +
        ", nextRecordTime=" + nextRecordTime +
        "}";
    }
}
