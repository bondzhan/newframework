package com.xingyun.bigdream.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author Bond
 * @Date 2024/12/25
 * @Description TODO
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.xingyun.bigdream.product"})
@EnableFeignClients(basePackages = {"com.xingyun.bigdream.product.api"})
public class NewFrameworkApp {

    public static void main(String[] args) {
        SpringApplication.run(NewFrameworkApp.class, args);
    }
}
