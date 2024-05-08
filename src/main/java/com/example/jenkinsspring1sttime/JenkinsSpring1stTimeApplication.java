package com.example.jenkinsspring1sttime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsSpring1stTimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsSpring1stTimeApplication.class, args);
    }


    @GetMapping
    public String get(){
        return "elo";
    }

}
