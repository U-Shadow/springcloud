package shadow.study.subscribeprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sub")
public class DemoController {

    @GetMapping("hello")
    public String hello() {
        System.out.println("欢迎进入订阅服务----测试");
        return "Hellp subscribe provider!";
    }
}
