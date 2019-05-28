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
 * 学生缴费信息表student_payment :StudentPayment
 缴费方式 由int改为varchar 具体值可为银行卡 支付宝 微信之类
 student_id 学生编号 关联student_info主键
 staff_id 员工编号  关联staff_info 主键
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("student_payment")
public class StudentPayment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "payment_id", type = IdType.AUTO)
    private Integer paymentId;
    @TableField("student_id")
    private Integer studentId;
    @TableField("staff_id")
    private Integer staffId;
    @TableField("payment_situation")
    private String paymentSituation;
    @TableField("payment_method")
    private String paymentMethod;
    @TableField("payment_time")
    private Date paymentTime;
    @TableField("discount_amount")
    private Double discountAmount;
    @TableField("should_amount")
    private Double shouldAmount;
    @TableField("real_amount")
    private Double realAmount;
    @TableField("debt_amount")
    private Double debtAmount;
    @TableField("payment_remark")
    private String paymentRemark;

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;  //对应学生

}
