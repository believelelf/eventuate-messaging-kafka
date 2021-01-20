package io.eventuate.messaging.kafka.common;

public class TopicCleaner {
    /**
     * topic 重命名
     *
     * @param topic Topic
     * @return Replaced Topic
     */
    public static String clean(String topic) {
        return topic.replace("$", "_DLR_");
    }

}
