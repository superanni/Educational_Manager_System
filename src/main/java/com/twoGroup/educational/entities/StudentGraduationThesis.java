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
@TableName("student_graduation_thesis")
public class StudentGraduationThesis implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "student_paper_id", type = IdType.AUTO)
    private Integer studentPaperId;
    @TableField("student_id")
    private Integer studentId;
    @TableField("staff_id")
    private Integer staffId;
    @TableField("paper_title")
    private String paperTitle;
    /**
     * 称谓
     */
    @TableField("paper_teacher")
    private String paperTeacher;
    @TableField("paper_start")
    private String paperStart;
    /**
     * 政治面貌
     */
    @TableField("paper_time")
    private Date paperTime;
    /**
     * 何处工作任职
     */
    @TableField("paper_score")
    private String paperScore;
    @TableField("paper_comments")
    private String paperComments;
    @TableField("reg_time")
    private Date regTime;
    @TableField("paper_note")
    private String paperNote;

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;  //对应学生

}
