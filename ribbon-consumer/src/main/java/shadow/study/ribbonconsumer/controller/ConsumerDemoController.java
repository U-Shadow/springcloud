package shadow.study.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import shadow.study.ribbonconsumer.Service.EurekaRibbonService;

@RestController
@RequestMapping("/ribbon-consumer")
public class ConsumerDemoController {

    @Autowired
    public EurekaRibbonService eurekaRibbonService;

    @GetMapping("helloConsumer")
    public String helloConsumer() {
        return eurekaRibbonService.getInfo();
    }
}
