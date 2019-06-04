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
 * 毕业论文和科研训练表   student_graduation_thesis :StudentGraduationThesis
 student_id 学生编号 关联student_info主键
 staff_id 员工编号  关联staff_info 主键
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("student_graduation_thesis")
public class StudentGraduationThesis implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "student_paper_id", type = IdType.AUTO)
    private Integer studentPaperId;         //毕业论文科研训练编号
    @TableField("student_id")
    private Integer studentId;              //学生编号
    @TableField("staff_id")
    private Integer staffId;                //员工编号
    @TableField("paper_title")
    private String paperTitle;              //论文标题
    @TableField("paper_teacher")
    private String paperTeacher;            //论文指导老师
    @TableField("paper_start")
    private String paperStart;              //起止时间
    @TableField("paper_time")
    private Date paperTime;                 //答辩时间
    @TableField("paper_score")
    private String paperScore;              //成绩
    @TableField("paper_comments")
    private String paperComments;           //评语
    @TableField("reg_time")
    private Date regTime;                   //登记时间
    @TableField("paper_note")
    private String paperNote;               //备注
    @TableField(exist = false)
    private StaffInfo staffInfo;             //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;        //对应学生

}
