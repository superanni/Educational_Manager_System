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
public class NoticeInfo extends Model<NoticeInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "notice_id", type = IdType.AUTO)
    private Integer noticeId;
    private Integer staffId;
    private String noticeTitle;
    private String noticeContent;
    private Date noticeTime;
    private String noticeFilename;


    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public String getNoticeFilename() {
        return noticeFilename;
    }

    public void setNoticeFilename(String noticeFilename) {
        this.noticeFilename = noticeFilename;
    }

    @Override
    protected Serializable pkVal() {
        return this.noticeId;
    }

    @Override
    public String toString() {
        return "NoticeInfo{" +
        ", noticeId=" + noticeId +
        ", staffId=" + staffId +
        ", noticeTitle=" + noticeTitle +
        ", noticeContent=" + noticeContent +
        ", noticeTime=" + noticeTime +
        ", noticeFilename=" + noticeFilename +
        "}";
    }
}
