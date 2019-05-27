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
 * 
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Accessors(chain=true)
@Data
@TableName("discipline_info")
public class DisciplineInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "discipline_id", type = IdType.AUTO)
    private Integer disciplineId;
    @TableField("discipline_no")
    private String disciplineNo;
    @TableField("discipline_name")
    private String disciplineName;
    /**
     * 学分
     */
    @TableField("discipline_tuition")
    private Double disciplineTuition;
    @TableField("discipline_bring")
    private Integer disciplineBring;
    @TableField("discipline_type")
    private String disciplineType;
    @TableField("discipline_desc")
    private String disciplineDesc;
    @TableField("discipline_isuesd")
    private String disciplineIsuesd;

}
