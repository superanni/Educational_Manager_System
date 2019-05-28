package com.twoGroup.educational.dataTransUtil;

import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataTransUtil {

    /*封装数据*/
    public void dataUtil(Map map,List list){
        PageInfo pageInfo=new PageInfo(list);
        map.put("status",0);
        map.put("list", list);
        map.put("currentPage",pageInfo.getPageNum());
        map.put("total",pageInfo.getTotal());
        map.put("totalPage",pageInfo.getPages());
    }
}
