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
 * 课程信息表 discipline_info :DisciplineInfo
   基础表 无关联 无修改
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("discipline_info")
public class DisciplineInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "discipline_id", type = IdType.AUTO)
    private Integer disciplineId;           //课程信息编号
    @TableField("discipline_no")
    private String disciplineNo;            //课程编号
    @TableField("discipline_name")
    private String disciplineName;          //课程名称
    @TableField("discipline_tuition")
    private Double disciplineTuition;       //学分
    @TableField("discipline_bring")
    private Integer disciplineBring;        //课时
    @TableField("discipline_type")
    private String disciplineType;          //课程类型
    @TableField("discipline_desc")
    private String disciplineDesc;          //课程描述
    @TableField("discipline_isuesd")
    private String disciplineIsuesd;        //课程状态

}
