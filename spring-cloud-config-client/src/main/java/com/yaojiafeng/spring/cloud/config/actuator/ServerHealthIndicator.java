package com.yaojiafeng.spring.cloud.config.actuator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * actuator健康指示器，每刷新一次执行一次
 * 自定义设置up、down以及详细信息
 *
 * http://localhost:8080/health
 *
 * @author yaojiafeng
 * @create 2017-10-30 上午11:28
 */
@Component
public class ServerHealthIndicator extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up().withDetail("date", LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
