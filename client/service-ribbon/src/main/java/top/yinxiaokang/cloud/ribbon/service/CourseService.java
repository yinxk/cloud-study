package top.yinxiaokang.cloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CourseService {

    @Autowired
    private RestTemplate restTemplate;

    public String info() {
        return restTemplate.getForObject("http://course//info", String.class);
    }
}
