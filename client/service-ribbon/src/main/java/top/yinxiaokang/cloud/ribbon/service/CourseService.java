package top.yinxiaokang.cloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CourseService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "infoError")
    public String info() {
        return restTemplate.getForObject("http://course//info", String.class);
    }

    public String infoError() {
        return "course info error from ribbon";
    }
}
