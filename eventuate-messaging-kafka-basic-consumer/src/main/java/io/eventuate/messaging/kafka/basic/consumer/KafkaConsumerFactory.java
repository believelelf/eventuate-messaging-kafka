package io.eventuate.messaging.kafka.basic.consumer;

import java.util.Properties;

/**
 * kafka消费者工厂
 */
public interface KafkaConsumerFactory {

  KafkaMessageConsumer makeConsumer(String subscriptionId, Properties consumerProperties);

}
