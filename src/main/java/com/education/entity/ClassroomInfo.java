package com.education.entity;

import com.baomidou.mybatisplus.enums.IdType;
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
public class ClassroomInfo extends Model<ClassroomInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "classroom_id", type = IdType.AUTO)
    private Integer classroomId;
    private String classroomName;
    private Integer classroomMax;
    private String classroomInfo;
    private String classroomRemark;
    private String classroomMark;


    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public Integer getClassroomMax() {
        return classroomMax;
    }

    public void setClassroomMax(Integer classroomMax) {
        this.classroomMax = classroomMax;
    }

    public String getClassroomInfo() {
        return classroomInfo;
    }

    public void setClassroomInfo(String classroomInfo) {
        this.classroomInfo = classroomInfo;
    }

    public String getClassroomRemark() {
        return classroomRemark;
    }

    public void setClassroomRemark(String classroomRemark) {
        this.classroomRemark = classroomRemark;
    }

    public String getClassroomMark() {
        return classroomMark;
    }

    public void setClassroomMark(String classroomMark) {
        this.classroomMark = classroomMark;
    }

    @Override
    protected Serializable pkVal() {
        return this.classroomId;
    }

    @Override
    public String toString() {
        return "ClassroomInfo{" +
        ", classroomId=" + classroomId +
        ", classroomName=" + classroomName +
        ", classroomMax=" + classroomMax +
        ", classroomInfo=" + classroomInfo +
        ", classroomRemark=" + classroomRemark +
        ", classroomMark=" + classroomMark +
        "}";
    }
}
