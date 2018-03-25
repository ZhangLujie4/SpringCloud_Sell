package com.zlj.order.message;

import com.zlj.order.config.RabbitMQConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 接收mq消息
 * Created by 张璐杰
 * 2018/3/24 9:39
 */
@Slf4j
@Component
public class MqReceiver {

    // 1. @RabbitListener(queues = "myQueue")
    // 2. 自动创建队列 @RabbitListener(queuesToDeclare = @Queue("myQueue"))
    // 3. exchange和queue绑定
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(RabbitMQConfig.queueName),
            exchange = @Exchange(RabbitMQConfig.exchangeName)
    ))
    public void process(String message) {
        log.info("MqReciver {}" , message);
    }

    /**
     * 数码供应商服务 消息接收方
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(RabbitMQConfig.exchange),
            key = RabbitMQConfig.key,
            value = @Queue(RabbitMQConfig.value)
    ))
    public void processComputer(String message) {
        log.info("computer MqReciver: {}" , message);
    }

    /**
     * 水果供应商服务 消息接收方
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(RabbitMQConfig.exchange),
            key = RabbitMQConfig.key2,
            value = @Queue(RabbitMQConfig.value2)
    ))
    public void processFruit(String message) {
        log.info("fruit MqReciver: {}" , message);
    }

}
