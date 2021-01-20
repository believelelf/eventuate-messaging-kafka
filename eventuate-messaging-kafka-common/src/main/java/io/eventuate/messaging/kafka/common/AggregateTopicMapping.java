package io.eventuate.messaging.kafka.common;

public class AggregateTopicMapping {
  /**
   * 替换AggregateTopic，将$替换为_DLR_
   * @param aggregateType 聚合类型
   * @return 替换后AggregateType
   */
  public static String aggregateTypeToTopic(String aggregateType) {
    return TopicCleaner.clean(aggregateType);
  }

}
