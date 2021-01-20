package io.eventuate.messaging.kafka.consumer;

/**
 * kafka消息定义
 */
public class KafkaMessage {
  private String payload;

  public KafkaMessage(String payload) {
    this.payload = payload;
  }

  public String getPayload() {
    return payload;
  }
}
