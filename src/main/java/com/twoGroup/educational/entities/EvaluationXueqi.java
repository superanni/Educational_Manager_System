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
 *  学生评教表 evaluation_xueqi :EvaluationXueqi
 *  基础表 无关联 无修改
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("evaluation_xueqi")
public class EvaluationXueqi implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "evaluation_id", type = IdType.AUTO)
    private Integer evaluationId;               //编号
    @TableField("student_id")
    private Integer studentId;                  //学生编号
    @TableField("discipline_id")
    private Integer disciplineId;               //课程编号
    @TableField("staff_id")
    private Integer staffId;                    //教师编号
    @TableField("class_id")
    private Integer classId;                    //班级编号
    @TableField("evaluation_xueqi")
    private String evaluationXueqi;             //学期
    @TableField("evaluation_month")
    private String evaluationMonth;             //月份
    @TableField("evaluation_major")
    private String evaluationMajor;             //专业
    @TableField("evaluation_content")
    private String evaluationContent;           //评价内容
    @TableField("evaluation_time")
    private Date evaluationTime;                //评价时间
    @TableField("evaluation_note")
    private String evaluationNote;              //备注

}
