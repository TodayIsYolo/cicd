package com.example.cicdtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class CicdtestApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome!!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(CicdtestApplication.class, args);
    }

}
