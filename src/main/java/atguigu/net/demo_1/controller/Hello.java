package atguigu.net.demo_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/con")
public class Hello {
    @RequestMapping("/hello")
    public String hello(){

        return "hello world!!!";

    }
}
