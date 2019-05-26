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
@TableName("upload_file")
public class UploadFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "file_id", type = IdType.AUTO)
    private Integer fileId;
    @TableField("staff_id")
    private Integer staffId;
    @TableField("file_title")
    private String fileTitle;
    @TableField("file_name")
    private String fileName;
    @TableField("file_time")
    private Date fileTime;

    @TableField(exist = false)
    private StaffInfo staffInfo;  //对应员工

    @Override
    public String toString() {
        return "UploadFile{" +
        "fileId=" + fileId +
        ", staffId=" + staffId +
        ", fileTitle=" + fileTitle +
        ", fileName=" + fileName +
        ", fileTime=" + fileTime +
        "}";
    }
}
