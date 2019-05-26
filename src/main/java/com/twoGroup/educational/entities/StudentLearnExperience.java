package com.twoGroup.educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Data
@TableName("student_learn_experience")
public class StudentLearnExperience implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "student_learn_id", type = IdType.AUTO)
    private Integer studentLearnId;
    @TableField("student_id")
    private Integer studentId;
    @TableField("staff_id")
    private Integer staffId;
    /**
     * 起讫年月
     */
    @TableField("learn_allyears")
    private String learnAllyears;
    /**
     * 学校或机关名称
     */
    @TableField("learn_school")
    private String learnSchool;
    /**
     * 学习或任职
     */
    @TableField("learn_position")
    private String learnPosition;
    /**
     * 登记时间
     */
    @TableField("reg_time")
    private Date regTime;
    /**
     * 备注
     */
    @TableField("learn_note")
    private String learnNote;

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;  //对应学生



    @Override
    public String toString() {
        return "StudentLearnExperience{" +
        "studentLearnId=" + studentLearnId +
        ", studentId=" + studentId +
        ", staffId=" + staffId +
        ", learnAllyears=" + learnAllyears +
        ", learnSchool=" + learnSchool +
        ", learnPosition=" + learnPosition +
        ", regTime=" + regTime +
        ", learnNote=" + learnNote +
        "}";
    }
}
