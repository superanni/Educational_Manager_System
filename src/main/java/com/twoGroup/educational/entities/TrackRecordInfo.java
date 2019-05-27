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
 * 
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("track_record_info")
public class TrackRecordInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "track_record_id", type = IdType.AUTO)
    private Integer trackRecordId;
    @TableField("student_id")
    private Integer studentId;
    @TableField("track_record_title")
    private String trackRecordTitle;
    @TableField("track_record_content")
    private String trackRecordContent;
    @TableField("track_record_time")
    private Date trackRecordTime;
    private Integer enrollment;
    @TableField("next_record_time")
    private Date nextRecordTime;
}
