package top.yinxiaokang.cloud.course.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController extends BaseController {

    @Value("${server.port}")
    String port;
    @RequestMapping
    public String say() {
        return "课程信息有: 语文 , 数学, 英语, C++ , C , 来自于: " + port;
    }


}
