package com.twoGroup.educational.mapper;

import com.twoGroup.educational.entities.StudentInfo;
import com.twoGroup.educational.entities.StudentWriteGrade;
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
public interface StudentWriteGradeMapper extends BaseMapper<StudentWriteGrade> {
    List<StudentWriteGrade> listStudentWriteGradeLike(@Param("writeGradeXuenian") String writeGradeXuenian,
                                                      @Param("writeGradeXueqi") String writeGradeXueqi,
                                                      @Param("classId") Integer classId,
                                                      @Param("disciplineId") Integer disciplineId,
                                                      @Param("studentName") String studentName);
}
