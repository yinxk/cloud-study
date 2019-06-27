package top.yinxiaokang.cloud.feign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import top.yinxiaokang.cloud.feign.feign.fallback.CourseFallback;

@FeignClient(value = "course", fallback = CourseFallback.class)
public interface CourseFeign {

    @GetMapping(value = "/info")
    String info();
}
