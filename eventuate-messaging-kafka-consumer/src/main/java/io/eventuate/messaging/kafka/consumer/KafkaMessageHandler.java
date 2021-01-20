package io.eventuate.messaging.kafka.consumer;

import java.util.function.Consumer;

/**
 * kafka消息处理器
 */
public interface KafkaMessageHandler extends Consumer<KafkaMessage> {

}
