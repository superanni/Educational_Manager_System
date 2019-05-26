package com.twoGroup.educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Data
@TableName("notice_info")
public class NoticeInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "notice_id", type = IdType.AUTO)
    private Integer noticeId;
    @TableField("staff_id")
    private Integer staffId;
    @TableField("notice_title")
    private String noticeTitle;
    @TableField("notice_content")
    private String noticeContent;
    @TableField("notice_time")
    private Date noticeTime;
    @TableField("notice_filename")
    private String noticeFilename;

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工

    @Override
    public String toString() {
        return "NoticeInfo{" +
        "noticeId=" + noticeId +
        ", staffId=" + staffId +
        ", noticeTitle=" + noticeTitle +
        ", noticeContent=" + noticeContent +
        ", noticeTime=" + noticeTime +
        ", noticeFilename=" + noticeFilename +
        "}";
    }
}
