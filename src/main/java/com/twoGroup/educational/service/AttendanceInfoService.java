package com.twoGroup.educational.service;

import com.twoGroup.educational.entities.AttendanceInfo;
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
public interface AttendanceInfoService extends IService<AttendanceInfo> {
    List<AttendanceInfo> listAttendanceLike(AttendanceInfo attendanceInfo,String studentName);
}
