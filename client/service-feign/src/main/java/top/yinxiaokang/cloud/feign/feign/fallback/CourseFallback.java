package top.yinxiaokang.cloud.feign.feign.fallback;

import org.springframework.stereotype.Component;
import top.yinxiaokang.cloud.feign.feign.CourseFeign;

@Component
public class CourseFallback implements CourseFeign {
    @Override
    public String info() {
        return "course info error from feign";
    }
}
