public static org.apache.flink.streaming.connectors.kafka.Kafka09JsonTableSink makeTableSink(java.lang.String theTopic, java.util.Properties myProperties) {
    java.util.Properties theProperties = new java.util.Properties();
    org.apache.flink.streaming.connectors.kafka.partitioner.FlinkKafkaPartitioner<org.apache.flink.types.Row> row2 = new org.apache.flink.streaming.connectors.kafka.partitioner.FlinkFixedPartitioner();
    return new org.apache.flink.streaming.connectors.kafka.Kafka09JsonTableSink(theTopic, theProperties, row2);
}