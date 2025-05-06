package com.oreilly.springboot.mytodoapp.login;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    @Autowired
    private AuthenticationService authenticationService;
    // private Logger logger = LoggerFactory.getLogger(getClass());

    //http://localhost:8080/login?name=XYZ
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goToLogin(){
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, Model model){
        if (authenticationService.authenticate(name, password)){
            model.addAttribute("name", name);
            model.addAttribute("password",password);
            return "welcome";
        }
        model.addAttribute("errorMessage","Invalid Credentials! Please try again.");
        return "login";
    }
}
