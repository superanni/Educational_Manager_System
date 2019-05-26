package com.TwoGroup.Educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Data
@TableName("class_info")
public class ClassInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "class_id", type = IdType.AUTO)
    private Integer classId;
    @TableField("syllabus_id")
    private Integer syllabusId;
    @TableField("classroom_id")
    private Integer classroomId;
    @TableField("staff_id")
    private Integer staffId;
    @TableField("class_name")
    private String className;
    @TableField("class_number")
    private Integer classNumber;
    @TableField("class_start_time")
    private Date classStartTime;
    @TableField("class_end_time")
    private Date classEndTime;
    @TableField("class_isuesd")
    private String classIsuesd;
    @TableField("class_state")
    private String classState;
    @TableField("class_desc")
    private String classDesc;
    @TableField("class_major")
    private String classMajor;

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工
    @TableField(exist = false)
    private SyllabusInfo syllabusInfo;  //课表
    @TableField(exist = false)
    private ClassroomInfo classroomInfo;    //教室
    @TableField(exist = false)
    private DisciplineInfo disciplineInfo;      //课程

    @Override
    public String toString() {
        return "ClassInfo{" +
        "classId=" + classId +
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
