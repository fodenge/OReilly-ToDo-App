package com.oreilly.springboot.mytodoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        boolean isValidUsername = username.equalsIgnoreCase("user");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");
        return isValidUsername && isValidPassword;
    }
}
