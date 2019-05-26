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
@TableName("student_write_grade")
public class StudentWriteGrade implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "write_grade_id", type = IdType.AUTO)
    private Integer writeGradeId;
    @TableField("student_id")
    private Integer studentId;
    @TableField("staff_id")
    private Integer staffId;
    @TableField("class_id")
    private Integer classId;
    @TableField("discipline_id")
    private Integer disciplineId;
    @TableField("write_grade")
    private Double writeGrade;
    @TableField("write_grade_time")
    private Date writeGradeTime;
    @TableField("write_grade_note")
    private String writeGradeNote;
    @TableField("write_grade_xuenian")
    private String writeGradeXuenian;
    /**
     * 学期
     */
    @TableField("write_grade_xueqi")
    private String writeGradeXueqi;
    /**
     * 考试类型（考试、考查、报考）
     */
    @TableField("write_grade_type")
    private String writeGradeType;

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;  //对应学生
    @TableField(exist = false)
    private ClassInfo classInfo;    //对应班级
    @TableField(exist = false)
    private DisciplineInfo disciplineInfo;      //对应课程

    @Override
    public String toString() {
        return "StudentWriteGrade{" +
        "writeGradeId=" + writeGradeId +
        ", studentId=" + studentId +
        ", staffId=" + staffId +
        ", classId=" + classId +
        ", disciplineId=" + disciplineId +
        ", writeGrade=" + writeGrade +
        ", writeGradeTime=" + writeGradeTime +
        ", writeGradeNote=" + writeGradeNote +
        ", writeGradeXuenian=" + writeGradeXuenian +
        ", writeGradeXueqi=" + writeGradeXueqi +
        ", writeGradeType=" + writeGradeType +
        "}";
    }
}
