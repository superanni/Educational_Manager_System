package com.twoGroup.educational.entities;

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
@TableName("class_transaction_info")
public class ClassTransactionInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "class_transaction_id", type = IdType.AUTO)
    private Integer classTransactionId;
    @TableField("class_id")
    private Integer classId;
    @TableField("class_transaction_title")
    private String classTransactionTitle;
    @TableField("class_transaction_content")
    private String classTransactionContent;
    @TableField("class_transaction_person")
    private String classTransactionPerson;
    @TableField("class_transaction_time")
    private Date classTransactionTime;
    @TableField("class_transaction_remark")
    private String classTransactionRemark;

    @TableField(exist = false)
    private ClassInfo classInfo ;   //所属班级


    @Override
    public String toString() {
        return "ClassTransactionInfo{" +
        "classTransactionId=" + classTransactionId +
        ", classId=" + classId +
        ", classTransactionTitle=" + classTransactionTitle +
        ", classTransactionContent=" + classTransactionContent +
        ", classTransactionPerson=" + classTransactionPerson +
        ", classTransactionTime=" + classTransactionTime +
        ", classTransactionRemark=" + classTransactionRemark +
        "}";
    }
}