package com.twoGroup.educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.experimental.Accessors;
import sun.font.SunFontManager;

import java.io.Serializable;

/**
 * <p>
 * 
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
    private Integer studentFamilyId;
    @TableField("student_id")
    private Integer studentId;
    @TableField("staff_id")
    private Integer staffId;
    @TableField("family_name")
    private String familyName;
    /**
     * 称谓
     */
    @TableField("family_app")
    private String familyApp;
    @TableField("family_age")
    private Integer familyAge;
    /**
     * 政治面貌
     */
    @TableField("family_zzmm")
    private String familyZzmm;
    /**
     * 何处工作任职
     */
    private String workplace;
    @TableField("reg_time")
    private Date regTime;
    @TableField("family_note")
    private String familyNote;

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工
    @TableField(exist = false)
    private StudentInfo studentInfo;  //对应学生

}
