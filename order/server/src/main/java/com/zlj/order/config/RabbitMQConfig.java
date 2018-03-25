package com.zlj.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.Queue;

/**
 * Created by 张璐杰
 * 2018/3/24 13:47
 */
@Configuration
public class RabbitMQConfig {

    public static final String queueName = "spring-boot";
    public static final String exchangeName = "spring-boot-exchange";
    public static final String exchange = "myOrder";
    public static final String key = "computer";
    public static final String value = "computerOrder";
    public static final String key2 = "fruit";
    public static final String value2 = "fruitOrder";

}
