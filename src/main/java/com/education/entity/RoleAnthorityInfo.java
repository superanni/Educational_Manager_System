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
public class RoleAnthorityInfo extends Model<RoleAnthorityInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "role_anthority_id", type = IdType.AUTO)
    private Integer roleAnthorityId;
    private Integer roleId;
    private Integer anthortyId;


    public Integer getRoleAnthorityId() {
        return roleAnthorityId;
    }

    public void setRoleAnthorityId(Integer roleAnthorityId) {
        this.roleAnthorityId = roleAnthorityId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAnthortyId() {
        return anthortyId;
    }

    public void setAnthortyId(Integer anthortyId) {
        this.anthortyId = anthortyId;
    }

    @Override
    protected Serializable pkVal() {
        return this.roleAnthorityId;
    }

    @Override
    public String toString() {
        return "RoleAnthorityInfo{" +
        ", roleAnthorityId=" + roleAnthorityId +
        ", roleId=" + roleId +
        ", anthortyId=" + anthortyId +
        "}";
    }
}
