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
    private Integer activeId;
    @TableField("staff_id")
    private Integer staffId;
    @TableField("active_name")
    private String activeName;
    @TableField("active_state")
    private Integer activeState;
    @TableField("active_start")
    private Date activeStart;
    @TableField("active_end")
    private Date activeEnd;
    @TableField("active_type")
    private Integer activeType;
    @TableField("active_coste_emtimate")
    private Double activeCosteEmtimate;  //预算成本
    @TableField("active_coste")
    private Double activeCoste;      //实际成本
    @TableField("active_refect_estimate")
    private Integer activeRefectEstimate;//预期反应
    @TableField("active_student")
    private String activeStudent; //预期人数
    @TableField("active_content")
    private String activeContent;

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工



}
