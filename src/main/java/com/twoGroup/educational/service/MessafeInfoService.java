package com.twoGroup.educational.service;

import com.twoGroup.educational.entities.MessafeInfo;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
public interface MessafeInfoService extends IService<MessafeInfo> {
    public List<MessafeInfo> selectAllMessage();    //查询所有信息

    public List<MessafeInfo> selectLikeMessage(String telephone);       //模糊查询短信

}
