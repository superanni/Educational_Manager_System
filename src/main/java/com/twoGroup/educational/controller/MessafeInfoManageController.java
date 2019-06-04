package com.twoGroup.educational.controller;


import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.commonUtils.DataTransUtil;
import com.twoGroup.educational.entities.MessafeInfo;
import com.twoGroup.educational.entities.TemplateInfo;
import com.twoGroup.educational.service.MessafeInfoService;
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
@RequestMapping("/messafeInfo")
public class MessafeInfoManageController {
    private Logger logger = LoggerFactory.getLogger(MessafeInfoManageController.class);

    private String locationURI = "manager/InformManager/saveOrUpdate";      //跳转路径前缀

    @Autowired
    private MessafeInfoService messafeInfoService;              //注入service

    private List<MessafeInfo> messafeInfos;
    private MessafeInfo messafeInfo;

    private Wrapper<TemplateInfo> wrapper;                  //用于封装查询条件

    //获取当前页数据
    @GetMapping("/messageCurrentList/{currentPage}")
    public @ResponseBody
    String messageCurrentList(Map<String, Object> map, @PathVariable Integer currentPage, String telephone) {
        logger.info("get in messageCurrentList ===>" + currentPage);
        PageHelper.startPage(currentPage, 5);
        if (telephone != null && !"".equals(telephone))             //当电话号码不为空时为模糊查询翻页
            messafeInfos = messafeInfoService.selectLikeMessage(telephone);
        else
            messafeInfos = messafeInfoService.selectAllMessage();           //查出所有短信
        return DataTransUtil.dataUtil(map, messafeInfos);
    }


    //搜索数据
    @PostMapping("/messageLikeList")
    public @ResponseBody
    String messageLikeList(Map<String, Object> map, String telephone) {
        logger.info("get in messageLikeList ===>" + telephone);
        PageHelper.startPage(1, 5);
        messafeInfos = messafeInfoService.selectLikeMessage(telephone);
        return DataTransUtil.dataUtil(map, messafeInfos);
    }

    @DeleteMapping("/deleteMessage/{id}")
    public @ResponseBody String deleteMessage(@PathVariable Integer id) {
        logger.info("get in deleteMessage ===>" + id);
        if (messafeInfoService.deleteById(id))
            return "true";
        else
            return "false";
    }


}

