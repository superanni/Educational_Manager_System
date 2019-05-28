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
 * 短信信息表 messafe_info :MessafeInfo

 staff_id 员工编号  关联staff_info 主键
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("messafe_info")
public class MessafeInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "messafe_id", type = IdType.AUTO)
    private Integer messafeId;
    @TableField("staff_id")
    private Integer staffId;
    @TableField("messafe_content")
    private String messafeContent;
    @TableField("messafe_man")
    private String messafeMan;
    @TableField("messafe_phone")
    private String messafePhone;
    @TableField("messafe_time")
    private Date messafeTime;
    @TableField("messafe_state")
    private String messafeState;

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工


}
