package com.education.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-24
 */
public class RoleInfo extends Model<RoleInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "role_id", type = IdType.AUTO)
    private Integer roleId;
    private String roleName;
    private String roleDesc;
    private String roleState;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getRoleState() {
        return roleState;
    }

    public void setRoleState(String roleState) {
        this.roleState = roleState;
    }

    @Override
    protected Serializable pkVal() {
        return this.roleId;
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
        ", roleId=" + roleId +
        ", roleName=" + roleName +
        ", roleDesc=" + roleDesc +
        ", roleState=" + roleState +
        "}";
    }
}
