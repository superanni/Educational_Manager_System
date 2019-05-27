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
@TableName("staff_info")
public class StaffInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "staff_id", type = IdType.AUTO)
    private Integer staffId;
    @TableField("role_id")
    private Integer roleId;
    @TableField("staff_name")
    private String staffName;
    @TableField("staff_sex")
    private String staffSex;
    @TableField("staff_age")
    private Integer staffAge;
    @TableField("staff_native_place")
    private String staffNativePlace;
    @TableField("staff_idcard")
    private String staffIdcard;
    @TableField("staff_brithday")
    private Date staffBrithday;
    @TableField("staff_office_phone")
    private String staffOfficePhone;
    @TableField("staff_mobile_phone")
    private String staffMobilePhone;
    @TableField("staff_eamil")
    private String staffEamil;
    @TableField("staff_addr")
    private String staffAddr;
    @TableField("staff_qq")
    private String staffQq;
    @TableField("staff_entry_time")
    private Date staffEntryTime;
    @TableField("staff_eduction_level")
    private String staffEductionLevel;
    @TableField("staff_remark")
    private String staffRemark;
    /**
     * 1 有效 员工
            0 无效
            2 教师
     */
    @TableField("staff_state")
    private String staffState;
    @TableField("user_number")
    private String userNumber;
    @TableField("user_passowrd")
    private String userPassowrd;
    @TableField("staff_image")
    private String staffImage;

    @TableField(exist = false)
    private RoleInfo roleInfo;  //员工角色

}
