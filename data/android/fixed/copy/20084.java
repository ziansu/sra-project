public org.apache.kafka.clients.consumer.Consumer<java.lang.String, java.lang.String> getConsumer(final java.lang.String clientId) {
    final java.util.Properties properties = kafkaLocationManager.getKafkaConsumerProperties();
    return this.getConsumer(properties);
}