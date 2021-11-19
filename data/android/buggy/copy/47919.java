@org.springframework.cloud.stream.module.kafka.source.AfterClass
public static void cleanup() {
    if ((org.springframework.cloud.stream.module.kafka.source.KafkaSourceIntegrationTests.scs_kafka_test_embedded) != null) {
        java.lang.System.setProperty("SCS_KAFKA_TEST_EMBEDDED", org.springframework.cloud.stream.module.kafka.source.KafkaSourceIntegrationTests.scs_kafka_test_embedded);
    }else {
        java.lang.System.clearProperty("SCS_KAFKA_TEST_EMBEDDED");
    }
}