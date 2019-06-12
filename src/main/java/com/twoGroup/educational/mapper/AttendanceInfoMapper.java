package com.twoGroup.educational.mapper;

import com.twoGroup.educational.entities.AttendanceInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
public interface AttendanceInfoMapper extends BaseMapper<AttendanceInfo> {
    List<AttendanceInfo> listAttendanceLike(@Param("attendanceXuenian") String attendanceXuenian,
                                            @Param("attendanceXueqi") String attendanceXueqi,
                                            @Param("attendanceMonth") String attendanceMonth,
                                            @Param("attendanceState") String attendanceState,
                                            @Param("studentName") String studentName);
}
