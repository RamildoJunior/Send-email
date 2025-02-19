package com.ms.email.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;

@Configuration
public class RabbitMQConfig {

    @Value("${broker.queue.eamil.name}")
    private String queue;

    @Bean
    public Queue queue(){
        return new Queue(queue, true)
    }

}
