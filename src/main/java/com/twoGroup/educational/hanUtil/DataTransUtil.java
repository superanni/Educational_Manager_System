package com.twoGroup.educational.hanUtil;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public class DataTransUtil {

    /*封装数据*/
    public static String  dataUtil(Map map,List list){
        PageInfo pageInfo=new PageInfo(list);
        map.put("status",0);
        map.put("list", list);
        map.put("currentPage",pageInfo.getPageNum());
        map.put("total",pageInfo.getTotal());
        map.put("totalPage",pageInfo.getPages());

        return JSON.toJSONString(map);
    }
}
