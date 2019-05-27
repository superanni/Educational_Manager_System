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
 * 课程表信息 syllabus_info :SyllabusInfo
 基础表 无关联 无修改
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("syllabus_info")
public class SyllabusInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "syllabus_id", type = IdType.AUTO)
    private Integer syllabusId;
    @TableField("syllabus_yi")
    private String syllabusYi;
    @TableField("syllabus_er")
    private String syllabusEr;
    @TableField("syllabus_san")
    private String syllabusSan;
    @TableField("syllabus_si")
    private String syllabusSi;
    @TableField("syllabus_wu")
    private String syllabusWu;
    @TableField("syllabus_liu")
    private String syllabusLiu;
    @TableField("syllabus_qi")
    private String syllabusQi;
    @TableField("is_uesd")
    private String isUesd;
    @TableField("syllabus_name")
    private String syllabusName;

}
