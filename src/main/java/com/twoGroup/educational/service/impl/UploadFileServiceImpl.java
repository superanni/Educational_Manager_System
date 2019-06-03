package com.twoGroup.educational.service.impl;

import com.twoGroup.educational.entities.UploadFile;
import com.twoGroup.educational.mapper.UploadFileMapper;
import com.twoGroup.educational.service.UploadFileService;
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
public class UploadFileServiceImpl extends ServiceImpl<UploadFileMapper, UploadFile> implements UploadFileService {
  @Autowired
  private UploadFileMapper uploadFileMapper;

	//连接查询所有班级信息
	@Override
	public List<UploadFile> selectList() {
		return uploadFileMapper.selectLinkList();
	}

	//根据班级名称查询班级信息
	@Override
	public List<UploadFile> selectListLike(String fileTitle) {
		return uploadFileMapper.selectListLike(fileTitle);
	}

}
