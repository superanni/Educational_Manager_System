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
 *  班主任对学生评价表 communicate_info :CommunicateInfo

 student_id 学生编号 关联student_info主键
 staff_id 员工编号  关联staff_info 主键
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("communicate_info")
public class CommunicateInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "communicate_id", type = IdType.AUTO)
    private Integer communicateId;          //班主任评价学生编号
    @TableField("student_id")
    private Integer studentId;              //学生编号
    @TableField("staff_id")
    private Integer staffId;                //员工编号
    @TableField("communicate_time")
    private Date communicateTime;           //评价时间
    @TableField("communicate_content")
    private String communicateContent;      //品行评语
    @TableField("communicate_xuenian")
    private String communicateXuenian;      //学年
    @TableField("communicate_xueqi")
    private String communicateXueqi;        //学期
    @TableField("leave_count")
    private Integer leaveCount;             //病事假统计
    @TableField("truancy_count")
    private Integer truancyCount;           //旷课统计
    @TableField("reward_punish")
    private String rewardPunish;            //奖惩记载

    @TableField(exist = false)
    private StaffInfo staffInfo;            //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;        //对应学生

}
