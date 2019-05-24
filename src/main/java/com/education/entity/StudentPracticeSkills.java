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
public class StudentPracticeSkills extends Model<StudentPracticeSkills> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "student_practice_id", type = IdType.AUTO)
    private Integer studentPracticeId;
    private Integer studentId;
    private Integer staffId;
    private Date practiceStart;
    private Date practiceEnd;
    private String practiceAddress;
    private String practiceContent;
    private String practiceScore;
    private Date regTime;
    private String practiceNote;


    public Integer getStudentPracticeId() {
        return studentPracticeId;
    }

    public void setStudentPracticeId(Integer studentPracticeId) {
        this.studentPracticeId = studentPracticeId;
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

    public Date getPracticeStart() {
        return practiceStart;
    }

    public void setPracticeStart(Date practiceStart) {
        this.practiceStart = practiceStart;
    }

    public Date getPracticeEnd() {
        return practiceEnd;
    }

    public void setPracticeEnd(Date practiceEnd) {
        this.practiceEnd = practiceEnd;
    }

    public String getPracticeAddress() {
        return practiceAddress;
    }

    public void setPracticeAddress(String practiceAddress) {
        this.practiceAddress = practiceAddress;
    }

    public String getPracticeContent() {
        return practiceContent;
    }

    public void setPracticeContent(String practiceContent) {
        this.practiceContent = practiceContent;
    }

    public String getPracticeScore() {
        return practiceScore;
    }

    public void setPracticeScore(String practiceScore) {
        this.practiceScore = practiceScore;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getPracticeNote() {
        return practiceNote;
    }

    public void setPracticeNote(String practiceNote) {
        this.practiceNote = practiceNote;
    }

    @Override
    protected Serializable pkVal() {
        return this.studentPracticeId;
    }

    @Override
    public String toString() {
        return "StudentPracticeSkills{" +
        ", studentPracticeId=" + studentPracticeId +
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
