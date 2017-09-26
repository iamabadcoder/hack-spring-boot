package com.hackx;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class HackSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HackSpringBootApplication.class, args);
    }
}
