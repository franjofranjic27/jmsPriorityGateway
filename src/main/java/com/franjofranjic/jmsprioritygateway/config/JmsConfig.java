package com.franjofranjic.jmsprioritygateway.config;

import jakarta.jms.ConnectionFactory;
import jakarta.jms.JMSException;
import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.connection.CachingConnectionFactory;

@Configuration
@EnableJms
public class JmsConfig {

//    @Value("${spring.jms.broker-url:tcp://localhost:61616}")  // Use default from application.yml or override
//    private String brokerUrl;
//
//    @Value("${spring.jms.user:admin}")  // Optional: Username for Artemis
//    private String user;
//
//    @Value("${spring.jms.password:admin}")  // Optional: Password for Artemis
//    private String password;
//
//    @Bean
//    @Profile("local")  // Profile-specific bean for local development
//    public CachingConnectionFactory activeMqConnectionFactory() throws JMSException {
//        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
//        activeMQConnectionFactory.setBrokerURL(brokerUrl);
//        activeMQConnectionFactory.setUser(user);  // Set the Artemis user
//        activeMQConnectionFactory.setPassword(password);  // Set the Artemis password
//
//        return new CachingConnectionFactory(activeMQConnectionFactory);
//    }
//
//    @Bean
//    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory(ConnectionFactory connectionFactory) {
//        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//        factory.setConnectionFactory(connectionFactory);
//        factory.setConcurrency("3-10");
//        return factory;
//    }
}