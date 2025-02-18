package com.oreilly.springboot.mytodoapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    //http://localhost:8080/login?name=XYZ
    @RequestMapping("login")
    public String goToLogin(){
        return "login";
    }
}
