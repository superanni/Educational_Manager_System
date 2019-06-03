package com.twoGroup.educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *  新增 学生 面试表 audition_info - AuditionInfo
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("audition_info")
public class AuditionInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "audition_id", type = IdType.AUTO)
    private Integer auditionId;         //面试编号
    @TableField("student_id")
    private Integer studentId;           //学生编号
    @TableField("audition_time")
    private Date auditionTime;          //面试时间
    @TableField("audition_addr")
    private String auditionAddr;         //面试地址
    @TableField("audition_course")
    private String auditionCourse;        //面试专业
    @TableField("audition_desc")
    private String auditionDesc;         //面试描述

}
