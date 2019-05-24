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
public class ClassTransactionInfo extends Model<ClassTransactionInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "class_transaction_id", type = IdType.AUTO)
    private Integer classTransactionId;
    private Integer classId;
    private String classTransactionTitle;
    private String classTransactionContent;
    private String classTransactionPerson;
    private Date classTransactionTime;
    private String classTransactionRemark;


    public Integer getClassTransactionId() {
        return classTransactionId;
    }

    public void setClassTransactionId(Integer classTransactionId) {
        this.classTransactionId = classTransactionId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassTransactionTitle() {
        return classTransactionTitle;
    }

    public void setClassTransactionTitle(String classTransactionTitle) {
        this.classTransactionTitle = classTransactionTitle;
    }

    public String getClassTransactionContent() {
        return classTransactionContent;
    }

    public void setClassTransactionContent(String classTransactionContent) {
        this.classTransactionContent = classTransactionContent;
    }

    public String getClassTransactionPerson() {
        return classTransactionPerson;
    }

    public void setClassTransactionPerson(String classTransactionPerson) {
        this.classTransactionPerson = classTransactionPerson;
    }

    public Date getClassTransactionTime() {
        return classTransactionTime;
    }

    public void setClassTransactionTime(Date classTransactionTime) {
        this.classTransactionTime = classTransactionTime;
    }

    public String getClassTransactionRemark() {
        return classTransactionRemark;
    }

    public void setClassTransactionRemark(String classTransactionRemark) {
        this.classTransactionRemark = classTransactionRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.classTransactionId;
    }

    @Override
    public String toString() {
        return "ClassTransactionInfo{" +
        ", classTransactionId=" + classTransactionId +
        ", classId=" + classId +
        ", classTransactionTitle=" + classTransactionTitle +
        ", classTransactionContent=" + classTransactionContent +
        ", classTransactionPerson=" + classTransactionPerson +
        ", classTransactionTime=" + classTransactionTime +
        ", classTransactionRemark=" + classTransactionRemark +
        "}";
    }
}
