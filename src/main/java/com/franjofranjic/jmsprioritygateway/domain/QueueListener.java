package com.franjofranjic.jmsprioritygateway.domain;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueListener {

    @JmsListener(destination = "${spring.activemq.queue.highPriority}", containerFactory = "jmsListenerContainerFactory")
    public void listenHighPriority(String message) {
        System.out.println("Received message from highPriority: " + message);
    }
}
