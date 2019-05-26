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



    @Override
    public String toString() {
        return "MarketActive{" +
        "activeId=" + activeId +
        ", staffId=" + staffId +
        ", activeName=" + activeName +
        ", activeState=" + activeState +
        ", activeStart=" + activeStart +
        ", activeEnd=" + activeEnd +
        ", activeType=" + activeType +
        ", activeCosteEmtimate=" + activeCosteEmtimate +
        ", activeCoste=" + activeCoste +
        ", activeRefectEstimate=" + activeRefectEstimate +
        ", activeStudent=" + activeStudent +
        ", activeContent=" + activeContent +
        "}";
    }
}
