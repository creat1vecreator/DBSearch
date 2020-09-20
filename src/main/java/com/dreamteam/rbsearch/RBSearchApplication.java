package com.dreamteam.rbsearch;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RBSearchApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(RBSearchApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
