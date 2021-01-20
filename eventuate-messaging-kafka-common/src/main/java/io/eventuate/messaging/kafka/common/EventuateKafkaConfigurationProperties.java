package io.eventuate.messaging.kafka.common;

/**
 * kafka 连接串及连接校验超时时间
 */
public class EventuateKafkaConfigurationProperties {

  private String bootstrapServers;
  private long connectionValidationTimeout;

  public EventuateKafkaConfigurationProperties(String bootstrapServers, long connectionValidationTimeout) {
    this.bootstrapServers = bootstrapServers;
    this.connectionValidationTimeout = connectionValidationTimeout;
  }

  public String getBootstrapServers() {
    return bootstrapServers;
  }

  public long getConnectionValidationTimeout() {
    return connectionValidationTimeout;
  }
}
