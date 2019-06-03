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
 * 学生缴费信息表 student_payment :StudentPayment
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
    private Integer paymentId;          //学生缴费编号
    @TableField("student_id")
    private Integer studentId;          //学生编号
    @TableField("staff_id")
    private Integer staffId;            //员工编号
    @TableField("payment_situation")
    private String paymentSituation;    //学年
    @TableField("payment_method")
    private String paymentMethod;       //缴费分式
    @TableField("payment_time")
    private Date paymentTime;           //缴费时间
    @TableField("discount_amount")
    private Double discountAmount;      //优惠金额
    @TableField("should_amount")
    private Double shouldAmount;        //应交金额
    @TableField("real_amount")
    private Double realAmount;          //实缴金额
    @TableField("debt_amount")
    private Double debtAmount;          //欠款金额
    @TableField("payment_remark")
    private String paymentRemark;       //备注

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;  //对应学生

}
