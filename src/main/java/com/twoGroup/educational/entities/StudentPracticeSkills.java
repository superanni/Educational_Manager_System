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
 * 学生社会实践及技能培训表 student_practice_skills :StudentPracticeSkills
 student_id 学生编号 关联student_info主键
 staff_id 员工编号  关联staff_info staff_id

 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("student_practice_skills")
public class StudentPracticeSkills implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "student_practice_id", type = IdType.AUTO)
    private Integer studentPracticeId;   //学生社会实践培训编号
    @TableField("student_id")
    private Integer studentId;          //学生编号
    @TableField("staff_id")
    private Integer staffId;            //员工编号
    @TableField("practice_start")
    private Date practiceStart;         //培训实践开始
    @TableField("practice_end")
    private Date practiceEnd;           //培训实践结束
    @TableField("practice_address")
    private String practiceAddress;     //培训实践地点
    @TableField("practice_content")
    private String practiceContent;     //培训实践内容
    @TableField("practice_score")
    private String practiceScore;       //成绩
    @TableField("reg_time")
    private Date regTime;               //登记时间
    @TableField("practice_note")
    private String practiceNote;        //备注

    @TableField(exist = false)
    private StaffInfo staffInfo;        //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;    //对应学生

}
