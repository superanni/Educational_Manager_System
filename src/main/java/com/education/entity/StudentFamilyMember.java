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
public class StudentFamilyMember extends Model<StudentFamilyMember> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "student_family_id", type = IdType.AUTO)
    private Integer studentFamilyId;
    private Integer studentId;
    private Integer staffId;
    private String familyName;
    /**
     * 称谓
     */
    private String familyApp;
    private Integer familyAge;
    /**
     * 政治面貌
     */
    private String familyZcmm;
    /**
     * 何处工作任职
     */
    private String workplace;
    private Date regTime;
    private String familyNote;


    public Integer getStudentFamilyId() {
        return studentFamilyId;
    }

    public void setStudentFamilyId(Integer studentFamilyId) {
        this.studentFamilyId = studentFamilyId;
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

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyApp() {
        return familyApp;
    }

    public void setFamilyApp(String familyApp) {
        this.familyApp = familyApp;
    }

    public Integer getFamilyAge() {
        return familyAge;
    }

    public void setFamilyAge(Integer familyAge) {
        this.familyAge = familyAge;
    }

    public String getFamilyZcmm() {
        return familyZcmm;
    }

    public void setFamilyZcmm(String familyZcmm) {
        this.familyZcmm = familyZcmm;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getFamilyNote() {
        return familyNote;
    }

    public void setFamilyNote(String familyNote) {
        this.familyNote = familyNote;
    }

    @Override
    protected Serializable pkVal() {
        return this.studentFamilyId;
    }

    @Override
    public String toString() {
        return "StudentFamilyMember{" +
        ", studentFamilyId=" + studentFamilyId +
        ", studentId=" + studentId +
        ", staffId=" + staffId +
        ", familyName=" + familyName +
        ", familyApp=" + familyApp +
        ", familyAge=" + familyAge +
        ", familyZcmm=" + familyZcmm +
        ", workplace=" + workplace +
        ", regTime=" + regTime +
        ", familyNote=" + familyNote +
        "}";
    }
}
