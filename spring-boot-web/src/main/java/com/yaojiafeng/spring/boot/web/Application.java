package com.yaojiafeng.spring.boot.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;

/**
 * web工程，运行完jvm实例持续监听状态，不停止
 *
 * Created by yaojiafeng on 2017/6/19 上午11:27.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.err.println(new Date());
    }
}
