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
    private Integer evaluationId;              //编号
    @TableField("student_id")
    private Integer studentId;                 //学生编号
    @TableField("discipline_id")
    private Integer disciplineId;              //课程信息
    @TableField("staff_id")
    private Integer staffId;                   //教师编号
    @TableField("class_id")
    private Integer classId;                   //班级编号
    @TableField("evaluation_xueqi")
    private String evaluationXueqi;            //学期
    @TableField("evaluation_month")
    private String evaluationMonth;            //月份
    @TableField("evaluation_major")
    private String evaluationMajor;            //专业
    private Integer score1;                    //评分1-6
    private Integer score2;
    private Integer score3;
    private Integer score4;
    private Integer score5;
    private Integer score6;
    private Integer sum;                       //总分
    @TableField("evaluation_time")
    private Date evaluationTime;               //评价时间
    @TableField("evaluation_note")
    private String evaluationNote;             //备注

    @TableField(exist = false)
    private StudentInfo studentInfo;            //对应学生编号
    @TableField(exist = false)
    private DisciplineInfo disciplineInfo;      //对应学科编号
    @TableField(exist = false)
    private StaffInfo staffInfo;                //对应员工编号
    @TableField(exist = false)
    private ClassInfo classInfo;                //对应班级编号

}
