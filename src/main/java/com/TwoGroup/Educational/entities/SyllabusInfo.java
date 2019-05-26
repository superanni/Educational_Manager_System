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
@TableName("syllabus_info")
public class SyllabusInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "syllabus_id", type = IdType.AUTO)
    private Integer syllabusId;
    @TableField("syllabus_yi")
    private String syllabusYi;
    @TableField("syllabus_er")
    private String syllabusEr;
    @TableField("syllabus_san")
    private String syllabusSan;
    @TableField("syllabus_si")
    private String syllabusSi;
    @TableField("syllabus_wu")
    private String syllabusWu;
    @TableField("syllabus_liu")
    private String syllabusLiu;
    @TableField("syllabus_qi")
    private String syllabusQi;
    @TableField("is_uesd")
    private String isUesd;
    @TableField("syllabus_name")
    private String syllabusName;


    public Integer getSyllabusId() {
        return syllabusId;
    }

    public void setSyllabusId(Integer syllabusId) {
        this.syllabusId = syllabusId;
    }

    public String getSyllabusYi() {
        return syllabusYi;
    }

    public void setSyllabusYi(String syllabusYi) {
        this.syllabusYi = syllabusYi;
    }

    public String getSyllabusEr() {
        return syllabusEr;
    }

    public void setSyllabusEr(String syllabusEr) {
        this.syllabusEr = syllabusEr;
    }

    public String getSyllabusSan() {
        return syllabusSan;
    }

    public void setSyllabusSan(String syllabusSan) {
        this.syllabusSan = syllabusSan;
    }

    public String getSyllabusSi() {
        return syllabusSi;
    }

    public void setSyllabusSi(String syllabusSi) {
        this.syllabusSi = syllabusSi;
    }

    public String getSyllabusWu() {
        return syllabusWu;
    }

    public void setSyllabusWu(String syllabusWu) {
        this.syllabusWu = syllabusWu;
    }

    public String getSyllabusLiu() {
        return syllabusLiu;
    }

    public void setSyllabusLiu(String syllabusLiu) {
        this.syllabusLiu = syllabusLiu;
    }

    public String getSyllabusQi() {
        return syllabusQi;
    }

    public void setSyllabusQi(String syllabusQi) {
        this.syllabusQi = syllabusQi;
    }

    public String getIsUesd() {
        return isUesd;
    }

    public void setIsUesd(String isUesd) {
        this.isUesd = isUesd;
    }

    public String getSyllabusName() {
        return syllabusName;
    }

    public void setSyllabusName(String syllabusName) {
        this.syllabusName = syllabusName;
    }

    @Override
    public String toString() {
        return "SyllabusInfo{" +
        "syllabusId=" + syllabusId +
        ", syllabusYi=" + syllabusYi +
        ", syllabusEr=" + syllabusEr +
        ", syllabusSan=" + syllabusSan +
        ", syllabusSi=" + syllabusSi +
        ", syllabusWu=" + syllabusWu +
        ", syllabusLiu=" + syllabusLiu +
        ", syllabusQi=" + syllabusQi +
        ", isUesd=" + isUesd +
        ", syllabusName=" + syllabusName +
        "}";
    }
}
