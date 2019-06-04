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
 *  权限信息表 anthorty_info-AnthortyInfo
 *  基础表 无关联 无修改
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain = true)
@Data
@TableName("anthorty_info")
public class AnthortyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "anthorty_id", type = IdType.AUTO)
    private Integer anthortyId;             //权限编号
    @TableField("anthorty_pid")
    private Integer anthortyPid;            //权限菜单编号
    @TableField("anthorty_name")
    private String anthortyName;            //权限名称
    @TableField("anthorty_desc")
    private String anthortyDesc;            //权限描述
    @TableField("anthorty_url")
    private String anthortyUrl;             //权限url


}
