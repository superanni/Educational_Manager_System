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
 * 学生学习经历表 student_learn_experience :StudentLearnExperience
 student_id 学生编号 关联student_info主键
 staff_id 员工编号  关联staff_info 主键

 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("student_learn_experience")
public class StudentLearnExperience implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "student_learn_id", type = IdType.AUTO)
    private Integer studentLearnId;         //学生学习经历编号
    @TableField("student_id")
    private Integer studentId;              //学生编号
    @TableField("staff_id")
    private Integer staffId;                //员工编号
    @TableField("learn_allyears")
    private String learnAllyears;           //起止年月
    @TableField("learn_school")
    private String learnSchool;             //学校或机关名
    @TableField("learn_position")
    private String learnPosition;          //学习任职
    @TableField("reg_time")
    private Date regTime;                  //登记时间
    @TableField("learn_note")
    private String learnNote;              //备注
    @TableField(exist = false)
    private StaffInfo staffInfo;            //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;        //对应学生

}
