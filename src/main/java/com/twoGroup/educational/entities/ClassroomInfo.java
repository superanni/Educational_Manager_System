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
 * 教室信息表 classroom_info :ClassroomInfo
 基础表 无关联 无修改

 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("classroom_info")
public class ClassroomInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "classroom_id", type = IdType.AUTO)
    private Integer classroomId;
    @TableField("classroom_name")
    private String classroomName;
    @TableField("classroom_max")
    private Integer classroomMax;
    @TableField("classroom_info")
    private String classroomInfo;
    @TableField("classroom_remark")
    private String classroomRemark;
    @TableField("classroom_mark")
    private String classroomMark;

}
