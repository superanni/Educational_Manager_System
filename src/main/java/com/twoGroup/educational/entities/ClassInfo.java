package com.twoGroup.educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 班级信息表 class_info:ClassInfo
 syllabus_id 课程编号 关联21课程表  syllabus_info 主键
 classroom_id  教室编号 关联教室表classroom_info主键
 staff_id 班导编号 关联员工表 staff_info 主键
 discipline_id  课程编号 关联19课程表discipline_info 主键
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("class_info")
public class ClassInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "class_id", type = IdType.AUTO)
    private Integer classId;            //班级编号
    @TableField("syllabus_id")
    private Integer syllabusId;         //编辑课表编号
    @TableField("classroom_id")
    private Integer classroomId;        //教室编号
    @TableField("staff_id")
    private Integer staffId;            //员工编号
    @TableField("class_name")
    private String className;           //班级名
    @TableField("class_number")
    private Integer classNumber;        //班级人数
    @TableField("class_start_time")
    private Date classStartTime;        //开班日期
    @TableField("class_end_time")
    private Date classEndTime;          //结束日期
    @TableField("class_isuesd")
    private String classIsuesd;         //是否使用
    @TableField("class_state")
    private String classState;          //班级状态
    @TableField("class_desc")
    private String classDesc;           //班级描述
    @TableField("class_major")
    private String classMajor;          //专业

    @TableField(exist = false)
    private StaffInfo staffInfo;              //对应员工
    @TableField(exist = false)
    private SyllabusInfo syllabusInfo;        //课表
    @TableField(exist = false)
    private ClassroomInfo classroomInfo;      //教室
    @TableField(exist = false)
    private DisciplineInfo disciplineInfo;    //课程

}
