package com.yaojiafeng.spring.boot.web;

import com.google.common.util.concurrent.RateLimiter;
import org.junit.Test;

/**
 * @author yaojiafeng
 * @create 2018-02-02 下午5:21
 */
public class RateLimiterTests {
    @Test
    public void test() {
        RateLimiter limiter = RateLimiter.create(2.0);
        //批量调用
        for (int i = 0; i < 10; i++) {

            double acquire = limiter.acquire();
        }

    }
}
