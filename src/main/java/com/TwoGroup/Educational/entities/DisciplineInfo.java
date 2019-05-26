package com.TwoGroup.Educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@TableName("discipline_info")
public class DisciplineInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "discipline_id", type = IdType.AUTO)
    private Integer disciplineId;
    @TableField("discipline_no")
    private String disciplineNo;
    @TableField("discipline_name")
    private String disciplineName;
    /**
     * 学分
     */
    @TableField("discipline_tuition")
    private Double disciplineTuition;
    @TableField("discipline_bring")
    private Integer disciplineBring;
    @TableField("discipline_type")
    private String disciplineType;
    @TableField("discipline_desc")
    private String disciplineDesc;
    @TableField("discipline_isuesd")
    private String disciplineIsuesd;


    public Integer getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Integer disciplineId) {
        this.disciplineId = disciplineId;
    }

    public String getDisciplineNo() {
        return disciplineNo;
    }

    public void setDisciplineNo(String disciplineNo) {
        this.disciplineNo = disciplineNo;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public Double getDisciplineTuition() {
        return disciplineTuition;
    }

    public void setDisciplineTuition(Double disciplineTuition) {
        this.disciplineTuition = disciplineTuition;
    }

    public Integer getDisciplineBring() {
        return disciplineBring;
    }

    public void setDisciplineBring(Integer disciplineBring) {
        this.disciplineBring = disciplineBring;
    }

    public String getDisciplineType() {
        return disciplineType;
    }

    public void setDisciplineType(String disciplineType) {
        this.disciplineType = disciplineType;
    }

    public String getDisciplineDesc() {
        return disciplineDesc;
    }

    public void setDisciplineDesc(String disciplineDesc) {
        this.disciplineDesc = disciplineDesc;
    }

    public String getDisciplineIsuesd() {
        return disciplineIsuesd;
    }

    public void setDisciplineIsuesd(String disciplineIsuesd) {
        this.disciplineIsuesd = disciplineIsuesd;
    }

    @Override
    public String toString() {
        return "DisciplineInfo{" +
        "disciplineId=" + disciplineId +
        ", disciplineNo=" + disciplineNo +
        ", disciplineName=" + disciplineName +
        ", disciplineTuition=" + disciplineTuition +
        ", disciplineBring=" + disciplineBring +
        ", disciplineType=" + disciplineType +
        ", disciplineDesc=" + disciplineDesc +
        ", disciplineIsuesd=" + disciplineIsuesd +
        "}";
    }
}
