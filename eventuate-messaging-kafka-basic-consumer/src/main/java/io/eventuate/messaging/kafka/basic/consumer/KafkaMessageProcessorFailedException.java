package io.eventuate.messaging.kafka.basic.consumer;

/**
 * kafka消息处理异常
 */
public class KafkaMessageProcessorFailedException extends RuntimeException {
  public KafkaMessageProcessorFailedException(Throwable t) {
    super(t);
  }
}
