package top.yinxiaokang.cloud.feign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("course")
public interface CourseFeign {

    @GetMapping(value = "/info")
    String info();
}
