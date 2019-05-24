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
public class StudentGraduationThesis extends Model<StudentGraduationThesis> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "student_paper_id", type = IdType.AUTO)
    private Integer studentPaperId;
    private Integer studentId;
    private Integer staffId;
    private String paperTitle;
    /**
     * 称谓
     */
    private String paperTeacher;
    private String paperStart;
    /**
     * 政治面貌
     */
    private Date paperTime;
    /**
     * 何处工作任职
     */
    private String paperScore;
    private String paperComments;
    private Date regTime;
    private String paperNote;


    public Integer getStudentPaperId() {
        return studentPaperId;
    }

    public void setStudentPaperId(Integer studentPaperId) {
        this.studentPaperId = studentPaperId;
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

    public String getPaperTitle() {
        return paperTitle;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle;
    }

    public String getPaperTeacher() {
        return paperTeacher;
    }

    public void setPaperTeacher(String paperTeacher) {
        this.paperTeacher = paperTeacher;
    }

    public String getPaperStart() {
        return paperStart;
    }

    public void setPaperStart(String paperStart) {
        this.paperStart = paperStart;
    }

    public Date getPaperTime() {
        return paperTime;
    }

    public void setPaperTime(Date paperTime) {
        this.paperTime = paperTime;
    }

    public String getPaperScore() {
        return paperScore;
    }

    public void setPaperScore(String paperScore) {
        this.paperScore = paperScore;
    }

    public String getPaperComments() {
        return paperComments;
    }

    public void setPaperComments(String paperComments) {
        this.paperComments = paperComments;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getPaperNote() {
        return paperNote;
    }

    public void setPaperNote(String paperNote) {
        this.paperNote = paperNote;
    }

    @Override
    protected Serializable pkVal() {
        return this.studentPaperId;
    }

    @Override
    public String toString() {
        return "StudentGraduationThesis{" +
        ", studentPaperId=" + studentPaperId +
        ", studentId=" + studentId +
        ", staffId=" + staffId +
        ", paperTitle=" + paperTitle +
        ", paperTeacher=" + paperTeacher +
        ", paperStart=" + paperStart +
        ", paperTime=" + paperTime +
        ", paperScore=" + paperScore +
        ", paperComments=" + paperComments +
        ", regTime=" + regTime +
        ", paperNote=" + paperNote +
        "}";
    }
}
