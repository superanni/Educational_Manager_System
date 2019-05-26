package com.TwoGroup.Educational.entities;

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
@TableName("student_practice_skills")
public class StudentPracticeSkills implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "student_practice_id", type = IdType.AUTO)
    private Integer studentPracticeId;
    @TableField("student_id")
    private Integer studentId;
    @TableField("staff_id")
    private Integer staffId;
    @TableField("practice_start")
    private Date practiceStart;
    @TableField("practice_end")
    private Date practiceEnd;
    @TableField("practice_address")
    private String practiceAddress;
    @TableField("practice_content")
    private String practiceContent;
    @TableField("practice_score")
    private String practiceScore;
    @TableField("reg_time")
    private Date regTime;
    @TableField("practice_note")
    private String practiceNote;

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;  //对应学生


    @Override
    public String toString() {
        return "StudentPracticeSkills{" +
        "studentPracticeId=" + studentPracticeId +
        ", studentId=" + studentId +
        ", staffId=" + staffId +
        ", practiceStart=" + practiceStart +
        ", practiceEnd=" + practiceEnd +
        ", practiceAddress=" + practiceAddress +
        ", practiceContent=" + practiceContent +
        ", practiceScore=" + practiceScore +
        ", regTime=" + regTime +
        ", practiceNote=" + practiceNote +
        "}";
    }
}