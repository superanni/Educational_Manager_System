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
@TableName("communicate_info")
public class CommunicateInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "communicate_id", type = IdType.AUTO)
    private Integer communicateId;
    @TableField("student_id")
    private Integer studentId;
    @TableField("staff_id")
    private Integer staffId;
    /**
     * 评价时间
     */
    @TableField("communicate_time")
    private Date communicateTime;
    /**
     * 评价内容
     */
    @TableField("communicate_content")
    private String communicateContent;
    @TableField("communicate_xuenian")
    private String communicateXuenian;
    @TableField("communicate_xueqi")
    private String communicateXueqi;
    /**
     * 病事假统计
     */
    @TableField("leave_count")
    private Integer leaveCount;
    /**
     * 旷课统计
     */
    @TableField("truancy_count")
    private Integer truancyCount;
    /**
     * 奖惩记载
     */
    @TableField("reward_punish")
    private String rewardPunish;

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;  //对应学生



    @Override
    public String toString() {
        return "CommunicateInfo{" +
        "communicateId=" + communicateId +
        ", studentId=" + studentId +
        ", staffId=" + staffId +
        ", communicateTime=" + communicateTime +
        ", communicateContent=" + communicateContent +
        ", communicateXuenian=" + communicateXuenian +
        ", communicateXueqi=" + communicateXueqi +
        ", leaveCount=" + leaveCount +
        ", truancyCount=" + truancyCount +
        ", rewardPunish=" + rewardPunish +
        "}";
    }
}
