package com.twoGroup.educational.commonUtils;

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

    /*一个对象的数据封装*/
    public static String oneObjDataUtil(Map map,String name,Object object){
        map.put("status",0);
        map.put(name, object);
        return JSON.toJSONString(map);
    }

    /*redis缓存的数据封装*/
    public static void redisDataUtil(Map map,List list,int currentPage,int pageSize){
        map.put("status",0);
        map.put("currentPage",currentPage);
        map.put("total",list.size());
        map.put("totalPage",list.size()%pageSize==0?list.size()/pageSize:list.size()/pageSize+1);
    }
}
