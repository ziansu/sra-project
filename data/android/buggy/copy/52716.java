public static com.lami.tuomatuo.mq.jafka.consumer.ConsumerConnector create(com.lami.tuomatuo.mq.jafka.consumer.ConsumerConfig config) {
    com.lami.tuomatuo.mq.jafka.consumer.ConsumerConnector consumerConnector = new com.lami.tuomatuo.mq.jafka.consumer.ZookeeperConsumerConnector(config);
    return consumerConnector;
}