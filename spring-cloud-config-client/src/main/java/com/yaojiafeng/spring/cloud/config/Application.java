package com.yaojiafeng.spring.cloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaojiafeng on 2017/6/19 上午11:27.
 */
@SpringBootApplication
@RestController
public class Application {

    @Value("${democonfigclient.message:World!}")
    String bar;

    @RequestMapping("/")
    String hello() {
        return "Hello " + bar + "!";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        Object properties = applicationContext.getBean("myAutoConfiguration");

        System.out.println(properties);
    }
}
