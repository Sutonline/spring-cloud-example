package cn.kevin.spring.boot.cloud.feign.service.hystric;

import cn.kevin.spring.boot.cloud.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Schedual Service Hi Hystric
 * Created by yongkang.zhang on 2017/8/2.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "Hi, " + name + ", sorry, sorry";
    }
}
