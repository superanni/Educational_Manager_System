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
public class TemplateInfo extends Model<TemplateInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "template_id", type = IdType.AUTO)
    private Integer templateId;
    private String templateTitle;
    private String templateContent;
    private String templateType;


    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getTemplateTitle() {
        return templateTitle;
    }

    public void setTemplateTitle(String templateTitle) {
        this.templateTitle = templateTitle;
    }

    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    @Override
    protected Serializable pkVal() {
        return this.templateId;
    }

    @Override
    public String toString() {
        return "TemplateInfo{" +
        ", templateId=" + templateId +
        ", templateTitle=" + templateTitle +
        ", templateContent=" + templateContent +
        ", templateType=" + templateType +
        "}";
    }
}
