package shadow.study.ribbonconsumer.Service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import shadow.study.ribbonconsumer.Service.EurekaRibbonService;

@Service
public class EurekaRibbonServiceImpl implements EurekaRibbonService {

    @Autowired
    public RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getInfoFailure")
    @Override
    public String getInfo() {
        String message;
        try {
            System.out.println("调用SUB-PROVIDER服务 EUREKA-CLIENT/sub/hello");
            message = restTemplate.getForObject("http://SUB-PROVIDER/sub/hello", String.class);
            System.out.println("服务SUB-PROVIDER服务 EUREKA-CLIENT/sub/hello : " + message);
            System.out.println("调用SUB-PROVIDER服务 EUREKA-CLIENT/sub/hello成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            message = ex.getMessage();
        }
        return message;
    }

    public String getInfoFailure() {
        return "网络繁忙，请稍后再试";
    }
}
