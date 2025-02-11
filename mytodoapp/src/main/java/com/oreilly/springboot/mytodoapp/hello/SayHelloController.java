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
    @GetMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>");
        sb.append("My First HTML page");
        sb.append("</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("Welcome to my First Hard-coded HTML page. Wish me luck");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
}
