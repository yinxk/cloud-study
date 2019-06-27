package top.yinxiaokang.cloud.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.yinxiaokang.cloud.feign.feign.CourseFeign;

@RestController
@RequestMapping("/course")
public class CourseContr {
    @Autowired
    private CourseFeign courseFeign;

    public String info() {
        return courseFeign.info();
    }
}
