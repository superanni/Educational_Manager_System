package com.twoGroup.educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@TableName("evaluation_info")
public class EvaluationInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "evaluation_id", type = IdType.AUTO)
    private Integer evaluationId;
    @TableField("student_id")
    private Integer studentId;
    @TableField("discipline_id")
    private Integer disciplineId;
    @TableField("staff_id")
    private Integer staffId;
    @TableField("class_id")
    private Integer classId;
    @TableField("evaluation_xueqi")
    private String evaluationXueqi;
    @TableField("evaluation_month")
    private String evaluationMonth;
    @TableField("evaluation_major")
    private String evaluationMajor;
    private Integer score1;
    private Integer score2;
    private Integer score3;
    private Integer score4;
    private Integer score5;
    private Integer score6;
    private Integer sum;
    @TableField("evaluation_time")
    private Date evaluationTime;
    @TableField("evaluation_note")
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

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    public Integer getScore3() {
        return score3;
    }

    public void setScore3(Integer score3) {
        this.score3 = score3;
    }

    public Integer getScore4() {
        return score4;
    }

    public void setScore4(Integer score4) {
        this.score4 = score4;
    }

    public Integer getScore5() {
        return score5;
    }

    public void setScore5(Integer score5) {
        this.score5 = score5;
    }

    public Integer getScore6() {
        return score6;
    }

    public void setScore6(Integer score6) {
        this.score6 = score6;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
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
    public String toString() {
        return "EvaluationInfo{" +
        "evaluationId=" + evaluationId +
        ", studentId=" + studentId +
        ", disciplineId=" + disciplineId +
        ", staffId=" + staffId +
        ", classId=" + classId +
        ", evaluationXueqi=" + evaluationXueqi +
        ", evaluationMonth=" + evaluationMonth +
        ", evaluationMajor=" + evaluationMajor +
        ", score1=" + score1 +
        ", score2=" + score2 +
        ", score3=" + score3 +
        ", score4=" + score4 +
        ", score5=" + score5 +
        ", score6=" + score6 +
        ", sum=" + sum +
        ", evaluationTime=" + evaluationTime +
        ", evaluationNote=" + evaluationNote +
        "}";
    }
}
