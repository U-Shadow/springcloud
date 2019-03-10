package shadow.study.ribbonconsumer.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import shadow.study.ribbonconsumer.Service.EurekaRibbonService;

@Service
public class EurekaRibbonServiceImpl implements EurekaRibbonService {

    @Autowired
    public RestTemplate restTemplate;

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
}
