package com.twoGroup.educational.mapper;
import com.twoGroup.educational.entities.UploadFile;
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
public interface UploadFileMapper extends BaseMapper<UploadFile> {

	List<UploadFile> selectLinkList(); //连接查询所有文件信息信息

	//根据文件标题查询文件信息
	List<UploadFile> selectListLike(@Param("fileTitle") String fileTitle);

}
