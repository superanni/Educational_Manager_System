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
public class MessafeInfo extends Model<MessafeInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "messafe_id", type = IdType.AUTO)
    private Integer messafeId;
    private Integer staffId;
    private String messafeContent;
    private String messafeMan;
    private String messafePhone;
    private Date messafeTime;
    private String messafeState;


    public Integer getMessafeId() {
        return messafeId;
    }

    public void setMessafeId(Integer messafeId) {
        this.messafeId = messafeId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getMessafeContent() {
        return messafeContent;
    }

    public void setMessafeContent(String messafeContent) {
        this.messafeContent = messafeContent;
    }

    public String getMessafeMan() {
        return messafeMan;
    }

    public void setMessafeMan(String messafeMan) {
        this.messafeMan = messafeMan;
    }

    public String getMessafePhone() {
        return messafePhone;
    }

    public void setMessafePhone(String messafePhone) {
        this.messafePhone = messafePhone;
    }

    public Date getMessafeTime() {
        return messafeTime;
    }

    public void setMessafeTime(Date messafeTime) {
        this.messafeTime = messafeTime;
    }

    public String getMessafeState() {
        return messafeState;
    }

    public void setMessafeState(String messafeState) {
        this.messafeState = messafeState;
    }

    @Override
    protected Serializable pkVal() {
        return this.messafeId;
    }

    @Override
    public String toString() {
        return "MessafeInfo{" +
        ", messafeId=" + messafeId +
        ", staffId=" + staffId +
        ", messafeContent=" + messafeContent +
        ", messafeMan=" + messafeMan +
        ", messafePhone=" + messafePhone +
        ", messafeTime=" + messafeTime +
        ", messafeState=" + messafeState +
        "}";
    }
}
