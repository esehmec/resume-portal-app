package com.esehmec.resumeportalapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ResumePortalAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumePortalAppApplication.class, args);
    }


}
