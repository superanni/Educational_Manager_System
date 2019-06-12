package com.twoGroup.educational.service;

import com.twoGroup.educational.entities.CommunicateInfo;
import com.baomidou.mybatisplus.service.IService;
import com.twoGroup.educational.entities.StudentInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
public interface CommunicateInfoService extends IService<CommunicateInfo> {
    List<CommunicateInfo> listCommunicateLike(StudentInfo studentInfo);
}
