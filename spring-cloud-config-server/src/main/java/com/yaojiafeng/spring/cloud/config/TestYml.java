package com.yaojiafeng.spring.cloud.config;

import org.yaml.snakeyaml.Yaml;

/**
 * @author yaojiafeng
 * @create 2017-07-04 下午4:41
 */
public class TestYml {

    public static void main(String[] args) throws InterruptedException {
        Yaml yaml = new Yaml();
        Object load = yaml.load(TestYml.class.getResourceAsStream("/application.yml"));

        System.out.println(load);
    }
}
