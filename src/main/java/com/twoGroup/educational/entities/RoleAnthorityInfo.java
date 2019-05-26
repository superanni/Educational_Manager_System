package com.twoGroup.educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("role_anthority_info")
public class RoleAnthorityInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "role_anthority_id", type = IdType.AUTO)
    private Integer roleAnthorityId;
    @TableField("role_id")
    private Integer roleId;
    @TableField("anthorty_id")
    private Integer anthortyId;

    @TableField(exist = false)
    private RoleInfo roleInfo;  //对应角色
    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工

    @Override
    public String toString() {
        return "RoleAnthorityInfo{" +
        "roleAnthorityId=" + roleAnthorityId +
        ", roleId=" + roleId +
        ", anthortyId=" + anthortyId +
        "}";
    }
}