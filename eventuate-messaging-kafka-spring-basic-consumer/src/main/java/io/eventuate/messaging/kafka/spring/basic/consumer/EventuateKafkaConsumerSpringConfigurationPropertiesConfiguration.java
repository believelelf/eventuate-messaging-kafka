package io.eventuate.messaging.kafka.spring.basic.consumer;

import io.eventuate.messaging.kafka.basic.consumer.EventuateKafkaConsumerConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * kafka消费
 */
@EnableConfigurationProperties(EventuateKafkaConsumerSpringConfigurationProperties.class)
public class EventuateKafkaConsumerSpringConfigurationPropertiesConfiguration {

  @Bean
  public EventuateKafkaConsumerConfigurationProperties eventuateKafkaConsumerConfigurationProperties(EventuateKafkaConsumerSpringConfigurationProperties eventuateKafkaConsumerSpringConfigurationProperties) {
    EventuateKafkaConsumerConfigurationProperties eventuateKafkaConsumerConfigurationProperties = new EventuateKafkaConsumerConfigurationProperties(eventuateKafkaConsumerSpringConfigurationProperties.getProperties());
    eventuateKafkaConsumerConfigurationProperties.setBackPressure(eventuateKafkaConsumerSpringConfigurationProperties.getBackPressure());
    eventuateKafkaConsumerConfigurationProperties.setPollTimeout(eventuateKafkaConsumerSpringConfigurationProperties.getPollTimeout());
    return eventuateKafkaConsumerConfigurationProperties;

  }
}
