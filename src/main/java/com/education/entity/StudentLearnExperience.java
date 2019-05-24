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
public class StudentLearnExperience extends Model<StudentLearnExperience> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "student_learn_id", type = IdType.AUTO)
    private Integer studentLearnId;
    private Integer studentId;
    private Integer staffId;
    /**
     * 起讫年月
     */
    private String learnAllyears;
    /**
     * 学校或机关名称
     */
    private String learnSchool;
    /**
     * 学习或任职
     */
    private String learnPosition;
    /**
     * 登记时间
     */
    private Date regTime;
    /**
     * 备注
     */
    private String learnNote;


    public Integer getStudentLearnId() {
        return studentLearnId;
    }

    public void setStudentLearnId(Integer studentLearnId) {
        this.studentLearnId = studentLearnId;
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

    public String getLearnAllyears() {
        return learnAllyears;
    }

    public void setLearnAllyears(String learnAllyears) {
        this.learnAllyears = learnAllyears;
    }

    public String getLearnSchool() {
        return learnSchool;
    }

    public void setLearnSchool(String learnSchool) {
        this.learnSchool = learnSchool;
    }

    public String getLearnPosition() {
        return learnPosition;
    }

    public void setLearnPosition(String learnPosition) {
        this.learnPosition = learnPosition;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getLearnNote() {
        return learnNote;
    }

    public void setLearnNote(String learnNote) {
        this.learnNote = learnNote;
    }

    @Override
    protected Serializable pkVal() {
        return this.studentLearnId;
    }

    @Override
    public String toString() {
        return "StudentLearnExperience{" +
        ", studentLearnId=" + studentLearnId +
        ", studentId=" + studentId +
        ", staffId=" + staffId +
        ", learnAllyears=" + learnAllyears +
        ", learnSchool=" + learnSchool +
        ", learnPosition=" + learnPosition +
        ", regTime=" + regTime +
        ", learnNote=" + learnNote +
        "}";
    }
}
