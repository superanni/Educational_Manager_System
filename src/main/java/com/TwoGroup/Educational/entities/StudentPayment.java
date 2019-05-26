package com.TwoGroup.Educational.entities;

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



    @Override
    public String toString() {
        return "StudentPayment{" +
        "paymentId=" + paymentId +
        ", studentId=" + studentId +
        ", staffId=" + staffId +
        ", paymentSituation=" + paymentSituation +
        ", paymentMethod=" + paymentMethod +
        ", paymentTime=" + paymentTime +
        ", discountAmount=" + discountAmount +
        ", shouldAmount=" + shouldAmount +
        ", realAmount=" + realAmount +
        ", debtAmount=" + debtAmount +
        ", paymentRemark=" + paymentRemark +
        "}";
    }
}
