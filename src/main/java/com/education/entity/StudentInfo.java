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
public class StudentInfo extends Model<StudentInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 学生编号
     */
    @TableId(value = "student_id", type = IdType.AUTO)
    private Integer studentId;
    /**
     * 员工编号
     */
    private Integer staffId;
    /**
     * 班级编号
     */
    private Integer classId;
    private String studentNo;
    private String studentName;
    private String studentSex;
    /**
     * 曾用名
     */
    private String studentName1;
    private String studentNational;
    private String studentBirthday;
    private String studentHealth;
    private String studentNative;
    private String studentIndate;
    private String studentMarital;
    private String studentAddress;
    private String studentPost;
    private String familyTellphone;
    private String studentTellphone;
    private String studentQq;
    private String studentIsleague;
    private String studentJoinTime;
    private String studentIdcard;
    private String studentBeforeSchool;
    private String studentHobby;
    private String studentSchool;
    private String studentPro;
    private String studentEduSys;
    private String studentProCity;
    private String studentType;
    private String studentIspay;
    private String studentDesc;
    private String studentNumber;
    private String studentPassword;
    private Integer studentMark;
    private String studentState;
    private String studentHard;
    private String studentLoan;
    private String studentMuster;
    private Double studentProject;


    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentName1() {
        return studentName1;
    }

    public void setStudentName1(String studentName1) {
        this.studentName1 = studentName1;
    }

    public String getStudentNational() {
        return studentNational;
    }

    public void setStudentNational(String studentNational) {
        this.studentNational = studentNational;
    }

    public String getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(String studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public String getStudentHealth() {
        return studentHealth;
    }

    public void setStudentHealth(String studentHealth) {
        this.studentHealth = studentHealth;
    }

    public String getStudentNative() {
        return studentNative;
    }

    public void setStudentNative(String studentNative) {
        this.studentNative = studentNative;
    }

    public String getStudentIndate() {
        return studentIndate;
    }

    public void setStudentIndate(String studentIndate) {
        this.studentIndate = studentIndate;
    }

    public String getStudentMarital() {
        return studentMarital;
    }

    public void setStudentMarital(String studentMarital) {
        this.studentMarital = studentMarital;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentPost() {
        return studentPost;
    }

    public void setStudentPost(String studentPost) {
        this.studentPost = studentPost;
    }

    public String getFamilyTellphone() {
        return familyTellphone;
    }

    public void setFamilyTellphone(String familyTellphone) {
        this.familyTellphone = familyTellphone;
    }

    public String getStudentTellphone() {
        return studentTellphone;
    }

    public void setStudentTellphone(String studentTellphone) {
        this.studentTellphone = studentTellphone;
    }

    public String getStudentQq() {
        return studentQq;
    }

    public void setStudentQq(String studentQq) {
        this.studentQq = studentQq;
    }

    public String getStudentIsleague() {
        return studentIsleague;
    }

    public void setStudentIsleague(String studentIsleague) {
        this.studentIsleague = studentIsleague;
    }

    public String getStudentJoinTime() {
        return studentJoinTime;
    }

    public void setStudentJoinTime(String studentJoinTime) {
        this.studentJoinTime = studentJoinTime;
    }

    public String getStudentIdcard() {
        return studentIdcard;
    }

    public void setStudentIdcard(String studentIdcard) {
        this.studentIdcard = studentIdcard;
    }

    public String getStudentBeforeSchool() {
        return studentBeforeSchool;
    }

    public void setStudentBeforeSchool(String studentBeforeSchool) {
        this.studentBeforeSchool = studentBeforeSchool;
    }

    public String getStudentHobby() {
        return studentHobby;
    }

    public void setStudentHobby(String studentHobby) {
        this.studentHobby = studentHobby;
    }

    public String getStudentSchool() {
        return studentSchool;
    }

    public void setStudentSchool(String studentSchool) {
        this.studentSchool = studentSchool;
    }

    public String getStudentPro() {
        return studentPro;
    }

    public void setStudentPro(String studentPro) {
        this.studentPro = studentPro;
    }

    public String getStudentEduSys() {
        return studentEduSys;
    }

    public void setStudentEduSys(String studentEduSys) {
        this.studentEduSys = studentEduSys;
    }

    public String getStudentProCity() {
        return studentProCity;
    }

    public void setStudentProCity(String studentProCity) {
        this.studentProCity = studentProCity;
    }

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }

    public String getStudentIspay() {
        return studentIspay;
    }

    public void setStudentIspay(String studentIspay) {
        this.studentIspay = studentIspay;
    }

    public String getStudentDesc() {
        return studentDesc;
    }

    public void setStudentDesc(String studentDesc) {
        this.studentDesc = studentDesc;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public Integer getStudentMark() {
        return studentMark;
    }

    public void setStudentMark(Integer studentMark) {
        this.studentMark = studentMark;
    }

    public String getStudentState() {
        return studentState;
    }

    public void setStudentState(String studentState) {
        this.studentState = studentState;
    }

    public String getStudentHard() {
        return studentHard;
    }

    public void setStudentHard(String studentHard) {
        this.studentHard = studentHard;
    }

    public String getStudentLoan() {
        return studentLoan;
    }

    public void setStudentLoan(String studentLoan) {
        this.studentLoan = studentLoan;
    }

    public String getStudentMuster() {
        return studentMuster;
    }

    public void setStudentMuster(String studentMuster) {
        this.studentMuster = studentMuster;
    }

    public Double getStudentProject() {
        return studentProject;
    }

    public void setStudentProject(Double studentProject) {
        this.studentProject = studentProject;
    }

    @Override
    protected Serializable pkVal() {
        return this.studentId;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
        ", studentId=" + studentId +
        ", staffId=" + staffId +
        ", classId=" + classId +
        ", studentNo=" + studentNo +
        ", studentName=" + studentName +
        ", studentSex=" + studentSex +
        ", studentName1=" + studentName1 +
        ", studentNational=" + studentNational +
        ", studentBirthday=" + studentBirthday +
        ", studentHealth=" + studentHealth +
        ", studentNative=" + studentNative +
        ", studentIndate=" + studentIndate +
        ", studentMarital=" + studentMarital +
        ", studentAddress=" + studentAddress +
        ", studentPost=" + studentPost +
        ", familyTellphone=" + familyTellphone +
        ", studentTellphone=" + studentTellphone +
        ", studentQq=" + studentQq +
        ", studentIsleague=" + studentIsleague +
        ", studentJoinTime=" + studentJoinTime +
        ", studentIdcard=" + studentIdcard +
        ", studentBeforeSchool=" + studentBeforeSchool +
        ", studentHobby=" + studentHobby +
        ", studentSchool=" + studentSchool +
        ", studentPro=" + studentPro +
        ", studentEduSys=" + studentEduSys +
        ", studentProCity=" + studentProCity +
        ", studentType=" + studentType +
        ", studentIspay=" + studentIspay +
        ", studentDesc=" + studentDesc +
        ", studentNumber=" + studentNumber +
        ", studentPassword=" + studentPassword +
        ", studentMark=" + studentMark +
        ", studentState=" + studentState +
        ", studentHard=" + studentHard +
        ", studentLoan=" + studentLoan +
        ", studentMuster=" + studentMuster +
        ", studentProject=" + studentProject +
        "}";
    }
}
