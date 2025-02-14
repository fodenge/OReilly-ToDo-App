package com.oreilly.springboot.mytodoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    //http://localhost:8080/login?name=XYZ
    @RequestMapping("login")
    public String goToLogin(@RequestParam String name, Model model){
        System.out.println(model.addAttribute("name",name));
        System.out.println("Request param is " + name);
        return "login";
    }
}
