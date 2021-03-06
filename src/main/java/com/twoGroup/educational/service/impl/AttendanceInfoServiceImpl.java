package com.twoGroup.educational.service.impl;

import com.twoGroup.educational.entities.AttendanceInfo;
import com.twoGroup.educational.mapper.AttendanceInfoMapper;
import com.twoGroup.educational.service.AttendanceInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Service
public class AttendanceInfoServiceImpl extends ServiceImpl<AttendanceInfoMapper, AttendanceInfo> implements AttendanceInfoService {

    @Autowired
    AttendanceInfoMapper mapper;

    @Override
    public List<AttendanceInfo> listAttendanceLike(AttendanceInfo attendanceInfo, String studentName) {
        return mapper.listAttendanceLike(attendanceInfo.getAttendanceXuenian(),
                attendanceInfo.getAttendanceXueqi(),
                attendanceInfo.getAttendanceMonth(),
                attendanceInfo.getAttendanceState(),
                studentName
        );
    }
}
