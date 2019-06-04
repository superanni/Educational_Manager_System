package com.twoGroup.educational.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.twoGroup.educational.entities.*;
import com.baomidou.mybatisplus.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Service
public interface UploadFileService extends IService<UploadFile> {

	//连接查询所有文件信息
	public List<UploadFile> selectList();

	//根据班级名称查询班级信息
	List<UploadFile> selectListLike(String fileTitle);

}
