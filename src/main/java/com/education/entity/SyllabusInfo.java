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
public class SyllabusInfo extends Model<SyllabusInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "syllabus_id", type = IdType.AUTO)
    private Integer syllabusId;
    private String syllabusYi;
    private String syllabusEr;
    private String syllabusSan;
    private String syllabusSi;
    private String syllabusWu;
    private String syllabusLiu;
    private String syllabusQi;
    private String isUesd;
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
    protected Serializable pkVal() {
        return this.syllabusId;
    }

    @Override
    public String toString() {
        return "SyllabusInfo{" +
        ", syllabusId=" + syllabusId +
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
