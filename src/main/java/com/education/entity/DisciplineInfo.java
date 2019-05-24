package com.education.entity;

import com.baomidou.mybatisplus.enums.IdType;
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
public class DisciplineInfo extends Model<DisciplineInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "discipline_id", type = IdType.AUTO)
    private Integer disciplineId;
    private String disciplineNo;
    private String disciplineName;
    /**
     * 学分
     */
    private Double disciplineTuition;
    private Integer disciplineBring;
    private String disciplineType;
    private String disciplineDesc;
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
    protected Serializable pkVal() {
        return this.disciplineId;
    }

    @Override
    public String toString() {
        return "DisciplineInfo{" +
        ", disciplineId=" + disciplineId +
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
