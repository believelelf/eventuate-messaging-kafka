package io.eventuate.messaging.kafka.consumer;

/**
 * kafka订阅者
 */
public class KafkaSubscription {
  private Runnable closingCallback;

  public KafkaSubscription(Runnable closingCallback) {
    this.closingCallback = closingCallback;
  }

  public void close() {
    closingCallback.run();
  }
}
