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
public class DataDictionary extends Model<DataDictionary> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "data_id", type = IdType.AUTO)
    private Integer dataId;
    private String dataContent;
    private String dataType;
    private String dataDesc;


    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getDataContent() {
        return dataContent;
    }

    public void setDataContent(String dataContent) {
        this.dataContent = dataContent;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataDesc() {
        return dataDesc;
    }

    public void setDataDesc(String dataDesc) {
        this.dataDesc = dataDesc;
    }

    @Override
    protected Serializable pkVal() {
        return this.dataId;
    }

    @Override
    public String toString() {
        return "DataDictionary{" +
        ", dataId=" + dataId +
        ", dataContent=" + dataContent +
        ", dataType=" + dataType +
        ", dataDesc=" + dataDesc +
        "}";
    }
}
