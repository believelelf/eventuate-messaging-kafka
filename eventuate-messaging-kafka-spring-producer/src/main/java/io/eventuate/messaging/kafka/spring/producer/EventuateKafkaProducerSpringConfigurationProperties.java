package io.eventuate.messaging.kafka.spring.producer;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * kafka生产者属性
 */
@ConfigurationProperties("eventuate.local.kafka.producer")
public class EventuateKafkaProducerSpringConfigurationProperties {
  Map<String, String> properties = new HashMap<>();

  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public static EventuateKafkaProducerSpringConfigurationProperties empty() {
    return new EventuateKafkaProducerSpringConfigurationProperties();
  }
}
