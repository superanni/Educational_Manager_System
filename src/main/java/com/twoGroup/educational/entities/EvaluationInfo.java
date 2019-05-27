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
 * 学生评教表（学期）evaluation_info :EvaluationInfo
 student_id学生编号 关联student_info 主键
 discipline_id关联19 课程表discipline_info主键
 staff_id 教师编号 关联staff_info 主键
 class_if 班级编号 关联class_info主键
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("evaluation_info")
public class EvaluationInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "evaluation_id", type = IdType.AUTO)
    private Integer evaluationId;
    @TableField("student_id")
    private Integer studentId;
    @TableField("discipline_id")
    private Integer disciplineId;
    @TableField("staff_id")
    private Integer staffId;
    @TableField("class_id")
    private Integer classId;
    @TableField("evaluation_xueqi")
    private String evaluationXueqi;
    @TableField("evaluation_month")
    private String evaluationMonth;
    @TableField("evaluation_major")
    private String evaluationMajor;
    private Integer score1;
    private Integer score2;
    private Integer score3;
    private Integer score4;
    private Integer score5;
    private Integer score6;
    private Integer sum;
    @TableField("evaluation_time")
    private Date evaluationTime;
    @TableField("evaluation_note")
    private String evaluationNote;

    @TableField(exist = false)
    private StudentInfo studentInfo;
    @TableField(exist = false)
    private DisciplineInfo disciplineInfo;
    @TableField(exist = false)
    private StaffInfo staffInfo;
    @TableField(exist = false)
    private ClassInfo classInfo;

}
