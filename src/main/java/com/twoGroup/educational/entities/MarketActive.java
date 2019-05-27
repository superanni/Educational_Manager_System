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
    private Double activeCosteEmtimate;
    @TableField("active_coste")
    private Double activeCoste;
    @TableField("active_refect_estimate")
    private Integer activeRefectEstimate;
    @TableField("active_student")
    private String activeStudent;
    @TableField("active_content")
    private String activeContent;

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工



}
