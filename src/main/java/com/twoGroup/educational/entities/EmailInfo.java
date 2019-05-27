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
    private Integer emailId;
    @TableField("staff_id")
    private Integer staffId;
    @TableField("email_title")
    private String emailTitle;
    @TableField("email_content")
    private String emailContent;
    @TableField("email_time")
    private Date emailTime;
    @TableField("email_man")
    private String emailMan;
    @TableField("email_addr")
    private String emailAddr;
    @TableField("email_state")
    private Integer emailState;

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工

}
