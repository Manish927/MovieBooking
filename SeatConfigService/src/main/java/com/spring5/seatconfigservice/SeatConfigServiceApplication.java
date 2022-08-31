package com.spring5.seatconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SeatConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeatConfigServiceApplication.class, args);
    }

}
