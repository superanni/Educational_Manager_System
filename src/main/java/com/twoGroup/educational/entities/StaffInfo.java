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
 * 员工信息表 staff_info:StaffInfo
 role_id 角色编号  关联role_info主键

 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("staff_info")
public class StaffInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "staff_id", type = IdType.AUTO)
    private Integer staffId;                //员工编号
    @TableField("role_id")
    private Integer roleId;                 //角色编号
    @TableField("staff_name")
    private String staffName;               //员工名称
    @TableField("staff_sex")
    private String staffSex;                //员工性别
    @TableField("staff_age")
    private Integer staffAge;               //员工年龄
    @TableField("staff_native_place")
    private String staffNativePlace;        //籍贯
    @TableField("staff_idcard")
    private String staffIdcard;             //身份证号
    @TableField("staff_brithday")
    private Date staffBrithday;             //出生日期
    @TableField("staff_office_phone")
    private String staffOfficePhone;        //办公电话
    @TableField("staff_mobile_phone")
    private String staffMobilePhone;        //移动电话
    @TableField("staff_eamil")
    private String staffEamil;              //email邮箱
    @TableField("staff_addr")
    private String staffAddr;               //地址
    @TableField("staff_qq")
    private String staffQq;                 //qq号码
    @TableField("staff_entry_time")
    private Date staffEntryTime;            //入职时间
    @TableField("staff_eduction_level")
    private String staffEductionLevel;      //学历
    @TableField("staff_remark")
    private String staffRemark;             //标注
    /**
     * 1 有效 员工
            0 无效
            2 教师
     */
    @TableField("staff_state")
    private String staffState;              //员工类型
    @TableField("user_number")
    private String userNumber;              //用户名
    @TableField("user_passowrd")
    private String userPassowrd;            //用户密码
    @TableField("staff_image")
    private String staffImage;              //用户头像
    @TableField(exist = false)
    private RoleInfo roleInfo;              //员工角色

}
