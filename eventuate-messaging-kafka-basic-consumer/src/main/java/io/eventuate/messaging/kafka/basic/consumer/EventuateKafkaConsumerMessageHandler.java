package io.eventuate.messaging.kafka.basic.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * 消费处理
 */
public interface EventuateKafkaConsumerMessageHandler
        extends BiFunction<ConsumerRecord<String, byte[]>, BiConsumer<Void, Throwable>, MessageConsumerBacklog> {
}
