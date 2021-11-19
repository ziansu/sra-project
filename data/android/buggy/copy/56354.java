@org.junit.Test
public void testIdempotentInputOperatorWithFailure() throws java.lang.Exception {
    org.apache.apex.malhar.kafka.AbstractKafkaInputOperatorTest.logger.warn("testIdempotentInputOperatorWithFailure - {}, {}", testName, hasMultiCluster);
    org.apache.apex.malhar.kafka.AbstractKafkaInputOperatorTest.hasFailure = true;
    testInputOperator(true, true);
}