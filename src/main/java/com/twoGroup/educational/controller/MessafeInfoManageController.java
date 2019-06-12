package com.twoGroup.educational.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.commonUtils.DataTransUtil;
import com.twoGroup.educational.commonUtils.RedisUtils;
import com.twoGroup.educational.entities.MessafeInfo;
import com.twoGroup.educational.entities.StaffInfo;
import com.twoGroup.educational.entities.TemplateInfo;
import com.twoGroup.educational.service.MessafeInfoService;
import com.twoGroup.educational.service.TemplateInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;
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
    @Autowired
    RedisUtils redisUtils;
    @Autowired
    private TemplateInfoService templateInfoService;


    private List<MessafeInfo> messafeInfos;
    private MessafeInfo messafeInfo;
    private List<TemplateInfo> templateInfos;
    private Wrapper<TemplateInfo> wrapper;                  //用于封装查询条件

    //获取当前页数据
    @GetMapping("/messageCurrentList/{currentPage}")
    public @ResponseBody
    String messageCurrentList(Map<String, Object> map, @PathVariable Integer currentPage) {
        logger.info("get in messageCurrentList ===>" + currentPage);
        messafeInfos = (List<MessafeInfo>) redisUtils.get("messafeInfos");
        if (null == messafeInfos) {
            synchronized (this) {
                if (null == messafeInfos) {
                    messafeInfos = messafeInfoService.selectAllMessage();
                    redisUtils.set("messafeInfos", messafeInfos);
                }
            }
        }
        DataTransUtil.redisDataUtil(map, messafeInfos, currentPage, 5);
        messafeInfos = (List<MessafeInfo>) redisUtils.selectByPage("messafeInfos", currentPage, 5);
        if (null != messafeInfos) {
            map.put("list", messafeInfos);
            return JSON.toJSONString(map);
        }

        return "false";
    }


    //搜索数据
    @PostMapping("/messageLikeList")
    public @ResponseBody
    String messageLikeList(Map<String, Object> map, String telephone) {
        logger.info("get in messageLikeList ===>" + telephone);
        /* PageHelper.startPage(1, 5);*/
        messafeInfos = messafeInfoService.selectLikeMessage(telephone);
        if (null != messafeInfos) {
            redisUtils.set("messafeInfos", messafeInfos);
            DataTransUtil.redisDataUtil(map, messafeInfos, 1, 5);
            messafeInfos = (List<MessafeInfo>) redisUtils.selectByPage("messafeInfos", 1, 5);
            map.put("list", messafeInfos);
            return JSON.toJSONString(map);
        }
        return "false";
    }

    //删除短信
    @DeleteMapping("/deleteMessage/{id}")
    public @ResponseBody
    String deleteMessage(@PathVariable Integer id) {
        logger.info("get in deleteMessage ===>" + id);
        if (messafeInfoService.deleteById(id)) {
            redisUtils.delete("messafeInfos");
            return "true";
        } else
            return "false";
    }

    //获取模板list
    @GetMapping("/getTemplateList")
    public @ResponseBody
    String getTemplateList(Map<String, Object> map) {
        logger.info("*******************getTemplateList*************");
        templateInfos = (List<TemplateInfo>) redisUtils.get("templateInfos");
        if (null == templateInfos) {
            templateInfos = templateInfoService.selectList(null);
            redisUtils.set("templateInfos", templateInfos);
        }
        map.put("list", templateInfos);
        return JSON.toJSONString(map);
    }

    //保存短息信息
    @PostMapping("/saveMessage")
    public @ResponseBody  String saveMessage(Map<String, Object> map, MessafeInfo messafeInfo, HttpSession session) {
        logger.info(" saveMessage " + messafeInfo);
        /*StaffInfo staffInfo = (StaffInfo) session.getAttribute("loginUser");
        messafeInfo.setStaffId(staffInfo.getStaffId());*/
        messafeInfo.setStaffId(10);
        if (messafeInfoService.insert(messafeInfo)){
            redisUtils.delete("messafeInfos");
            return "true";
        }else {
            return  "false";
        }

    }


}

