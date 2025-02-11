package com.oreilly.springboot.mytodoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @GetMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! Have a good day ahead";
    }
}
