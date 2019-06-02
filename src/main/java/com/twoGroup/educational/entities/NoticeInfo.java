package com.twoGroup.educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *  公告信息表 notice_info :NoticeInfo

 staff_id 员工编号  关联staff_info 主键
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("notice_info")
public class NoticeInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "notice_id", type = IdType.AUTO)
    private Integer noticeId;           //公告编号
    @TableField("staff_id")
    private Integer staffId;            //员工编号
    @TableField("notice_title")
    private String noticeTitle;         //公告标题
    @TableField("notice_content")
    private String noticeContent;       //公告内容
    @TableField("notice_time")
    private Date noticeTime;            //发布时间
    @TableField("notice_filename")
    private String noticeFilename;      //公告文件名

    @TableField(exist = false)
    private StaffInfo staffInfo;        //对应员工
}
