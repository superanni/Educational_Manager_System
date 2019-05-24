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
public class EvaluationXueqi extends Model<EvaluationXueqi> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "evaluation_id", type = IdType.AUTO)
    private Integer evaluationId;
    private Integer studentId;
    private Integer disciplineId;
    private Integer staffId;
    private Integer classId;
    private String evaluationXueqi;
    private String evaluationMonth;
    private String evaluationMajor;
    private String evaluationContent;
    private Date evaluationTime;
    private String evaluationNote;


    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Integer disciplineId) {
        this.disciplineId = disciplineId;
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

    public String getEvaluationXueqi() {
        return evaluationXueqi;
    }

    public void setEvaluationXueqi(String evaluationXueqi) {
        this.evaluationXueqi = evaluationXueqi;
    }

    public String getEvaluationMonth() {
        return evaluationMonth;
    }

    public void setEvaluationMonth(String evaluationMonth) {
        this.evaluationMonth = evaluationMonth;
    }

    public String getEvaluationMajor() {
        return evaluationMajor;
    }

    public void setEvaluationMajor(String evaluationMajor) {
        this.evaluationMajor = evaluationMajor;
    }

    public String getEvaluationContent() {
        return evaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent;
    }

    public Date getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    public String getEvaluationNote() {
        return evaluationNote;
    }

    public void setEvaluationNote(String evaluationNote) {
        this.evaluationNote = evaluationNote;
    }

    @Override
    protected Serializable pkVal() {
        return this.evaluationId;
    }

    @Override
    public String toString() {
        return "EvaluationXueqi{" +
        ", evaluationId=" + evaluationId +
        ", studentId=" + studentId +
        ", disciplineId=" + disciplineId +
        ", staffId=" + staffId +
        ", classId=" + classId +
        ", evaluationXueqi=" + evaluationXueqi +
        ", evaluationMonth=" + evaluationMonth +
        ", evaluationMajor=" + evaluationMajor +
        ", evaluationContent=" + evaluationContent +
        ", evaluationTime=" + evaluationTime +
        ", evaluationNote=" + evaluationNote +
        "}";
    }
}
