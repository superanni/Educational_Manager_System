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
 *   新增学生 履历档案表 track_record_info -TrackRecordInfo
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
    private Integer trackRecordId;       //履历档案编号
    @TableField("student_id")
    private Integer studentId;           //学生编号
    @TableField("track_record_title")
    private String trackRecordTitle;      //履历档案标题
    @TableField("track_record_content")
    private String trackRecordContent;     //履历档案内容
    @TableField("track_record_time")
    private Date trackRecordTime;          //履历密封时间
    private Integer enrollment;
    @TableField("next_record_time")
    private Date nextRecordTime;           //履历更新时间
}
