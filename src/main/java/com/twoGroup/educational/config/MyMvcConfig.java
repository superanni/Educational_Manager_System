package com.twoGroup.educational.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能
//@EnableWebMvc   不要接管SpringMVC
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    //允许全部请求跨域
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

    //所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean //将组件注册在容器
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {

            //配置所有进入能进入请求的uri
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("index");
                registry.addViewController("index.html").setViewName("index");
	            registry.addViewController("login.html").setViewName("login");
	            /*教务管理*/
                registry.addViewController("developmentManage/saveOrUpdate/saveOrUpdateClassroom.html").setViewName("manager/developmentManage/saveOrUpdate/saveOrUpdateClassroom");
                registry.addViewController("developmentManage/saveOrUpdate/saveOrUpdateGradeClass.html").setViewName("manager/developmentManage/saveOrUpdate/saveOrUpdateGradeClass");
                registry.addViewController("developmentManage/saveOrUpdate/saveOrUpdateGradeTransaction.html").setViewName("manager/developmentManage/saveOrUpdate/saveOrUpdateGradeTransaction");
                registry.addViewController("developmentManage/saveOrUpdate/saveOrUpdateLesson.html").setViewName("manager/developmentManage/saveOrUpdate/saveOrUpdateLesson");
                registry.addViewController("developmentManage/saveOrUpdate/saveOrUpdateLessonTable.html").setViewName("manager/developmentManage/saveOrUpdate/saveOrUpdateLessonTable");
                registry.addViewController("developmentManage/saveOrUpdate/saveOrUpdateListenClassWriteDown.html").setViewName("manager/developmentManage/saveOrUpdate/saveOrUpdateListenClassWriteDown");
                registry.addViewController("developmentManage/saveOrUpdate/saveOrUpdateTeacher.html").setViewName("manager/developmentManage/saveOrUpdate/saveOrUpdateTeacher");

                registry.addViewController("developmentManage/lessonManage.html").setViewName("manager/developmentManage/lessonManage");
                registry.addViewController("developmentManage/classroomManage.html").setViewName("manager/developmentManage/classroomManage");
                registry.addViewController("developmentManage/lessonTable.html").setViewName("manager/developmentManage/lessonTable");
                registry.addViewController("developmentManage/teacherManage.html").setViewName("manager/developmentManage/teacherManage");
                registry.addViewController("developmentManage/gradeclassManage.html").setViewName("manager/developmentManage/gradeclassManage");
                registry.addViewController("developmentManage/gradeclassTransaction.html").setViewName("manager/developmentManage/gradeclassTransaction");
                registry.addViewController("developmentManage/studentEvaluateByMonth.html").setViewName("manager/developmentManage/studentEvaluateByMonth");
                registry.addViewController("developmentManage/studentEvaluateByTerm.html").setViewName("manager/developmentManage/studentEvaluateByTerm");
                registry.addViewController("developmentManage/listenClassWriteDown.html").setViewName("manager/developmentManage/listenClassWriteDown");


	            //学生管理 --> 班主任评价
	            registry.addViewController("studentManager/communicateInfo.html").setViewName("manager/studentManager/communicateInfo");
	            registry.addViewController("studentManager/saveOrUpdate/saveOrUpdateCommunicate.html").setViewName("manager/studentManager/saveOrUpdate/saveOrUpdateCommunicate");

                //      --> 期末成绩
                registry.addViewController("studentManager/studentWriteGradeInfo.html").setViewName("manager/studentManager/studentWriteGradeInfo");
                registry.addViewController("studentManager/saveOrUpdate/saveOrUpdateStudentWriteGrade.html").setViewName("manager/studentManager/saveOrUpdate/saveOrUpdateStudentWriteGrade");

                //     -->考勤管理
                registry.addViewController("studentManager/attendanceInfo.html").setViewName("manager/studentManager/attendanceInfo");
                registry.addViewController("studentManager/saveOrUpdate/saveOrUpdateAttendance.html").setViewName("manager/studentManager/saveOrUpdate/saveOrUpdateAttendance");



	               /* 教务活动*/
	            registry.addViewController("teachActiviti/saveOrUpdate/saveOrUpdateAcitiviti.html").setViewName("manager/teachActiviti/saveOrUpdate/saveOrUpdateAcitiviti");

	            registry.addViewController("teachActiviti/activitiManage.html").setViewName("manager/teachActiviti/activitiManage");

	            /* 图表分析*/

	            registry.addViewController("dataAndStatistics/student_bootm.html").setViewName("manager/dataAndStatistics/student_bootm");

	            registry.addViewController("dataAndStatistics/teacher_bootm.html").setViewName("manager/dataAndStatistics/teacher_bootm");

	            /*文件上传下载*/
	            registry.addViewController("fileUpload/saveOrUpdate/saveOrUpdateFileUpload.html").setViewName("manager/fileUpload/saveOrUpdate/saveOrUpdateFileUpload");

	            registry.addViewController("fileUpload/fileUploadManage.html").setViewName("manager/fileUpload/fileUploadManage");

            //	            信息通知
                registry.addViewController("InforManager/templateManage").setViewName("manager/InformManager/templateManage");
                registry.addViewController("InforManager/messafeinfoManage").setViewName("manager/InformManager/messafeinfoManage");
                registry.addViewController("InformManager/saveOrUpdate").setViewName("manager/InformManager/saveOrUpdate/saveOrUpdateMessafeinfo.html");


            }

            //注册拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //静态资源；  *.css , *.js
                //SpringBoot已经做好了静态资源映射
                /*registry.addInterceptor(new ErrorPageHandlerInterceptor(accModuleMoreMapper)).excludePathPatterns("/static/**","/user/loginOut");
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/index.html","/","/user/login");
                super.addInterceptors(registry);*/
            }
        };
        return adapter;
    }

    /*国际化*/
    /*@Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }*/


}
