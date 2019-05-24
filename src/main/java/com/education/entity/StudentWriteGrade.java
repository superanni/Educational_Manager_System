package com.education.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-24
 */
public class StudentWriteGrade extends Model<StudentWriteGrade> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "write_grade_id", type = IdType.AUTO)
    private Integer writeGradeId;
    private Integer studentId;
    private Integer staffId;
    private Integer classId;
    private Integer disciplineId;
    private String writeGrade;
    private Date writeGradeTime;
    private String writeGradeNote;
    private String writeGradeXuenian;
    /**
     * 学期
     */
    private String writeGradeXueqi;
    /**
     * 考试类型（考试、考查、报考）
     */
    private String writeGradeType;


    public Integer getWriteGradeId() {
        return writeGradeId;
    }

    public void setWriteGradeId(Integer writeGradeId) {
        this.writeGradeId = writeGradeId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Integer disciplineId) {
        this.disciplineId = disciplineId;
    }

    public String getWriteGrade() {
        return writeGrade;
    }

    public void setWriteGrade(String writeGrade) {
        this.writeGrade = writeGrade;
    }

    public Date getWriteGradeTime() {
        return writeGradeTime;
    }

    public void setWriteGradeTime(Date writeGradeTime) {
        this.writeGradeTime = writeGradeTime;
    }

    public String getWriteGradeNote() {
        return writeGradeNote;
    }

    public void setWriteGradeNote(String writeGradeNote) {
        this.writeGradeNote = writeGradeNote;
    }

    public String getWriteGradeXuenian() {
        return writeGradeXuenian;
    }

    public void setWriteGradeXuenian(String writeGradeXuenian) {
        this.writeGradeXuenian = writeGradeXuenian;
    }

    public String getWriteGradeXueqi() {
        return writeGradeXueqi;
    }

    public void setWriteGradeXueqi(String writeGradeXueqi) {
        this.writeGradeXueqi = writeGradeXueqi;
    }

    public String getWriteGradeType() {
        return writeGradeType;
    }

    public void setWriteGradeType(String writeGradeType) {
        this.writeGradeType = writeGradeType;
    }

    @Override
    protected Serializable pkVal() {
        return this.writeGradeId;
    }

    @Override
    public String toString() {
        return "StudentWriteGrade{" +
        ", writeGradeId=" + writeGradeId +
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
