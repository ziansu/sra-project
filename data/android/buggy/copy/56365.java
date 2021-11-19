private java.lang.String getClusterConfig() {
    return (org.apache.apex.malhar.kafka.AbstractKafkaInputOperatorTest.kafkaServer.getBroker()) + (hasMultiCluster ? ";" + (org.apache.apex.malhar.kafka.AbstractKafkaInputOperatorTest.kafkaServer.getBroker(1)) : "");
}