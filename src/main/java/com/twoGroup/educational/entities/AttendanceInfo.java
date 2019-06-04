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
 * 学生考勤信息表 attendance_info
 student_id 学生编号 关联student_info主键
 staff_id 员工编号  关联staff_info 主键
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("attendance_info")
public class AttendanceInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "attendance_id", type = IdType.AUTO)
    private Integer attendanceId;           //学生编号
    @TableField("student_id")
    private Integer studentId;              //员工编号
    @TableField("staff_id")
    private Integer staffId;                //员工编号
    @TableField("attendance_desc")
    private String attendanceDesc;          //考勤描述
    @TableField("attendance_state")
    private String attendanceState;         //考勤状态
    @TableField("attendance_time")
    private Date attendanceTime;            //考勤时间
    @TableField("attendance_remark")
    private String attendanceRemark;        //考勤备注
    @TableField("attendance_xuenian")
    private String attendanceXuenian;       //学年
    @TableField("attendance_xueqi")
    private String attendanceXueqi;         //学期
    @TableField("attendance_month")
    private String attendanceMonth;         //月份

    @TableField(exist = false)
    private StaffInfo staffInfo;            //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;        //对应学生
}
