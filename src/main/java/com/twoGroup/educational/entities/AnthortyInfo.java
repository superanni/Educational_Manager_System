package com.twoGroup.educational.entities;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@TableName("anthorty_info")
public class AnthortyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "anthorty_id", type = IdType.AUTO)
    private Integer anthortyId;
    @TableField("anthorty_pid")
    private Integer anthortyPid;
    @TableField("anthorty_name")
    private String anthortyName;
    @TableField("anthorty_desc")
    private String anthortyDesc;
    @TableField("anthorty_url")
    private String anthortyUrl;


    public Integer getAnthortyId() {
        return anthortyId;
    }

    public void setAnthortyId(Integer anthortyId) {
        this.anthortyId = anthortyId;
    }

    public Integer getAnthortyPid() {
        return anthortyPid;
    }

    public void setAnthortyPid(Integer anthortyPid) {
        this.anthortyPid = anthortyPid;
    }

    public String getAnthortyName() {
        return anthortyName;
    }

    public void setAnthortyName(String anthortyName) {
        this.anthortyName = anthortyName;
    }

    public String getAnthortyDesc() {
        return anthortyDesc;
    }

    public void setAnthortyDesc(String anthortyDesc) {
        this.anthortyDesc = anthortyDesc;
    }

    public String getAnthortyUrl() {
        return anthortyUrl;
    }

    public void setAnthortyUrl(String anthortyUrl) {
        this.anthortyUrl = anthortyUrl;
    }

    @Override
    public String toString() {
        return "AnthortyInfo{" +
        "anthortyId=" + anthortyId +
        ", anthortyPid=" + anthortyPid +
        ", anthortyName=" + anthortyName +
        ", anthortyDesc=" + anthortyDesc +
        ", anthortyUrl=" + anthortyUrl +
        "}";
    }
}
