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
 * 班级事务信息表 class_transaction_info :ClassTransactionInfo
 class_id 班级号 关联class_info表class_id

 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("class_transaction_info")
public class ClassTransactionInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "class_transaction_id", type = IdType.AUTO)
    private Integer classTransactionId;              //班级事务编号
    @TableField("class_id")
    private Integer classId;                         //班级号
    @TableField("class_transaction_title")
    private String classTransactionTitle;            //主题
    @TableField("class_transaction_content")
    private String classTransactionContent;          //内容
    @TableField("class_transaction_person")
    private String classTransactionPerson;          //组织人
    @TableField("class_transaction_time")
    private Date classTransactionTime;             //活动日期
    @TableField("class_transaction_remark")
    private String classTransactionRemark;         //备注信息

    @TableField(exist = false)
    private ClassInfo classInfo ;                   //所属班级

}
