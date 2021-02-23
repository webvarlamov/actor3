package com.actor3.actor3.controller;
import com.actor3.actor3.entity.User;
import com.actor3.actor3.model.auth.LoginForm;
import com.actor3.actor3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    UserService userService;

    @PostMapping ("/registration")
    public boolean registration(@RequestBody LoginForm loginForm) {
        User user = new User();
        user.setPassword(loginForm.getPassword());
        user.setUsername(loginForm.getUsername());

        return userService.registerNewUser(user);
    }
}
