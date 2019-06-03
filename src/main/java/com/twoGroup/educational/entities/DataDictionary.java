package com.twoGroup.educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>数据字典信息表 data_dictionary
 *  基础表 无关联 无修改
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("data_dictionary")
public class DataDictionary implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "data_id", type = IdType.AUTO)
    private Integer dataId;                 //数据字典编号
    @TableField("data_content")
    private String dataContent;             //数据名称
    @TableField("data_type")
    private String dataType;                //数据类型
    @TableField("data_desc")
    private String dataDesc;                //数据描述

}
