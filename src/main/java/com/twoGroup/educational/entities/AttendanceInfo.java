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
 * 
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
    private Integer attendanceId;
    @TableField("student_id")
    private Integer studentId;
    @TableField("staff_id")
    private Integer staffId;
    @TableField("attendance_desc")
    private String attendanceDesc;
    @TableField("attendance_state")
    private String attendanceState;
    @TableField("attendance_time")
    private Date attendanceTime;
    @TableField("attendance_remark")
    private String attendanceRemark;
    @TableField("attendance_xuenian")
    private String attendanceXuenian;
    @TableField("attendance_xueqi")
    private String attendanceXueqi;
    @TableField("attendance_month")
    private String attendanceMonth;

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;  //对应学生

}
