package com.twoGroup.educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("classroom_info")
public class ClassroomInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "classroom_id", type = IdType.AUTO)
    private Integer classroomId;
    @TableField("classroom_name")
    private String classroomName;
    @TableField("classroom_max")
    private Integer classroomMax;
    @TableField("classroom_info")
    private String classroomInfo;
    @TableField("classroom_remark")
    private String classroomRemark;
    @TableField("classroom_mark")
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
    public String toString() {
        return "ClassroomInfo{" +
        "classroomId=" + classroomId +
        ", classroomName=" + classroomName +
        ", classroomMax=" + classroomMax +
        ", classroomInfo=" + classroomInfo +
        ", classroomRemark=" + classroomRemark +
        ", classroomMark=" + classroomMark +
        "}";
    }
}
