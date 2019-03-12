package shadow.study.feignconsumer.service.fallback;

import org.springframework.stereotype.Service;
import shadow.study.feignconsumer.service.FeignService;

@Service
public class FeignServerFallback implements FeignService {
    @Override
    public String getInfo() {
        System.out.println("Feign Hystrix 熔断措施!");
        return "网络繁忙，请稍后再试!";
    }
}
