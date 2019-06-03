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
 *  角色信息表  role_info  :RoleInfo
 基础表 无关联 无修改
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("role_info")
public class RoleInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "role_id", type = IdType.AUTO)
    private Integer roleId;             //角色编号
    @TableField("role_name")
    private String roleName;            //角色名称
    @TableField("role_desc")
    private String roleDesc;            //角色描述
    @TableField("role_state")
    private Integer roleState;          //角色状态
}
