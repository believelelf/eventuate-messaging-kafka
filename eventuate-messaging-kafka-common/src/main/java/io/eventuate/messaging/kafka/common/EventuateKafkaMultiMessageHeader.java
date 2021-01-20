package io.eventuate.messaging.kafka.common;

/**
 * 定义kafka消息的报文头定义，key-->value 键值对
 */
public class EventuateKafkaMultiMessageHeader extends KeyValue {

  public EventuateKafkaMultiMessageHeader(String key, String value) {
    super(key, value);
  }
}
