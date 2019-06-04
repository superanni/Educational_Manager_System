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
 * 学生成绩表 student_write_grade :StudentWriteGrade
 学生成绩write_grade 由varchar改为double
 student_id 学生编号 关联student_info主键
 staff_id 员工编号  关联staff_info 主键
 class_id 班级编号 关联class_info 主键
 discipline_id 课程编号 关联19课程表discipline_info
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("student_write_grade")
public class StudentWriteGrade implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "write_grade_id", type = IdType.AUTO)
    private Integer writeGradeId;           //学生成绩编号
    @TableField("student_id")
    private Integer studentId;              //学生编号
    @TableField("staff_id")
    private Integer staffId;                //员工编号
    @TableField("class_id")
    private Integer classId;                //班级编号
    @TableField("discipline_id")
    private Integer disciplineId;           //课程编号
    @TableField("write_grade")
    private Double writeGrade;              //成绩
    @TableField("write_grade_time")
    private Date writeGradeTime;            //登分日期
    @TableField("write_grade_note")
    private String writeGradeNote;          //备注
    @TableField("write_grade_xuenian")
    private String writeGradeXuenian;       //学年
    @TableField("write_grade_xueqi")
    private String writeGradeXueqi;         //学期

    @TableField("write_grade_type")
    private String writeGradeType;          //考试类型（考试、考查、报考）

    @TableField(exist = false)
    private StaffInfo staffInfo;             //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;        //对应学生
    @TableField(exist = false)
    private ClassInfo classInfo;            //对应班级
    @TableField(exist = false)
    private DisciplineInfo disciplineInfo;  //对应课程

}
