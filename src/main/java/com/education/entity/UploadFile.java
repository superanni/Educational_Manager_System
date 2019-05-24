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
public class UploadFile extends Model<UploadFile> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "file_id", type = IdType.AUTO)
    private Integer fileId;
    private Integer staffId;
    private String fileTitle;
    private String fileName;
    private Date fileTime;


    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getFileTitle() {
        return fileTitle;
    }

    public void setFileTitle(String fileTitle) {
        this.fileTitle = fileTitle;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getFileTime() {
        return fileTime;
    }

    public void setFileTime(Date fileTime) {
        this.fileTime = fileTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.fileId;
    }

    @Override
    public String toString() {
        return "UploadFile{" +
        ", fileId=" + fileId +
        ", staffId=" + staffId +
        ", fileTitle=" + fileTitle +
        ", fileName=" + fileName +
        ", fileTime=" + fileTime +
        "}";
    }
}
