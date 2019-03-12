package shadow.study.feignconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shadow.study.feignconsumer.service.FeignService;

@RestController
@RequestMapping("feign-consumer")
public class FeignController {

    @Autowired
    public FeignService feignService;

    @GetMapping("getInfo")
    public String getInfo() {
        String message = feignService.getInfo();
        return message;
    }
}
