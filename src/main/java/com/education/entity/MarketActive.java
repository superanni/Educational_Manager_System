package com.education.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-24
 */
public class MarketActive extends Model<MarketActive> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "active_id", type = IdType.AUTO)
    private Integer activeId;
    private Integer staffId;
    private String activeName;
    private Integer activeState;
    private Date activeStart;
    private Date activeEnd;
    private Integer activeType;
    private Double activeCosteEmtimate;
    private Double activeCoste;
    private Integer activeRefectEstimate;
    private String activeStudent;
    private String activeContent;


    public Integer getActiveId() {
        return activeId;
    }

    public void setActiveId(Integer activeId) {
        this.activeId = activeId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getActiveName() {
        return activeName;
    }

    public void setActiveName(String activeName) {
        this.activeName = activeName;
    }

    public Integer getActiveState() {
        return activeState;
    }

    public void setActiveState(Integer activeState) {
        this.activeState = activeState;
    }

    public Date getActiveStart() {
        return activeStart;
    }

    public void setActiveStart(Date activeStart) {
        this.activeStart = activeStart;
    }

    public Date getActiveEnd() {
        return activeEnd;
    }

    public void setActiveEnd(Date activeEnd) {
        this.activeEnd = activeEnd;
    }

    public Integer getActiveType() {
        return activeType;
    }

    public void setActiveType(Integer activeType) {
        this.activeType = activeType;
    }

    public Double getActiveCosteEmtimate() {
        return activeCosteEmtimate;
    }

    public void setActiveCosteEmtimate(Double activeCosteEmtimate) {
        this.activeCosteEmtimate = activeCosteEmtimate;
    }

    public Double getActiveCoste() {
        return activeCoste;
    }

    public void setActiveCoste(Double activeCoste) {
        this.activeCoste = activeCoste;
    }

    public Integer getActiveRefectEstimate() {
        return activeRefectEstimate;
    }

    public void setActiveRefectEstimate(Integer activeRefectEstimate) {
        this.activeRefectEstimate = activeRefectEstimate;
    }

    public String getActiveStudent() {
        return activeStudent;
    }

    public void setActiveStudent(String activeStudent) {
        this.activeStudent = activeStudent;
    }

    public String getActiveContent() {
        return activeContent;
    }

    public void setActiveContent(String activeContent) {
        this.activeContent = activeContent;
    }

    @Override
    protected Serializable pkVal() {
        return this.activeId;
    }

    @Override
    public String toString() {
        return "MarketActive{" +
        ", activeId=" + activeId +
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
