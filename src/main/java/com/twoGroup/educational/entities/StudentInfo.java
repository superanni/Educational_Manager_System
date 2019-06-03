package com.twoGroup.educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 学生信息表 student_info :StudentInfo
 staff_id 员工编号 关联staff_info 主键
 class_id 班级编号 关联class_info 主键
 isPay字段重复删去一行
 student_class字段无意义 删去 该表剩余39列
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("student_info")
public class StudentInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "student_id", type = IdType.AUTO)
    private Integer studentId;          //学生编号
    @TableField("staff_id")
    private Integer staffId;            //员工编号
    @TableField("class_id")
    private Integer classId;            //班级编号
    @TableField("student_no")
    private String studentNo;           //学号
    @TableField("student_name")
    private String studentName;         //姓名
    @TableField("student_sex")
    private String studentSex;          //性别
    @TableField("student_name1")
    private String studentName1;        //曾用名
    @TableField("student_national")
    private String studentNational;     //民族
    @TableField("student_birthday")
    private String studentBirthday;     //出生年月
    @TableField("student_health")
    private String studentHealth;       //健康状况
    @TableField("student_native")
    private String studentNative;       //籍贯
    @TableField("student_indate")
    private String studentIndate;       //入学时间
    @TableField("student_marital")
    private String studentMarital;      //婚否
    @TableField("student_address")
    private String studentAddress;      //家庭地址
    @TableField("student_post")
    private String studentPost;         //邮编
    @TableField("family_tellphone")
    private String familyTellphone;     //家庭电话
    @TableField("student_tellphone")
    private String studentTellphone;    //本人电话
    @TableField("student_qq")
    private String studentQq;           //QQ号
    @TableField("student_isleague")
    private String studentIsleague;     //是否团员
    @TableField("student_join_time")
    private String studentJoinTime;     //入党团时间
    @TableField("student_idcard")
    private String studentIdcard;       //身份证号
    @TableField("student_before_school")
    private String studentBeforeSchool; //入学前学校
    @TableField("student_hobby")
    private String studentHobby;        //特长爱好
    @TableField("student_school")
    private String studentSchool;       //所在分院
    @TableField("student_pro")
    private String studentPro;          //专业
    @TableField("student_edu_sys")
    /**
     * 缺少student_class 班级
     */
    private String studentEduSys;       //学制
    @TableField("student_pro_city")
    private String studentProCity;      //城市
    @TableField("student_type")
    private String studentType;         //学历类型
    @TableField("student_ispay")
    private String studentIspay;        //是否缴费
    @TableField("student_desc")
    private String studentDesc;         //学生描述
    @TableField("student_number")
    private String studentNumber;        //账号
    @TableField("student_password")
    private String studentPassword;      //密码
    @TableField("student_mark")
    private Integer studentMark;         //是否报到
    @TableField("student_hard")
    private String studentHard;          //是否困难生
    @TableField("student_loan")
    private String studentLoan;          //是否助学贷款
    @TableField("student_state")
    private String studentState;         //学籍状态
    @TableField("student_muster")
    private String studentMuster;        //是否退伍考学
    @TableField("student_project")
    private Double studentProject;       //十一工程分
    @TableField("student_image")
    private String studentImage;         //学生照片

    @TableField(exist = false)
    private StaffInfo staffInfo;         //对应员工
    @TableField(exist = false)
    private ClassInfo classInfo;         //对应班级

}
