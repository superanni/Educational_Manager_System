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
 * 
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("anthorty_info")
public class AnthortyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "anthorty_id", type = IdType.AUTO)
    private Integer anthortyId;
    @TableField("anthorty_pid")
    private Integer anthortyPid;
    @TableField("anthorty_name")
    private String anthortyName;
    @TableField("anthorty_desc")
    private String anthortyDesc;
    @TableField("anthorty_url")
    private String anthortyUrl;

}
