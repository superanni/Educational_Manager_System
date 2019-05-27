package com.twoGroup.educational.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.twoGroup.educational.entities.StaffInfo;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
public interface StaffInfoService extends IService<StaffInfo> {
    List<StaffInfo> selectListVo();
}
