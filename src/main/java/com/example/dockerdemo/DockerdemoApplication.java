package com.example.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@SpringBootApplication
public class DockerdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerdemoApplication.class, args);
    }

    @GetMapping(value = "/user/find")
    @ResponseBody
    public Object findUser(){
        Map<String, String> user = new HashMap<>();
        user.put("name", "zly");
        user.put("certNo", "8888888");
        return user;
    }
}
