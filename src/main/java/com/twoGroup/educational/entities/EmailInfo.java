package com.twoGroup.educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 *  邮件信息表 email_info :EmailInfo
 *  staff_id 员工编号  关联staff_info 主键
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("email_info")
public class EmailInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "email_id", type = IdType.AUTO)
    private Integer emailId;            //编号
    @TableField("staff_id")
    private Integer staffId;            //员工编号
    @TableField("email_title")
    private String emailTitle;          //主题
    @TableField("email_content")
    private String emailContent;        //邮件内容
    @TableField("email_time")
    private Date emailTime;             //发送时间
    @TableField("email_man")
    private String emailMan;            //接收人
    @TableField("email_addr")
    private String emailAddr;           //邮件地址
    @TableField("email_state")
    private Integer emailState;         //邮件状态

    @TableField(exist = false)
    private StaffInfo staffInfo;        //对应员工
}
