package com.franjofranjic.jmsprioritygateway.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class DispatchService {

    @Autowired
    JmsTemplate jmsTemplate;;

    @Value("${spring.activemq.queue.highPriority}")
    String jmsQueue;

    public void sendMessage(String message) {
        jmsTemplate.convertAndSend(jmsQueue,message);
    }
}
