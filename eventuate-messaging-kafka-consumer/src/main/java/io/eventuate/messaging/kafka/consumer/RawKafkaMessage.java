package io.eventuate.messaging.kafka.consumer;

/**
 * 原始类型kafka消息
 */
public class RawKafkaMessage {
  private byte[] payload;

  public RawKafkaMessage(byte[] payload) {
    this.payload = payload;
  }

  public byte[] getPayload() {
    return payload;
  }
}
