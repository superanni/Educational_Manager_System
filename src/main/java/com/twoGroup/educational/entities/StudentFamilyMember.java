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
 * 学生家庭成员信息表 student_family_member :StudentFamilyMember
 列政治面貌 family_zcmm 更新为family_zzmm
 student_id 学生编号 关联student_info主键
 staff_id 员工编号  关联staff_info 主键
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("student_family_member")
public class StudentFamilyMember implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "student_family_id", type = IdType.AUTO)
    private Integer studentFamilyId;      //学生家庭编号
    @TableField("student_id")
    private Integer studentId;            //学生编号
    @TableField("staff_id")
    private Integer staffId;              //员工编号
    @TableField("family_name")
    private String familyName;            //姓名
    @TableField("family_app")
    private String familyApp;             //称谓
    @TableField("family_age")
    private Integer familyAge;            //年龄
    @TableField("family_zzmm")
    private String familyZzmm;            //政治面貌
	@TableField("workplace")
    private String workplace;             //何处工作任职
    @TableField("reg_time")
    private Date regTime;                 //登记时间
    @TableField("family_note")
    private String familyNote;            //备注

    @TableField(exist = false)
    private StaffInfo staffInfo;            //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;        //对应学生

}
