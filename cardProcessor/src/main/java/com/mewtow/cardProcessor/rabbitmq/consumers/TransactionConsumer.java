package com.mewtow.cardProcessor.rabbitmq.consumers;

import com.mewtow.cardProcessor.model.Installment;
import com.mewtow.cardProcessor.model.Person;
import com.mewtow.cardProcessor.model.Transaction;
import com.mewtow.cardProcessor.repository.InstallmentRepository;
import com.mewtow.cardProcessor.repository.PersonRepository;
import com.mewtow.cardProcessor.repository.TransactionRepository;
import lombok.extern.log4j.Log4j2;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.rabbitmq.constants.RabbitMQConstants.RK_TRANSACTION;

@Log4j2
@Component
public class TransactionConsumer {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private InstallmentRepository installmentRepository;
    @Autowired
    private TransactionRepository transactionRepository;

    @RabbitListener(queues = {RK_TRANSACTION})
    public void consumer(String message) { log.info(message.toString()); }
}
