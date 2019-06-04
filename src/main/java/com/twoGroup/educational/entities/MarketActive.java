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
 * 教务活动信息表 market_active :MarketActive
 staff_id 	 员工编号  关联staff_info 主键
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("market_active")
public class MarketActive implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "active_id", type = IdType.AUTO)
    private Integer activeId;               //编号
    @TableField("staff_id")
    private Integer staffId;                //员工编号
    @TableField("active_name")
    private String activeName;              //活动名称
    @TableField("active_state")
    private Integer activeState;            //活动状态
    @TableField("active_start")
    private Date activeStart;               //开始时间
    @TableField("active_end")
    private Date activeEnd;                 //结束时间
    @TableField("active_type")
    private Integer activeType;             //活动类型
    @TableField("active_coste_emtimate")
    private Double activeCosteEmtimate;     //预算成本
    @TableField("active_coste")
    private Double activeCoste;             //实际成本
    @TableField("active_refect_estimate")
    private Integer activeRefectEstimate;   //预期反应
    @TableField("active_student")
    private String activeStudent;            //预期人数
    @TableField("active_content")
    private String activeContent;            //活动描述

    @TableField(exist = false)
    private StaffInfo staffInfo;             //对应员工



}
