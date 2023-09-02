package com.example.messagingstompwebsocket;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login/")
public class LoginController  {
    LoginController(){
        System.out.println("Hello");
    }

    @PostMapping
    public Object createUser(@RequestBody User user)
  {
    System.out.println(user.username);
    if(user.username.equals("helo") && user.password.equals("123")){
      Map<String, Object> object = new HashMap<>();

      object.put("status", true);
      object.put("username", user.username);
      object.put("date", user.password);
      return object;
    }
    Map<String, Object> object = new HashMap<>();

    object.put("status", false);
    object.put("username", "");
    object.put("date", "");
    return object;
    }
}