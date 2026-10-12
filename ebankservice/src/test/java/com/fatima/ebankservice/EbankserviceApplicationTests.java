package com.fatima.ebankservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

class EbankserviceApplicationTests {

 public static void main(String[] args) {
        SpringApplication.run(EbankserviceApplication.class, args);
    }
}
