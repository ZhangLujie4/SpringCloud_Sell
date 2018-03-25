package com.zlj.order;

import com.zlj.order.config.RabbitMQConfig;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 发送mq消息测试
 * Created by 张璐杰
 * 2018/3/24 9:43
 */
@Component
public class MqSenderTest extends OrderApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send() {
        amqpTemplate.convertAndSend(RabbitMQConfig.queueName, "now " + new Date());
    }

    @Test
    public void sendOrder() {
        amqpTemplate.convertAndSend(RabbitMQConfig.exchange,
                RabbitMQConfig.key, "now " + new Date());
    }
}
