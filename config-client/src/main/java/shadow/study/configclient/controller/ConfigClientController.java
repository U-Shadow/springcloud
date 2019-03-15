package shadow.study.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConfigClientController {

    @Value("${info}")
    private String info;

    /**
     * 提供的一个restful服务
     *
     * @return 返回  配置中的info信息
     */
    @RequestMapping("/info")
    public String info() {
        return info;
    }
}
