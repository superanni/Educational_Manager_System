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
public class ClassInfo extends Model<ClassInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "class_id", type = IdType.AUTO)
    private Integer classId;
    private Integer syllabusId;
    private Integer classroomId;
    private Integer staffId;
    private String className;
    private Integer classNumber;
    private Date classStartTime;
    private Date classEndTime;
    private String classIsuesd;
    private String classState;
    private String classDesc;
    private String classMajor;


    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getSyllabusId() {
        return syllabusId;
    }

    public void setSyllabusId(Integer syllabusId) {
        this.syllabusId = syllabusId;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    public Date getClassStartTime() {
        return classStartTime;
    }

    public void setClassStartTime(Date classStartTime) {
        this.classStartTime = classStartTime;
    }

    public Date getClassEndTime() {
        return classEndTime;
    }

    public void setClassEndTime(Date classEndTime) {
        this.classEndTime = classEndTime;
    }

    public String getClassIsuesd() {
        return classIsuesd;
    }

    public void setClassIsuesd(String classIsuesd) {
        this.classIsuesd = classIsuesd;
    }

    public String getClassState() {
        return classState;
    }

    public void setClassState(String classState) {
        this.classState = classState;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public String getClassMajor() {
        return classMajor;
    }

    public void setClassMajor(String classMajor) {
        this.classMajor = classMajor;
    }

    @Override
    protected Serializable pkVal() {
        return this.classId;
    }

    @Override
    public String toString() {
        return "ClassInfo{" +
        ", classId=" + classId +
        ", syllabusId=" + syllabusId +
        ", classroomId=" + classroomId +
        ", staffId=" + staffId +
        ", className=" + className +
        ", classNumber=" + classNumber +
        ", classStartTime=" + classStartTime +
        ", classEndTime=" + classEndTime +
        ", classIsuesd=" + classIsuesd +
        ", classState=" + classState +
        ", classDesc=" + classDesc +
        ", classMajor=" + classMajor +
        "}";
    }
}
