package com.education.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;
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
public class EmailInfo extends Model<EmailInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "email_id", type = IdType.AUTO)
    private Integer emailId;
    private Integer staffId;
    private String emailTitle;
    private String emailContent;
    private Date emailTime;
    private String emailMan;
    private String emailAddr;
    private String emailState;


    public Integer getEmailId() {
        return emailId;
    }

    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getEmailTitle() {
        return emailTitle;
    }

    public void setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle;
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public Date getEmailTime() {
        return emailTime;
    }

    public void setEmailTime(Date emailTime) {
        this.emailTime = emailTime;
    }

    public String getEmailMan() {
        return emailMan;
    }

    public void setEmailMan(String emailMan) {
        this.emailMan = emailMan;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getEmailState() {
        return emailState;
    }

    public void setEmailState(String emailState) {
        this.emailState = emailState;
    }

    @Override
    protected Serializable pkVal() {
        return this.emailId;
    }

    @Override
    public String toString() {
        return "EmailInfo{" +
        ", emailId=" + emailId +
        ", staffId=" + staffId +
        ", emailTitle=" + emailTitle +
        ", emailContent=" + emailContent +
        ", emailTime=" + emailTime +
        ", emailMan=" + emailMan +
        ", emailAddr=" + emailAddr +
        ", emailState=" + emailState +
        "}";
    }
}
