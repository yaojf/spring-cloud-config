package com.yaojiafeng.spring.boot.noweb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;

/**
 * 非web工程，运行完jvm实例就结束
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
