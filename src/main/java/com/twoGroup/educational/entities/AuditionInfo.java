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
 * 
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
    private Integer auditionId;
    @TableField("student_id")
    private Integer studentId;
    @TableField("audition_time")
    private Date auditionTime;
    @TableField("audition_addr")
    private String auditionAddr;
    @TableField("audition_course")
    private String auditionCourse;
    @TableField("audition_desc")
    private String auditionDesc;

}
