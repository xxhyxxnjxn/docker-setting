package com.gmc.dockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DockerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerTestApplication.class, args);
        System.out.println("test");
    }

}
