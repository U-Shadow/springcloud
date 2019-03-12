package shadow.study.feignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import shadow.study.feignconsumer.service.fallback.FeignServerFallback;

@FeignClient(value = "sub-provider", fallback = FeignServerFallback.class)
public interface FeignService {

    @RequestMapping(value = "/sub/hello")
    String getInfo();
}
