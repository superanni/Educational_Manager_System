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
 * 文件上传表 upload_file :UploadFile
 staff_id 	员工编号	    关联staff_info 主键
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
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

}
