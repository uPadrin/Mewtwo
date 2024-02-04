package com.mewtow.cardProcessor.rabbitmq.consumers;

import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static org.rabbitmq.constants.RabbitMQConstants.RK_TRANSACTION;

@Log4j2
@Component
public class TransactionConsumer {

    @RabbitListener(queues = {RK_TRANSACTION})
    public void consumer(String message) {
        log.info("Receveid message " + message);
    }
}
