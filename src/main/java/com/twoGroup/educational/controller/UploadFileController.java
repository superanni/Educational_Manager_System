package com.twoGroup.educational.controller;import com.baomidou.mybatisplus.mapper.EntityWrapper;import com.baomidou.mybatisplus.mapper.Wrapper;import com.github.pagehelper.PageHelper;import com.twoGroup.educational.commonUtils.DataTransUtil;import com.twoGroup.educational.entities.UploadFile;import com.twoGroup.educational.entities.ClassroomInfo;import com.twoGroup.educational.entities.UploadFile;import com.twoGroup.educational.entities.UploadFile;import com.twoGroup.educational.service.UploadFileService;import org.apache.tomcat.jni.FileInfo;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.*;import org.springframework.web.multipart.MultipartFile;import javax.servlet.http.HttpServletRequest;import java.io.File;import java.io.IOException;import java.util.Date;import java.util.HashMap;import java.util.List;import java.util.Map;/** * @author ：lisson * @date ：Created in 2019/6/3/ 8:15 * @Created * 文件上传下载 */@RestController@RequestMapping("uploadFile")public class UploadFileController {	private Logger logger = LoggerFactory.getLogger(DisciplineInfoManageController.class);		/**	 * 显示文件列表	 */	/*文件数据列表接口*/	@Autowired	UploadFileService uploadFileService;	/*所有文件列表*/    private List<UploadFile> uploadFiles;    /*文件信息*/    private  UploadFile uploadFile;    //文件上传路径	private static final String folder =		    "Educational_Manager_System\\src\\main\\resources\\static\\Upload_file";	/**	 * 分页查询所有课程信息,	 */	@GetMapping("uploadfileCurrentList/{currentPage}")	public @ResponseBody String uploadfileCurrentList(Map map, @PathVariable int currentPage) {		System.out.println("get 文件 list"+currentPage);		//每页显示五行数据		PageHelper.startPage(currentPage, 5);		//获取数据		uploadFiles = uploadFileService.selectList();		if (uploadFiles==null) {			return "false";		}else{			//数据绑定			return DataTransUtil.dataUtil(map, uploadFiles);		}	}	/**	 * 条件查询 文件信息	 */	@PostMapping("listUploadFileLike")	public @ResponseBody String listUploadFileLike(Map<String,Object> map,int currentPage , UploadFile uploadFile){		//判断有无条件		//每页显示五行数据		PageHelper.startPage(currentPage, 5);		System.out.println(uploadFile.getFileTitle());		//判断有无条件		if (!"".equals(uploadFile.getFileTitle())) {			uploadFiles=uploadFileService.selectListLike(uploadFile.getFileTitle());		}else {			uploadFiles=uploadFileService.selectList();	  }		if (uploadFiles != null) {			//数据绑定			return DataTransUtil.dataUtil(map, uploadFiles);		}		return "false";	}	/**	 * 添加上传文件	 */	@PostMapping("saveUploadFile")	public @ResponseBody String saveUploadFile(HttpServletRequest request, @RequestParam("fileName") MultipartFile file, UploadFile uploadFile) throws IOException {		boolean b=false;		if (uploadFileService.selectOne(new EntityWrapper<UploadFile>()				.eq("file_name",uploadFile.getFileName()))==null) {            //打印获取文件数据			System.out.println("file name=" + file.getName());			System.out.println("origin file name=" + file.getOriginalFilename());			System.out.println("file size=" + file.getSize());              //文件数据插入数据表			b = uploadFileService.insert(uploadFile);		   }				if (b==true){					return "true";				}else {					return "false";				}	}	/**	 * 删除文件信息	 */	@DeleteMapping("deleteUploadFile/{fileId}")	public @ResponseBody String deleteUploadFile(@PathVariable String fileId) {		try {			boolean b = uploadFileService.deleteById(Integer.parseInt(fileId));			if (b == false) {				return "false";			}			return "true";		} catch (Exception e) {			return "false";		}	}}