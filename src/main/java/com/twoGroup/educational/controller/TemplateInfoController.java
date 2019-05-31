package com.twoGroup.educational.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.hanUtil.DataTransUtil;
import com.twoGroup.educational.entities.TemplateInfo;
import com.twoGroup.educational.service.TemplateInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 黄武斌
 * @since 2019-05-26
 */
@Controller
@RequestMapping("InforManager")
public class TemplateInfoController {
    private Logger logger = LoggerFactory.getLogger(TemplateInfoController.class);

    @Autowired
    TemplateInfoService templateInfoService;

    private String locationURI = "manager/InformManager";      //跳转路径前缀

    private DataTransUtil dataTransUtil;        //数据传输工具

    private List<TemplateInfo> templateInfos;



    //获取当前页数据
    @GetMapping("tamplateCurrentList/{currentPage}")
    public @ResponseBody
    String TemplateCurrentList(Map<String, Object> map, @PathVariable Integer currentPage) {
        System.out.println("get TemplateCurrentList!");
        PageHelper.startPage(currentPage, 5);        //获取当前页记录,每页5条
        templateInfos = templateInfoService.selectList(null);
        if (templateInfos != null && templateInfos.size() != 0) {
            dataTransUtil = new DataTransUtil();
            dataTransUtil.dataUtil(map, templateInfos);
        } else
            logger.info("查询数据失败");
        return JSON.toJSONString(map);
    }

    @PostMapping("/templateLikeList")
    public @ResponseBody String  templateLikeList(Map<String,Object> map,String templateContent,Integer currentPage){
        System.out.println("get TemplateLikeList!"+templateContent+currentPage);
        Wrapper<TemplateInfo> wrapper =  new EntityWrapper<TemplateInfo>();
        wrapper.like("template_content",templateContent);
        PageHelper.startPage(currentPage, 5);
        templateInfos = templateInfoService.selectList(wrapper);

        if (templateInfos != null && templateInfos.size() != 0) {
            dataTransUtil = new DataTransUtil();
            dataTransUtil.dataUtil(map, templateInfos);
        } else
            logger.info("查询数据失败");
        return JSON.toJSONString(map);
    }

    //删除模板信息
    @DeleteMapping("templateDelete/{templateId}")
    public @ResponseBody  String templateDelete(@PathVariable Integer templateId) {
        logger.info("删除模板信息！");
        try {
            if (templateInfoService.deleteById(templateId))
                return "success";
            else return "fail";
        } catch (Exception e) {
            logger.info("删除模板异常!");
        }
        return "fail";
    }


}

