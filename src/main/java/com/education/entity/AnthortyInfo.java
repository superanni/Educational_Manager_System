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
public class AnthortyInfo extends Model<AnthortyInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "anthorty_id", type = IdType.AUTO)
    private Integer anthortyId;
    private Integer anthortyPid;
    private String anthortyName;
    private String anthortyDesc;
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
    protected Serializable pkVal() {
        return this.anthortyId;
    }

    @Override
    public String toString() {
        return "AnthortyInfo{" +
        ", anthortyId=" + anthortyId +
        ", anthortyPid=" + anthortyPid +
        ", anthortyName=" + anthortyName +
        ", anthortyDesc=" + anthortyDesc +
        ", anthortyUrl=" + anthortyUrl +
        "}";
    }
}
