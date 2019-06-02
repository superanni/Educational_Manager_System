package com.twoGroup.educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 角色权限信息表 role_anthority_info :RoleAnthorityInfo
 role_id 角色编号 关联 role_info 主键
 anthorty_id 权限编号 关联 anthorty_info主键
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("role_anthority_info")
public class RoleAnthorityInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "role_anthority_id", type = IdType.AUTO)
    private Integer roleAnthorityId;            //角色权限编号
    @TableField("role_id")
    private Integer roleId;                     //角色编号
    @TableField("anthorty_id")
    private Integer anthortyId;                 //权限编号

    @TableField(exist = false)
    private RoleInfo roleInfo;                   //对应角色
    @TableField(exist = false)
    private AnthortyInfo anthortyInfo;          //对应权限

}
