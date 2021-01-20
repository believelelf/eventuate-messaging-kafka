package io.eventuate.messaging.kafka.common;

/**
 * kafka报文头定义
 */
public class EventuateKafkaMultiMessagesHeader extends KeyValue {

  public EventuateKafkaMultiMessagesHeader(String key, String value) {
    super(key, value);
  }
}
