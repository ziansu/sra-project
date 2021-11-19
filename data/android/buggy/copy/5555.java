private void registerTopics() {
    topicCenter.register(BasicQueueTest.TOPIC_NAME_1);
    topicCenter.register(BasicQueueTest.TOPIC_NAME_2);
    BasicQueueTest.topic1 = topicCenter.getTopic(BasicQueueTest.TOPIC_NAME_1);
    BasicQueueTest.topic2 = topicCenter.getTopic(BasicQueueTest.TOPIC_NAME_2);
}