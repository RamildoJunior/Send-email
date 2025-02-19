package com.ms.email.consumers;

import com.ms.email.Dtos.EmailRecordDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;

public class EmailConsumer {

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void lisetenEmailQueue(@Payload EmailRecordDto emailRecordDto){
        System.out.println(emailRecordDto.emailTo());
    }
}
